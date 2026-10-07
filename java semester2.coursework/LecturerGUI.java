import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LecturerGUI {
    ArrayList<Teacher> t = new ArrayList<Teacher>();
    public static void M1() {
        // Creating JFrame
        JFrame jf = new JFrame("LecturerGUI");
        jf.setSize(1000, 1000);
        jf.setLayout(null);
        jf.setVisible(true);

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Lecturer:"));
        panel1.setBounds(0, 0, 1000, 1000);
        panel1.setLayout(null);
        panel1.setBackground(Color.LIGHT_GRAY);
        jf.add(panel1);

        JLabel l1 = new JLabel("Lecturer");
        l1.setBounds(450, 40, 100, 50);
        l1.setFont(new Font("Arial", Font.BOLD, 25));
        panel1.add(l1);

        JLabel l2 = new JLabel("Teacher ID");
        l2.setBounds(70, 75, 100, 50);
        panel1.add(l2);

        JTextField tf1 = new JTextField();
        tf1.setBounds(160, 80, 120, 35);
        panel1.add(tf1);

        JLabel l3 = new JLabel("Teacher Name");
        l3.setBounds(70, 120, 100, 50);
        panel1.add(l3);

        JTextField tf2 = new JTextField();
        tf2.setBounds(160, 130, 120, 35);
        panel1.add(tf2);

        JLabel l4 = new JLabel("Address");
        l4.setBounds(70, 165, 100, 50);
        panel1.add(l4);

        JTextField tf3 = new JTextField();
        tf3.setBounds(160, 180, 120, 35);
        panel1.add(tf3);

        JLabel l5 = new JLabel("Working Type");
        l5.setBounds(70, 220, 100, 50);
        panel1.add(l5);

        JTextField tf4 = new JTextField();
        tf4.setBounds(160, 230, 120, 35);
        panel1.add(tf4);

        JLabel l6 = new JLabel("Employment Status");
        l6.setBounds(650,75,150,50);
        panel1.add(l6);

        JTextField tf5 = new JTextField();
        tf5.setBounds(780,80,120,35);
        panel1.add(tf5);

        JLabel l7 = new JLabel("Working Hours");
        l7.setBounds(650,120,150,50);
        panel1.add(l7);

        JTextField tf6 = new JTextField();
        tf6.setBounds(780,130,120,35);
        panel1.add(tf6);

        JLabel l8 = new JLabel("Years Of Experience");
        l8.setBounds(650,165,130,50);
        panel1.add(l8);

        JTextField tf7 = new JTextField();
        tf7.setBounds(780,180,120,35);
        panel1.add(tf7);

        JLabel l9 = new JLabel("Department");
        l9.setBounds(650,210,130,50);
        panel1.add(l9);

        JTextField tf8 = new JTextField();
        tf8.setBounds(780,230,120,35);
        panel1.add(tf8);

        JButton jb1 = new JButton("Add a Lecturer");
        jb1.setBounds(380,280, 150, 40); 
        jb1.setBackground(Color.WHITE);
        panel1.add(jb1);

        // ActionListener for the button
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Check if any text field is empty
                if (tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty()
                        || tf4.getText().isEmpty() || tf5.getText().isEmpty() || tf6.getText().isEmpty()
                        || tf7.getText().isEmpty() || tf8.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(jf, "Please fill all the text fields.");
                } else {
                    try {
                        Integer.parseInt(tf1.getText());
                        Integer.parseInt(tf7.getText());
                        JOptionPane.showMessageDialog(jf, "Successfully added a lecturer.");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(jf, "Alert! TeacherID and Years Of Experience must be integer values.");
                    }
                }
            }
        });
        
         JButton jb2 = new JButton("Display");
        jb2.setBounds(680, 280, 150, 40);
        jb2.setBackground(Color.WHITE);
        panel1.add(jb2);

        
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                StringBuilder displayMessage = new StringBuilder();
                displayMessage.append("Teacher ID: ").append(tf1.getText()).append("\n");
                displayMessage.append("Teacher Name: ").append(tf2.getText()).append("\n");
                displayMessage.append("Address: ").append(tf3.getText()).append("\n");
                displayMessage.append("Working Type: ").append(tf4.getText()).append("\n");
                displayMessage.append("Employment Status: ").append(tf5.getText()).append("\n");
                displayMessage.append("Working Hours: ").append(tf6.getText()).append("\n");
                displayMessage.append("Years Of Experience: ").append(tf7.getText()).append("\n");
                displayMessage.append("Department: ").append(tf8.getText()).append("\n");

                JOptionPane.showMessageDialog(jf, displayMessage.toString(), "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        JButton jb3 = new JButton("Clear");
        jb3.setBounds(100, 280, 150, 40);
        jb3.setBackground(Color.WHITE);
        panel1.add(jb3);


      jb3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        int option = JOptionPane.showConfirmDialog(jf, "Are you sure?", "Clear", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            tf1.setText(""); // Clearing all text fields
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
        }
    }
});


