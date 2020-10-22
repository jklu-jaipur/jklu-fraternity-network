#include<iostream>
#include<stdlib.h>

using namespace std;

/*struct Node{
    Node *left=NULL;
    Node *right=NULL;
    int key=0;
};*/

class Node{

    public:
        int key;
        Node *left,*right;

        Node(){
            key=0;
            left=right=NULL;
        }//Default Constructor

        Node(int data){
            key=data;
            left=right=NULL;
        }//parrameteraized constructor

};//Node

class Binarty_Search_Tree{
    private:
        Node *root=NULL;
    
    public:
        Node* Create_Node(int data){
            Node *Dummy=new Node(data);
            return Dummy;

        }//Create_Node

        void Insert_Node(int data){

           root=Implement_Tree(root,data);
           //Print_Elements_Preorder();
        }//Insert_Node

        Node* Implement_Tree(Node *root,int data){

            if(root==NULL){
                return Create_Node(data);
            }
            
            if(data> root->key){
                root->right=Implement_Tree(root->right,data);
            }

            else{
                root->left=Implement_Tree(root->left,data);
            }
            return root;
        }//Implement_Tree

        void Print_Elements_Preorder(){
            printpre(root);

        }//print_ELements

        void printpre(Node *root){
            if(root==NULL){
                return ;
            }
            cout<<root->key<<" ";
            printpre(root->left);
            printpre(root->right);
        }

        void Print_Elements_Inorder(){
            printin(root);

        }//print_ELements

        void printin(Node *root){
            if(root==NULL){
                return ;
            }
            printin(root->left);
            cout<<root->key<<" ";
            printin(root->right);
        }

        void Print_Elements_Postorder(){
            printpost(root);

        }//print_ELements

        void printpost(Node *root){
            if(root==NULL){
                return ;
            }
            printpost(root->left);
            printpost(root->right);
            cout<<root->key<<" ";
        }

        void Search_Key(int key){
                Node *temp=search(root,key);
                if(temp==NULL){
                    cout<<"Key is not present";
                }
                else{
                    cout<<"Key is present";
                }
        }

        Node* search(Node *root,int key)
        {
            if (root == NULL || root->key == key){
                return root; 
            }
              
            if (root->key < key){
                return search(root->right, key);
            } 
                 

            return search(root->left, key); 
        }


}; //Binary_Search_Tree



int main(){

    int choice;
    Binarty_Search_Tree l;
    do{
        cout<<"\n \n 1. Insert Element into Binary Tree";
        cout<<"\n 2. Seaching Element." ;
        cout<<"\n 3. Print Inorder traversal" ;
        cout<<"\n 4. Print Preorder traversal" ;
        cout<<"\n 5. Print Postorder traversal" ;
        cout<<"\n Please enter your choice (or) Enter -1 to exit: ";            //asking user for the choice and storing it in "choice" variable.
        cin>>choice;

        switch(choice){

            case 1:
                int data;
                cout<<"Please Enter the element you want:";
                cin>>data;

                l.Insert_Node(data);
                break;
            
            case 2:
                int key;
                cout<<"Please Enter the element you want to search:";
                cin>>key;
                l.Search_Key(key);
                break;

            case 3:
                l.Print_Elements_Inorder();
                break;

            case 4:
                l.Print_Elements_Preorder();
                break;

            case 5:
                l.Print_Elements_Postorder();
                break;

            default:
                break;
        

    


    }//switch
    }while(choice!=-1);


    return 0;
}//main