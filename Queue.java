public class Queue {
    LinkedList list;
    public Queue(){
        list=new LinkedList();
    }
    public void  enQueue(Object data){
        list.addLast(data);
        
    }
    public Object deQueue(){
        if(!isEmpty())return list.removeFirst();
        System.out.println("The queue is empty");
        return "";
    }
    public Object front(){
        if(!isEmpty())return list.get(0);
        System.out.println("The queue is empty");
        return "";
    }
    public int size(){
        return this.list.size();
    }

    public boolean isEmpty(){
        return this.list.size()==0 ?true:false;
    }
}