JLabel l10 = new JLabel("Teacher ID");
l10.setBounds(70, 350, 100, 25);
panel1.add(l10);

JTextField tf9 = new JTextField();
tf9.setBounds(160, 350, 120, 25);
panel1.add(tf9);

JLabel l11 = new JLabel("Graded Score");
l11.setBounds(70, 390, 100, 25);
panel1.add(l11);

JTextField tf10 = new JTextField();
tf10.setBounds(160, 390, 120, 25);
panel1.add(tf10);

JLabel l12 = new JLabel("Department");
l12.setBounds(70, 430, 100, 25);
panel1.add(l12);

JTextField tf11 = new JTextField();
tf11.setBounds(160, 430, 120, 25);
panel1.add(tf11);

JLabel l13 = new JLabel("Years of Experience");
l13.setBounds(70, 460, 130, 40);
panel1.add(l13);

JTextField tf12 = new JTextField();
tf12.setBounds(190, 470, 120, 25);
panel1.add(tf12);

JButton jb4 = new JButton("Grade the assignment");
jb4.setBounds(400, 510, 200, 40);
jb4.setBackground(Color.WHITE);
panel1.add(jb4);


jb4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty()
                || tf4.getText().isEmpty() || tf5.getText().isEmpty() || tf6.getText().isEmpty()
                || tf7.getText().isEmpty() || tf8.getText().isEmpty() || tf9.getText().isEmpty()
                || tf10.getText().isEmpty() || tf11.getText().isEmpty() || tf12.getText().isEmpty()) {
            JOptionPane.showMessageDialog(jf, "Please fill all the text fields.");
        } else {
            try {
                Integer.parseInt(tf1.getText());
                Integer.parseInt(tf7.getText());
                Integer.parseInt(tf9.getText());
                Integer.parseInt(tf10.getText());
                Integer.parseInt(tf12.getText());
                
            
                JOptionPane.showMessageDialog(jf, "Assignment Graded.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(jf, "Alert! TeacherID, GradedScore, and Years Of Experience must be integer values.");
            }
        }
    }
});

JButton jb5 = new JButton("Display");
jb5.setBounds(100, 510, 150, 40);
jb5.setBackground(Color.WHITE);
panel1.add(jb5);


jb5.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        StringBuilder displayMessage = new StringBuilder();
        displayMessage.append("TeacherID: ").append(tf9.getText()).append("\n");
        displayMessage.append("GradedScore: ").append(tf10.getText()).append("\n");
        displayMessage.append("Department: ").append(tf11.getText()).append("\n");
        displayMessage.append("Years of Experience: ").append(tf12.getText()).append("\n");

        JOptionPane.showMessageDialog(jf, displayMessage.toString(), "Additional Teacher Information", JOptionPane.INFORMATION_MESSAGE);
    }
});

