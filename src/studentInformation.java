
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class studentInformation {
    private String firstName;
    
    public String getFirstName(){
    return firstName;
    }
    
    public void setFirstName(String A){
    firstName=A;
    }
    
    private String lastName;
    
    public String getLastName(){
    return lastName;}
    
    public void setLastName(String B){
    lastName=B;}
    
    private int studentNumber;
    
    public int getStudentNumber(){
    return studentNumber;}
    
    public void setStudentNumber(int studentNumber){
    
    this.studentNumber=studentNumber;}
    
    public void captureInput(){
    firstName=JOptionPane.showInputDialog("Please enter your name:");
    lastName=JOptionPane.showInputDialog("Please enter your last name:");
    studentNumber=Integer.parseInt(JOptionPane.showInputDialog("Please enter your student number:"));
    }
    
    public void displayInfo(){
        JOptionPane.showMessageDialog(null,"Your name is " + firstName+ " and your last name is " + lastName +".Your student number is " + studentNumber);}
    }

