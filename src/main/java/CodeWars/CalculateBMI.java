package CodeWars;

//Write function bmi that calculates body mass index (bmi = weight / height2).
//
//if bmi <= 18.5 return "Underweight"
//
//if bmi <= 25.0 return "Normal"
//
//if bmi <= 30.0 return "Overweight"
//
//if bmi > 30 return "Obese"

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateBMI {
    public static String bmi(double weight, double height) {

        //double bmi = weight/(height*height);
        //    return bmi <= 18.5 ? "Underweight": bmi <=25.0 ? "Normal" : bmi<=30.0 ? "Overweight" : "Obese";

        if ((weight/(height*height)) <= 18.5){
            return "Underweight";
        } else if ((weight/(height*height)) <= 25.0){
            return "Normal";
        } else if ((weight/(height*height)) <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    @Test
    public void testBMI() {
        assertEquals("Underweight", CalculateBMI.bmi(50, 1.80));
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80));
        assertEquals("Obese", CalculateBMI.bmi(180, 1.80));
        assertEquals("Overweight", CalculateBMI.bmi(90, 1.80));
    }
}
