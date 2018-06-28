package Association_Composition_Aggregation;

/**
 * @author : codedsun
 * Created on 28/06/18
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
class Student {
    int id;
    String name;
    String dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Student(int id, String name, String dept) {

        this.id = id;
        this.dept = dept;

        this.name = name;
    }

}

class Department {
    String name;
    List<Student> students;

    public Department(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

class Institute {
    String name;
    List<Department> departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public Institute(String name, List<Department> departments) {

        this.name = name;
        this.departments = departments;
    }
}

public class Aggregation {

    public static void main(String[] args) {
        Student suneet = new Student(1,"Suneet","IT");
        Student suyash = new Student(2,"Suyash","IT");
        Student brijesh = new Student(3,"Brijesh","CE");
        Student niks = new Student(4,"Nikhil","CE");
        List<Student> cs = new ArrayList<>();
        cs.add(suneet);
        cs.add(suyash);
        List<Student> ce = new ArrayList<>();
        ce.add(brijesh);
        ce.add(niks);
        Department csDept = new Department("CS",cs);
        Department ceDept = new Department("CE",ce);
        List<Department> departments = new ArrayList<>();
        departments.add(csDept);
        departments.add(ceDept);
        Institute institute = new Institute("IPEC",departments);
        System.out.println(institute.name);
    }
}
