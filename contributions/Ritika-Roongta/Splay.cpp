#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;
 
struct splay
{
    int key;
    splay* lchild;
    splay* rchild;
};
 
class SplayTree
{
    public:
        SplayTree()
        {
        }
 
        splay* RR_Rotate(splay* k)
        {
            splay* k1 = k->lchild;
            k->lchild = k1->rchild;
            k1->rchild = k;
            return k1;
        }
 
        splay* LL_Rotate(splay* k)
        {
            splay* k1 = k->rchild;
            k->rchild = k1->lchild;
            k1->lchild = k;
            return k1;
        }
 
        splay* Splay(int key, splay* root)
        {
            if (!root)
                return NULL;
            splay header;
            header.lchild = header.rchild = NULL;
            splay* LTMax = &header;
            splay* RTMin = &header;
            while (1)
            {
                if (key < root->key)
                {
                    if (!root->lchild)
                        break;
                    if (key < root->lchild->key)
                    {
                        root = RR_Rotate(root);
                        if (!root->lchild)
                            break;
                    }
                    RTMin->lchild = root;
                    RTMin = RTMin->lchild;
                    root = root->lchild;
                    RTMin->lchild = NULL;
                }
                else if (key > root->key)
                {
                    if (!root->rchild)
                        break;
                    if (key > root->rchild->key)
                    {
                        root = LL_Rotate(root);
                        if (!root->rchild)
                            break;
                    }
                    LTMax->rchild = root;
                    LTMax = LTMax->rchild;
                    root = root->rchild;
                    LTMax->rchild = NULL;
                }
                else
                    break;
            }
            LTMax->rchild = root->lchild;
            RTMin->lchild = root->rchild;
            root->lchild = header.rchild;
            root->rchild = header.lchild;
            return root;
        }
 
        splay* New_Node(int key)
        {
            splay* p_node = new splay;
            if (!p_node)
            {
                fprintf(stderr, "Out of memory!\n");
                exit(1);
            }
            p_node->key = key;
            p_node->lchild = p_node->rchild = NULL;
            return p_node;
        }
 
        splay* Insert(int key, splay* root)
        {
            static splay* p_node = NULL;
            if (!p_node)
                p_node = New_Node(key);
            else
                p_node->key = key;
            if (!root)
            {
                root = p_node;
                p_node = NULL;
                return root;
            }
            root = Splay(key, root);
            if (key < root->key)
            {
                p_node->lchild = root->lchild;
                p_node->rchild = root;
                root->lchild = NULL;
                root = p_node;
            }
            else if (key > root->key)
            {
                p_node->rchild = root->rchild;
                p_node->lchild = root;
                root->rchild = NULL;
                root = p_node;
            }
            else
                return root;
            p_node = NULL;
            return root;
        }
 
        splay* Search(int key, splay* root)
        {
            return Splay(key, root);
        }
    
        void PreOrder(splay* root)  
		{  
    		if (root != NULL)  
    		{  
        		cout<< "\n"; 
				cout<<"key: " << root->key<<" "; 
				if(root->lchild)
                    cout<< " -> left child: "<< root->lchild->key; 
				PreOrder(root->lchild);  
				if(root->rchild)
                    cout << " -> right child: " << root->rchild->key;
        		PreOrder(root->rchild);  
    		}  
		}  
};
 
int main()
{
    SplayTree st;
    int vector[10] = {};
    splay *root;
    root = NULL;
    int input, choice;
    while(1)
    {
        cout<<"\nSplay Tree Operations\n";
        cout<<"1. Insert "<<endl;
        cout<<"2. Search"<<endl;
        cout<<"3. Exit"<<endl;
        cout<<"Enter your choice: ";
        cin>>choice;
        switch(choice)
        {
        case 1:
            cout<<"Enter value to be inserted: ";
            cin>>input;
            root = st.Insert(input, root);
            cout<<"\nAfter Insert: "<<input<<endl;
            st.PreOrder(root);
            break;

        case 2:
            cout<<"Enter value to be searched: ";
            cin>>input;
            root = st.Search(input, root);
            cout<<"\nAfter Search "<<input<<endl;
            st.PreOrder(root);
            break;
 
        case 3:
            exit(1);
        default:
            cout<<"\nInvalid type! \n";
        }
    }
    cout<<"\n";
    return 0;
}
