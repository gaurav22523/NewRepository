error id: file:///C:/Users/gujar/OneDrive/Documents/Java/linked_list/creating_linked_list.java:java/lang/System#
file:///C:/Users/gujar/OneDrive/Documents/Java/linked_list/creating_linked_list.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1210
uri: file:///C:/Users/gujar/OneDrive/Documents/Java/linked_list/creating_linked_list.java
text:
```scala
package linked_list;

import java.util.zip.CRC32;

import org.w3c.dom.Node;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class create{
    Node head;
    Node last;
    public void linked(int arr[],int n){
        head=new Node(arr[0]);
        last=head;

        for(int i=1;i<n;i++){
            last.next=new Node(arr[i]);
            last=last.next;
        }

    }
    public void insert(int x,int p){
        Node t=head;
        Node n;
        n=new Node(x);
        if(p==0){
            n.next=head;
            head=n;
        }else{
            for(int i=0;i<p-1;i++){
                t=t.next;
                n.next=t.next;
                t.next=n;
            }
        }
    }
    public void delete(int p){
        Node t=head;
     
        if(p==0){
            head=head.next;
        }else{
            for(int i=0;i<p-1;i++){
                t=t.next;
            }
            if(t.next!=null){
                t.next=t.next.next;
            }
            
        }

    }

    public void display(){
        Node p=head;
        
            @@System.out.println(p.data);
            p=p.next;
        
    }

}
public class creating_linked_list {
    public static void main(String[] args) {
        int[] arr={2,5,6,8,9};
        create obj=new create();
        obj.linked(arr, 5);
        // obj.delete(4);
        // obj.insert(10, 2);
        obj.display(5);

    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#