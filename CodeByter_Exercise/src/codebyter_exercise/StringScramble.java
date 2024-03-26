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
public class StringScramble {

    public static String StringScramble(String str1, String str2) { //cdore - coder --> true
        for (int i = 0; i < str2.length(); i++) {
            int index = str1.indexOf(str2.charAt(i));
            if (index == -1) {
                return "false";
            }
            str1 = str1.substring(0, index) + str1.substring(index + 1);
        }
        return "true";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(StringScramble(sc.nextLine(), sc.nextLine()));
    }
}
