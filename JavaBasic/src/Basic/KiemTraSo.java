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
public class KiemTraSo {
    public static void kiemTraChanLe(int n){
        if(n%2==0)
            System.out.println("so "+n+" la so chan");
        else System.out.println("so "+n+" la so le");
    }
    public static boolean kiemTraSoNguyenTo(int a){
        boolean kTra = true;
        if(a<2) 
            kTra = false;
        else {
            for(int i=2; i<=Math.sqrt(a);i++){
                if(a%i==0) {
                     kTra = false;
                     break;
                }    
            }
        }
        return kTra;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, x;
        System.out.println("kiem tra chan le nhap 1, so nguyen to nhap 2: ");
        while(true){
           x = sc.nextInt();
        if(x==1){
            System.out.println("nhap so can kiem tra chan le: ");
            n = sc.nextInt();
            kiemTraChanLe(n); 
            break;
       }
        else if(x==2){
            System.out.println("nhap so can kiem tra so nguyen to: ");
            a = sc.nextInt();
            if(kiemTraSoNguyenTo(a)){
                System.out.println("so "+a+" la so nguyen to");
            }
            else{
                System.out.println("so "+a+" khong phai la so nguyen to");
            }
            break;
        }
        else{
            System.out.println("lua chon khong hop le vui long nhap 1 or 2");
        } 
        }
        
    }
}
