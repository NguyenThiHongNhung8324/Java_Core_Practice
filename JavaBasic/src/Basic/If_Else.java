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
public class If_Else {
    public static void main(String[] args) {
        // ex
        int score = 5;
        if(score > 5){
            System.out.println("pass");
        }else{
            System.out.println("fall");
        }
//        chuong trinh tinh thue 
//        duoi 10M: khong dong
//        tu 10M-15M: thue 10%
//        tu 15M-30M: thue 20%
//        tren 30M: thue 50%
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao tax =");
        int tax = sc.nextInt();
        if(tax<10){
            System.out.println("khong dong");
        }else if(tax >=10 && tax <=15){
            System.out.println("thue 10%");
        }else if(15< tax && tax <=30){
            System.out.println("thue 20%");
        }else{
            System.out.println("thue 50%");
        }
    }
}
