package Tree.BinaryTree;

/**
 * @author : codedsun
 * Created on 10/Jun/2018
 */

import ListADT.Position;

import java.util.Iterator;

/**
 * Implementation of Tree through linked structure
 *
 * @see Tree.AbstractTree
 * @see AbstractBinaryTree
 */

//  Here we have assumed, that if the parent of node is self node then it's an invalid node;
//  helps in removal operation

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {


    //Nested class to represent a Node of Tree

    protected static class Node<E> implements Position<E> {
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        @Override
        public E getElement() throws IllegalStateException {
            return element;
        }

        Node(E e, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = e;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }

        public void setNull(){
            this.left = null;
            this.right = null;
        }
    }

    protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right) {
        return new Node<E>(e, parent, left, right);
    }

    protected Node<E> root = null;
    private int size = 0;

    public LinkedBinaryTree() {
        //Construct an Empty Linked Binary Tree
    }

    protected Node<E> validate(Position<E> p) {
        if (!(p instanceof Node)) throw new IllegalArgumentException("Not valid position");
        if (((Node) p).getParent() == p) throw new IllegalArgumentException("Node is no longer in the tree");
        return (Node) p;

    }

    /**
     * Accessor Methods and Implementation of abstract methods.
     *
     * @return
     */

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterable<Position<E>> positions() {
        return super.positions();
    }

    @Override
    public Position<E> root() {
        return root;
    }

    @Override
    public Position<E> parent(Position<E> parent) {
        Node<E> node = validate(parent);
        return node.getParent();
    }

    @Override
    public Position<E> left(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getLeft();
    }

    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        Node node = validate(p);
        return node.getRight();
    }

    /*
      Updation methods
     */

    public Position<E> addRoot(E e) throws IllegalStateException {
        if (!isEmpty()) throw new IllegalStateException("Tree is not empty");
        else
            root = createNode(e, null, null, null);
        size = 1;
        return root;
    }

    public Position<E> addLeft(Position<E> p, E e) {
        Node<E> node = validate(p);
        if (node.getLeft() != null) throw new IllegalArgumentException("Node has already a left child");
        else {
            Node child = new Node(e, node, null, null);
            node.setLeft(child);
            size++;
            return child;
        }
    }

    public Position<E> addRight(Position<E> p, E e) {
        Node<E> node = validate(p);
        if (node.getRight() != null)
            throw new IllegalArgumentException("Node has already right child");
        else {
            Node child = new Node(e, node, null, null);
            node.setRight(child);
            size++;
            return child;
        }
    }

    public E set(Position<E> p, E e) throws IllegalArgumentException{
        Node<E> node = validate(p);
        E element = node.getElement();
        node.setElement(e);
        return element;
    }
    /**
        Attach 2 subtrees to a position
        @param : p
     */
    public void attach(Position<E> p, LinkedBinaryTree<E> tree1, LinkedBinaryTree<E> tree2){
        Node<E> node = validate(p);
        if(isInternal(p)) throw new IllegalArgumentException("Node must be a leaf");

        size = size+ tree1.size() + tree2.size();
        if(!tree1.isEmpty()){
            tree1.root.setParent(node);
            node.setLeft(tree1.root);
            tree1.size = 0;
        }
        if(!tree2.isEmpty()){
            tree2.root.setParent(node);
            node.setRight(tree2.root);
            tree2.size = 0;
        }
    }
    /*
    Removes the node and replaces it with child, if present
     */
    public E remove(Position<E> p) throws IllegalArgumentException{
        Node<E> node  = validate(p);
        if(numChildren(p) == 2) throw new IllegalArgumentException("Node has two children");
        Node<E> child = node.getLeft()!=null ? node.getLeft() : node.getRight();
        if(child!=null){
            child.setParent(node.getParent());
        }
        if(node == root()){
            root = child;
        }
        else{
            Node<E> parent = node.getParent();
            if(node == parent.getLeft()){
                parent.setLeft(child);
            }
            else{
                parent.setRight(child);
            }
        }
        size--;
        node.setParent(node);
        node.setNull();
        return node.getElement();
    }

    public static void main(String[] args) {
        LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();
        tree.addRoot(1);
        tree.addLeft(tree.root,2);
        System.out.println(tree.size());

    }
}
