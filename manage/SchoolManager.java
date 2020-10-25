package com.tixqik.manage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class SchoolManager extends javax.swing.JDialog {

	/**
	* Auto-generated main method to display this JDialog
	*/
	private Vector itemNameContainer = new Vector();
	private Vector itemContainer = new Vector();
	private JLabel logo;
	private JTextField schoolNameEntry;
	private JTextField jTextField3;
	private JButton exitBtn;
	private JButton BackBtn;
	private JButton addBtn;
	private JLabel jLabel2;
	private JTextField jTextField1;
	private JLabel jLabel1;
	private JLabel nameLabel;
	private JLabel title;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				SchoolManager inst = new SchoolManager(frame);
				inst.setVisible(true);
			}
		});
	}
public SchoolManager(Vector items, Vector names) {
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	
	
	public SchoolManager(JFrame frame) {
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
					logo.setBounds(102, 30, 178, 159);
				}
				{
					title = new JLabel();
					getContentPane().add(title);
					title.setText("Add New School");
					title.setBounds(499, 50, 400, 97);
					title.setFont(new java.awt.Font("Times New Roman",1,56));
				}
				{
					nameLabel = new JLabel();
					getContentPane().add(nameLabel);
					nameLabel.setText("School Name:");
					nameLabel.setBounds(114, 232, 222, 50);
					nameLabel.setFont(new java.awt.Font("Times New Roman",1,36));
				}
				{
					schoolNameEntry = new JTextField();
					getContentPane().add(schoolNameEntry);
					schoolNameEntry.setBounds(406, 232, 493, 50);
				}
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Website:");
					jLabel1.setFont(new java.awt.Font("Times New Roman",1,36));
					jLabel1.setBounds(114, 375, 222, 50);
				}
				{
					jTextField1 = new JTextField();
					getContentPane().add(jTextField1);
					jTextField1.setBounds(406, 375, 493, 50);
				}
				{
					jLabel2 = new JLabel();
					getContentPane().add(jLabel2);
					jLabel2.setText("Email:");
					jLabel2.setFont(new java.awt.Font("Times New Roman",1,36));
					jLabel2.setBounds(114, 510, 222, 50);
				}
				{
					addBtn = new JButton();
					getContentPane().add(addBtn);
					addBtn.setText("Add");
					addBtn.setBounds(406, 622, 104, 40);
					addBtn.setFont(new java.awt.Font("Times New Roman",0,26));
					addBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("addBtn.actionPerformed, event="+evt);
							//TODO add your code for addBtn.actionPerformed
							String ak1 = schoolNameEntry.getText();
							String ak2 = jTextField3.getText();
							 String fileName = "database/dat/schoolInfo.dat";  
							 try {  
				                    FileWriter writer = new FileWriter(fileName,true);  
				                    BufferedWriter outWriter=new BufferedWriter(writer);
				                    outWriter.write("School Name: " + ak1 +" && "+"Email: " + ak2 );
				                    outWriter.newLine();  
				                    outWriter.close();  
				                    writer.close();  
				                }catch (IOException e1) {  
				                    e1.printStackTrace();  
				                }
							 schoolNameEntry.setText(null);
							 jTextField3.setText(null);
						}
					});
				}
				{
					BackBtn = new JButton();
					getContentPane().add(BackBtn);
					BackBtn.setText("Back");
					BackBtn.setBounds(565, 622, 104, 40);
					BackBtn.setFont(new java.awt.Font("Times New Roman",0,26));
					BackBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("BackBtn.actionPerformed, event="+evt);
							//TODO add your code for BackBtn.actionPerformed
							ControlPanel cp = new ControlPanel(itemContainer, itemNameContainer);
							cp.show();
							dispose();
						}
					});
				}
				{
					exitBtn = new JButton();
					getContentPane().add(exitBtn);
					exitBtn.setText("Leave");
					exitBtn.setBounds(723, 622, 104, 40);
					exitBtn.setFont(new java.awt.Font("Times New Roman",0,26));
					exitBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("exitBtn.actionPerformed, event="+evt);
							//TODO add your code for exitBtn.actionPerformed
							dispose();
						}
					});
				}
				{
					jTextField3 = new JTextField();
					getContentPane().add(jTextField3);
					jTextField3.setBounds(406, 510, 493, 50);
				}

			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
