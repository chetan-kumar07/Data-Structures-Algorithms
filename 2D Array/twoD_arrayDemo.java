/* This is a Program in which we create a program that how 2D Array works

Input:-
3                                           //number of rows
4                                           //number of columns
2
4
6
8
10
12
14
16
18
20
22
24

Output:-

2 4 6 8 
10 12 14 16
18 20 22 24
*/

import java.io.*;
import java.util.*;

public class twoD_arrayDemo{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int arr[][]=new int[n][m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=in.nextInt();
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
 }

}