JButton jb6 = new JButton("Clear");
jb6.setBounds(680, 510, 150, 40);
jb6.setBackground(Color.WHITE);
panel1.add(jb6);


jb6.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        int option = JOptionPane.showConfirmDialog(jf, "Are you sure?", "Clear", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            tf9.setText(""); 
            tf10.setText("");
            tf11.setText("");
            tf12.setText("");
        }
    }
});

JButton jb7 = new JButton("Change to Tutor");
jb7.setBounds(800, 580, 200, 40);
jb7.setBackground(Color.WHITE);
panel1.add(jb7);


jb7.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        jf.setTitle("TutorGUI");
        jf.dispose();

        // Open the Tutor GUI
        TutorGUI.M2();
    }
});
}



public class TutorGUI {
    public static void M2() {
        // Create JFrame for TutorGUI
        JFrame tutorFrame = new JFrame("TutorGUI");
        tutorFrame.setSize(1400, 1000);
        tutorFrame.setLayout(null);
        tutorFrame.setVisible(true);

        JPanel tutorPanel = new JPanel();
        tutorPanel.add(new JLabel("Tutor:"));
        tutorPanel.setBounds(0, 0, 1000, 1000);
        tutorPanel.setLayout(null);
        tutorPanel.setBackground(Color.LIGHT_GRAY);
        tutorFrame.add(tutorPanel);

        
        JLabel tutorLabel = new JLabel("Tutor");
        tutorLabel.setBounds(450, 40, 100, 50);
        tutorLabel.setFont(new Font("Arial", Font.BOLD, 19));
        tutorPanel.add(tutorLabel);

        
        JLabel tutorIDLabel = new JLabel("Teacher ID");
        tutorIDLabel.setBounds(70, 75, 100, 50);
        tutorPanel.add(tutorIDLabel);

        JTextField tutorIDField = new JTextField();
        tutorIDField.setBounds(160, 80, 120, 35);
        tutorPanel.add(tutorIDField);
        
        
        JLabel tutorNameLabel = new JLabel("Teacher Name");
        tutorNameLabel.setBounds(70, 120, 100, 50);
        tutorPanel.add(tutorNameLabel);

        JTextField tutorNameField = new JTextField();
        tutorNameField.setBounds(160, 130, 120, 35);
        tutorPanel.add(tutorNameField);

        
        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(70, 165, 100, 50);
        tutorPanel.add(addressLabel);

        JTextField addressField = new JTextField();
        addressField.setBounds(160, 180, 120, 35);
        tutorPanel.add(addressField);

       
        JLabel workingTypeLabel = new JLabel("Working Type");
        workingTypeLabel.setBounds(70, 220, 100, 50);
        tutorPanel.add(workingTypeLabel);

        JTextField workingTypeField = new JTextField();
        workingTypeField.setBounds(160, 230, 120, 35);
        tutorPanel.add(workingTypeField);

        
        JLabel employmentStatusLabel = new JLabel("Employment Status");
        employmentStatusLabel.setBounds(650,75,150,50);
        tutorPanel.add(employmentStatusLabel);

        JTextField employmentStatusField = new JTextField();
        employmentStatusField.setBounds(780,80,120,35);
        tutorPanel.add(employmentStatusField);

      
        JLabel workingHoursLabel = new JLabel("Working Hours");
        workingHoursLabel.setBounds(650,120,150,50);
        tutorPanel.add(workingHoursLabel);

        JTextField workingHoursField = new JTextField();
        workingHoursField.setBounds(780,130,120,35);
        tutorPanel.add(workingHoursField);

      
        JLabel salaryLabel = new JLabel("Salary");
        salaryLabel.setBounds(650,165,130,50);
        tutorPanel.add(salaryLabel);

        JTextField salaryField = new JTextField();
        salaryField.setBounds(780,180,120,35);
        tutorPanel.add(salaryField);

       
        JLabel specializationLabel = new JLabel("Specialization");
        specializationLabel.setBounds(650,210,130,50);
        tutorPanel.add(specializationLabel);

        JTextField specializationField = new JTextField();
        specializationField.setBounds(780,230,120,35);
        tutorPanel.add(specializationField);

        
        JLabel academicQualificationsLabel = new JLabel("Academic Qualifications");
        academicQualificationsLabel.setBounds(70, 270, 150, 50);
        tutorPanel.add(academicQualificationsLabel);

        JTextField academicQualificationsField = new JTextField();
        academicQualificationsField.setBounds(220, 280, 200, 35);
        tutorPanel.add(academicQualificationsField);

       
        JLabel performanceIndexLabel = new JLabel("Performance Index");
        performanceIndexLabel.setBounds(70, 320, 150, 50);
        tutorPanel.add(performanceIndexLabel);

        JTextField performanceIndexField = new JTextField();
        performanceIndexField.setBounds(220, 330, 200, 35);
        tutorPanel.add(performanceIndexField);

JButton jb8 = new JButton("Add a Tutor");
jb8.setBounds(100, 400, 250, 40);
jb8.setBackground(Color.WHITE);
tutorPanel.add(jb8);


jb8.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        String tutorID = tutorIDField.getText();
        String tutorName = tutorNameField.getText();
        String address = addressField.getText();
        String workingType = workingTypeField.getText();
        String employmentStatus = employmentStatusField.getText();
        String workingHours = workingHoursField.getText();
        String salary = salaryField.getText();
        String specialization = specializationField.getText();
        String academicQualifications = academicQualificationsField.getText();
        String performanceIndex = performanceIndexField.getText();

        
        System.out.println("Tutor ID: " + tutorID);
        System.out.println("Tutor Name: " + tutorName);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + workingType);
        System.out.println("Employment Status: " + employmentStatus);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Salary: " + salary);
        System.out.println("Specialization: " + specialization);
        System.out.println("Academic Qualifications: " + academicQualifications);
        System.out.println("Performance Index: " + performanceIndex);

        
        clearFields();
    }

    // Methods to clear all JTextFields
    private void clearFields() {
        tutorIDField.setText("");
        tutorNameField.setText("");
        addressField.setText("");
        workingTypeField.setText("");
        employmentStatusField.setText("");
        workingHoursField.setText("");
        salaryField.setText("");
        specializationField.setText("");
        academicQualificationsField.setText("");
        performanceIndexField.setText("");
    }
});



