package InterfaceAndAbstract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Suneet",1));
        arrayList.add(new Student("Vineet",2));
        arrayList.add(new Student("Suneeta",3));
        arrayList.add(new Student("Suneetaaaa",4));
        arrayList.add(new Student("Srivastava",5));
        arrayList.add(new Student("Satyam Yadav",1));
        arrayList.add(new Student("Suyash ",1));

        Collections.sort(arrayList,new SortByName());
        print(arrayList);

    }

    public static void print(ArrayList<Student> arrayList){
        for(Student s : arrayList){
            s.print();
        }
    }
}

class Student{

    String name;
    int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void print(){
        System.out.println(rollNo+ " "+name);
    }
}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortByRollNo implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo - o2.rollNo;
    }
}
