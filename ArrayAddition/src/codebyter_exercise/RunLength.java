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
public class RunLength {

    public static String runLength(String str) { //helloo worlf -> he2l2o worlf
        StringBuilder result = new StringBuilder();
        char[] arr = str.toCharArray();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    result.append(arr[i]);
                } else {
                    result.append(count).append(arr[i]);
                    count = 1;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(runLength(sc.nextLine()));
    }
}
