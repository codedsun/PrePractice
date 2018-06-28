/*

    Created by
    @author : codedsun
    @date : 05/April/2018

    This is a test for static nested class
    We can't invoke static class through instance variable or reference variable


 */


public class NestedStaticClass {

    private static String TAG = "NestedStatic Class";

    private static class NestedInnerClass{
        void display(){
            System.out.println("Hello from "+getClass().getCanonicalName());
        }
    }

    public static String getTAG() {
        return TAG;
    }

    public static void main(String[] args) {
       NestedStaticClass nestedStaticClass = new NestedStaticClass();

        System.out.println(getTAG());
       /*
       You can't access the static class heere but you can access by creating the object
        */
//       nestedStaticClass.NestedInnerClass;

        NestedStaticClass.NestedInnerClass nestedInnerClass = new NestedInnerClass();
        nestedInnerClass.display();
    }
}
