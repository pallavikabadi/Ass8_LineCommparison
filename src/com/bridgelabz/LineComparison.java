package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static double x1,x2,y1,y2;
    public static double x3,x4,y3,y4;
    public static double LengthofLine1,LengthofLine2;

    public static int lengthofline1() {
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
        return (int) LengthofLine1;
    }
    public static int lengthofline2() {
        Scanner Inputvalues = new Scanner(System.in);
        //lengthofline2 calculation
        System.out.println("Enter the value of x3 :");
        x3 = Inputvalues.nextInt();
        System.out.println("Enter the value of y3 :");
        y3 = Inputvalues.nextInt();
        System.out.println("Enter the value of x4 :");
        x4 = Inputvalues.nextInt();
        System.out.println("Enter the value of y4 :");
        y4 = Inputvalues.nextInt();
        LengthofLine2 = Math.sqrt(Math.pow(x4-x3,2)+ Math.pow(y4-y3,2));
        System.out.println("The length of a line =" +LengthofLine2);
        return(int)LengthofLine2;
    }
    public void equalitycheck() {
        String Line1=String.valueOf(LengthofLine1);
        String Line2=String.valueOf(LengthofLine2);
        if(Line1.equals(Line2))
            System.out.println("Length of both lines are equal");
        else
            System.out.println("lengths are not equal");
    }
    public void Comparelines() {
        String Line1=String.valueOf(LengthofLine1);
        String Line2=String.valueOf(LengthofLine2);
        int compare=Line1.compareTo(Line2);
        System.out.println(compare);
        if(compare==0)
            System.out.println("lines are equal");
        else if(compare>0)
            System.out.println("line1 is greater then line2");
        else
            System.out.println("line1 is less than line2");
    }
    public static void main(String[] args) {
        lengthofline1();
        lengthofline2();

        LineComparison obj=new LineComparison();
        obj.equalitycheck();
        obj.Comparelines();
    }
}
