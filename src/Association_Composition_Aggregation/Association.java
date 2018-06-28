package Association_Composition_Aggregation;

/**
 * @author : codedsun
 * Created on 28/06/18
 */

/**
 * Association is a mechanism through which one object can refer to another, their can be many types of association
 * 1.One to Many
 * 2.One to One
 * 3.Many to One
 * 4.Many to Many
 * <p>
 * Composition and Aggregation are the types of association
 */

class Bank {
    public Bank(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee{
    public Employee(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Association {

    public static void main(String[] args) {
        Bank b1 = new Bank("Axis");
        Employee e1 = new Employee("Ashish");
        System.out.println(e1.getName()+" is an Employee at "+b1.getName());

    }
}
