/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayaddition;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class ArrayAddition {
    //this function is use to calculate if any addition of array equal to the max element then return true

    public static String ArrayAddition(int[] arr) {
        Arrays.sort(arr);

        return "false";
    }

    public static void main(String[] args) {
        int[] ar = {3, 5, -1, 8, 12};
        System.out.println(ArrayAddition(ar));
    }
}
