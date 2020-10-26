
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saumy
 */
class AVLNode
 {    
     AVLNode left, right;
     int data;
     int height;
 
     /* Constructor */
     public AVLNode()
     {
         left = null;
         right = null;
         data = 0;
         height = 0;
     }
     /* Constructor */
     public AVLNode(int n)
     {
         left = null;
         right = null;
         data = n;
         height = 0;
     }    
      /* Function to set left node */
     public void setLeft(AVLNode n)
     {
         left = n;
     }
     /* Function to set right node */ 
     public void setRight(AVLNode n)
     {
         right = n;
     }
     /* Function to get left node */
     public AVLNode getLeft()
     {
         return left;
     }
     /* Function to get right node */
     public AVLNode getRight()
     {
         return right;
     }
     /* Function to set data to node */
     public void setData(int d)
     {
         data = d;
     }
     /* Function to get data from node */
     public int getData()
     {
         return data;
     }     
 }

class AVLTree
{
     private AVLNode root;     
    /* Constructor */
     public AVLTree()
     {
         root = null;
     }
     /* Function to get height of AVL tree */
     public int height(AVLNode node) 
     {
         if (node == null)
             return 0;
         else
             return node.height;
     }
     /* Right rotate the node */
     public AVLNode rightRotate(AVLNode n2) 
     {
         AVLNode n1 = n2.left;
         AVLNode n3 = n1.right;
         n1.right = n2;
         n2.left = n3;
         n2.height = Math.max(height(n2.left), height(n2.right)) + 1;
         n1.height = Math.max(height(n1.left), height(n1.right)) + 1;
         return n1;
     }
     /* Left rotate the node */
     public AVLNode leftRotate(AVLNode n1) 
     {
         AVLNode n2 = n1.right;
         AVLNode n3 = n2.left;
         n2.left = n1;
         n1.right = n3;
         n1.height = Math.max(height(n1.left), height(n1.right)) + 1;
         n2.height = Math.max(height(n2.left), height(n2.right)) + 1;
         return n2;
     }
     /* Get balance factor of a node */
     public int getBalanceFactor(AVLNode node)
     {
         int BF;
         if (node == null)
             BF = 0;
         else
             BF = height(node.getLeft()) - height(node.getRight());
         return BF;
     }
     /* rebalaces the balancing factor of a node */
     public AVLNode reBalance(AVLNode node) 
     {
         node.height = Math.max(height(node.left), height(node.right)) + 1;
         int balance = getBalanceFactor(node);
         if (balance > 1) 
         {
             if (height(node.right.right) > height(node.right.left)) 
                 node = rightRotate(node); 
             else 
             {
                 node.left = leftRotate(node.left);
                 node = rightRotate(node);
             }
         } 
         else if (balance < -1) 
         {
                if (height(node.left.left) > height(node.left.right))
                    node = leftRotate(node);
                else 
                {
                    node.right = rightRotate(node.right);
                    node = leftRotate(node);
                }
         }
        return node;
     }
     /* Function to insert data */
     public void insert(int data)
     {
         root = insert(root, data);
     }
     /* Function to insert data recursively */
     private AVLNode insert(AVLNode node, int data) 
     {
         // Find the position and insert the node
         if (node == null)
             node = new AVLNode(data);
         if (data < node.getData())
             node.left = insert(node.left, data);
         else if (data > node.getData())
             node.right = insert(node.right, data);
         return reBalance(node);
     }
     /* Function to get the minimum element*/
     public AVLNode nodeWithMimumValue(AVLNode node) 
     {
         AVLNode current = node;
         while (current.getLeft() != null)
             current = current.getLeft();
         return current;
     }
     /* Function to delete data */
     public void delete(int data)
     {
         root = delete(root, data);
     }
     /* Function to insert data recursively */
     private AVLNode delete(AVLNode node, int data) 
     {
         if (node == null)
            return node;
         if (data < node.getData())
            node.left = delete(node.left, data);
         else if (data > node.getData())
            node.right = delete(node.right, data);
         else 
         {
            if ((node.left == null) || (node.right == null)) 
            {
                AVLNode temp = null;
                if (temp == node.left)
                    temp = node.right;
                else
                    temp = node.left;
                if (temp == null) 
                {
                    temp = node;
                    node = null;
                } 
                else
                    node = temp;
            } 
            else 
            {
                AVLNode temp = nodeWithMimumValue(node.right);
                node.data = temp.getData();
                node.right = delete(node.right, temp.data);
            }
        }   
        if (node == null)
            return node;
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        int balance = getBalanceFactor(node);
        if (balance > 1) 
        {
             if (getBalanceFactor(node.left) >= 0) 
                 node = rightRotate(node); 
             else 
             {
                 node.left = leftRotate(node.left);
                 node = rightRotate(node);
             }
        } 
        else if (balance < -1) 
        {
                if (getBalanceFactor(node.right) <= 0)
                    node = leftRotate(node);
                else 
                {
                    node.right = rightRotate(node.right);
                    node = leftRotate(node);
                }
        }
        return node;
     }
     /* Function to search for an element */
     public boolean search(int val)
     {
         return search(root, val);
     }
     /* Function to search for an element recursively */
     private boolean search(AVLNode r, int val)
     {
         if (r.getData() == val)
             return true;
         if (r.getLeft() != null)
             if (search(r.getLeft(), val))
                 return true;
         if (r.getRight() != null)
             if (search(r.getRight(), val))
                 return true;
         return false;     
     }
     /* Function for inorder traversal */
     public void inorder()
     {
         inorder(root);
     }
     private void inorder(AVLNode r)
     {
         if (r != null)
         {
             inorder(r.left);
             System.out.print(r.data +" ");
             inorder(r.right);
         }
     }
     /* Function for preorder traversal */
     public void preorder()
     {
         preorder(root);
     }
     private void preorder(AVLNode r)
     {
         if (r != null)
         {
             System.out.print(r.data +" ");
             preorder(r.left);             
             preorder(r.right);
         }
     }
     /* Function for postorder traversal */
     public void postorder()
     {
         postorder(root);
     }
     private void postorder(AVLNode r)
     {
         if (r != null)
         {
             postorder(r.left);             
             postorder(r.right);
             System.out.print(r.data +" ");
         }
     }     
}
        
public class AVLBinarySearchTree {
    public static void main(String[] args)
    {            
        Scanner scan = new Scanner(System.in);
        /* Creating object of SBT */
        AVLTree avlt = new AVLTree(); 
        /*  Perform tree operations  */
        System.out.println("AVL Tree Test\n");          
        char ch;        
        do    
        {
            System.out.println("\nAVL Tree Operations\n");
            System.out.println("1. Insert ");
            System.out.println("2. Delete ");
            System.out.println("3. Search");
            System.out.println("4. Traverse");
            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                avlt.insert( scan.nextInt() );                     
                break; 
            case 2 : 
                System.out.println("Enter integer element to deleted");
                avlt.delete( scan.nextInt() );                     
                break;     
            case 3 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ avlt.search( scan.nextInt() ));
                break;     
            case 4 : 
                System.out.print("\nPost order : ");
                avlt.postorder();
                System.out.print("\nPre order : ");
                avlt.preorder();
                System.out.print("\nIn order : ");
                avlt.inorder();
                break;                                                      
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
    
}
