/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_5;

import java.util.Scanner;

/**
 *
 * @author prylz2189
 */
public class A5Q1V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        //Ask the user what they want translated to ubidubi
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter what you wish to be translated to ubidubi");
        String english = input.nextLine();
        int length = english.length();
        //If the first leter is a vowel at ub before it
        if (i == 0
                && (english.startsWith("a")
                || english.startsWith("e")
                || english.startsWith("i")
                || english.startsWith("o")
                || english.startsWith("u"))) {
            english = "ub" + english;
            i = i + 3;
        }
        for (i = i; i < length; i++) {
            //If there are other vowels without a vowel before them add up before it
            if (((english.charAt(i) == 'a')
                    || (english.charAt(i) == 'e')
                    || (english.charAt(i) == 'i')
                    || (english.charAt(i) == 'o')
                    || (english.charAt(i) == 'u'))
                    && ((english.charAt(i - 1) != 'a')
                    && (english.charAt(i - 1) != 'e')
                    && (english.charAt(i - 1) != 'i')
                    && (english.charAt(i - 1) != 'o')
                    && (english.charAt(i - 1) != 'u')))
            {
                english = english.replace(english.charAt(i) + "", "ub" + english.charAt(i));
                i = i + 2;
            }
        }
        //Print the translated version
        System.out.println(english);
    }
}
