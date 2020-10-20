# Requirements to be installed:
# pip install requests
# pip install BeautifulSoup4
# pip install prettytable

import json
import requests
from bs4 import BeautifulSoup
import sys
import datetime as dt
from prettytable import PrettyTable

URL = "https://www.instagram.com/{}/"


def scrape_data(username):
    r = requests.get(URL.format(username))
    soup= BeautifulSoup(r.text, "html.parser")
    
    script = soup.find('script', text=lambda t: t.startswith('window._sharedData'))
    page_json = script.text.split(' = ', 1)[1].rstrip(';')
    data = json.loads(page_json)
    non_bmp_map = dict.fromkeys(range(0x10000, sys.maxunicode + 1), 0xfffd)
    raw_posts = data['entry_data']['ProfilePage'][0]['graphql']['user']['edge_owner_to_timeline_media']['edges']
    
    profile = soup.find("meta", property = "og:description")
    posts = []
    
    for i in range(len(raw_posts)):
        link = raw_posts[i]['node']['display_url'] 
        date = dt.datetime.fromtimestamp(raw_posts[i]['node']['taken_at_timestamp']).strftime('%Y-%m-%d %H:%M:%S')
        likes = raw_posts[i]['node']['edge_liked_by']['count']
        comments = raw_posts[i]['node']['edge_media_to_comment']['count']
        type = "Video" if raw_posts[i]['node']['is_video'] else "Image"
        posts.append({"id": i, "link": link, "type": type, "date": date, "likes": likes, "comments": comments})
        
    return posts


def printTable(data):
    t = PrettyTable(["S.No", "Date", "Post Type", "No. likes", "No. Comments"])
    for row in data:
        t.add_row([row["id"], row["date"], row["type"], row["likes"], row["comments"]])
    
    print(t)
    
         
if __name__ == "__main__":
    
    print("Enter your Instagram UserName: ")
    username = input()
    
    data = scrape_data(username)
    
    print("\n\tRecent Instagram Posts Data of ", username)
    printTable(data);
    
