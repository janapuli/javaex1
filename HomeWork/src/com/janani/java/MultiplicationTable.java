package com.janani.java;

public class MultiplicationTable {

        public static void main (String args[]){
            int MulTable[][]=new int[10][10];
            int row=1,column=1;
            for(int i=0; i<MulTable.length; i++){
                for(int j=0; j<MulTable[i].length; j++){
                    MulTable[i][j]=row*column;
                    column=column+1;
                }
                row=row+1;
                column=1;
            }
            for(int i=0; i<MulTable.length; i++){
                for(int j=0; j<MulTable[i].length; j++){
                    System.out.print(" "+MulTable[i][j]+"\t| ");
                }
                System.out.print("\n");
            }
        }

    }

