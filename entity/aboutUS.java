package com.tixqik.entity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
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
public class aboutUS extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JTextPane jTextPane1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton backBtn;
	private JButton exitBtn;
	private JTextArea jTextArea2;
	private JScrollPane jScrollPane2;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel2;
	private Vector itemContainer1 = new Vector();
	private Vector itemNameContainer1 = new Vector();

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				aboutUS inst = new aboutUS();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	public aboutUS(Vector items, Vector names) {
		
		super();
		itemContainer1 = items;
		itemNameContainer1 = names;
		initGUI();
	}
	
	public aboutUS() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Mission");
				jLabel1.setBounds(27, 73, 122, 210);
				jLabel1.setFont(new java.awt.Font("Times New Roman",0,36));
			}
			
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Team: ");
				jLabel2.setBounds(20, 486, 249, 37);
				jLabel2.setFont(new java.awt.Font("Times New Roman",0,36));
			}
			
			
			
	
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(161, 34, 832, 426);
				{
					jTextArea1 = new JTextArea();
					jScrollPane1.setViewportView(jTextArea1);
					jTextArea1.setText("    When amazon launched its online marketplace with the aim providing consumers with a large variety of third party goods, since "
							+ "then it has come to become one of the world’s largest shopping hub. Although coming up with an online shopping "
							+ "model like Amazon will be quite difficult, online ticket sales are also a very large market area"
							+ " covering sports, concerts and event ticket sales. A report published by "
							+ "IBISWorld on Online Ticket Event Sales – US Market Research shows that online "
							+ "ticket sales industry has a $9bn revenue each year and an annual growth of 12.8% with mor"
							+ "e than 56,846 people employed under 2,682 businesses. A state of the art example of an ex"
							+ "isting model are eBay Inc. and StubHub. StubHub especially employs an approach of focusin"
							+ "g on sport games ticket sales. The problem with current vendors are that they do not prov"
							+ "ide a consumer to consumer sales platform. For example, if a consumer who buys a ticket "
							+ "30 day before an event, but cannot attend the event, normally uses a social media platfo"
							+ "rm or connections of his peers to sell the ticket. TIXQIX provides a platform for the con"
							+ "sumer to sell the ticket to another one of its registered users or to another ticket ven"
							+ "dor. This allows the users to avoid hassle of using a social media platform. Another adv"
							+ "antage of this model is that users have a slight chance of missing a great deal on a "
							+ "social media platform since they may not be a part of a certain group where the ticket is posted.\n\n    Objectives of ta"
							+ "ckling this problem include starting from the basics of identifying an object and the certain relatio"
							+ "nships defining it. An example will be an existing customer and potential customer. Information "
							+ "like SSN, Bank account etc. will be collected from all sellers but a customer would not be requir"
							+ "ed to provide sensitive information. For a customer to sell a ticket he/she will onl"
							+ "y be required to submit credit card information like a regular buyer. Once a customer sells a tic"
							+ "ket he/she does not need credit will be transferred directly into to the customer’s account fro"
							+ "m where they can transfer it to necessary source.\n\n    JAVA coding language will be used to build a "
							+ "program in which all the considerations of customers and buyers are considered.\n\n    An approach of "
							+ "building the model which is centered around the user rather than seller will be our focus for this "
							+ "project. Since second hand ticket sales are to be available to all customers unlike Facebook where "
							+ "friends and family are informed first when a post goes up; customer profiles will be built as new "
							+ "rather than taking information from existing social media platforms i.e. Facebook or Google Plus.");
					jTextArea1.setLineWrap(true);
					jTextArea1.setWrapStyleWord(true);
					jTextArea1.setEditable(false);
					jTextArea1.setOpaque(false);
					jTextArea1.setFont(new java.awt.Font("Times New Roman",0,20));
					jTextArea1.setPreferredSize(new java.awt.Dimension(814, 1282));
				}
			}
			{
				jScrollPane2 = new JScrollPane();
				getContentPane().add(jScrollPane2);
				jScrollPane2.setBounds(158, 486, 832, 198);
				{
					jTextArea2 = new JTextArea();
					jScrollPane2.setViewportView(jTextArea2);
					jTextArea2.setText("Ankit Sharma, shar357@usc.edu" + "\n"+"Jamal Jamal, jamaljam@usc.edu" +"\n"+"Jirui Fu, jiruifu@usc.edu"+"\n"+
					"Ning Wang, wang505@usc.edu"+"\n"+"Shalini Brahmbhatt, sbbrahmb@usc.edu"+"\n"+"Xiaochen Li, xiaochel@usc.edu");
					jTextArea2.setLineWrap(true);
					jTextArea2.setWrapStyleWord(true);
					jTextArea2.setEditable(false);
					jTextArea2.setOpaque(false);
					jTextArea2.setFont(new java.awt.Font("Times New Roman",1,20));
					jTextArea2.setPreferredSize(new java.awt.Dimension(814, 410));
				}
			}
			{
				exitBtn = new JButton();
				getContentPane().add(exitBtn);
				exitBtn.setText("quit");
				exitBtn.setBounds(907, 704, 83, 31);
				exitBtn.setFont(new java.awt.Font("Times New Roman",0,20));
				exitBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("exitBtn.actionPerformed, event="+evt);
						//TODO add your code for exitBtn.actionPerformed
						dispose();
					}
				});

			}
			{
				backBtn = new JButton();
				getContentPane().add(backBtn);
				backBtn.setText("Back to Login");
				backBtn.setBounds(727, 706, 158, 29);
				backBtn.setFont(new java.awt.Font("Times New Roman",0,20));
				backBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("backBtn.actionPerformed, event="+evt);
						//TODO add your code for backBtn.actionPerformed
						Login ln = new Login(itemContainer1, itemNameContainer1);
						ln.show();
						dispose();
					}
				});
			}
			pack();
			setSize(1080, 768);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
