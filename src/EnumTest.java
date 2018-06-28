/*
    Class for checking the enum type and it's functionality
 */

enum Human{
    MALE, FEMALE
}
public class EnumTest {

    public static void main(String[] args) {
        System.out.println(Human.MALE);
        System.out.println(Human.FEMALE);
        System.out.println(Human.values());
    }
}
