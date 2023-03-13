public class SinglyLinkedList {

    private Node head;
    private int length;

    public SinglyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void insert(int n) {
        Node newNode = new Node(n);
        Node tmp = head;
        if (head == null) {
            head = newNode;
            length++;
        }else {
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
            length++;
        }
    }

    public void delete(int val) {
        Node tmp = head;
        Node prev = head;
        if (tmp.value == val) {
            tmp = tmp.next;
            head =tmp;
        }else  {
            while(tmp.value != val) {
                prev = tmp;
                tmp = tmp.next;
            }
            prev.next = tmp.next;
        }
    }

    public void update(int oldValue, int newValue) {

        Node tmp = head;
        if (tmp.value == oldValue) {
            tmp.value = newValue;
        } else {
            while(tmp.value != oldValue) {
                tmp = tmp.next;
            }
            tmp.value = newValue;
        }
    }


    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
}
