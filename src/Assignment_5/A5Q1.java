
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author prylz2189
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ask user to input what they want translated
        System.out.println("Please enter what you wish to be translated to ubidubi");
        Scanner input = new Scanner(System.in);
        String english = input.nextLine();
        //Put ub before all vowels
        String a1 = english.replace("u", "ubu");
        String a2 = a1.replace("a", "uba");
        String a3 = a2.replace("e", "ube");
        String a4 = a3.replace("i", "ubi");
        String a5 = a4.replace("o", "ubo");
        //For any groups of three vowels in a row remove the second and third ub
        String a6 = a5.replace("ubaubaub","ubaa");
        String a7 = a6.replace("ubaubeub","ubae");
        String a8 = a7.replace("ubaubiub","ubai");
        String a9 = a8.replace("ubauboub","ubao");
        String a10 = a9.replace("ubaubuub","ubau");
        String a11 = a10.replace("ubeubaub","ubea");
        String a12 = a11.replace("ubeubeub","ubee");
        String a13 = a12.replace("ubeubiub","ubei");
        String a14 = a13.replace("ubeuboub","ubeo");
        String a15 = a14.replace("ubeubuub","ubeu");
        String a16 = a15.replace("ubiubaub","ubia");
        String a17 = a16.replace("ubiubeub","ubie");
        String a18 = a17.replace("ubiubiub","ubii");
        String a19 = a18.replace("ubiuboub","ubio");
        String a20 = a19.replace("ubiubuub","ubiu");
        String a21 = a20.replace("uboubaub","uboa");
        String a22 = a21.replace("uboubeub","uboe");
        String a23 = a22.replace("uboubiub","uboi");
        String a24 = a23.replace("ubouboub","uboo");
        String a25 = a24.replace("uboubuub","ubou");
        String a26 = a25.replace("ubuubaub","ubua");
        String a27 = a26.replace("ubuubeub","ubue");
        String a28 = a27.replace("ubuubiub","ubui");
        String a29 = a28.replace("ubuuboub","ubuo");
        String a30 = a29.replace("ubuubuub","ubuu");
        //For any 2 vowels in a row remove the second ub
        String a31 = a30.replace("ubaub","uba");
        String a32 = a31.replace("ubeub","ube");
        String a33 = a32.replace("ubiub","ubi");
        String a34 = a33.replace("uboub","ubo");
        String a35 = a34.replace("ubuub","ubu");
        //print the translated ubidubi
        System.out.println(a35);

    }
}
