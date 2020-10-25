import java.util.*;
public class DFS{
Stack<Node> S=new Stack<>();
static class Node{
int data;
ArrayList<Node> neighbour=new ArrayList<>();
boolean visit;
public Node(int v){
data=v;
}
public class Graph {
  private int[][] nodes; // all nodes; e.g. int[][] nodes = {{1,2,3}, {3,2,1,5,6}...};
  public int[] getAdjacentNodes(int v) {
  return nodes[v];
  }
// number of vertices in a graph
public int vSize() {
  return nodes.length;
  }
  }
public void addneighbour(Node n){
neighbour.add(n);
  }
public ArrayList<Node> getneighbour(Node n){
return n.neighbour;
  }
public void printneighbour(Node n){
ArrayList<Node> nn =getneighbour(n);
for(int i=0;i<nn.size();i++){
Node node=nn.get(i);
System.out.print(node.data+" ");
}
}
}
void dfs(Node n){
                S.add(n);//add
              while(!S.isEmpty()) {
              Node ex = S.pop();//remove
              System.out.print(ex.data+" ");//print
              ArrayList<Node> E = ex.getneighbour(ex);//getting nei and adding to queue
              for(int i=0;i<E.size();i++) {
              Node N=E.get(i);
              if(N!=null && N.visit==false) {//important condn
              S.add(N);
                }
              N.visit=true;
              }
              }
}
public static void main(String[] args){
DFS bf=new DFS();
Node no40=new Node(40);
Node no20=new Node(20);
Node no10=new Node(10);
Node no50=new Node(50);
Node no30=new Node(30);
Node no60=new Node(60);
Node no70=new Node(70);
no40.addneighbour(no20);
no40.addneighbour(no10);
no10.addneighbour(no30);
no20.addneighbour(no50);
no20.addneighbour(no60);
no20.addneighbour(no30);
no20.addneighbour(no10);
no30.addneighbour(no60);
no50.addneighbour(no70);
no60.addneighbour(no70);
DFS bf1=new DFS();
bf.dfs(no40);
}}
