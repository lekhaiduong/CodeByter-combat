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
public class LongestWord {

    public static String LongestWord(String str) { //hello worldddd -> wordddd(longest word in string)
        String[] result = str.split("[^a-zA-Z^0-9]");
        String total = "";
        int longestIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i].length() > longestIndex) {
                total = result[i];
                longestIndex = result[i].length();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(LongestWord(sc.nextLine()));
    }
}
