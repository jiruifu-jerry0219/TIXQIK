package com.tixqik.manage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;
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
public class Checkcompany extends javax.swing.JDialog {
	private JLabel jLabel1;
	private JList jList1;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JTextField jTextField5;
	private JTextField jTextField4;
	private JButton jButton3;
	private JButton jButton2;
	private JButton jButton1;
	private JLabel jLabel6;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JLabel jLabel3;
	private JTextField jTextField1;
	private JLabel jLabel2;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				Checkcompany inst = new Checkcompany(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public Checkcompany(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Check Companies");
					jLabel1.setBounds(370, 34, 394, 73);
					jLabel1.setFont(new java.awt.Font("Times New Roman",1,48));
				}
				{
					ListModel jList1Model = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
					jList1 = new JList();
					getContentPane().add(jList1);
					jList1.setModel(jList1Model);
					jList1.setBounds(77, 145, 338, 461);
					jList1.setFont(new java.awt.Font("Times New Roman",0,24));
					jList1.addMouseListener(new MouseAdapter() {
					});
				}
				{
					jLabel2 = new JLabel();
					getContentPane().add(jLabel2);
					jLabel2.setText("Name");
					jLabel2.setBounds(456, 161, 109, 61);
					jLabel2.setFont(new java.awt.Font("Times New Roman",1,28));
				}
				{
					jTextField1 = new JTextField();
					getContentPane().add(jTextField1);
					jTextField1.setBounds(583, 169, 422, 46);
					jTextField1.setFont(new java.awt.Font("Times New Roman",0,26));
				}
				{
					jLabel3 = new JLabel();
					getContentPane().add(jLabel3);
					jLabel3.setText("Address");
					jLabel3.setBounds(456, 265, 120, 38);
					jLabel3.setFont(new java.awt.Font("Times New Roman",1,28));
				}
				{
					jTextField2 = new JTextField();
					getContentPane().add(jTextField2);
					jTextField2.setBounds(583, 261, 422, 49);
					jTextField2.setFont(new java.awt.Font("Times New Roman",0,26));
				}
				{
					jLabel4 = new JLabel();
					getContentPane().add(jLabel4);
					jLabel4.setText("City");
					jLabel4.setBounds(456, 350, 115, 47);
					jLabel4.setFont(new java.awt.Font("Times New Roman",1,28));
				}
				{
					jTextField3 = new JTextField();
					getContentPane().add(jTextField3);
					jTextField3.setBounds(583, 353, 422, 50);
					jTextField3.setFont(new java.awt.Font("Times New Roman",0,26));
				}
				{
					jLabel5 = new JLabel();
					getContentPane().add(jLabel5);
					jLabel5.setText("ID");
					jLabel5.setBounds(456, 443, 87, 38);
					jLabel5.setFont(new java.awt.Font("Times New Roman",1,28));
				}
				{
					jLabel6 = new JLabel();
					getContentPane().add(jLabel6);
					jLabel6.setText("Email");
					jLabel6.setBounds(456, 541, 120, 33);
					jLabel6.setFont(new java.awt.Font("Times New Roman",1,28));
				}
				{
					jButton1 = new JButton();
					getContentPane().add(jButton1);
					jButton1.setText("Add");
					jButton1.setBounds(225, 651, 140, 43);
					jButton1.setFont(new java.awt.Font("Times New Roman",1,36));
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton1.actionPerformed, event="+evt);
							//TODO add your code for jButton1.actionPerformed
						}
					});
				}
				{
					jButton2 = new JButton();
					getContentPane().add(jButton2);
					jButton2.setText("Refresh");
					jButton2.setBounds(443, 651, 152, 44);
					jButton2.setFont(new java.awt.Font("Times New Roman",1,36));
					jButton2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton2.actionPerformed, event="+evt);
							//TODO add your code for jButton2.actionPerformed
						}
					});
				}
				{
					jButton3 = new JButton();
					getContentPane().add(jButton3);
					jButton3.setText("Delete");
					jButton3.setBounds(653, 651, 156, 44);
					jButton3.setFont(new java.awt.Font("Times New Roman",1,36));
					jButton3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton3.actionPerformed, event="+evt);
							//TODO add your code for jButton3.actionPerformed
						}
					});
				}
				{
					jTextField4 = new JTextField();
					getContentPane().add(jTextField4);
					jTextField4.setBounds(583, 443, 422, 50);
					jTextField4.setFont(new java.awt.Font("Times New Roman",0,26));
				}
				{
					jTextField5 = new JTextField();
					getContentPane().add(jTextField5);
					jTextField5.setBounds(583, 541, 422, 49);
					jTextField5.setFont(new java.awt.Font("Times New Roman",0,26));
				}
			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