JLabel teacherIDLabel = new JLabel("TeacherID");
teacherIDLabel.setBounds(450, 420, 100, 25);
tutorPanel.add(teacherIDLabel);


JTextField teacherIDField = new JTextField();
teacherIDField.setBounds(550, 420, 120, 25);
tutorPanel.add(teacherIDField);


JLabel newSalaryLabel = new JLabel("New Salary");
newSalaryLabel.setBounds(450, 450, 100, 25);
tutorPanel.add(newSalaryLabel);


JTextField newSalaryField = new JTextField();
newSalaryField.setBounds(550, 450, 120, 25);
tutorPanel.add(newSalaryField);


JLabel newPerformanceIndexLabel = new JLabel("New Performance Index");
newPerformanceIndexLabel.setBounds(450, 480, 150, 25);
tutorPanel.add(newPerformanceIndexLabel);


JTextField newPerformanceIndexField = new JTextField();
newPerformanceIndexField.setBounds(600, 480, 120, 25);
tutorPanel.add(newPerformanceIndexField);


JButton jb9 = new JButton("Set Salary of Tutor");
jb9.setBounds(100, 550, 250, 40);
jb9.setBackground(Color.WHITE);
tutorPanel.add(jb9);


jb9.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        String teacherID = teacherIDField.getText();
        String newSalary = newSalaryField.getText();
        String newPerformanceIndex = newPerformanceIndexField.getText();

        
        if (teacherID.isEmpty() || newSalary.isEmpty() || newPerformanceIndex.isEmpty()) {
            JOptionPane.showMessageDialog(tutorFrame, "Please fill all the fields.");
            return;
        }

        
        try {
            int teacherIDInt = Integer.parseInt(teacherID);
            int newSalaryInt = Integer.parseInt(newSalary);
            int newPerformanceIndexInt = Integer.parseInt(newPerformanceIndex);

            System.out.println("TeacherID: " + teacherIDInt);
            System.out.println("New Salary: " + newSalaryInt);
            System.out.println("New Performance Index: " + newPerformanceIndexInt);

            
            teacherIDField.setText("");
            newSalaryField.setText("");
            newPerformanceIndexField.setText("");

            JOptionPane.showMessageDialog(tutorFrame, "Salary of Tutor set successfully.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(tutorFrame, "TeacherID, New Salary, and New Performance Index must be integer values.");
        }
    }
});


