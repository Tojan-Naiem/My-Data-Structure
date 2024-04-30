
public class Node {
    private Object data;
    private Node next;
    public Node(Object data){
        this.data=data;
    }
    public Node(Object data,Node next){
        this.data=data;
        this.next=next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class LinkedList {
    private Node head;
    private int size=0;
    LinkedList(Object  data){
        this.head=new Node(data);
    }
    LinkedList(){

    }
    public boolean addFirst(Object data){
        if(this.head==null){
            this.head=new Node(data);return true;
        }
        Node newNode=new Node(data);
        newNode.setNext(this.head);
        this.head=newNode;
        size++;
        return true;

    }
    public boolean addLast(Object data){
        if(this.head==null){
            this.head=new Node(data);
            return true;
        }
        Node temp=head;
        Node newNode=new Node(data);

        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(newNode);
        size++;
        return true;
    }
    public boolean addByIndex(Object data,int index){
        if(this.head==null)return false;
        Node newNode=new Node(data);
        Node temp=this.head;
        while(index>0&&temp!=null){
            temp=temp.getNext();
            index--;
        }
        if(index!=0)return false;
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        this.size++;
        return true;
    }

    public Object removeFirst(){
        if(this.head==null)return null;
        Node temp=this.head;
        this.head=head.getNext();
        this.size--;
        return temp.getData();

    }
    public Object removeLast(){
        if(this.head==null)return null;
        Node temp=this.head;

        while(temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }
        Node t=temp.getNext();
        temp.setNext(null);
        this.size--;
        return t.getData();


    }
    public Object removeByIndex(int index){
        if(this.head==null)return null;
        Node temp1=this.head;
        Node temp2=this.head;
        while(temp1!=null&&index>0){
            temp2=temp1;
            temp1=temp1.getNext();
            index--;
        }
        if(index!=0)return null;
        temp2.setNext(temp1.getNext());
        this.size--;
        return temp1.getData();
    }
    public int size(){
        return this.size;
    }
    public Object get(int index){
        if(head==null)return null;
        Node temp=this.head;
        while(temp!=null&&index!=0){
            temp=temp.getNext();
            index--;
        }
        if(index!=0)return null;
        return temp.getData();
    }

}
