
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class wellnessTracker {
    private int hoursSlept;
    
    public int getHoursSlept(){
    return hoursSlept;}
    
    public void setHoursSlept(int hoursSlept){
    this.hoursSlept=hoursSlept;}
    
    private int hoursStudied;
    
    public int getHoursStudied(){
    return hoursStudied;}
    
    public void setHoursStudied(int hoursStudied){
    this.hoursStudied=hoursStudied;}
    
    public String evaluateBalance(){
    if(hoursSlept>=7 && hoursStudied>=3)
    {return "Well balanced!";}
    else if(hoursSlept<6){return "You need more rest!";}
    else{return "Try to study more consistently.";}
    }
    
    public void captureInput(){
        hoursSlept=Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of hours you slept:"));
    hoursStudied=Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of hours you studied:"));
    }
    public void displayInfo(){
        JOptionPane.showMessageDialog(null, "You slept for " + hoursSlept + " and studied for " + hoursStudied + " and your evaluation is " + evaluateBalance());
    }
    }
    
    
    

