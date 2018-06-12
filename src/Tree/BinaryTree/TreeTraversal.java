package Tree.BinaryTree;

import ListADT.Position;
import Queue.LinkedQueue;
import Queue.Queue;
import javafx.geometry.Pos;
import sun.net.www.http.PosterOutputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author : codedsun
 * Created on 10/Jun/2018
 */



/*
   Class for Tree Traversal for Inorder, PreOrder, PostOrder
   For Example : + is root,
                 A is left child, B is right child
   @Inorder - Left Root Right (A+B)
   @PreOrder - Root Left Right (+AB)
   @PostOrer - Left Right Root (AB+)
 */

public class TreeTraversal<E> {
    static LinkedBinaryTree<Integer> tree;

    private static void PreOrderTraversal() {
        tree.positions().forEach(new Consumer<Position<Integer>>() {
            @Override
            public void accept(Position<Integer> integerPosition) {
                System.out.println(integerPosition.getElement());
            }
        });
    }

    private static void PostOrderTraversal() {
        tree.postOrder().forEach(new Consumer<Position<Integer>>() {
            @Override
            public void accept(Position<Integer> integerPosition) {
                System.out.println(integerPosition.getElement());
            }
        });

    }

    private static List<Position<Integer>> BreadthFirstTraversal(){
        Queue<Position<Integer>> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue(tree.root);
        List<Position<Integer>> snapshot = new ArrayList<>();
        while(!linkedQueue.isEmpty()){
            Position<Integer> p = linkedQueue.dequeue();
            snapshot.add(p);
            for(Position<Integer> child : tree.children(p)){
                linkedQueue.enqueue(child);
            }

        }
        return snapshot;
    }

    public static void main(String[] args) {


        tree = new LinkedBinaryTree<>();
        tree.addRoot(1);
        tree.addLeft(tree.root, 2);
        tree.addRight(tree.root, 3);
        PreOrderTraversal();
        PostOrderTraversal();
        tree.inOrder().forEach(new Consumer<Position<Integer>>() {
            @Override
            public void accept(Position<Integer> integerPosition) {
                System.out.println(integerPosition.getElement());
            }
        });
        BreadthFirstTraversal().forEach(new Consumer<Position<Integer>>() {
            @Override
            public void accept(Position<Integer> integerPosition) {
                System.out.println(integerPosition.getElement());
            }
        });
    }
}
