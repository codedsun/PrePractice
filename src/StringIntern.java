public class StringIntern {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized ");
    }

    public static void main(String[] args) throws Throwable {


        String s = "Suneet";
        String x = "Suneet";
        String z = s.intern();
        if(s==x){
            System.out.println("Equal s and x");
        }if(s==z){
            System.out.println("Equal s and z");
        }if(x==z){
            System.out.println("Equal z and x");
        }
    }
}
