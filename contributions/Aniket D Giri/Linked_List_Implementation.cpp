#include<iostream>
#include<stdlib.h>

using namespace std;


struct Node{
         Node *next=NULL;
        int data=0;
};


class Linked_List{
    private:
    Node *head;

    public:

    Linked_List(){
        head=NULL;
    }

   Node* Create_Node(int data){      //Function for creating the node.
       Node *temp=new Node;
       temp->data=data;
        return temp;
   }

    void Insert_Element(int data)   //Function for inserting in the linked list.
    {
  
            if(head==NULL)
            {
                head=Create_Node(data);

            }
            else{
                Node *temp;
                temp=head;
                while(temp->next!=NULL)
                {
                    temp=temp->next;
                }
                temp->next=Create_Node(data);
            }   
            Print_Elements();

    }

    void Print_Elements(){         //Function for printing elements.         
        Node *temp;
        temp=head;
        while(temp!=NULL){
            cout<<temp->data<<" ";
            temp=temp->next;
        }//while

    }//Print_Elements

    void Delete_Element(){

        int delete_element;
        cout<<"\n Please Enter the element you want to delete: ";
        cin>>delete_element;

        /* There will be Three cases arises:
        1. Delete from head.
        2. Delete at specifed location.
        2. Delete from end.

        */

        //case1
        Node *temp;
        temp=head;
        if(temp==NULL)
        {
            cout<<"LIST IS EMPTY ";
            
        }
        else{
            if(head->data == delete_element)
            {
                head=head->next;
                free(temp);
            }//if

        else{
            while(temp->next!=NULL && (temp->next)->data!=delete_element  )
            {
                temp=temp->next;
                
            }//while
            if(temp->next==NULL){
                cout<<"please enter valid Element ";
               
            }//if

            else{
                Node *dummy;
                dummy=temp->next;
                temp->next=dummy->next;
                free(dummy);

                 
            }//else
             Print_Elements();

        }//else       
          
        }//outer Else

        





    }//Delete_Element

    void Searching_Element(int data){
        Node *temp;
        temp=head;
        int count=1;

        while(temp!=NULL && temp->data!=data)
        {
            count++;
            temp=temp->next;
        }
        
        if(temp==NULL){
            cout<<"\n Element is not present in the list";
        }//if
        
        else{
            cout<<"\n Element is present at location "<<count;
        }
      
        

    }//Searchin_Element

    void Insert_at_a_given_pos(int pos,int data){
        Node *temp;
        temp=head;
        pos=pos-1;
        Node *dummy=Create_Node(data);

        if(pos==0)
        {
            dummy->next=temp;
            head=dummy;
        }//if
        else{
            while(pos>1){
            temp=temp->next;
            pos--;
        }
        
            dummy->next=temp->next;
            temp->next=dummy;
        }//else
        

        Print_Elements();


    }//insert at a given pos

    


};


int main(){

    int choice;
    Linked_List l;
    do{
        cout<<"\n \n 1. Insert Element into Linked List.";
        cout<<"\n 2. Delete Element from the Linked List.";
        cout<<"\n 3. Insert at given position."; 
        cout<<"\n 4. Seaching Element." ;
        cout<<"\n Please enter your choice";            //asking user for the choice and storing it in "choice" variable.
        cin>>choice;

        switch(choice){
            case 1:
                int element;
                cout<<"\n Please enter the element you want to insert: ";
                cin>>element;
                l.Insert_Element(element);
                break;

            case 2:
                l.Delete_Element();
                break;

            case 3:
                int pos,data;
                cout<<"\n Please enter the position at which you want to enter: ";
                cin>>pos;

                cout<<"\n Please enter thr Element you want to enter: ";
                cin>>data;

                l.Insert_at_a_given_pos(pos,data);
                break;

            case 4:
                int key;
                cout<<"\n Please enter the element ou wnat to search: ";
                cin>>key;
                l.Searching_Element(key);
                break;

            default:
                break;
        

    


    }//switch
    }while(choice!=-1);
    



    return 0;
}