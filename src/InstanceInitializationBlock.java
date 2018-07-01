/**
 * @author : codedsun
 * Created on 01/07/18
 */
public class InstanceInitializationBlock {

    {
        System.out.println("Instance Initialization Block");
    }

    public InstanceInitializationBlock() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        InstanceInitializationBlock instanceInitializationBlock = new InstanceInitializationBlock();

    }
}
