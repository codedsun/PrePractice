package LeetCode.LinkedList;

import LinkedList.SinglyLinkedList;

public class MergeLL {
    private  SinglyLinkedList<Integer> list1 = new SinglyLinkedList();
    private  SinglyLinkedList<Integer> list2 = new SinglyLinkedList();
    private  SinglyLinkedList<Integer> mergeList = new SinglyLinkedList();

    public static void main(String args[]){
        MergeLL mergeLL = new MergeLL();
        mergeLL.list2.addFirst(1);
        mergeLL.list2.addLast(2);
        mergeLL.list2.addLast(3);
        mergeLL.list1.addFirst(1);
        mergeLL.list1.addLast(2);
        mergeLL.list1.addLast(4);


        mergeLL.merge( mergeLL.list1,  mergeLL.list2);

    }

    private  void merge(SinglyLinkedList<Integer> list1, SinglyLinkedList<Integer> list2){

        while(list1.head!=null || list2.head!=null){
            if(list1.head.getElement()<list2.head.getElement()){
                mergeList.addLast(list1.head.getElement());
                list1.head = list1.head.getNext();
            }
            else if(list1.head.getElement() == list2.head.getElement()){
                mergeList.addLast(list1.head.getElement());
                mergeList.addLast(list2.head.getElement());
                list1.head = list1.head.getNext();
                list2.head = list2.head.getNext();
            }
            else {
                mergeList.addLast(list2.head.getElement());
                list2.head = list2.head.getNext();
            }
        }
        mergeList.printList();

    }


}
