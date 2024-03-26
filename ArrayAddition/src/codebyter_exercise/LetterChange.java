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
public class LetterChange {

    public static String LetterChange(String str) {
        String rs = "";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i])) {
                if (arr[i] == 'z') {
                    rs += 'a';
                } else {
                    if (arr[i] == 't' || arr[i] == 'd' || arr[i] == 'n' || arr[i] == 'z' || arr[i] == 'h') {
                        rs += (char) ((int) (arr[i] + 1) - 32);
                    } else {
                        rs += (char) ((int) arr[i] + 1) + "";
                    }
                }
            } else {
                rs += arr[i];
            }

        }
        return rs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(LetterChange(sc.nextLine()));
    }

}
