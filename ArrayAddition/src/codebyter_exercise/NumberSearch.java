/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codebyter_exercise;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NumberSearch {

    public static int numberSearch(String str) {  //he4 llo5 -> (4+5) / lengthOfChar(5)-> 9/5
        float total = 0;
        int countLetter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
                total += Integer.parseInt(str.charAt(i) + "");
            }
            if (Character.isLetter(str.charAt(i))) {
                countLetter++;
            }
        }
        System.out.println("total = "+total / countLetter);
        return Math.round(total / countLetter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(numberSearch(sc.nextLine()));
    }
}
