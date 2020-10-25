package com.tixqik.behavior;
import java.util.Vector;

import javax.swing.JColorChooser;
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
public class PaymentMadeDialog extends javax.swing.JDialog {
	private JLabel paymentMade;
	private JLabel emailTix;
	private Vector itemContainer = new Vector();
    private Vector itemNameContainer = new Vector();

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				PaymentMadeDialog inst = new PaymentMadeDialog(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public PaymentMadeDialog(JFrame frame) {
		super(frame);
		initGUI();
	}
public PaymentMadeDialog(Vector items, Vector names) {
		
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
					paymentMade = new JLabel();
					getContentPane().add(paymentMade);
					paymentMade.setText("Your Payment Has Been Made!");
					paymentMade.setBounds(72, 68, 217, 15);
					paymentMade.setFont(new java.awt.Font("Dialog",0,14));
				}
				{
					emailTix = new JLabel();
					getContentPane().add(emailTix);
					emailTix.setText("Your Ticket(s) Has Been Sent To Your Email!");
					emailTix.setBounds(40, 120, 280, 30);
				}
			}
			this.setSize(352, 257);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
