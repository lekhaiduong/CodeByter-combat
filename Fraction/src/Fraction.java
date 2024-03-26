
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Fraction {
    
    public static int fraction(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fraction(num - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fraction(sc.nextInt()));
    }
}
