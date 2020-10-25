package com.tixqik.behavior;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class finalReg extends javax.swing.JDialog {
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
				finalReg inst = new finalReg(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public finalReg(JFrame frame) {
		super(frame);
		initGUI();
	}
	public finalReg(Vector items, Vector names) {			
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
					jLabel1.setText("Registration Complete!");
					jLabel1.setBounds(399, 267, 427, 140);
					jLabel1.setFont(new java.awt.Font("Times New Roman",1,28));
				}
			}
			setSize(1080,768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
