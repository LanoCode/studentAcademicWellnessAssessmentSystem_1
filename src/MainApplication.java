
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MainApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        studentInformation studentInformation = new studentInformation();
        modulePerformance modulePerformance = new modulePerformance();
        wellnessTracker wellnessTracker= new wellnessTracker();
        
        studentInformation.captureInput();
        modulePerformance.captureInput();
        wellnessTracker.captureInput();
        
        String summary= "Student Info:\n" + studentInformation.getFirstName()+" "+studentInformation.getLastName()+" \nStudent number: "+
                studentInformation.getStudentNumber()+"\nModule performance:\n"+"Assignmnent mark is "+modulePerformance.getAssignmentMark()+" and test mark is \n"+modulePerformance.getTestMark()+"\nYour average is "+modulePerformance.calculateAverage()+"\n"+
                "Wellness tracker: \n" +"You slept for "+ wellnessTracker.getHoursSlept()+" hours "+" and studied for "+ wellnessTracker.getHoursStudied()+" hours"+"\nYour evaluation is "+ wellnessTracker.evaluateBalance();
        
        JOptionPane.showMessageDialog(null, summary,"Your summary report:",JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}
