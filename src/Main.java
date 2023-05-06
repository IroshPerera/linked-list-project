import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        /*declare LinkedList type object and initialize LinkedList type reference variable*/

        linkedList.add(10);
        linkedList.add(25);
        linkedList.add(1);
        linkedList.add(24);
        /*Initialize values*/

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);
        /*remove first object of the linkedList*/

        linkedList.removeLast();
        System.out.println(linkedList);
        /*remove last object of the linkedList*/

        linkedList.addFirst(35);
        /*add object for the beginning of the linkedList*/

        linkedList.addLast(100);
        /*add object for the last of the linkedList*/

        System.out.println(linkedList.size());
        /*print length linkedList of the linkedList*/

        linkedList.clear();
        /*clear all object of the linkedList*/

        System.out.println(linkedList.size());


    }
}
