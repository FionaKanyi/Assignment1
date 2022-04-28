/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradingsystem;

import java.util.ArrayList;
/**
 *
 
 * @author FIONA KANYI
 */import java.util.Scanner;
public class Gradingsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fullname;
        String subject;
        Double subjectMark;
        String grade;
        ArrayList<String> subjectNames = new ArrayList<>();
        ArrayList<Double> subjectMarks = new ArrayList<>();
        ArrayList<String> subjectGrade = new ArrayList<>();


        Scanner inputString = new Scanner(System.in);
        Scanner inputDouble = new Scanner(System.in);
        System.out.println("Enter Students Full Name");
        fullname = inputString.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter subject name");
            subject = inputString.nextLine();
            subjectNames.add(subject);
            System.out.println("Enter mark of "+subject);
            subjectMark = inputDouble.nextDouble();
            subjectMarks.add(subjectMark);

            if (subjectMark > 90){
               grade = "A";
            }else if(subjectMark >= 70 && subjectMark<=89){
                grade = "B";
            }else if(subjectMark >= 50 && subjectMark<=69){
                grade = "C;";
            }else if(subjectMark >= 40 && subjectMark<=59){
                grade = "D";
            }else{
                grade = "Failed";
            }

            subjectGrade.add(grade);
        }

        System.out.println("The students name is: "+fullname);
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject Name: "+subjectNames.get(i)+" "+"Subject Mark : "+subjectMarks.get(i)
                    + " " + "Subject Grade: " + subjectGrade.get(i));
        }
    }
    
    
  
}

    
    
        

        
    
    
    

