package Tree.GFG_BinaryTree.Traversals;

/**
 * @author : codedsun
 * Created on 30/07/18
 */

import java.util.Scanner;

/**
 * The problem is to find postOrderTraversal from PreOrderTraversal in
 * <b>Binary Search Tree</b>
 */
public class PostOrderFromPreOrderinBST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        postOrderFromPreOrder(a);

    }

    private static void postOrderFromPreOrder(int a[]) {
        int root = a[0];
        int i;
        for (i = 1; i < a.length; i++) {
            if (a[i] >= root){
                break;
            }
        }

        for(int j=i-1;j>0;j--){
            System.out.println(a[j]);
        }
        for(int k = a.length-1; k>=i;k--){
            System.out.println(a[k]);
        }
        System.out.println(root);
    }

}
