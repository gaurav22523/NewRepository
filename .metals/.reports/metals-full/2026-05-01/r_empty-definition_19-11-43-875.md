error id: file:///C:/Users/gujar/OneDrive/Documents/Java/linked_list/doubley_linked_list.java:_empty_/obj#
file:///C:/Users/gujar/OneDrive/Documents/Java/linked_list/doubley_linked_list.java
empty definition using pc, found symbol in pc: _empty_/obj#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 798
uri: file:///C:/Users/gujar/OneDrive/Documents/Java/linked_list/doubley_linked_list.java
text:
```scala
package linked_list;

class Node{
    Node next;
    Node prev;
    int data;

    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class double_linked_list{
    Node head;
    Node last;

    public void create(int arr[],int n){
        head=new Node(arr[0]);
        last=head;

        for(int i=0;i<n;i++){
            Node newNode=new Node(arr[i]);
            last.next=newNode;
            newNode.prev=last;
            last=newNode;
        }
    }
    public void display(){
        Node t=head;
        while(t!=null){
            System.out.println(t.data);
        }
    }
}

public class doubley_linked_list {
    public static void main(String[] args) {
        int[] arr={2,5,6,8,9};
     @@obj=new double_linked_list();
        obj.create(arr,5);
        obj.display();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/obj#