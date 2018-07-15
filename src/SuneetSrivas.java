/**
 * @author : codedsun
 * Created on 15/07/18
 */
public class SuneetSrivas {

    SuneetSrivas(){
        Sankalp sankalp = new Sankalp();
//        System.out.println(sankalp.hashCode());
        System.out.println(this.hashCode() + "   " +
                sankalp.hashCode());
    }

    public static void main(String[] args) {

        SuneetSrivas suneetSrivas = new SuneetSrivas();


    }
}
