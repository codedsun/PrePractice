package MethodOverloading;

import sun.applet.Main;

/**
 * @author : codedsun
 * Created on 01/07/18
 */
public class MainOverloading {

    public static void main(String[] args) {
        System.out.println("Simple main with [] args");
        //Calling other main func
        MainOverloading.main("Suneet");
    }

    public static void main(String args){
        System.out.println("Main with only String args");
        main();
    }

    public static void main(){
        System.out.println("Main with no args");
    }
}
