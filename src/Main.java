import ImplSingleLinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        //add customer to queue
        list.push("Andi");
        list.push("Bayu");
        list.push("Cinta");

        //remove customer to queue
        list.pop();
        }
    }