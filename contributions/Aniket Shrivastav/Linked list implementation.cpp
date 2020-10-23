#include <bits/stdc++.h>
using namespace std;
class Node {
  public :
   int data;
   Node *next;
};
 Node* head = NULL;
void insert(int new_data) {
    Node* new_node = new Node;
   new_node->data = new_data;
   new_node->next = head;
   head = new_node;
}
void display() {
    Node* ptr;
   ptr = head;
   while (ptr != NULL) {
      cout<< ptr->data <<" ";
      ptr = ptr->next;
   }
}
int main() {
   insert(6);
   insert(10);
   insert(75);
   insert(200);
   insert(19);
   cout<<"The linked list is: ";
   display();
   return 0;
}
