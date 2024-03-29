import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class NewStudentAdmission extends JFrame implements ActionListener {

    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii, tfaadhar;
    JLabel labelRoll;
    JDateChooser dcdob;
    JComboBox cbcourse, cbbranch;
    JButton submit, cancel;

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    NewStudentAdmission() {

        // setSize(900, 700);

        setLayout(null);
        getContentPane().setBackground(new Color(238, 232, 170));
        // setBackground(Color.blue);

        // JLabel id15=new JLabel();
        // id15.setBounds(0,0,900,700);
        // id15.setLayout(null);
        // ImageIcon img = new
        // ImageIcon(ClassLoader.getSystemResource("icons/fifth.jpg"));
        // Image i3 = img.getImage().getScaledInstance(920, 600,Image.SCALE_DEFAULT);
        // ImageIcon icc3 = new ImageIcon(i3);
        // id15.setIcon(icc3);
        // add(id15);

        /* Heading - New Faculty Details */
        JLabel heading = new JLabel("New Student Admission");
        heading.setForeground(new Color(204, 0, 0));
        heading.setBounds(150, 30, 500, 50);
        heading.setFont(new Font("Arial Nova", Font.BOLD, 40));
        add(heading);

        /* Label -> Name */
        JLabel lblname = new JLabel("Name");
        lblname.setForeground(new Color(3, 7, 82));
        lblname.setForeground(new Color(3, 7, 82));
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblname);

        /* TextField -> Name */
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        /* Label -> Father's Name */
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setForeground(new Color(3, 7, 82));
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblfname);

        /* TextField -> Name */
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        /* Label -> Rollno */
        JLabel lblRoll = new JLabel("Roll No.");
        lblRoll.setForeground(new Color(3, 7, 82));
        lblRoll.setBounds(50, 200, 200, 30);
        lblRoll.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblRoll);

        /* Roll no -> Random generate */
        labelRoll = new JLabel("1533" + first4);
        labelRoll.setBounds(200, 200, 200, 30);
        labelRoll.setFont(new Font("Arial", Font.BOLD, 20));
        add(labelRoll);

        /* Label -> Date of birth */
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setForeground(new Color(3, 7, 82));
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("Arial", Font.BOLD, 20));
        add(lbldob);

        /* Date Chooser */
        dcdob = new JDateChooser();
        dcdob.setBounds(600, 200, 150, 30);
        add(dcdob);

        /* Label -> Address */
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setForeground(new Color(3, 7, 82));
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("Arial", Font.BOLD, 20));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        /* Label -> Phone */
        JLabel lblphone = new JLabel("Phone");
        lblphone.setForeground(new Color(3, 7, 82));
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        /* Label -> Email */
        JLabel lblemail = new JLabel("Email Id");
        lblemail.setForeground(new Color(3, 7, 82));
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        /* Label -> Class x */
        JLabel lblx = new JLabel("Class X (%)");
        lblx.setForeground(new Color(3, 7, 82));
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblx);

        tfx = new JTextField();
        tfx.setBounds(600, 300, 150, 30);
        add(tfx);

        /* Label -> Class xii */
        JLabel lblxii = new JLabel("Class XII (%)");
        lblxii.setForeground(new Color(3, 7, 82));
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblxii);

        tfxii = new JTextField();
        tfxii.setBounds(200, 350, 150, 30);
        add(tfxii);

        /* Label -> Aadhar number */
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setForeground(new Color(3, 7, 82));
        lblaadhar.setBounds(400, 350, 200, 30);
        lblaadhar.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblaadhar);

        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);

        /* Label -> Course */
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setForeground(new Color(3, 7, 82));
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblcourse);

        /* Course -> Combo Box */
        String course[] = { "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "MCom", "MA", "BA" };
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200, 400, 150, 30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);

        /* Label -> Branch */
        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setForeground(new Color(3, 7, 82));
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblbranch);

        /* Department -> Combo Box */
        String branch[] = { "Computer Application", "Computer Science", "Electronics", "Mechanical", "Civil", "IT" };
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(600, 400, 150, 30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);

        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Arial", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Arial", Font.BOLD, 15));
        add(cancel);

        setTitle("New Student Admission");
        setSize(800, 650);
        setResizable(false);
        setLocationRelativeTo(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String roll = labelRoll.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();

            try {
                String query = "insert into student_Details values('" + name + "', '" + fname + "', '" + roll + "', '"
                        + dob + "', '" + address + "', '" + phone + "', '" + email + "', '" + x + "', '" + xii + "', '"
                        + aadhar + "', '" + course + "', '" + branch + "')";

                jdbc db = new jdbc();
                db.stm.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new NewStudentAdmission();
    }
}
