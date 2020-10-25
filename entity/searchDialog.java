package com.tixqik.entity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;


public class searchDialog extends javax.swing.JDialog {
	private JList jList1;
	private JButton jButton1;
	private JButton jButton2;
	private JLabel jLabel1;
	private Vector itemContainer  = new Vector();
	private Vector itemNameContainer = new Vector();

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				searchDialog inst = new searchDialog(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public searchDialog(JFrame frame) {
		super(frame);
		initGUI();
	}
	public searchDialog(Vector items, Vector names) {			
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					ListModel jList1Model = 
							new DefaultComboBoxModel(
									new String[] { "Basketball", "Football","Squash","Cricket" });
					jList1 = new JList();
					getContentPane().add(jList1);
					jList1.setModel(jList1Model);
					jList1.setBounds(259, 157, 561, 250);
					jList1.setFont(new java.awt.Font("Times New Roman",1,28));
				}
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Events coming up");
					jLabel1.setBounds(437, 59, 625, 101);
					jLabel1.setFont(new java.awt.Font("Times New Roman",1,28));
				}
				{
					jButton1 = new JButton();
					getContentPane().add(jButton1);
					jButton1.setText("Sign Up");
					jButton1.setBounds(372, 450, 166, 51);
					jButton1.setFont(new java.awt.Font("Times New Roman",1,28));
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton1.actionPerformed, event="+evt);
							//TODO add your code for jButton1.actionPerformed
							infoForEvent infoForEvent = new infoForEvent (null);
							infoForEvent.show();
						}
					});
				}
				{
					jButton2 = new JButton();
					getContentPane().add(jButton2);
					jButton2.setText("Back");
					jButton2.setBounds(561, 450, 137, 51);
					jButton2.setFont(new java.awt.Font("Times New Roman",1,28));
				}
			}
			this.setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
