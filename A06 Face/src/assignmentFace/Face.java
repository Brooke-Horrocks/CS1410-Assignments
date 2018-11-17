/**
* Assignment A06 Face
* Program: Face
* Programmer: Brooke Horrocks
* Date: Jul 15, 2018
*/
package assignmentFace;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Canvas;

public class Face extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2415695980920799983L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Face frame = new Face();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Face() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelForCheckBoxes = new JPanel();
		panelForCheckBoxes.setBounds(10, 5, 103, 251);
		panelForCheckBoxes.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelForCheckBoxes);
		panelForCheckBoxes.setLayout(null);
		
		JCheckBox chckbxEyes = new JCheckBox("Eyes");
		chckbxEyes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		chckbxEyes.setBackground(Color.LIGHT_GRAY);
		chckbxEyes.setBounds(6, 25, 68, 23);
		panelForCheckBoxes.add(chckbxEyes);
		
		JCheckBox chckbxNose = new JCheckBox("Nose");
		chckbxNose.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		chckbxNose.setBackground(Color.LIGHT_GRAY);
		chckbxNose.setBounds(6, 60, 68, 23);
		panelForCheckBoxes.add(chckbxNose);
		
		JCheckBox chckbxMouth = new JCheckBox("Mouth");
		chckbxMouth.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		chckbxMouth.setBackground(Color.LIGHT_GRAY);
		chckbxMouth.setBounds(6, 95, 68, 23);
		panelForCheckBoxes.add(chckbxMouth);
		
		JButton buttonSubmit = new JButton("Submit");
		buttonSubmit.setBounds(10, 134, 83, 23);
		panelForCheckBoxes.add(buttonSubmit);
		
		JPanel panelForFace = new JPanel();
		panelForFace.setBackground(Color.BLUE);
		panelForFace.setBounds(123, 5, 306, 251);
		contentPane.add(panelForFace);
		
		Canvas canvas = new Canvas();
		panelForFace.add(canvas);
	}
}
