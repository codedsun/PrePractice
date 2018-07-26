package Tree.GFG_BinaryTree.Introduction;

/**
 * @author : codedsun
 * Created on 26/07/18
 */
public class ExpressionTreeEvaluation {
    /**
     * Function to evaluate the tree
     * @see ExpressionTreeCreation for usage
     * @param tree - the tree input
     * @return the result evaluated
     */
    public static int evaluateTree(ExpressionTreeCreation.Node tree) {
        if (tree.left == null && tree.right == null) {
            return toDigit(tree.data);
        } else {
            int result = 0;
            int leftResult = evaluateTree(tree.left);
            int rightResult = evaluateTree(tree.right);
            char operator = tree.data;
            switch (operator) {
                case '+':
                    result = leftResult + rightResult;
                    break;
                case '-':
                    result = leftResult - rightResult;
                    break;
                case '/':
                    result = leftResult / rightResult;
                    break;
                case '*':
                    result = leftResult * rightResult;
                    break;
                case '^':
                    result = (int) Math.pow(leftResult, rightResult);
                    break;
            }
            return result;
        }

    }

    //How's this shit working
    //Any char has the numeric value equal to its equivalent deximal value, hence it's subtracted
    private static int toDigit(char data) {
        return data - '0';

    }

}
