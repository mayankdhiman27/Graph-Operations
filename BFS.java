
package graphsadjlistbfs;
import java.util.*;
/**
 *
 * @author dmayank
 */
public class GraphsAdjListBFS {
    
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
    
    //Function for BFS using queue
    public void BFS(){
        
        int visited[]=new int[arr.size()];
        Queue q=new LinkedList<>();
        
        Node temp=arr.get(0);
        //Node head=arr.get(0);
        q.add(temp);
        visited[temp.data]=1;
        //System.out.print(temp.data+" ");
        while(!q.isEmpty()){
            Node tmp=(Node)q.poll();
            System.out.print(tmp.data+" ");
            Node head=arr.get(tmp.data);
            Node newhead=head.next;
            while(newhead!=null){
                if(visited[newhead.data]==0){
                    q.add(newhead);
                    visited[newhead.data]=1;
                }
                newhead=newhead.next;
            }
        }
    }
    
    public static void main(String[] args) {
            
        GraphsAdjListBFS graph=new GraphsAdjListBFS();
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
        
        
        graph.BFS();
    }
    
}

package graphsadjlistbfs;
import java.util.*;
/**
 *
 * @author dmayank
 */
public class GraphsAdjListBFS {
    
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
    
    //Function for BFS using queue
    public void BFS(){
        
        int visited[]=new int[arr.size()];
        Queue q=new LinkedList<>();
        
        Node temp=arr.get(0);
        //Node head=arr.get(0);
        q.add(temp);
        visited[temp.data]=1;
        //System.out.print(temp.data+" ");
        while(!q.isEmpty()){
            Node tmp=(Node)q.poll();
            System.out.print(tmp.data+" ");
            Node head=arr.get(tmp.data);
            Node newhead=head.next;
            while(newhead!=null){
                if(visited[newhead.data]==0){
                    q.add(newhead);
                    visited[newhead.data]=1;
                }
                newhead=newhead.next;
            }
        }
    }
    
    public static void main(String[] args) {
            
        GraphsAdjListBFS graph=new GraphsAdjListBFS();
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
        
        
        graph.BFS();
    }
    
}

