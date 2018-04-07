package CompetetiveProgramming.LeetCode.LinkedList;

/*
 created by @author : codedsun
 */

/*

    Problem Link : https://leetcode.com/problems/delete-node-in-a-linked-list
 */


public class DeleteNodeLL {

   public static class Node<Integer> {
       Integer element;
       Node<Integer> next;
       Node(Integer element, Node<Integer> next){
           this.element = element;
           this.next = next;

       }

   }
   static Node<Integer> head;
   public static void main(String args[]){
       head = new Node(1, null);
       head.next = new Node(2,null);
       head.next.next = new Node(3,null);
       head.next.next.next = new Node(4,null);
       delete(head);
       print(head);

   }
   public static void delete(Node<Integer> node){
       while(true){
           node.element = node.next.element;
           if(node.next.next==null){
               node.next = null;
               break;
           }
           else node = node.next;
       }





   }

   public static void print(Node<Integer> head){
       Node<Integer> node = head;
       while(node!=null){
           System.out.println(node.element);
           node = node.next;
       }
   }



}
