import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener{
    
    Dashboard() {
        setSize(1540, 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/2.jpg"));
        Image scaled_i1_Image = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon scaled_i1 = new ImageIcon(scaled_i1_Image);
        JLabel image = new JLabel(scaled_i1);
        add(image);

        JMenuBar mb = new JMenuBar();
        
        // New Information
        JMenu newinformation = new JMenu("New Information");
        newinformation.setForeground(Color.BLUE);
        mb.add(newinformation);

        JMenuItem studentInfo = new JMenu("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newinformation.add(studentInfo);

        // Details
        JMenu Details = new JMenu("View Details");
        Details.setForeground(Color.BLUE);
        mb.add(Details);

        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        Details.add(studentdetails);

        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLUE);
        mb.add(updateInfo);
        
        JMenuItem updateStudentinfo = new JMenuItem("Update Student Details");
        updateStudentinfo.setBackground(Color.WHITE);
        updateStudentinfo.addActionListener(this);
        updateInfo.add(updateStudentinfo);

        // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feeStructure = new JMenuItem("Fees Structure");
        feeStructure.setBackground(Color.WHITE);
        feeStructure.addActionListener(this);
        fee.add(feeStructure);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        feeForm.addActionListener(this);
        fee.add(feeForm);

        // utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);

        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);

        

        setJMenuBar(mb);

        setVisible(true);
    }

    
    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if(msg.equals("Exit")){
            setVisible(false);
        }
        else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            } catch(Exception e){

            }
        }
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            } catch(Exception e){

            }
        }
        else if(msg.equals("New Student Information")){
            new AddStudent();
        }
        else if(msg.equals("View Student Details")){
            new StudentDetails();
        }
        else if(msg.equals("Update Student Details")){
            new UpdateStudent();
        }
        else if (msg.equals("Fees Structure")) {
            new FeeStructure();
        }
        else if (msg.equals("Student Fee Form")) {
            new StudentFeesForm();
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
