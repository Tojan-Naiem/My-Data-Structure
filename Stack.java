import java.util.ArrayList;

public class Stack {
    ArrayList list;
    public Stack(){
        this.list=new ArrayList<>();
    }
    public void push(Object data){
        this.list.add(data);
    }
    public Object pop(){
        return this.list.remove(this.list.size()-1);
    }
    public Object peek(){
        return this.list.get(this.list.size()-1);
    }
    public int size(){
        return this.list.size();
    }
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
}
