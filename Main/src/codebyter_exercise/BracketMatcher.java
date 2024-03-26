/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codebyter_exercise;

import java.util.*;
import java.io.*;

/**
 *
 * @author admin Have the function BracketMatcher(str) take the str parameter
 * being passed and return 1 i f the brackets are correctly matched and each one
 * is accounted for. Otherwise return 0. For example: if str is "(hello
 * (world))", then the output should be 1, but if str is "((hello (world))" the
 * the output should be 0 because the brackets do not correctly match up. Only
 * "(" and ")" will be used as brackets. If str contains no brackets return 1
 */
class Main {

    public static int BracketMatcher(String str) {
        Stack s = new Stack();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                s.push(arr[i]);
            } else if (arr[i] == ')') {
                if (s.size() == 0) {
                    return 0;
                } else {
                    s.pop();
                }
            }
        }
        return s.empty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = BracketMatcher(s.nextLine());
        System.out.print(n);
    }

}
