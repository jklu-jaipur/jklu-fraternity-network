#include<iostream>
#include<stack>
using namespace std;
class Node{
 public:
  int data;
  Node* next;
  Node(int data){
     this->data=data;
     next=NULL;
  }
};
void createNode(Node** head,int data){
 Node* newNode=new Node(data);
  if(*head==NULL){
    *head=newNode;
    return;
  }
  newNode->next=*head;
  *head=newNode;
}
void display(Node** head){
 Node* temp=*head;
 while(temp!=NULL){
   cout<<temp->data<<" ";
   temp=temp->next;
   }
}

void recursiveDisplay(Node* head){
 if(head==NULL) return;
 
 recursiveDisplay(head->next);
 cout<<head->data<<" ";  
 
}
int main(){
int T;
cout<<"Enter Number of Nodes: "<<endl;
cin>>T;
Node* head=NULL;
while(T--){
int data; 
 cout<<"enter data of Node"<<endl;
 cin>>data;
 createNode(&head,data);
}
cout<<"Linked List is: "<<endl;
display(&head);
cout<<endl<<"Linked List in Reverse order- Recursively: "<<endl;

recursiveDisplay(head);
  
}