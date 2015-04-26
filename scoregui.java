

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class scoregui implements ActionListener {
	JFrame frame;
	JButton button;
	JLabel label;
	JPanel studentname;
	JPanel panel1 = new JPanel();
	JPanel scorepanel = new JPanel();
	JPanel weightpanel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel calculate = new JPanel();
	private JLabel name;
	private JLabel assign;
	private JLabel mid;
	private JLabel pro;
	private JLabel fina;
	private JLabel finalgrade;
	private JLabel studentname1;
	private JLabel subject;
	private JLabel weight;
	private JLabel score;
	private JLabel finalscore;
	private JLabel finalweight;
	JLabel output, output1, output2, output3, output4;
	JTextField [] textfield = new JTextField[10];
	JTextField [] textfield1 = new JTextField[10];
	
public scoregui(){
	frame = new JFrame("Score Calculator");
	frame.setVisible(true);
	frame.setSize(600, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	name = new JLabel();
	name.setText("Student name");
	assign = new JLabel();
	assign.setText("Assignments");
	mid = new JLabel();
	mid.setText("Midterm");
	pro = new JLabel();
	pro.setText("Project");
	fina = new JLabel();
	fina.setText("Final");
	finalgrade = new JLabel();
	finalgrade.setText("");
	studentname1 = new JLabel();
	studentname1.setText("Name: ");
	
	finalscore = new JLabel();
	finalscore.setText("Average Score: ");
	finalweight = new JLabel();
	finalweight.setText("Letter Grade: ");
	
	subject = new JLabel();
	subject.setText("Subject");
	weight = new JLabel();
	weight.setText("                                       Weight");
	score = new JLabel();
	score.setText("                       Score");
	
	panel1 = new JPanel();
	panel1.setBackground(Color.cyan);
	panel1.setLayout(new GridLayout(7,1));
	panel2 = new JPanel();
	panel2.setBackground(Color.cyan);
	panel2.setLayout(new GridLayout(1,3));
	scorepanel = new JPanel();
	scorepanel.setBackground(Color.gray);
	scorepanel.setLayout(new GridLayout(7,1));
	weightpanel = new JPanel();
	weightpanel.setBackground(Color.WHITE);
	weightpanel.setLayout(new GridLayout(7,1));
	calculate = new JPanel();
	calculate.setBackground(Color.GREEN);
	calculate.setLayout(new GridLayout(1,4));
	
	button = new JButton("Calculate");
	button.addActionListener(this);
	
	textfield[0] = new JTextField(2);
	textfield[1] = new JTextField(2);
	textfield[2] = new JTextField(2);
	textfield[3] = new JTextField(2);
	textfield[4] = new JTextField(2);
	textfield[5] = new JTextField(2);
	textfield[6] = new JTextField(2);
	
	textfield1[0] = new JTextField(3);
	textfield1[1] = new JTextField(3);
	textfield1[2] = new JTextField(3);
	textfield1[3] = new JTextField(3);
	textfield1[4] = new JTextField(3);
	textfield1[5] = new JTextField(3);
	textfield1[6] = new JTextField(3);
	
	frame.add(panel1, BorderLayout.WEST);
	frame.add(scorepanel, BorderLayout.CENTER);
	frame.add(weightpanel, BorderLayout.EAST);
	frame.add(panel2, BorderLayout.PAGE_START);
	frame.add(calculate, BorderLayout.AFTER_LAST_LINE);
	
	panel1.add(name);
	panel1.add(assign);
	panel1.add(mid);
	panel1.add(pro);
	panel1.add(fina);
	
	
	panel2.add(subject);
	panel2.add(score);
	panel2.add(weight);
	
	scorepanel.add(textfield[0]);
	scorepanel.add(textfield[1]);
	scorepanel.add(textfield[2]);
	scorepanel.add(textfield[3]);
	scorepanel.add(textfield[4]);
	
	
	weightpanel.add(finalgrade);
	weightpanel.add(textfield1[1]);
	weightpanel.add(textfield1[2]);
	weightpanel.add(textfield1[3]);
	weightpanel.add(textfield1[4]);
	
	
	calculate.add(button);
	calculate.add(studentname1);
	calculate.add(finalscore);
	calculate.add(finalweight);

	
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String score1 = textfield[0].getText();
		double score2 = Double.parseDouble(textfield[1].getText());
		double score3 = Double.parseDouble(textfield[2].getText());
		double score4 = Double.parseDouble(textfield[3].getText());
		double score5 = Double.parseDouble(textfield[4].getText());
		
		
		
		double weight2 = Double.parseDouble(textfield1[1].getText());
		double weight3 = Double.parseDouble(textfield1[2].getText());
		double weight4 = Double.parseDouble(textfield1[3].getText());
		double weight5 = Double.parseDouble(textfield1[4].getText());
		
		
		
		double total2= score2*(weight2/100);
		double total3= score3*(weight3/100);
		double total4= score4*(weight4/100);
		double total5= score5*(weight5/100);
		
		studentname1.setText(score1);
		double averagescore= total2+total3+total4+total5;
		finalscore.setText(String.valueOf("Average Score: " + averagescore));
		
		if(averagescore>=90) {
			finalweight.setText(String.valueOf("Letter Grade: " + "A"));
		} else if (averagescore>=80){
			finalweight.setText(String.valueOf("Letter Grade: " + "B"));
		} else if (averagescore>=70){
			finalweight.setText(String.valueOf("Letter Grade: " + "C"));
		}else if (averagescore>=60){
			finalweight.setText(String.valueOf("Letter Grade: " + "D"));
		} else if (averagescore>=0){
			finalweight.setText(String.valueOf("Letter Grade: " + "F"));
		} 
		
		
	}
}
