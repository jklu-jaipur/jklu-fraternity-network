package javaapplication5;
import java.util.Scanner;
class Node{
    protected int data;
    public Node link;
    public Node pre;
    public Node(){
        data=0;
        link=null;
        pre=null;
    }
    public Node(int d,Node n,Node m){
        data=d;
        link=n;
        pre=m;
    }
    public void setdata(int d){
        data=d;
    }
    public int getdata(){
       return data;
    }
    public void setlink(Node n){
        link=n;
    }
    public Node getlink(){
        return link;
    }
    public void setpre(Node m){
        pre=m;
    }
    public Node getpre(){
        return pre;
    }
    
   
}
 
class linked
{
    public Node start;
   
    public linked(){
        start=null;
       
        }
    public void insertAtstart(int a){
        Node nptr=new Node(a,null,null);
        nptr.setlink(start);
        nptr.setpre(null);
        
        start=nptr;
    }
    public void insertAtend(int b){
        Node ptr=start;
        Node nptr=new Node(b, null,null);
        while(ptr.getlink()!=null){
            ptr=ptr.getlink();
        }
        nptr.setpre(ptr);
        nptr.setlink(null);
        ptr.setlink(nptr);
        }
    public void insertafter(int val,int pos){
        Node nptr = new Node(val, null,null);               
        Node ptr = start;
        
        while(ptr.getdata()!=pos){
            ptr=ptr.getlink();
        }
        nptr.setpre(ptr);
        nptr.setlink(ptr.getlink());
        ptr.getlink().setpre(nptr);
        ptr.setlink(nptr);
       }
    public void insertbefore(int val1, int pos1){
        Node nptr=new Node(val1,null,null);
        Node ptr=start;
       
        while(ptr.getdata()!=pos1){
            ptr=ptr.getlink();
        }
        nptr.setlink(ptr);
        nptr.setpre(ptr.getpre());
        ptr.getpre().setlink(nptr);
        ptr.setpre(nptr);
        }
    public void delfirst(){
        if(start==null){
            System.out.println("Empty");
        }
        else{
            start=start.getlink();
    }
    }
    public void dellast(){
        Node ptr;
        Node pptr;
        if(start==null){
            System.out.println("empty");
        }
        else{
            ptr=start;
            pptr=start;
            while(ptr.getlink()!=null){
                pptr=ptr;
                ptr=ptr.getlink();
            }
            pptr.setlink(null);
        }
    }
    public void delbefore(int val3){
        Node ptr=start;
        Node pptr;
        while(ptr.getdata()!=val3){
            ptr=ptr.getlink();
           }
        //ptr.getpre().getpre().setlink(ptr);
      pptr=ptr;
        ptr= ptr.pre;
        ptr=ptr.getpre();
        ptr.setlink(pptr);
        pptr.setpre(ptr);
        
        
        
        
      
    }
    public void delafter(int val4){
        Node ptr=start;
        while(ptr.getdata()!=val4){
            ptr=ptr.getlink();
        }
        ptr.getlink().getlink().setpre(ptr);
        ptr.setlink(ptr.getlink().getlink());
        
        
    }
   
    
    
    public void display(){
        Node ptr = start;
        System.out.print("->");
       
        
        while (ptr.getlink() != null)
        {
            System.out.print(ptr.getdata()+ "->");
            ptr = ptr.getlink();
        }
        System.out.print(ptr.getdata()+ "\n");
    }
    }
 
public class linkedlis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Linked List options");
        linked list=new linked();
        char ch;
        do{
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("Enter your choice");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Insert options--");
                    do{
                        System.out.println("1. Insert at beginning");
                        System.out.println("2. Insert at end");
                        System.out.println("3. Insert before the Position");
                        System.out.println("4. Insert after the Position");
                        int choice1=sc.nextInt();
                        switch(choice1)
                        {
                            case 1:
                                System.out.println("Insert at Beginning");
                                System.out.println("Value");
                                int a=sc.nextInt();
                                list.insertAtstart(a);
                                list.display();
                                break;
                            case 2:
                                System.out.println("Insert at End");
                                System.out.println("Value");
                                int b=sc.nextInt();
                                list.insertAtend(b);
                                list.display();
                               
                                break;
                            case 3:
                                System.out.println("Insert before position");
                                System.out.println("Position --");
                                int pos=sc.nextInt();
                                System.out.println("Value ");
                                int val=sc.nextInt();
                                list.insertbefore(val,pos);
                                list.display();
                                break;
                            case 4:
                                System.out.println("Insert after position");
                                System.out.println("Position --");
                                int pos1=sc.nextInt();
                                System.out.println("Value");
                                int val1=sc.nextInt();
                                list.insertafter(val1,pos1);
                                list.display();
                                break;
                        }
                        System.out.println("Do you want to continue");
                        ch=sc.next().charAt(0);
                    }
                    while(ch == 'y'||ch =='Y');
                    break;
                case 2:
                    System.out.println("Delete options--");
                    do{
                        System.out.println("1. Delete at Beginning");
                        System.out.println("2. Delete at End");
                        System.out.println("3. Delete at before position");
                        System.out.println("4. Delete at after position");
                        int choice2=sc.nextInt();
                        switch(choice2)
                        {
                            case 1:
                                System.out.println("Delete at Beginnig");
                                list.delfirst();
                                list.display();
                                break;
                            case 2:
                                System.out.println("Delete at End");
                                list.dellast();
                                list.display();
                                break;
                            case 3:
                                System.out.println("Delete before Position");
                                System.out.println("Enter value");
                                int val3=sc.nextInt();
                                list.delbefore(val3);
                                list.display();
                                break;
                            case 4:
                                System.out.println("Delete After Position");
                                System.out.println("Enter position");
                                int val4=sc.nextInt();
                                list.delafter(val4);
                                list.display();
                                break;
                                }
                        System.out.println("Do you want to continue");
                        ch=sc.next().charAt(0);
                    }
                    while(ch == 'y'||ch =='Y');
                    break;
                case 3:
                    System.out.println("Your linked list is");
                    list.display();
                    break;
                }
            System.out.println("Do you want to continue");
            ch=sc.next().charAt(0);
        }
        while(ch == 'y'||ch =='Y');
    }
   
}
