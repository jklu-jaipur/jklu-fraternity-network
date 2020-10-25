package linklist;
import java.util.Scanner;
class BinaryT{
     protected int data;
    protected BinaryT left,right ;
    public BinaryT(){
        data =0;
        left = null;
        right= null;
    }
    public BinaryT(int n){
        data =n;
        left = null;
        right = null;
    }
    void setdata(int val){
        data=val;
    }
     int getdata(){
      return  data;
    }
     void setleft(BinaryT a){
      left=a;
    }
    BinaryT getleft(){
      return left;
    } 
    void setright(BinaryT b){
       right=b;
    }
    BinaryT getright(){
      return right;
    } 
    static int getHeight(BinaryT root)  
{  
    if (root.left == null && root.right == null)  
        return 0;  
    int left = 0;  
    if (root.left != null)  
        left = getHeight(root.left);  
    int right = 0;  
    if (root.right != null)  
        right = getHeight(root.right);  
    return (Math.max(left, right) + 1);  
}  
}
class Bt {
    int c = 0;
  BinaryT root = null;
  
  public void insert(int v){
      root=insert(root,v);
  }
  public BinaryT insert(BinaryT n,int val){
      if(n == null){
          n= new BinaryT(val);
      }
      else if(n.left == null){
          n.left=insert(n.left,val);
      }
      else if(n.right == null)
           n.right=insert(n.right,val);
      else
           n.left=insert(n.left,val);
     
      
              
      return n;
              }
  static void calculateLevelSum(BinaryT node, int level, int sum[])  
{  
    if (node == null)  
        return;  
  
    // Add current node data to the sum  
    // of the current node's level  
    sum[level] += node.data;  
  
    // Recursive call for left and right sub-tree  
    calculateLevelSum(node.left, level + 1, sum);  
    calculateLevelSum(node.right, level + 1, sum);  
}  

  int sum =0;
public void inorder(BinaryT r){
      if(r != null)
      { inorder(r.getleft());
      sum=sum+r.getdata();
      System.out.print(r.getdata()+" ");
      
       inorder(r.getright());}
  }

      public void preorder(BinaryT r){
      if(r != null){
      System.out.print(r.getdata()+" ");
      preorder(r.getleft());
      preorder(r.getright());}
  }
       public void postorder(BinaryT r){
      if(r != null)
      {  
       postorder(r.getleft());
        postorder(r.getright());
      System.out.print(r.getdata() +" ");}
      
  }
      }
 
 
public class Binarytree {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  char ch;
      Bt bt = new Bt();
         BinaryT bt1 = new BinaryT();
   int levels = bt1.getHeight(bt.root) + 1;  
    // To store the sum at every level  
    int sum[]=new int[levels];  
      do{
          System.out.println("1.Insertion  \n"+"2.Inorder \n"+"3.preorder \n"+"4.postorder ");  
           int choice = sc.nextInt();
         switch(choice){
             case 1:
                 System.out.println("Insertion \n input a no.");
             int k1=sc.nextInt();
             bt.insert(k1);
             break;
            case 2:
              bt.inorder(bt.root);
              break;
            case 3:
              bt.preorder(bt.root);
            break;
            case 4:
              bt.postorder(bt.root);
              break;
               case 5:
              bt.calculateLevelSum(bt.root,0,sum);
              break;
          default:
                 System.out.println("invalid input");
         }  
              System.out.print("\n inorder :");
         bt.inorder(bt.root);
               System.out.print("\n preorder :");    
              bt.preorder(bt.root);
              System.out.print("\n postorder :"); 
              bt.postorder(bt.root);
              System.out.println("\n no. of nodes : "+bt.sum);  
         System.out.println("\n do you want to perform any operation(y/n)");
         ch= sc.next().charAt(0);
       }
       while(ch == 'y' || ch == 'Y');
    }
}
