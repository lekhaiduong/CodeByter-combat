/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codebyter_exercise;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class ArrayAddition {

    //this function is use to calculate if any addition of array equal to the max element then return true
    public static String ArrayAddition(int[] arr) {
        Arrays.sort(arr);
        int highestNum = arr[arr.length - 1];
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (i != j) {
                    sum += arr[j];
                    if (sum == highestNum) {
                        return "true";
                    }
                }
            }
            for (int k = 0; k < arr.length - 1; k++) {
                if (i != k) {
                    sum -= arr[k];
                    if (sum == highestNum) {
                        return "true";
                    }
                }
            }
            sum = 0;
        }

        return "false";
    }

    public static void main(String[] args) {
        int[] ar = {3, 5, -1, 8, 12};
        System.out.println(ArrayAddition(ar));
    }
}
