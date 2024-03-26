/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codebyter_exercise;

/**
 *
 * @author admin
 */
public class SimpleMode {

    public static int SimpleMode(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ar = {5, 5, 2, 2, 1};
        System.out.println(SimpleMode(ar));
    }
}
