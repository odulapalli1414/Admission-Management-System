import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class StudentDetails extends JFrame implements ActionListener{

    Choice crollno;
    JTable table;
    JButton search, print, update, add, cancel;
    
    StudentDetails() {

        getContentPane().setBackground((Color.WHITE));
        setLayout(null);

        JLabel heading = new JLabel("Search by Roll Number");
        heading.setBounds(20,20,150,20);
        add(heading);

        crollno = new Choice();
        crollno.setBounds(180,20,150,20);
        add(crollno);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from student");
            while(rs.next()){
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 1250, 600); // Increase width to 1200
        jsp.setBackground(Color.decode("#a8143c"));
        add(jsp);

        // Optional: Adjust column widths for better visibility
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Allow horizontal scrolling
        table.getColumnModel().getColumn(0).setPreferredWidth(100); // Set specific column width
        table.getColumnModel().getColumn(1).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(2).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(3).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(4).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(5).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(6).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(7).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(8).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(9).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(10).setPreferredWidth(100); // Adjust as needed for other columns
        table.getColumnModel().getColumn(11).setPreferredWidth(150); // Adjust as needed for other columns




        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.setBackground(Color.decode("#a8143c"));
        search.setForeground(Color.WHITE);;
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.setBackground(Color.decode("#a8143c"));
        print.setForeground(Color.WHITE);;
        print.addActionListener(this);
        add(print);

        add = new JButton("Add");
        add.setBounds(220,70,80,20);
        add.setBackground(Color.decode("#a8143c"));
        add.setForeground(Color.WHITE);;
        add.addActionListener(this);
        add(add);

        update = new JButton("Update");
        update.setBounds(320,70,80,20);
        update.setBackground(Color.decode("#a8143c"));
        update.setForeground(Color.WHITE);;
        update.addActionListener(this);
        add(update);        

        cancel = new JButton("Cancel");
        cancel.setBounds(420,70,80,20);
        cancel.setBackground(Color.decode("#a8143c"));
        cancel.setForeground(Color.WHITE);;
        cancel.addActionListener(this);
        add(cancel);


        setSize(1300,700);
        setLocation(200,100);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == search){
            String query = "select * from student where rollno ='" + crollno.getSelectedItem() + "'"; 
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(ae.getSource() == print){
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == add){
            setVisible(false);
            new AddStudent();
        } else if (ae.getSource() == update){
            setVisible(false);
            // new updateStudent();
        } else{
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new StudentDetails();
    }

}
