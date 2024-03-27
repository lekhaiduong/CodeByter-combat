/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runlength;

import java.util.Scanner;

/**
 *
 * this function is use to count the appearance of character which next to same
 * character and return the count + character
 */
public class RunLength {

    public static String runLength(String str) { //helloo worlf -> he2l2o worlf
        StringBuilder rs = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    rs.append(str.charAt(i));
                } else {
                    rs.append(count).append(str.charAt(i));
                    count = 1;
                }
            }
        }
        return rs.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(runLength(sc.nextLine()));
    }

}
