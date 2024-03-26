/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bracketmatcher;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BracketMatcher {

    /**
     * @author admin Have the function BracketMatcher(str) take the str
     * parameter being passed and return 1 i f the brackets are correctly
     * matched and each one is accounted for. Otherwise return 0.
     *
     * For example: if str is "(hello(world))", then the output should be 1, but
     * if str is "((hello (world))" the output should be 0 because the brackets
     * do not correctly match up. Only "(" and ")" will be used as brackets. If
     * str contains no brackets return 1
     */
    public static int BracketMatcher(String str) {
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(BracketMatcher(sc.nextLine()));
    }
    
}
