package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// task1
    int MulTab[][]= new int[10][10];
int row=1,col=1;
for(int a=0;a<MulTab.length; a++){
    for(int b=0; b<MulTab.length; b++){
        MulTab[a][b] = row*col;
        System.out.println(row + "*" +col+ "=" + MulTab[a][b]);
        col++;
    }
row++;
    col=1;

    }

//task2
      int[] Arr= {3,4,5,6};
int[] CopyArr= new int[4];
for(int a=0; a<4; a++){
    CopyArr[a]=Arr[a];
    System.out.println(CopyArr[a]);

}}}















