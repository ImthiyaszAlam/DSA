public class CycleDetection {

    public static Node hNode;

    public static void main(String[] args) {
        CycleDetection cd = new CycleDetection();
        cd.insertAtEnd(1);
        cd.insertAtEnd(2);
        cd.insertAtEnd(3);
        cd.insertAtEnd(4);
        cd.insertAtEnd(5);

        cd.createCycle(2); // Creating a cycle at index 2 (node with value 3)

        if (cd.hasCycle()) {
            System.out.println("Cycle detected in Linked List.");
        } else {
            System.out.println("No cycle in Linked List.");
        }
    }

    public static boolean hasCycle() {
        Node slow = hNode;
        Node fast = hNode;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void insertAtEnd(int data) {
        Node node = new Node(data);
        if (hNode == null) {
            hNode = node;
            return;
        }

        Node temp = hNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public static void printLL() {
        Node temp = hNode;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void createCycle(int pos) {

        if (pos == -1) {
            return;
        }
        Node temp = hNode;
        Node cycleNode = null;
        int count = 0;
        while (temp.next != null) {
            cycleNode = temp;
            temp = temp.next;
            count++;
        }

        temp.next = cycleNode;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
