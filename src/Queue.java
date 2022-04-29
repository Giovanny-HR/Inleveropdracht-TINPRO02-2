//package Queue;
public class Queue {

    private  LinkedList queue = new LinkedList();

    public void push(Muppet m){
        queue.push(m,size() + 1);//Queue push Muppet at position 1
    }
    Muppet pop(){
        return queue.pop(1 );
    }
    int size(){

        return queue.getSize();
    }
    public void print(){
        queue.print();

    }

}
