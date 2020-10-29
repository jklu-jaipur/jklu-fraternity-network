#include<iostream>
#include<cstdio>
#include<sstream>
#include<algorithm>
#define pow2(n) (1 << (n))
using namespace std;


struct avl {
   int data;
   struct avl *left;
   struct avl *right;
}*r;
class avl_tree {
   public:
      int height(avl *t){
   			int h = 0;
   			if (t != NULL) {
      			int l_height = height(t->left);
      			int r_height = height(t->right);
      			int max_height = max(l_height, r_height);
      			h = max_height + 1;
   			}
   		return h;
}
      int difference(avl *);
      avl *rr_rotat(avl *);
      avl *ll_rotat(avl *);
      avl *lr_rotat(avl*);
      avl *rl_rotat(avl *);
      avl * balance(avl *);
      avl * insert(avl*, int);
      
void Inorder(avl *t) {
   if (t == NULL)
      return;
      Inorder(t->left);
      cout << t->data << " ";
      Inorder(t->right);
}

void Preorder(avl *t) {
   if (t == NULL)
      return;
      cout << t->data << " ";
      Preorder(t->left);
      Preorder(t->right);
}

void Postorder(avl *t) {
   if (t == NULL)
      return;
      Postorder(t ->left);
      Postorder(t ->right);
      cout << t->data << " ";
}
      avl_tree() {
         r = NULL;
      }
}; 
int avl_tree::difference(avl *t) {
   int l_height = height(t->left);
   int r_height = height(t->right);
   int b_factor = l_height - r_height;
   return b_factor;
}
avl *avl_tree::rr_rotat(avl *parent) {
   avl *t;
   t = parent->right;
   parent->right = t->left;
   t->left = parent;
   cout<<"Right-Right Rotation";
   return t;
}
avl *avl_tree::ll_rotat(avl *parent) {
   avl *t;
   t = parent->left;
   parent->left = t->right;
   t->right = parent;
   cout<<"Left-Left Rotation";
   return t;
}
avl *avl_tree::lr_rotat(avl *parent) {
   avl *t;
   t = parent->left;
   parent->left = rr_rotat(t);
   cout<<"Left-Right Rotation";
   return ll_rotat(parent);
}
avl *avl_tree::rl_rotat(avl *parent) {
   avl *t;
   t = parent->right;
   parent->right = ll_rotat(t);
   cout<<"Right-Left Rotation";
   return rr_rotat(parent);
}
avl *avl_tree::balance(avl *t) {
   int bal_factor = difference(t);
   if (bal_factor > 1) {
      if (difference(t->left) > 0)
         t = ll_rotat(t);
      else
         t = lr_rotat(t);
   } else if (bal_factor < -1) {
      if (difference(t->right) > 0)
         t = rl_rotat(t);
      else
         t = rr_rotat(t);
   }
   return t;
}
avl *avl_tree::insert(avl *right, int v) {
   if (right == NULL) {
      right = new avl;
      right->data = v;
      right->left = NULL;
      right->right = NULL;
      return right;
   } else if (v< right->data) {
      right->left = insert(right->left, v);
      right = balance(right);
   } else if (v >= right->data) {
      right->right = insert(right->right, v);
      right = balance(right);
   } return right;
}

int main() {
   int c, i;
   avl_tree avl;
   while (1) {
      cout << "1.Insert Element into the tree" << endl;
      cout << "2.InOrder traversal" << endl;
      cout << "3.PreOrder traversal" << endl;
      cout << "4.PostOrder traversal" << endl;
      cout << "5.Exit" << endl;
      cout << "Enter your Choice: ";
      cin >> c;
      switch (c) {
         case 1:
            cout << "Enter value to be inserted: ";
            cin >> i;
            r = avl.insert(r, i);
         break;
         case 2:
            cout << "Inorder Traversal:" << endl;
            avl.Inorder(r);
            cout << endl;
         break;
         case 3:
            cout << "Preorder Traversal:" << endl;
            avl.Preorder(r);
            cout << endl;
         break;
         case 4:
            cout << "Postorder Traversal:" << endl;
            avl.Postorder(r);
            cout << endl;
         break;
         case 5:
            exit(1);
         break;
         default:
            cout << "Wrong Choice" << endl;
      }
   }
   return 0;
}
