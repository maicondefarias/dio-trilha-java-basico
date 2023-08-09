import java.util.Scanner;

public class Formulas{

    
    double initialPoint, finalPoint, wallBase, wallArea;

    //It calculates standard wall area
    public double standardWallMeasure(double pointOne, double pointTwo, double wallWidth){
        
               
        //Initial Point Measure
        initialPoint = pointOne;

        //Final Point Measure
        //System.out.println("Enter the final wall height (m): ");
        finalPoint = pointTwo;

        //Base Measure
        wallBase = wallWidth;

        //Calculator
        wallArea = (((pointOne + pointTwo)*wallBase))/2;

        return wallArea;
    }



}