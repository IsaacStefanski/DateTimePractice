/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author Isaac
 */
public class CalcNextDate {
    public static void main(String[] args) {
        //Next Leap Year
        int year = LocalDate.now().getYear();
        while(!Year.isLeap(year)) {
            year++;
        }
        System.out.println("Next leap year: " + year);
        
        //Next Friday the 13th
        LocalDate today = LocalDate.now();
        while(!today.getDayOfWeek().toString().equals("FRIDAY") || today.getDayOfMonth() != 13){
            today = today.plusDays(1);
        }
        System.out.println("Next Friday the 13th: " + today);
    }
}