public class LocalInnerClass {

    public void getValue(){
        int sum = 20;
        /*
        Local Inner class declaraation
         */
         class Suneet{

             void print(){
                 System.out.println(sum);
             }
        }
        Suneet s = new Suneet();
         s.print();
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.getValue();
    }
}
