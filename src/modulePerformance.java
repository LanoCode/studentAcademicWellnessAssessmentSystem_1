
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class modulePerformance {
    private int assignmentMark;
    
    public int getAssignmentMark(){
    return assignmentMark;}
    
    public void setAssignmentMark(int assignmentMark){
    this.assignmentMark=assignmentMark;}
    
    private int testMark;
    
    public int getTestMark(){
    return testMark;}
    
    public void setTestMark(int testMark){
    this.testMark=testMark;}
    
    
    public double calculateAverage(){
    return (assignmentMark+testMark)/2;}
    
    public void captureInput(){
    assignmentMark=Integer.parseInt(JOptionPane.showInputDialog("Please enter your assignemnt mark:"));
   testMark=Integer.parseInt(JOptionPane.showInputDialog("Please enter your test Marks:"));}
    
    public void displayInfo(){
    JOptionPane.showMessageDialog(null,"Your assignment mark is " + assignmentMark + " and your test mark is " + testMark + ".Your average is " + calculateAverage());}
}
