/*
 @author : codedsun
 Created on 26/April/2018
 */

/*
An island of isolation is referred when one object refers to another and another refers to it and these objects
are not referenced by any other active object in the code.
Any object that is not accessible from root set of references can be garbage collected.

 */

public class IslandOfIsolation {
    IslandOfIsolation islandOfIsolation;

    public static void main(String[] args) {

        IslandOfIsolation obj1 = new IslandOfIsolation();
        IslandOfIsolation obj2 = new IslandOfIsolation();
        obj1.islandOfIsolation = obj2;
        obj2.islandOfIsolation = obj1;

        obj2 = null;
        obj1 = null;



        System.gc();


    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC Called");
    }
}

