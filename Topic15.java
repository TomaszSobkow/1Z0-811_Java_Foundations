import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Topic15{
	
	void phonePad(){
		
		JFrame frame = new JFrame();
		frame.setSize(225,210);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel dialPanel = new JPanel(new GridLayout(4,3,2,2));
		for(int i = 1; i <=9; i++)
			dialPanel.add(new JButton(""+i));
		
		dialPanel.add(new JButton("Clear"));
		dialPanel.add(new JButton(""+0));
		dialPanel.add(new JButton("Dial"));
		
		JPanel textFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		textFieldPanel.add(new JTextField("Enter number here "));
		
		JPanel parentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		parentPanel.add(textFieldPanel);
		parentPanel.add(dialPanel);
		frame.add(parentPanel);
		
		
		
	}



	void panels(){

		JFrame frame = new JFrame("Frame with panel");
		frame.setSize(300,160);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Border blackline = BorderFactory.createLineBorder(Color.green);
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		
		JPanel userEntry = new JPanel(new GridLayout(2,2,5,5));
		userEntry.setBorder( BorderFactory.createCompoundBorder(
				raisedbevel, loweredbevel));
		userEntry.add(new JLabel("Name"));
		userEntry.add(new JTextField(10));
		userEntry.add(new JLabel("Surname"));
		userEntry.add(new JTextField(10));
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		buttonsPanel.add(new JButton("Submit"));
		buttonsPanel.add(new JButton("Exit"));
		
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT,10,10);
		JPanel parentPanel = new JPanel(layout);
		parentPanel.setBorder(blackline);
		parentPanel.add(userEntry);
		parentPanel.add(buttonsPanel);
		
		frame.add(parentPanel);	
	}
	
	void borderLayout(){

		JFrame frame = new JFrame("Border Layout");
		BorderLayout borderLauout = new BorderLayout();
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(borderLauout);
		frame.add(new JButton("Center"),BorderLayout.CENTER);
		frame.add(new JButton("North"),BorderLayout.NORTH);
		frame.add(new JButton("South"),BorderLayout.SOUTH);
		frame.add(new JButton("East"),BorderLayout.EAST);
		frame.add(new JButton("West"),BorderLayout.WEST);
	}

	void frame(){

		JFrame frame = new JFrame("Frame with component");
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,30,10);
		GridLayout gridLayout = new GridLayout(3,2,10,5);
		BorderLayout borderLauout = new BorderLayout();
		
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(borderLauout);
		//frame.setLayout(flowLayout);
		frame.add(new JLabel("First Name"));
		frame.add(new JTextField(20));
		frame.add(new JLabel("Last Name"));
		frame.add(new JTextField(20));
		frame.add(new JButton("Submit"));
		frame.add(new JButton("EXIT"));
		
	}


	void confirmationBox(){

		int option = JOptionPane.showConfirmDialog(null,"Continue?");

		if(option == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null,"You wish to continue!");
		else if(option == JOptionPane.NO_OPTION)
			JOptionPane.showMessageDialog(null,"You do not wish to continue!");
		else if(option == JOptionPane.CANCEL_OPTION)
			JOptionPane.showMessageDialog(null,"You pressed the cancel button");
	}

	void inputOutput(){

		String name = JOptionPane.showInputDialog(null,"What is your name please: ","Name",JOptionPane.INFORMATION_MESSAGE);
		int age = Integer.parseInt(JOptionPane.showInputDialog(null,"What is your age please: ",
													"Age",JOptionPane.INFORMATION_MESSAGE));

		JOptionPane.showMessageDialog(null,"Your name is: " +name+ "\nYour age is: " + age,
									"Customer data",JOptionPane.INFORMATION_MESSAGE);
	}

}