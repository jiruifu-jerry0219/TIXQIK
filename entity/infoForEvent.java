package com.tixqik.entity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.tixqik.behavior.finalReg;


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
public class infoForEvent extends javax.swing.JDialog {
	private JLabel jLabel1;
	private JTextField jTextField1;
	private JTable jTable1;
	private JLabel jLabel2;
	private JButton jButton1;
	private Vector itemContainer  = new Vector();
	private Vector itemNameContainer = new Vector();

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				infoForEvent inst = new infoForEvent(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public infoForEvent(JFrame frame) {
		super(frame);
		initGUI();
	}
	public infoForEvent(Vector items, Vector names) {			
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
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Name");
					jLabel1.setBounds(346, 263, 130, 37);
					jLabel1.setFont(new java.awt.Font("Times New Roman",1,28));
				}
				{
					jTextField1 = new JTextField();
					getContentPane().add(jTextField1);
					jTextField1.setBounds(437, 263, 345, 36);
				}
				{
					TableModel jTable1Model = 
							new DefaultTableModel(
									new String[][] { { "Center", "Small Forward" }, { "Shooting Guard", "Point Guard" },{"Power Forward","Small Forward" }},
									new String[] { "Column 1", "Column 2", });
					jTable1 = new JTable();
					getContentPane().add(jTable1);
					jTable1.setModel(jTable1Model);
					jTable1.setBounds(346, 327, 443, 119);
					jTable1.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					jLabel2 = new JLabel();
					getContentPane().add(jLabel2);
					jLabel2.setText("Basketball at Lyon Center");
					jLabel2.setBounds(373, 154, 473, 84);
					jLabel2.setFont(new java.awt.Font("Times New Roman",0,36));
				}
				{
					jButton1 = new JButton();
					getContentPane().add(jButton1);
					jButton1.setText("Register");
					jButton1.setBounds(502, 466, 167, 91);
					jButton1.setFont(new java.awt.Font("Times New Roman",1,20));
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton1.actionPerformed, event="+evt);
							//TODO add your code for jButton1.actionPerformed
							finalReg finalReg = new finalReg (null);
							finalReg.show();
						}
					});
				}
			}
			setSize(1090, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
