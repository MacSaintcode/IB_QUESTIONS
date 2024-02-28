package IB_QUESTIONS.src.university.attempt;

import java.awt.image.ImageProducer;
import java.sql.Statement;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class studentdetails extends JFrame implements ActionListener, WindowListener, ItemListener {

    Color fgcolor = Color.YELLOW, bgcolor = Color.BLACK;
    Font font = new Font("Comic sans", Font.BOLD, 30);
    JTextField Phone_Number, fname, mname, lname, Date_Of_Birth;
    JComboBox faculty, department;
    JButton submit, reset;
    JRadioButton male, female, others;
    String gender;
    Statement st2;

    studentdetails(Statement st) {
        st2 = st;
        GridLayout gl = new GridLayout(8, 2);
        JPanel centerpanel = new JPanel();
        centerpanel.setFont(font);
        centerpanel.setBackground(Color.DARK_GRAY);
//        centerpanel.setIcon
        gl.setVgap(20);
        gl.setHgap(10);

        add(centerpanel);
        centerpanel.setLayout(gl);

//        centerpanel.add(new JLabel(new ImageIcon("C:\\Users\\Saintcoded\\Pictures\\strut.png")));
        centerpanel.add(createlabel("First name"));
        fname = createtextfield();
        centerpanel.add(fname);

        centerpanel.add(createlabel("Middle name (optional)"));
        mname = createtextfield();
        centerpanel.add(mname);

        centerpanel.add(createlabel("Last name"));
        lname = createtextfield();
        centerpanel.add(lname);

        centerpanel.add(createlabel("Phone Number"));
        Phone_Number = createtextfield();
        centerpanel.add(Phone_Number);

        centerpanel.add(createlabel("Date of Birth"));
        Date_Of_Birth = createtextfield();
        centerpanel.add(Date_Of_Birth);

        male = radioButton("Male");
        female = radioButton("Female");
        others = radioButton("Others");

        JPanel combine = new JPanel();

        combine.setBackground(Color.DARK_GRAY);
        combine.add(male);
        combine.add(female);
        combine.add(others);

        centerpanel.add(createlabel("Gender"));
        centerpanel.add(combine);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(others);

        male.setSelected(true);

        centerpanel.add(createlabel("Facaulty"));
        faculty = createjbox();
        centerpanel.add(faculty);
        faculty.addItemListener(this);

        centerpanel.add(createlabel("Department"));
        department = createjbox();
        centerpanel.add(department);

        JPanel southpanel = new JPanel();
        southpanel.setBackground(Color.DARK_GRAY);

        add(southpanel, BorderLayout.SOUTH);

        reset = createbutton("RESET");
        southpanel.add(reset);

        submit = createbutton("SUBMIT");
        southpanel.add(submit);
        addWindowListener(this);
        male.addItemListener(this);
        female.addItemListener(this);
        generate();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Student Registration");
        pack();
        setSize(750, 750);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    JButton createbutton(String txt) {
        JButton btn = new JButton(txt);
        btn.setFont(font);
        btn.setFocusable(false);
        btn.setBackground(bgcolor);
        btn.setForeground(fgcolor);
        btn.addActionListener(this);
        return btn;
    }

    JLabel createlabel(String txt) {
        JLabel label = new JLabel(txt);
        label.setFont(font);
        label.setForeground(fgcolor);
        label.setHorizontalAlignment(JLabel.CENTER);

        return label;
    }

    JRadioButton radioButton(String txt) {
        JRadioButton radio = new JRadioButton(txt);
        radio.setFocusable(false);
        radio.setFont(font);
        radio.setBackground(Color.DARK_GRAY);
        radio.setForeground(fgcolor);
        return radio;
    }

    private JComboBox<String> createjbox() {
        JComboBox<String> box = new JComboBox<String>();
        box.setBackground(bgcolor);
        box.setForeground(fgcolor);
        box.setFont(font);
        return box;
    }

    JTextField createtextfield() {
        JTextField field = new JTextField();
        field.setBackground(bgcolor);
        field.setForeground(fgcolor);
        field.setCaretColor(Color.yellow);
        field.setFont(font);

        return field;
    }

    void generate() {
        String gots;
        faculty.removeAllItems();
        faculty.addItem("CHOOSE A FACAULTY");
        faculty.addItem("CHOOSE FACAULTY");
        // String selectIntoTable = String.format("SELECT Facaultyname FROM Facaulty");
        // try {
        // ResultSet rs = st2.executeQuery(selectIntoTable);
        // while (rs.next()) {
        // gots = rs.getString("Facaultyname");
        // System.out.println(gots);
        // faculty.addItem(gots);
        // }
        //
        // System.out.println("Completed");
        // } catch (SQLException sqe) {
        // System.out.println(sqe.getMessage());
        // }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String select = (String) faculty.getSelectedItem();
        String got;

        department.removeAllItems();
        if (select.equalsIgnoreCase("CHOOSE A FACAULTY")) {
            department.disable();

        } else {
            department.enable();
            department.addItem("CHOACAULTY");
            department.addItem("CHOACAULTY");
            // String selectIntoTable = String.format("SELECT %s FROM department", select);
            // try {
            // ResultSet rs = st2.executeQuery(selectIntoTable);
            // while (rs.next()) {
            // got = rs.getString(select);
            // department.addItem(got);
            // }
            // } catch (SQLException sqe) {
            // System.out.println(sqe.getMessage());
            // }
        }
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else {
            gender = "Others";
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reset) {
            Date_Of_Birth.setText("");
            fname.setText("");
            lname.setText("");
            mname.setText("");
            faculty.setSelectedIndex(0);
            department.setSelectedIndex(0);
            Phone_Number.setText("");

        } else if (e.getSource() == submit) {
            if (lname.getText().isEmpty() || fname.getText().isEmpty()
                    || faculty.getSelectedItem().equals("CHOOSE A FACAULTY")
                    || Phone_Number.getText().isEmpty() || Date_Of_Birth.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field cannot be Blank!");
                return;
            }
            if (mname.equals("")) {
                mname = null;
            }
            String Phone_Numbe[] = { "467", "234", "456", "333" };
            Boolean res = false;
            for (String string : Phone_Numbe) {
                res = Pattern.matches("(0||\\+" + string + ")[7-9][01]\\d{8}", Phone_Number.getText());
                if (res) {
                    break;
                }
            }
            // Boolean res = Pattern.matches("(0||\\+234)[7-9][01]\\d{8}",
            // Phone_Number.getText());
            if (res == false) {
                JOptionPane.showMessageDialog(null, "INCORRECT PHONE NUMBER!");
                return;
            }

            res = Pattern.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}",
                    Date_Of_Birth.getText());
            if (res == false) {
                JOptionPane.showMessageDialog(null, "INCORRECT DATE FORMAT");
                Date_Of_Birth.setText("");
                return;
            }
        }

        // Boolean res = Pattern.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}",
        // Date_Of_Birth.getText());
        // if (res == false) {
        // JOptionPane.showMessageDialog(null, "INCORRECT DATE FORMAT");
        // Date_Of_Birth.setText("");
        // return;
        // }

    }

    public static void main(String[] args) {
        Connector call = new Connector();
        // new studentdetails(call.createStatement());
        new studentdetails(null);
    }

    @Override
    public void windowActivated(WindowEvent arg0) {

    }

    @Override
    public void windowClosed(WindowEvent arg0) {

    }

    @Override
    public void windowClosing(WindowEvent arg0) {

    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {

    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {

    }

    @Override
    public void windowIconified(WindowEvent arg0) {

    }

    @Override
    public void windowOpened(WindowEvent arg0) {

    }
}
