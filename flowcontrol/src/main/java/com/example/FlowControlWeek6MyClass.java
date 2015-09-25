package com.example;



public class FlowControlWeek6MyClass {

    public static void main(String args[]) {
        double timeofday = 7.00;

        if (timeofday >= 6.00 && timeofday <= 7.00) {
            System.out.println("Wake up and have cup of Coffee");
        } else if (timeofday >= 7.01 && timeofday <= 8.00) {
            System.out.println("take a shower and eat breakfast");
        } else if (timeofday >= 8.01 && timeofday <= 11.00) {
            System.out.println("school, homework, shopping, chores, cook, clean, entertainment time or socialize. If weekend, have some fun");
        } else {
            System.out.println("Go Back to Bed");
        }
    }
}
//Decision making process for day based on time
//1. have cup of coffee 6am
//2. go back to bed
//3. take a shower and eat breakfast 7am
//4. school, homework, shopping, chores, cook, clean, entertainment time or socialize. If weekend, have some fun
// 8am to 11pm
//Instructions, add a series of if and if else statements, based on timeofday of varable, do task
//NOTE: use military time. 11pm to 7am sleep