/*
    Used to check some of the references of null and its functioning
 */

public class NULLCheck {

    public static void main(String[] args) {
        NULLCheck check = null;
        Integer i = null;
        Integer i1 =10;
        System.out.println(i instanceof Integer);
        System.out.println(i1 instanceof Integer);
        check.Suneet();
    }

    private static void Suneet(){
        System.out.println("hello I am called");
    }
}
