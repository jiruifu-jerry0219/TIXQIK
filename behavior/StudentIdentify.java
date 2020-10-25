package com.tixqik.behavior;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;






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
public class StudentIdentify extends javax.swing.JDialog {
	private Vector itemContainer = new Vector();
	private JLabel title;
    private Vector itemNameContainer = new Vector();
	private JLabel emailLabel;
	private JTextField emailFieldEntry;
	private JButton signupButton;
	private JButton cancelButton;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static int pd;
	public static String ak1, ak2, ak3, ak4, ak5, ak6, ak7, ak8, ak9, ak10;
	public static String fix1 = "@";
	public static String fix2 = ".edu";
	public static boolean result;
	private JTextField schoolEntry;
	private JComboBox schoolSelection;
	private JLabel schoolLabel;
	private JLabel edu;
	private JTextField last;
	private JLabel at;
	private JLabel logo;
	private JTextField jTextField1;
	private JLabel jLabel1;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				StudentIdentify inst = new StudentIdentify(frame);
				inst.setVisible(true);
			}
		});
	}
	
public StudentIdentify(Vector items, Vector names) {
		
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	
	public StudentIdentify(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					logo = new JLabel();
					ImageIcon icon = new ImageIcon("database/image/tlogo.png");
					getContentPane().add(logo);
					logo.setIcon(icon);
					logo.setBounds(53, 12, 178, 159);
				}
				{
					title = new JLabel();
					getContentPane().add(title);
					title.setText("Student Verification");
					title.setBounds(402, 76, 314, 44);
					title.setFont(new java.awt.Font("Times New Roman",1,36));
				}
				{
					emailLabel = new JLabel();
					getContentPane().add(emailLabel);
					emailLabel.setText("*Email Address :");
					emailLabel.setBounds(107, 444, 152, 34);
					emailLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					emailFieldEntry = new JTextField();
					getContentPane().add(emailFieldEntry);
					//emailFieldEntry.setText(null);
					emailFieldEntry.setBounds(267, 449, 160, 31);
				}
				{
					signupButton = new JButton();
					getContentPane().add(signupButton);
					signupButton.setText("Submit");
					signupButton.setBounds(134, 589, 208, 49);
					signupButton.setFont(new java.awt.Font("Times New Roman",1,20));
					signupButton.addActionListener(new ActionListener() {
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent evt) {
							System.out.println("signupButton.actionPerformed, event="+evt);
							//TODO add your code for signupButton.actionPerformed
							ak1 = schoolEntry.getText();
							ak2 = last.getText();
							File fileName=new File("database/dat/schoolInfo.dat");    // read data from file
		                    try{  
		                    FileReader inOne=new FileReader(fileName);  
		                    BufferedReader inTwo=new BufferedReader(inOne);   
		                    String s=null;  
		                    int judge=1;  
		                    while((s=inTwo.readLine())!=null)  
		                    {  
		                      StringBuilder stringBuilder = new StringBuilder();  
		                        stringBuilder.append("School Name: ");  
		                        stringBuilder.append(ak1);  
		                        stringBuilder.append(" && ");  
		                        stringBuilder.append("Email: ");  
		                        stringBuilder.append(ak2); 	
		                        //stringBuilder.append(".edu");
		                        String ak=stringBuilder.toString();  
		                        System.out.println(ak);
		                        
		                        
		                      if(s.equals(ak)) {   //match input with database
		                        JOptionPane.showMessageDialog(null, "Verify Successfully!");  
		                        schoolEntry.getText();
								
								emailFieldEntry.setText(null);
								last.getText();
		                        judge=0;  			                          
		                        break;  
		                      }  
		                    }    
		                    inTwo.close();  
		                    inOne.close();  
		                    if(judge==1) {  
		                         JOptionPane.showMessageDialog(null,"Wrong School Information!",null,JOptionPane.ERROR_MESSAGE, null);  
		                         schoolEntry.getText();
								
									emailFieldEntry.setText(null);
									last.setText(null);
		                      }  
		                     if(judge==0){  
		                  
		                         Login hp = new Login(itemContainer, itemNameContainer);
		                         hp.show();
		                    	 dispose();   
		                         return;   
		                     }  
		                     
		                    }catch(IOException event){  
		                        JOptionPane.showMessageDialog(null,"System Error"+event,null,JOptionPane.ERROR_MESSAGE, null);  
		                    }
		                	
						}
					});
				}
				{
					cancelButton = new JButton();
					getContentPane().add(cancelButton);
					cancelButton.setText("Cancel");
					cancelButton.setBounds(755, 589, 208, 49);
					cancelButton.setFont(new java.awt.Font("Times New Roman",1,20));
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("cancelButton.actionPerformed, event="+evt);
							//TODO add your code for cancelButton.actionPerformed
							dispose();
						}
					});
				}
				{
					at = new JLabel();
					getContentPane().add(at);
					at.setText("@");
					at.setBounds(433, 452, 23, 22);
					at.setFont(new java.awt.Font("Times New Roman",0,20));
				}
				{
					last = new JTextField();
					getContentPane().add(last);
					last.setBounds(456, 449, 160, 32);
				}
				{
					edu = new JLabel();
					getContentPane().add(edu);
					edu.setText(".edu");
					edu.setBounds(616, 452, 51, 22);
					edu.setFont(new java.awt.Font("Times New Roman",0,20));
					
				}
				{
					schoolLabel = new JLabel();
					getContentPane().add(schoolLabel);
					schoolLabel.setText("*School Name: ");
					schoolLabel.setBounds(107, 314, 140, 34);
					schoolLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					schoolEntry = new JTextField();
					getContentPane().add(schoolEntry);
					schoolEntry.setBounds(267, 314, 690, 31);
				}
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Student ID:");
					jLabel1.setBounds(109, 215, 140, 34);
					jLabel1.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					jTextField1 = new JTextField();
					getContentPane().add(jTextField1);
					jTextField1.setBounds(267, 215, 690, 31);
				}

				pack();
			}
			setSize(1080,768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
