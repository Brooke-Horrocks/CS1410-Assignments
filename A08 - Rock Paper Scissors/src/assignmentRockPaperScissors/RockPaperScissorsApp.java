/**
* Assignment A08 Rock Paper Scissors
* Program: RockPaperScissorsApp
* Programmer: Brooke Horrocks
* Date: Jul 23, 2018
*/
package assignmentRockPaperScissors;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class RockPaperScissorsApp extends JFrame {
	
	private static final long serialVersionUID = 1L;
	ImageIcon rock = new ImageIcon(getClass().getResource("Rock.PNG"));
	ImageIcon paper = new ImageIcon(getClass().getResource("Paper.PNG"));
	ImageIcon scissors = new ImageIcon(getClass().getResource("Scissors.PNG"));
	Random r = new Random();
	Icon[] pics = {rock, paper, scissors};
	
	private JPanel contentPane;

	/**
	 * Method: main
	 * @param args Launch the Application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissorsApp frame = new RockPaperScissorsApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame
	 */
	public RockPaperScissorsApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 25, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(5, 5));
		setContentPane(contentPane);
		
		/**
		 * Create Game Label
		 */
		JLabel lblRockPaperScissors = new JLabel("Rock, Paper, Scissors... Shoot!");
		lblRockPaperScissors.setBackground(new Color(64, 224, 208));
		lblRockPaperScissors.setOpaque(true);
		lblRockPaperScissors.setForeground(new Color(0, 0, 0));
		lblRockPaperScissors.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 25));
		lblRockPaperScissors.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblRockPaperScissors, BorderLayout.NORTH);
		
		/** 
		 * Create Control Panel
		 */
		JPanel controlPanel = new JPanel();
		contentPane.add(controlPanel, BorderLayout.WEST);
		controlPanel.setLayout(new GridLayout(0, 1, 20, 5));
		
		/**
		 * Create User Choice Label
		 */
		JLabel lblUserChoice = new JLabel("Select Below:");
		lblUserChoice.setVerticalAlignment(SwingConstants.BOTTOM);
		lblUserChoice.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		lblUserChoice.setBackground(UIManager.getColor("Button.background"));
		lblUserChoice.setOpaque(true);
		lblUserChoice.setHorizontalAlignment(SwingConstants.CENTER);
		controlPanel.add(lblUserChoice);
		
		/**
		 * Create Game Panel
		 */
		JPanel gamePanel = new JPanel();
		gamePanel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		gamePanel.setBackground(Color.WHITE);
		contentPane.add(gamePanel, BorderLayout.CENTER);
		gamePanel.setLayout(new GridLayout(0, 2, 0, 20));
		
		/**
		 * Create User Choice Button
		 */
		JButton btnUser = new JButton("User");
		btnUser.setBackground(new Color(0, 139, 139));
		gamePanel.add(btnUser);
		
		/**
		 * Create Computer Choice Button
		 */
		JButton btnComputer = new JButton("Computer");
		btnComputer.setBackground(new Color(0, 139, 139));
		gamePanel.add(btnComputer);
		
		/**
		 * Create Outcome Label
		 */
		JLabel lblOutcome = new JLabel("Who will win?");
		lblOutcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutcome.setBackground(new Color(64, 224, 208));
		lblOutcome.setOpaque(true);
		lblOutcome.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(lblOutcome, BorderLayout.SOUTH);
		
		/**
		 * Create Rock Choice Button
		 */
		JButton btnRock = new JButton();
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Set user button text and icon
				btnUser.setText("");
				btnUser.setIcon(rock);
				
				//Set Computer button text and icon
				btnComputer.setText("");
				btnComputer.setIcon(pics[r.nextInt(pics.length)]);
				
				//Check for winner and change outcome label accordingly
				if(btnUser.getIcon().equals(rock) && btnComputer.getIcon().equals(paper)) {
					lblOutcome.setText("Computer wins...");
				}
				else if(btnUser.getIcon().equals(rock) && btnComputer.getIcon().equals(scissors)) {
					lblOutcome.setText("You win!!!");
				}
				else if(btnUser.getIcon().equals(rock) && btnComputer.getIcon().equals(rock)) {
					lblOutcome.setText("You tied with the Computer");
				}
			}
		});
		btnRock.setIcon(rock);
		btnRock.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnRock.setBackground(Color.WHITE);
		controlPanel.add(btnRock);
		
		/**
		 * Create Paper Choice Button
		 */
		JButton btnPaper = new JButton();
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Set user button text and icon
				btnUser.setIcon(paper);
				btnUser.setText("");
				
				//Set Computer button text and icon
				btnComputer.setText("");
				btnComputer.setIcon(pics[r.nextInt(pics.length)]);
				
				//Check for winner and change outcome label accordingly
				if(btnUser.getIcon().equals(paper) && btnComputer.getIcon().equals(rock)) {
					lblOutcome.setText("You win!!!");
				}
				else if(btnUser.getIcon().equals(paper) && btnComputer.getIcon().equals(scissors)) {
					lblOutcome.setText("Computer wins...");
				}
				else if(btnUser.getIcon().equals(paper) && btnComputer.getIcon().equals(paper)) {
					lblOutcome.setText("You tied with the Computer");
				}
			}
		});
		btnPaper.setIcon(paper);
		btnPaper.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnPaper.setBackground(Color.WHITE);
		controlPanel.add(btnPaper);
		
		/**
		 * Create Scissors Choice Button
		 */
		JButton btnScissors = new JButton();
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Set user button text and icon
				btnUser.setIcon(scissors);
				btnUser.setText("");
				
				//Set Computer button text and icon
				btnComputer.setText("");
				btnComputer.setIcon(pics[r.nextInt(pics.length)]);
				
				//Check for winner and change outcome label accordingly
				if(btnUser.getIcon().equals(scissors) && btnComputer.getIcon().equals(paper)) {
					lblOutcome.setText("You win!!!");
				}
				else if(btnUser.getIcon().equals(scissors) && btnComputer.getIcon().equals(rock)) {
					lblOutcome.setText("Computer wins...");
				}
				else if(btnUser.getIcon().equals(scissors) && btnComputer.getIcon().equals(scissors)) {
					lblOutcome.setText("You tied with the Computer");
				}
			}
		});
		btnScissors.setIcon(scissors);
		btnScissors.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnScissors.setBackground(Color.WHITE);
		controlPanel.add(btnScissors);		
	}

}
