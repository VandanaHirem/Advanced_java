package JavaProgram4C;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;    // For ActionListener

public class CountryButtonDemo {
	
	
	
		
		
		
		JLabel l1;
		CountryButtonDemo(){
		JFrame f=new JFrame("Button Example");
		l1=new JLabel();
		l1.setBounds(50,50, 700,100);
		l1.setFont(new Font("Lucida Calligraphy",Font.BOLD,60));
		JButton b1=new JButton(" Digital Clock ");
		JButton b2=new JButton(" Hour Glass ");

		b1.setBounds(100,200,100, 100);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		l1.setText("Digital Clock is pressed");
		}
		});
		b2.setBounds(400,200,100, 100);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		l1.setText("Hour Glass is pressed");
		}
		});
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String[] args) {
		new CountryButtonDemo();
		}
		}


	

	

	
	
	


