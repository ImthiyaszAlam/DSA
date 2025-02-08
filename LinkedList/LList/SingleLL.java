public class SingleLL {

    Node hNode;

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = hNode;
        hNode = newNode;
    }

    void printLList(){
        Node temp = hNode;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);

        list.printLList();
    }
}

class Node {
    int data;
    Node next;

    Node(int d){
        this.data = d;
        this.next = null;
    }
}
