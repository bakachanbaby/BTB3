/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btb3;

import data.bai2;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BTB3 extends bai2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bai2 b2 = new bai2();
        
        
        while(true){
            System.out.println("==============================");
            System.out.println("1:Nhập 2 ma trận cùng cấp");
            System.out.println("2:In r màn hình 2 ma trận vừa nhập");
            System.out.println("3:In ra màn hình ma trận chuyển vị 2 ma trận vừa nhập");
            System.out.println("4:Tính tổng 2 ma trận và xuất");
            System.out.println("0:Thoát");
            int lc;
            Scanner sc = new Scanner(System.in);
            lc = Integer.parseInt(sc.nextLine());
            switch(lc){
                case 1:
                    System.out.println("Ma trận 1:");
                    b2.nhap(n, m, a);
                    System.out.println("Ma trận 2:");
                    b2.nhap(n, m, b);
                    break;
                case 2:
                    System.out.println("Ma trận 1:");
                    b2.xuat(n, m, a);
                    System.out.println("Ma trận 2:");
                    b2.xuat(n, m, b);
                    break;
                case 3:
                    System.out.println("Ma trận 1:");
                    b2.chuyenVi(n, m, a);
                    b2.xuat(n, m, a);
                    System.out.println("Ma trận 2:");
                    b2.chuyenVi(n, m, b);
                    b2.xuat(n, m, b);
                    break;
                case 4:
                    System.out.println("Tổng của 2 ma trận là:");
                    b2.tong(n, m, c);
                    b2.xuat(n, m, c);
                    break;
                case 0:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại cú pháp");
                    break;
            }
        }
    }
    
}
