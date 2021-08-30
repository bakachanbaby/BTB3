/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class bai2 {

    public static int n;
    public static int m;
    public static int a[][] = new int[n][m];
    public static int b[][] = new int[n][m];
    public static int c[][] = new int[n][m];

    

    public void nhap(int n, int m, int a[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        System.out.println("Nhập m: ");
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public void xuat(int n, int m, int a[][]) {
        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void chuyenVi(int n, int m, int a[][]) {
        System.out.println("Ma trận chuyển vị vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();
        }
    }
    
    public void tong(int n, int m, int c[][]) {
        System.out.println("Tổng 2 Ma trận vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] =  a[i][j] + b[i][j];
            }
        }
    }
}
