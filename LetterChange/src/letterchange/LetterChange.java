/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letterchange;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LetterChange {

    /**
     * this function is use to change the letter 1 unit. For example a -> b, b->c, c->d, ... , z->a
     * If the character after change is belong to 'u, e, o, a, i' then uppercase them
     * The number and specialChar will keep
     * Sample output: hello*4 -> Ifmmp*4
     */
    public static String LetterChange(String str) {
        return "1";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(LetterChange(sc.nextLine()));
    }
    
}
