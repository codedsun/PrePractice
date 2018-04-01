/*
    it checks that the main method object is not created
 */

abstract class Ques1 {
    public static void main(String args[]){
        System.out.println("Suneet, the main method instance is not created");
    }

    public static void suneet(){
        System.out.println("Hello");
    }

}

class SuneetSri extends Ques1{

   public static void main(String args[]){
       suneet();
   }

//    As the abstract method object is not created
//   Ques1 ques1 = new Ques1();
}