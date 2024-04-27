public class MyArrayList {

    private Object arr[];
    private int num=0;

    public MyArrayList(int size){
        this.arr=new Object[size];
    }

    public boolean add(Object item){
        if(num==this.arr.length)growUp();
        this.arr[num]=item;
        num++;
        return true;
    }

    public boolean set(Object item,int index){
        if(index>=this.arr.length){
            growUp(index);
        }
        arr[index]=item;
        if(index>num)  num=index+1;
        return true;
    }
    public  boolean addFirst(Object item){
        if(num== arr.length){
            growUp();
        }
        for (int i=num-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=item;
        num++;
        return  true;

    }
    public  boolean addByIndex(Object item,int index){
        if(num== arr.length){
            growUp();
        }
        for (int i=num-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=item;num++;
        return  true;

    }
    public Object get(int index){
        return arr[index];
    }
    public  int size(){
        return num;
    }
    public  boolean removeLast(){
        if(num>0){
            arr[--num]=null;return true;
        }
        return false;
    }
    public  boolean removeFirst(){
        if(num>0) {
            for (int i = 1; i < num; i++) {
                arr[i - 1] = arr[i];
            }
            num--;
            arr[num]=null;
            return true;
        }
        return false;

    }
    public  boolean removeByIndex(int index){
        if(index< arr.length&&index>=0&&num>0) {
            for (int i = index+1; i < num; i++) {
                arr[i - 1] = arr[i];
            }
            num--;
            arr[num]=null;
            return true;
        }
        return false;

    }
    private void growUp(){
        Object []arr2=new Object[arr.length*2];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        this.arr=arr2;
    }

    private void growUp(int index){
        Object []arr2=new Object[index*2];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        this.arr=arr2;
    }
 


}
