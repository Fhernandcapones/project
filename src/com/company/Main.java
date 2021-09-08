package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      double prelim, midterm, finals, avg ,total;
        System.out.println("Enter your Name: ");
        String name = in.nextLine();
        System.out.println("Emter your Student Number: ");
        String snumber = in.nextLine();
        System.out.println("Emter your Course: ");
        String course = in.nextLine();
        System.out.println("Emter your Age: ");
        Integer age = in.nextInt();
        System.out.println("Emter your Quiz grade in prelim: ");
        double pquiz = in.nextInt();
        System.out.println("Emter your homework grade in prelim: ");
        double phome = in.nextInt();
        System.out.println("Emter your Major grade in prelim: ");
        double pmajor = in.nextInt();
        System.out.println("Emter your Quiz grade in midterm: ");
        double mquiz = in.nextInt();
        System.out.println("Emter your homework grade in midterm: ");
        double mhome = in.nextInt();
        System.out.println("Emter your Major grade in midterm: ");
        double mmajor = in.nextInt();
        System.out.println("Emter your Quiz grade in finals: ");
        double fquiz = in.nextInt();
        System.out.println("Emter your homework grade in finals: ");
        double fhome = in.nextInt();
        System.out.println("Emter your Major grade in finals: ");
        double fmajor = in.nextInt();
        prelim = (pquiz *0.40)+(phome * 0.10)+(pmajor * 0.50);
        midterm = (mquiz *0.40)+(mhome * 0.10)+(mmajor * 0.50);
        finals = (fquiz *0.40)+(fhome * 0.10)+(fmajor * 0.50);
        total = prelim +midterm + finals;
        avg = total/3;
      System.out.println("Student name:" +name);
      System.out.println("Student number:"+snumber);
      System.out.println("Student course:" +course);
      System.out.println("Student age:"+age);
      System.out.println("your final grade is:"+avg);
      if (avg >= 75 && avg <=100){
        System.out.println("passed");
      }else if (avg >= 65 && avg <=74){
        System.out.println("failed");
      }else {
        System.out.println("invalid ");
      }




    }



}