JButton jb10 = new JButton("Remove the Tutor");
jb10.setBounds(400, 550, 250, 40);
jb10.setBackground(Color.WHITE);
tutorPanel.add(jb10);



jb10.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String tutorID = teacherIDField.getText();

        if (tutorID.isEmpty()) {
            JOptionPane.showMessageDialog(tutorFrame, "Please enter the Tutor's ID.");
            return;
        }

       
        System.out.println("Removing Tutor with ID: " + tutorID);

        
        teacherIDField.setText("");

        JOptionPane.showMessageDialog(tutorFrame, "Tutor removed successfully.");
    }
});



JButton jb11= new JButton("Display");
jb11.setBounds(700, 550, 200, 40);
jb11.setBackground(Color.WHITE);
tutorPanel.add(jb11);



jb11.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        String tutorID = teacherIDField.getText();
        String tutorName = tutorNameField.getText();
        String address = addressField.getText();
        String workingType = workingTypeField.getText();
        String employmentStatus = employmentStatusField.getText();
        String workingHours = workingHoursField.getText();
        String salary = salaryField.getText();
        String specialization = specializationField.getText();
        String academicQualifications = academicQualificationsField.getText();
        String performanceIndex = performanceIndexField.getText();

       
        StringBuilder displayMessage = new StringBuilder();
        displayMessage.append("Tutor Information:\n");
        displayMessage.append("Teacher ID: ").append(tutorID).append("\n");
        displayMessage.append("Teacher Name: ").append(tutorName).append("\n");
        displayMessage.append("Address: ").append(address).append("\n");
        displayMessage.append("Working Type: ").append(workingType).append("\n");
        displayMessage.append("Employment Status: ").append(employmentStatus).append("\n");
        displayMessage.append("Working Hours: ").append(workingHours).append("\n");
        displayMessage.append("Salary: ").append(salary).append("\n");
        displayMessage.append("Specialization: ").append(specialization).append("\n");
        displayMessage.append("Academic Qualifications: ").append(academicQualifications).append("\n");
        displayMessage.append("Performance Index: ").append(performanceIndex).append("\n");

        
        JOptionPane.showMessageDialog(tutorFrame, displayMessage.toString(), "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
    }
});



JButton jb12 = new JButton("Clear");
jb12.setBounds(100, 600, 200, 40);
jb12.setBackground(Color.WHITE);
tutorPanel.add(jb12);



jb12.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Clearing all JTextFields
        tutorIDField.setText("");
        tutorNameField.setText("");
        addressField.setText("");
        workingTypeField.setText("");
        employmentStatusField.setText("");
        workingHoursField.setText("");
        salaryField.setText("");
        specializationField.setText("");
        academicQualificationsField.setText("");
        performanceIndexField.setText("");
    }
});



JButton jb13 = new JButton("Change to Lecturer");
jb13.setBounds(700, 600, 200, 40);
jb13.setBackground(Color.WHITE);
tutorPanel.add(jb13);


jb13.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Closing the current Tutor GUI
        tutorFrame.dispose();

        // Opening the Lecturer GUI
        LecturerGUI.M1();
    }
});

        
    }
}
}


        
    

