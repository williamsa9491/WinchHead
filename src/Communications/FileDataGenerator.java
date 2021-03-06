/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Communications;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Reads of lines of a pre-generated file to simulate the input of data from the
 * embedded system.
 *
 * @author Alex
 */
public class FileDataGenerator {
    Scanner reader;
    
    private BigDecimal unixTime;
    private BigDecimal cableOut;
    private BigDecimal cableAngle;
    private BigDecimal cableSpeed;
    private BigDecimal tension;
    private int state;
    
    public FileDataGenerator() {
        try {
            //***********************************************
            //**********For use outside of NetBeans**********
            //***********************************************
            //reader = new Scanner(new File(System.getProperty("user.dir") + "/lnchdata.txt"));
            
            //***********************************************
            //**************For use in NetBeans**************
            //***********************************************
            reader = new Scanner(new File(System.getProperty("user.dir") + "/build/classes/Communications/lnchdata.txt"));
            
            readLineOfValues();
        } catch (FileNotFoundException ex) {
            System.out.println(System.getProperty("user.dir") + "/build/classes/Communications/lnchdata.txt");
            System.out.println("Bad file name");
        }
    }
    
    private void reopenFile() {
        reader.close();
        try {
            //***********************************************
            //**********For use outside of NetBeans**********
            //***********************************************
            //reader = new Scanner(new File(System.getProperty("user.dir") + "/lnchdata.txt"));
            
            //***********************************************
            //**************For use in NetBeans**************
            //***********************************************
            reader = new Scanner(new File(System.getProperty("user.dir") + "/build/classes/Communications/lnchdata.txt"));
            
            readLineOfValues();
        } catch (FileNotFoundException ex) {
            System.out.println(System.getProperty("user.dir"));
            System.out.println("Bad file name");
        }
    }
    
    /**
     * Reads in a set of values from the data file to be used by the Filter 
     */
    public void readLineOfValues() {
        if(reader.hasNext()){
            //reopenFile();
        
            unixTime = new BigDecimal(reader.nextDouble());
            cableOut = new BigDecimal(reader.nextDouble());
            cableSpeed = new BigDecimal(reader.nextDouble());
            cableAngle = new BigDecimal(reader.nextDouble());
            tension = new BigDecimal(reader.nextDouble());
            state = (int) reader.nextDouble(); 
        }
    }

    long getUnixTime() {
        return unixTime.longValue();
    }

    double getCableOut() {
        return cableOut.doubleValue();
    }

    double getCableAngle() {
        return cableAngle.doubleValue();
    }

    double getCableSpeed() {
        return cableSpeed.doubleValue();
    }

    double getTension() {
        return tension.doubleValue();
    }

    int getState() {
        return state;
    }

    public void restartFile() {
        reopenFile();
    }
}
