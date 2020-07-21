public class Node {
    Node next;
    int data;

    public Node(int newData){
        data=newData;
        next=null;
    }
    public Node(int newData,Node newNext){
        data=newData;
        next=newNext;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNext) {
        this.next = newNext;
    }

    public int getData() {
        return data;
    }

    public void setData(int newData) {
        this.data = newData;
    }
}
