public class StringIntern {
    @Override
    protected void finalize() {
        System.out.println("Finalized ");
    }

    public static void main(String[] args) {


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
