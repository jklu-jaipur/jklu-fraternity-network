
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.common.exceptions import WebDriverException

# function to update chrome driver
def update_chrome_driver(n):
    import subprocess
    try:
        print('Need to update the Chromedriver')
        rc = subprocess.run('/home/sb/dev/Projects-Python/automate-boring-stuff/update-chrome-driver.sh')
        rc.check_returncode()
        print('Chrome driver updated successfully')
        main(n + 1)
    except subprocess.CalledProcessError:
        print('Error in updating Chrome driver, please do it manually')
        return


def main(n):
    if n <= 1:
        try:
            opt = Options()
            opt.headless = True
            global browser
            browser = webdriver.Chrome(chrome_options=opt)
            print('Rebooting router')
            browser.get('http://192.168.1.254')
            browser.find_element_by_xpath(r'//*[(@id = "username")]').send_keys('') #Enter your user id here.
            browser.find_element_by_xpath(r'//*[(@id = "password")]').send_keys('')  #enter your password here
            browser.find_element_by_xpath(
                '//td//td[(((count(preceding-sibling::*) + 1) = 1) and parent::*)]//input').click()
            browser.find_element_by_xpath('//*[contains(concat( " ", @class, " " ),'
                                          ' concat( " ", "x_main_menu", " " )) '
                                          'and (((count(preceding-sibling::*) + 1) = 5) and parent::*)]//a').click()
            browser.find_element_by_xpath('/html/body/div/section/div[1]/div[1]/div[1]/ul[5]/li[5]').click()
            browser.switch_to.frame(browser.find_element_by_id('mainFrame'))
            browser.find_element_by_id('do_reboot').click()
            alert = browser.switch_to.alert
            alert.accept()
            import time
            time.sleep(2)
            browser.close()
            print('Successfully Rebooted')
        except WebDriverException:
            update_chrome_driver(n)
    else:
        print("Error in rebooting router")


main(0)
