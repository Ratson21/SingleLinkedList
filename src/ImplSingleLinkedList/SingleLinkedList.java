package ImplSingleLinkedList;

public class SingleLinkedList {
    private Customer head = null;
    private Customer tail = null;

    public void push(String name) {
        Customer customer = new Customer(name);
        if (head != null) {
            head.next = customer;
        }else{
            head = customer;
        }
        tail = customer;
        System.out.println("add " + name + " to the list");
    }

    public String pop() {
        if (head == null) {
            System.out.println("Tidak ada antrian.");
            return null;
        }
        String nama = head.getName();
        head = head.next;
        if (head == null) tail = null;
        System.out.println("remove " + nama + " from the list");
        return nama;
        }
    }
