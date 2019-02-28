package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declare

        Scanner Input;
        int height1, height2;
        double meters, BMI, weight;

        //initilizing
        Input = new Scanner(System.in);

        System.out.println("What is your Height(Only The Feet)");
        height1 = Input.nextInt() * 12;

        System.out.println("What is your height (Only The Inches)");
        height2 = Input.nextInt();

        System.out.println("What is your weight (pounds)");
        weight = Input.nextInt() * 0.453;

        meters = (height1  + height2) * 0.0254;
        BMI = weight/(meters * meters);


        System.out.printf("Your BMI is %5.1f", BMI);

    }
}
