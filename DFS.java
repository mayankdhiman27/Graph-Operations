
package graphsadjlist;
import java.util.*;
/**
 * using adjacency list with unidirectional graph
 *
 * @author dmayank
 */
public class GraphsAdjListDFS {
    
    static ArrayList<Node> arr=new ArrayList<>();
    
    static class Node{
        int data;
        Node next;
        
        public Node(){
            
        }
        
        public Node(int d){
            data=d;
            next=null;
        }
    }
    
    public void addEdge(int a, int b){
        
        Node temp=arr.get(a);
        if(temp.next==null){
            Node n2=new Node(b);
            temp.next=n2;
            Node head=temp.next;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            Node n3=new Node(b);
            temp.next=n3;
        }
        
    }
    
    public void display(){
        for(int i=0;i<arr.size();i++){
            Node temp=arr.get(i);
            if(temp.next!=null){
                System.out.print(i+" -> ");
                Node head=temp.next;
                while(head!=null){
                    System.out.print(head.data+" -> ");
                    head=head.next;
                }
            }
            System.out.println();
        }
    }
    
    //Function for DFS
    public void DFS(){
        
        int visited[]=new int[arr.size()];
        
        Node temp=new Node();
        for(int i=0;i<arr.size();i++){
            temp=arr.get(i);
            while(temp.next!=null){
                if(visited[temp.data]==0){
                    visited[temp.data]=1;
                    System.out.print(temp.data+" ");
                }
                temp=temp.next;
            }
            
        }
        
    }
    
    
    //Function to find connection between nodes
    public boolean findRasta(int a,int b){
        Queue q1=new LinkedList<>();
        int traverse[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            traverse[i]=0;
        }
        Node temp=arr.get(a);
        if(temp.data==b){
            return true;
        }
        else{
        q1.add(temp);
        traverse[temp.data]=1;
        //if(temp.next==null){
            
        //}
        while(!q1.isEmpty()){
            Node tmp=(Node)q1.poll();
            Node head=arr.get(tmp.data);
            Node newhead=head.next;
            
                    while(newhead!=null){
                        if(newhead.data==b){
                        return true;
                     }
                        else{
                            if(traverse[newhead.data]==0){
                                q1.add(newhead);
                                traverse[newhead.data]=1;
                            }
                        newhead=newhead.next;
                        //
                        }
                    }
                
            
        }
        }  
           return false;
    }
    
    public static void main(String[] args) {
            
        GraphsAdjListDFS graph=new GraphsAdjListDFS();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no of nodes...");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            Node n1=new Node(i);
            arr.add(n1);
        }
        
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(4,1);
        
        graph.display();
        
        System.out.println("Enter nodes to search way...");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        if(graph.findRasta(a1,a2)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        //int v=sc.nextInt();
        graph.DFS();
    }
    
}

