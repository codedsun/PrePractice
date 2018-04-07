package CompetetiveProgramming.LeetCode.LinkedList;

import LinkedList.SinglyLinkedList;
import com.sun.istack.internal.NotNull;

public class RemoveDuplicates {

    private static SinglyLinkedList<Integer> head = new SinglyLinkedList<>();
    public static void main(String args[]){
        head.addFirst(1);
        head.addLast(1);
        head.addLast(2);
        head.addLast(3);
        head.addLast(3);
        head.printList();
        System.out.println();
        callMe(head);
        System.out.println();
        System.out.println("LET'S CHECK ");
        head.printList();
    }

   static void callMe(@NotNull  SinglyLinkedList<Integer> list){
        SinglyLinkedList<Integer> suneet = list;
        suneet.removeFirst();

        suneet.printList();
        list.printList();
    }

}
