package com.tixqik.entity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.tixqik.behavior.Login;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class PopularQA extends javax.swing.JFrame {

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PopularQA inst = new PopularQA();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	private JLabel helpTitle;
	private JScrollPane jScrollPane1;
	private JButton bBtn;
	private JTextArea jTextArea2;
	private JTextArea jTextArea1;
	private Vector itemContainer1 = new Vector();
	private Vector itemNameContainer1 = new Vector();

	public PopularQA() {
		super();
		initGUI();
	}
public PopularQA(Vector items, Vector names) {
		
		super();
		itemContainer1 = items;
		itemNameContainer1 = names;
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				helpTitle = new JLabel();
				getContentPane().add(helpTitle);
				helpTitle.setText("Popular Questions & Answers");
				helpTitle.setBounds(320, 12, 405, 47);
				helpTitle.setFont(new java.awt.Font("Times New Roman",1,30));
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(114, 97, 846, 454);
				jScrollPane1.setOpaque(false);
				{
					jTextArea1 = new JTextArea();
					jScrollPane1.setViewportView(jTextArea1);
					jTextArea1.setText("Q: When will I get my tickets?"+"\n"+"\n"+
					"A: As soon as you have finished purchasing the ticket it will be."+"\n"+"\n"+"\n"+"Q: How do I change or delete information on my profile?"
							+"\n"+"\n"+"A: Send us an Email! We can definitely help!"+"\n"+"\n"+"\n"+"Q: Can I cancel my order?"+"\n"+"\n"+"A: Yes, you can cancel your oder but you have to do "
									+ "so within 30 minutes of placing the order."+"\n"+"\n"+"\n"+"Q: If when I created my account I was a normal customer but now I am a "
											+ "student, can I change my account to a student account?"+"\n"+"\n"+"A: The best way to change your account would be "
													+ "through us. So contact us and let us handle it!"+"\n"+"\n"+"\n"+"Q:Can I sign-up to attend a "
															+ "student event?"+"\n"+"\n"+"A: Only students can sign-up for student events.");
					jTextArea1 .setFont(new java.awt.Font("Times New Roman",0,20));
					jTextArea1.setLineWrap(true);
					jTextArea1.setWrapStyleWord(true);
					jTextArea1.setEditable(false);
					jTextArea1.setOpaque(false);

				}
			}
			{
				jTextArea2 = new JTextArea();
				getContentPane().add(jTextArea2);
				jTextArea2.setBounds(114, 607, 846, 37);
				jTextArea2.setText("       For all other questions please sned us an email and we will get back to you within 12 hrs!");
				jTextArea2.setLineWrap(true);
				jTextArea2.setWrapStyleWord(true);
				jTextArea2.setEditable(false);
				jTextArea2 .setFont(new java.awt.Font("Times New Roman",1,20));
				jTextArea2.setOpaque(false);

			}
			{
				bBtn = new JButton();
				getContentPane().add(bBtn);
				bBtn.setText("BACK");
				bBtn.setBounds(851, 662, 92, 34);
				bBtn.setFont(new java.awt.Font("Times New Roman",1,20));
				bBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("bBtn.actionPerformed, event="+evt);
						//TODO add your code for bBtn.actionPerformed
						Login lg = new Login(itemContainer1, itemNameContainer1);
						lg.show();
						dispose();
					}
				});
			}
			pack();
			setSize(1080,768);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
