import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.toedter.calendar.*;

public class SignUpTwo extends JFrame {
    JTextField pan, aadhar;
    JRadioButton syes, sno, eyes, eno;
    JButton next;
    JComboBox religion, category, occupation, education, income;
    String formno;

    SignUpTwo(String formno){

        this.formno = formno;

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Form 2 : Additional Details");
        additionalDetails.setFont(new Font("Ralway", Font.BOLD,22));
        additionalDetails.setBounds(280,80,300,30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Ralway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Others"};
        religion = new JComboBox(valReligion);
        religion.setBackground(Color.WHITE);
        religion.setBounds(300,140,400,30);
        add(religion);


        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Ralway", Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valCategory[] = {"OPEN", "OBC", "SC", "ST", "OTHER"};
        category = new JComboBox(valCategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300,190,400,30);
        add(category);

        JLabel dob = new JLabel("Icome:");
        dob.setFont(new Font("Ralway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String incomeCategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300,240,400,30);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Ralway", Font.BOLD,20));
        gender.setBounds(100,310,200,30);
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Ralway", Font.BOLD,20));
        email.setBounds(100,335,200,30);
        add(email);

        String educationValues[] = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctrate", "Other"};
        education = new JComboBox(educationValues);
        education.setBackground(Color.WHITE);
        education.setBounds(300,340,400,30);
        add(education);


        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Ralway", Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        String occupatoinValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
        occupation = new JComboBox(occupatoinValues);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300,390,400,30);
        add(occupation);

        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Ralway", Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        pan = new JTextField();
        pan.setFont(new Font("Railway", Font.PLAIN,14));
        pan.setBounds(300,440,400,30);
        add(pan);

        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Ralway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Railway", Font.PLAIN,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);


        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Ralway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBackground(Color.WHITE);
        syes.setBounds(300,540,100,30);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBackground(Color.WHITE);
        sno.setBounds(450,540,100,30);
        add(sno);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Ralway", Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBackground(Color.WHITE);
        eyes.setBounds(300,590,100,30);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBackground(Color.WHITE);
        eno.setBounds(450,590,100,30);
        add(eno);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eyes);
        existingGroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        add(next);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String sreligion = (String) religion.getSelectedItem();
                String scategory = (String) category.getSelectedItem();
                String sincome = (String) income.getSelectedItem();
                String seducation = (String) education.getSelectedItem();
                String soccupation = (String) occupation.getSelectedItem();
                String seniorcitizen = null;

                if(syes.isSelected()){
                    seniorcitizen = "Yes";
                }
                else if(sno.isSelected()){
                    seniorcitizen = "No";
                }

                String existionAccount = null;

                if(eyes.isSelected()){
                    existionAccount = "Yes";
                }
                else if(eno.isSelected()){
                    existionAccount = "No";
                }

                String span = pan.getText();
                String saadhar = aadhar.getText();

                try {
                        Conn c = new Conn();
                        String query = "insert into signuptwo values ('" + formno + "', '" + sreligion + "','" + scategory + "', '" + sincome + "', '" + seducation + "', '" + soccupation + "',  '" + span + "', '" + saadhar + "', '" + seniorcitizen + "', '" + existionAccount + "')";
                        c.s.executeUpdate(query);

                        // SignupThree obj
                    setVisible(false);
                    new SignUpThree(formno).setVisible(true);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        });

        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(350,10);
        setSize(850,800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUpTwo("");
    }
}
