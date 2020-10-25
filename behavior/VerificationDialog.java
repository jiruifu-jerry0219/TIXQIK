package com.tixqik.behavior;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import com.tixqik.object.Payment;


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
public class VerificationDialog extends javax.swing.JDialog {
	private JLabel verificationConfirm;

	/**
	* Auto-generated main method to display this JDialog
	*
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				VerificationDialog inst = new VerificationDialog(frame);
				inst.setVisible(true);
			}
		});
	}*/
	
	public VerificationDialog() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					verificationConfirm = new JLabel();
					getContentPane().add(verificationConfirm);
					verificationConfirm.setText("Your Card Has Been Verified!");
					verificationConfirm.setBounds(79, 95, 242, 15);
					verificationConfirm.setFont(new java.awt.Font("Dialog",1,16));
					verificationConfirm.setForeground(new java.awt.Color(74,211,79));
				}
			}
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
