import java.util.*;

class q1{
 
 public Queue<Integer> queue;
     
 public Q()
 {
    this.queue = new LinkedList<Integer>();
 }
    
 public void push(int data) {
   this.queue.add(data);
 }
  
 public void pop() {
    this.queue.remove();
 }
    
 public void peek() {
  System.out.println("Element on top: " + this.queue.element());
 }
    
 public void reverse(){ 
      
     Integer temp;
     if(!queue.isEmpty()) {
         temp = this.queue.remove();
         this.reverse();
         this.queue.add(temp); 
      } 
 }
 
 public void printQueue()
 {
     System.out.println(this.queue.toString());
 }
}

class Question1 { 
 public static void main(String[] args) {
  Q obj = new Q();
  Scanner s = new Scanner(System.in);
  System.out.println(" enter size of queue : ");
  int n = s.nextInt();
  System.out.println(" enter elements of queue : ");
  for(int i=0;i<n;i++) {
	  obj.push(s.nextInt());
  }
  
  obj.printQueue();   
  obj.reverse();
  obj.printQueue();   
 }
}