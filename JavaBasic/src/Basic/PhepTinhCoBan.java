/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PhepTinhCoBan {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a, b: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("cong: "+(a+b));
        System.out.println("tru: "+(a-b));
        System.out.println("nhan: "+(a*b));
        System.out.println("chia: "+(float)(a/b));
        
    }
}
