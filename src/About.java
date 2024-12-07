import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{

    JLabel heading;
    JLabel image, image2;
    JButton admin, student;

    public About() {
        // Set frame properties
        setTitle("Admission Management System");
        setBounds(0, 0, 1540, 850); // Position and size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure program exits on close
        setLayout(null);

        // Load and scale the image to fit the frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Admission_Management_Sysyem.png"));
        Image scaledImage = i1.getImage().getScaledInstance(1540, 850, Image.SCALE_SMOOTH); // Smooth scaling
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Set up the image label
        image = new JLabel(scaledIcon);
        image.setBounds(0, 0, 1540, 850); // Match frame size
        add(image);



        // Add the "Next" button on top of the image
        admin = new JButton("Admin Login");
        admin.addActionListener(this);
        admin.setBackground(Color.decode("#a8143c"));
        admin.setForeground(Color.WHITE);
        admin.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        admin.setBounds(900, 130, 150, 40); // Adjust position for the larger frame
        image.add(admin); // Add button to the image label to display it above the background

        student = new JButton("Student Login");
        student.addActionListener(this);
        student.setBackground(Color.decode("#a8143c"));
        student.setForeground(Color.WHITE);
        student.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        student.setBounds(1150, 130, 150, 40); // Adjust position for the larger frame
        image.add(student); // Add button to the image label to display it above the background

        setVisible(true); // Make the frame visible
    }
    

    // Action performed when the "Next" button is clicked
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == admin) {
            new Login(); // Assuming Login is another class you created
            setVisible(false);
        }
        if(ae.getSource() == student){
            
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new About();
    }
}
