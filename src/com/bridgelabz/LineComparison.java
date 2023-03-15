package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        double x1,x2,y1,y2;
        double x3,x4,y3,y4;
        double LengthofLine1,LengthofLine2;
        Scanner inputvalues = new Scanner(System.in);
        //lengthofline1 calculation
        System.out.println("Enter the value of x1 :");
        x1 = inputvalues.nextInt();
        System.out.println("Enter the value of y1 :");
        y1 = inputvalues.nextInt();
        System.out.println("Enter the value of x2 :");
        x2 = inputvalues.nextInt();
        System.out.println("Enter the value of y2 :");
        y2 = inputvalues.nextInt();
        LengthofLine1 = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("The length of a line =" +LengthofLine1);

        //lengthofline2 calculation
        System.out.println("Enter the value of x3 :");
        x3 = inputvalues.nextInt();
        System.out.println("Enter the value of y3 :");
        y3 = inputvalues.nextInt();
        System.out.println("Enter the value of x4 :");
        x4 = inputvalues.nextInt();
        System.out.println("Enter the value of y4 :");
        y4 = inputvalues.nextInt();
        LengthofLine2 = Math.sqrt(Math.pow(x4-x3,2)+ Math.pow(y4-y3,2));
        System.out.println("The length of a line =" +LengthofLine2);

        String Line1=String.valueOf(LengthofLine1);
        String Line2=String.valueOf(LengthofLine2);
        if(Line1.equals(Line2))
            System.out.println("Length of both lines are equal");

        else
            System.out.println("lengths are not equal");
    }
}
