package ImplSingleLinkedList;

public class Customer {
    private String name;
    Customer next;

    public Customer(String name) {
        this.name = name;
        next = null;
    }
    public String getName() {
        return name;
    }
}
