/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Configuration;

/**
 *
 * @author awilliams5
 */
public class UnitLabelUtilities {
    public static String lenghtUnitInexToString(int index) {
        switch (index) {
            case 0:
                return "m";
            case 1:
                return "ft";
            case 2: 
                return "mm";
            case 3:
                return "cm";
            case 4:
                return "km";
            default:
                return "";
        }
    }
    
    public static String tensionUnitIndexToString(int index) {
       switch (index) {
            case 0:
                return "N";
            case 1:
                return "ldf";
            case 2: 
                return "Kgf";
            default:
                return "";
        } 
    }
    
    public static String weightUnitIndexToString(int index) {
       switch (index) {
            case 0:
                return "lbs";
            case 1:
                return "Kg";
            default:
                return "";
        } 
    }
    
    public static String velocityUnitIndexToString(int index) {
       switch (index) {
            case 0:
                return "mph";
            case 1:
                return "Km/h";
            case 2: 
                return "m/s";
            case 3:
                return "kn";
            default:
                return "";
        } 
    }
    
    public static String tempUnitIndexToString(int index) {
       switch (index) {
            case 0:
                return "F";
            case 1:
                return "C";
            default:
                return "";
        } 
    }
    
    public static String pressureUnitIndexToString(int index) {
       switch (index) {
            case 0:
                return "psi";
            case 1:
                return "Mp";
            case 2: 
                return "Kp";
            default:
                return "";
        } 
    }
}
