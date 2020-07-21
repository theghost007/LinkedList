import java.util.LinkedList;

public class LinkedListMain {
    Node head;
    int count;

//    public LinkedListMain(){
//        head=null;
//        count=0;
//    }
    public LinkedListMain(Node newHead){
        head=newHead;
        count=1;
    }
    public void add(int newData){
        Node temp=new Node(newData);
        Node current=head;
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(temp);
        count++; 
    }
    public int get(int index){
        if(index<=0){
            return -1;
        }
      Node current=head;
        for (int i=1;i<index;i++){
            current=current.getNext();
        }
        return  current.getData();
    }
    public int size(){
        return  count;
    }
    public boolean isEmpty(){
        return  head==null;
    }
    // remove from the back of the list
    public void remove(){
        Node current=head;
        while(current.getNext().getNext()!=null){
            current=current.getNext();
        }
        current.setNext(null);
        count--;
    }


    public static void main(String[] args){
     LinkedList<String> linkedList=new LinkedList<String>();
     linkedList.add("alice");
        System.out.println(linkedList);
     linkedList.add("alicey");
        System.out.println(linkedList);
    }
}
