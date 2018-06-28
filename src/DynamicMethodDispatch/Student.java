package DynamicMethodDispatch;

/**
 * @author : codedsun
 * Created on 28/06/18
 */

/**
 * Also known as Runtime Polymorphism, in which the overridden methods are resolved at run time
 * rather than at compile time.
 */
public class Student {

    public void show() {
        System.out.println("Student");
    }

}

class CollegeStudent extends Student {

    public void show() {
        System.out.println("College");

    }

    public static void main(String[] args) {
        Student s = new CollegeStudent();
        CollegeStudent s1 = new CollegeStudent();
        s.show();
        s1.show();
        s = new Student();
//        s1= new Student();//Doesnt' happen

        //
        s.show();

    }

}