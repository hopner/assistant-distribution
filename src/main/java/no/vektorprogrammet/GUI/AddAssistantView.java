package no.vektorprogrammet.GUI;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddAssistantView extends JFrame implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;

    // Monday times
    private JLabel monday;
    private JComboBox monStartHour;
    private JComboBox monStartMinute;
    private JComboBox monEndHour;
    private JComboBox monEndMinute;

    // Tuesday times
    private JLabel tuesday;
    private JComboBox tueStartHour;
    private JComboBox tueStartMinute;
    private JComboBox tueEndHour;
    private JComboBox tueEndMinute;

    // Wednesday times
    private JLabel wednesday;
    private JComboBox wedStartHour;
    private JComboBox wedStartMinute;
    private JComboBox wedEndHour;
    private JComboBox wedEndMinute;

    // Thursday times
    private JLabel thursday;
    private JComboBox thuStartHour;
    private JComboBox thuStartMinute;
    private JComboBox thuEndHour;
    private JComboBox thuEndMinute;

    // Friday times
    private JLabel friday;
    private JComboBox friStartHour;
    private JComboBox friStartMinute;
    private JComboBox friEndHour;
    private JComboBox friEndMinute;

    private JButton submit;
    private JButton reset;
    private JTextArea tout;

    private String[] hours 
    = { "00", "01", "02", "03", 
        "04", "05", "06", "07", 
        "08", "09", "10", "11", 
        "12", "13", "14", "15", 
        "16", "17", "18", "19", 
        "20", "21", "22", "23" };

    private String[] minutes
    = { "00", "15", "30", "45" };


    public AddAssistantView() {
        setTitle("Legg til assistent");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Legg til assistent");
        title.setFont(new Font("Arial", java.awt.Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Navn");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        monday = new JLabel("Mandag");
        monday.setFont(new Font("Arial", Font.PLAIN, 20));
        monday.setSize(100, 20);
        monday.setLocation(100, 150);
        c.add(monday);

        monStartHour = new JComboBox(hours);
        monStartHour.setFont(new Font("Arial", Font.PLAIN, 15));
        monStartHour.setSize(50, 20);
        monStartHour.setLocation(200, 150);
        c.add(monStartHour);

        monStartMinute = new JComboBox(minutes);
        monStartMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        monStartMinute.setSize(50, 20);
        monStartMinute.setLocation(260, 150);
        c.add(monStartMinute);

        monEndHour = new JComboBox(hours);
        monEndHour.setFont(new Font("Arial", Font.PLAIN, 15));
        monEndHour.setSize(50, 20);
        monEndHour.setLocation(320, 150);
        c.add(monEndHour);

        monEndMinute = new JComboBox(minutes);
        monEndMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        monEndMinute.setSize(50, 20);
        monEndMinute.setLocation(380, 150);
        c.add(monEndMinute);

        tuesday = new JLabel("Tirsdag");
        tuesday.setFont(new Font("Arial", Font.PLAIN, 20));
        tuesday.setSize(100, 20);
        tuesday.setLocation(100, 200);
        c.add(tuesday);

        tueStartHour = new JComboBox(hours);
        tueStartHour.setFont(new Font("Arial", Font.PLAIN, 15));
        tueStartHour.setSize(50, 20);
        tueStartHour.setLocation(200, 200);
        c.add(tueStartHour);

        tueStartMinute = new JComboBox(minutes);
        tueStartMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        tueStartMinute.setSize(50, 20);
        tueStartMinute.setLocation(260, 200);
        c.add(tueStartMinute);

        tueEndHour = new JComboBox(hours);
        tueEndHour.setFont(new Font("Arial", Font.PLAIN, 15));
        tueEndHour.setSize(50, 20);
        tueEndHour.setLocation(320, 200);
        c.add(tueEndHour);

        tueEndMinute = new JComboBox(minutes);
        tueEndMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        tueEndMinute.setSize(50, 20);
        tueEndMinute.setLocation(380, 200);
        c.add(tueEndMinute);

        wednesday = new JLabel("Onsdag");
        wednesday.setFont(new Font("Arial", Font.PLAIN, 20));
        wednesday.setSize(100, 20);
        wednesday.setLocation(100, 250);
        c.add(wednesday);

        wedStartHour = new JComboBox(hours);
        wedStartHour.setFont(new Font("Arial", Font.PLAIN, 15));
        wedStartHour.setSize(50, 20);
        wedStartHour.setLocation(200, 250);
        c.add(wedStartHour);

        wedStartMinute = new JComboBox(minutes);
        wedStartMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        wedStartMinute.setSize(50, 20);
        wedStartMinute.setLocation(260, 250);
        c.add(wedStartMinute);

        wedEndHour = new JComboBox(hours);
        wedEndHour.setFont(new Font("Arial", Font.PLAIN, 15));
        wedEndHour.setSize(50, 20);
        wedEndHour.setLocation(320, 250);
        c.add(wedEndHour);

        wedEndMinute = new JComboBox(minutes);
        wedEndMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        wedEndMinute.setSize(50, 20);
        wedEndMinute.setLocation(380, 250);
        c.add(wedEndMinute);

        thursday = new JLabel("Torsdag");
        thursday.setFont(new Font("Arial", Font.PLAIN, 20));
        thursday.setSize(100, 20);
        thursday.setLocation(100, 300);
        c.add(thursday);

        thuStartHour = new JComboBox(hours);
        thuStartHour.setFont(new Font("Arial", Font.PLAIN, 15));
        thuStartHour.setSize(50, 20);
        thuStartHour.setLocation(200, 300);
        c.add(thuStartHour);

        thuStartMinute = new JComboBox(minutes);
        thuStartMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        thuStartMinute.setSize(50, 20);
        thuStartMinute.setLocation(260, 300);
        c.add(thuStartMinute);

        thuEndHour = new JComboBox(hours);
        thuEndHour.setFont(new Font("Arial", Font.PLAIN, 15));
        thuEndHour.setSize(50, 20);
        thuEndHour.setLocation(320, 300);
        c.add(thuEndHour);

        thuEndMinute = new JComboBox(minutes);
        thuEndMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        thuEndMinute.setSize(50, 20);
        thuEndMinute.setLocation(380, 300);
        c.add(thuEndMinute);

        friday = new JLabel("Fredag");
        friday.setFont(new Font("Arial", Font.PLAIN, 20));
        friday.setSize(100, 20);
        friday.setLocation(100, 350);
        c.add(friday);

        friStartHour = new JComboBox(hours);
        friStartHour.setFont(new Font("Arial", Font.PLAIN, 15));
        friStartHour.setSize(50, 20);
        friStartHour.setLocation(200, 350);
        c.add(friStartHour);

        friStartMinute = new JComboBox(minutes);
        friStartMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        friStartMinute.setSize(50, 20);
        friStartMinute.setLocation(260, 350);
        c.add(friStartMinute);

        friEndHour = new JComboBox(hours);
        friEndHour.setFont(new Font("Arial", Font.PLAIN, 15));
        friEndHour.setSize(50, 20);
        friEndHour.setLocation(320, 350);
        c.add(friEndHour);

        friEndMinute = new JComboBox(minutes);
        friEndMinute.setFont(new Font("Arial", Font.PLAIN, 15));
        friEndMinute.setSize(50, 20);
        friEndMinute.setLocation(380, 350);
        c.add(friEndMinute);

        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100, 20);
        submit.setLocation(150, 450);
        submit.addActionListener(this);
        c.add(submit);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
