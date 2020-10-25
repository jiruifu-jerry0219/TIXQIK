package com.tixqik.behavior;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
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
public class PurchasingTopFrame extends javax.swing.JFrame {
	private JLabel titlePurchasing;
	private JComboBox Dropdown1;
	private JLabel address2;
	private JTextField address1Entry;
	private JTextField cardnm;
	private JLabel cardname;
	private JLabel address1;
	private JLabel bAddress;
	private JLabel title;
	private JTextField cvvNum;
	private JTextField stateEntry;
	private JLabel zipC;
	private JLabel cardnum;
	private JButton verify;
	private JButton deleteCard;
	private JButton addCard;
	private JList cardList;
	private JTextField zipCEntry;
	private JLabel state;
	private JTextField cityEntry;
	private JLabel city;
	private JTextField address2Entry;
	private JLabel cvv;
	private JTextField cardNumber;
	private JLabel cardNum;
	private JLabel detailsPayment;
	private JLabel paymentType;
	private Vector itemContainer = new Vector();
	private Vector itemNameContainer = new Vector();

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PurchasingTopFrame inst = new PurchasingTopFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public PurchasingTopFrame() {
		super();
		initGUI();
		
	}
public PurchasingTopFrame(Vector items, Vector names) {
		
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				titlePurchasing = new JLabel();
				getContentPane().add(titlePurchasing);
				titlePurchasing.setText("Payment Method");
				titlePurchasing.setBounds(21, 43, 116, 15);
				titlePurchasing.setFont(new java.awt.Font("Dialog",1,12));
			}
			{
				paymentType = new JLabel();
				getContentPane().add(paymentType);
				paymentType.setText("Payment Type:");
				paymentType.setBounds(21, 68, 94, 15);
			}
			{
				ComboBoxModel Dropdown1Model = 
						new DefaultComboBoxModel(
								new String[] { "Credit", "Debit" });
				Dropdown1 = new JComboBox();
				getContentPane().add(Dropdown1);
				Dropdown1.setModel(Dropdown1Model);
				Dropdown1.setBounds(127, 64, 114, 22);
			}
			{
				detailsPayment = new JLabel();
				getContentPane().add(detailsPayment);
				detailsPayment.setText("Payment Details");
				detailsPayment.setBounds(21, 99, 106, 15);
				detailsPayment.setFont(new java.awt.Font("Dialog",1,12));
			}
			{
				cardNum = new JLabel();
				getContentPane().add(cardNum);
				cardNum.setText("Card Number:");
				cardNum.setBounds(21, 126, 94, 15);
			}
			{
				cardNumber = new JTextField();
				getContentPane().add(cardNumber);
				cardNumber.setBounds(127, 123, 117, 22);
			}
			{
				cvv = new JLabel();
				getContentPane().add(cvv);
				cvv.setText("CVV:");
				cvv.setBounds(268, 126, 34, 15);
			}
			{
				cvvNum = new JTextField();
				getContentPane().add(cvvNum);
				cvvNum.setBounds(308, 123, 40, 22);
			}
			{
				title = new JLabel();
				getContentPane().add(title);
				title.setText("Setup Payment Method");
				title.setBounds(177, 12, 196, 15);
				title.setFont(new java.awt.Font("Dialog",1,16));
			}
			{
				bAddress = new JLabel();
				getContentPane().add(bAddress);
				bAddress.setText("Billing Address");
				bAddress.setBounds(21, 161, 98, 15);
				bAddress.setFont(new java.awt.Font("Dialog",1,12));
			}
			{
				address1 = new JLabel();
				getContentPane().add(address1);
				address1.setText("Address 1:");
				address1.setBounds(21, 188, 70, 15);
			}
			{
				address1Entry = new JTextField();
				getContentPane().add(address1Entry);
				address1Entry.setBounds(103, 185, 112, 22);
			}
			{
				address2 = new JLabel();
				getContentPane().add(address2);
				address2.setText("Address 2:");
				address2.setBounds(21, 223, 70, 15);
			}
			{
				address2Entry = new JTextField();
				getContentPane().add(address2Entry);
				address2Entry.setBounds(103, 220, 112, 22);
			}
			{
				city = new JLabel();
				getContentPane().add(city);
				city.setText("City:");
				city.setBounds(253, 188, 30, 15);
			}
			{
				cityEntry = new JTextField();
				getContentPane().add(cityEntry);
				cityEntry.setBounds(290, 185, 54, 22);
			}
			{
				state = new JLabel();
				getContentPane().add(state);
				state.setText("State:");
				state.setBounds(356, 188, 37, 15);
			}
			{
				stateEntry = new JTextField();
				getContentPane().add(stateEntry);
				stateEntry.setBounds(400, 185, 33, 22);
			}
			{
				zipC = new JLabel();
				getContentPane().add(zipC);
				zipC.setText("Zip Code:");
				zipC.setBounds(253, 227, 61, 15);
			}
			{
				zipCEntry = new JTextField();
				getContentPane().add(zipCEntry);
				zipCEntry.setBounds(321, 224, 59, 22);
			}
			{
				ListModel cardListModel = 
						new DefaultComboBoxModel(
								itemNameContainer);
				cardList = new JList();
				getContentPane().add(cardList);
				cardList.setModel(cardListModel);
				cardList.setBounds(492, 41, 111, 197);
			}
			{
				addCard = new JButton();
				getContentPane().add(addCard);
				addCard.setText("Add Card");
				addCard.setBounds(21, 337, 76, 22);
				addCard.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("addCard.actionPerformed, event="+evt);
						//TODO add your code for addCard.actionPerformed
						String cm = cardnm.getText();
						Payment newItem= new Payment(cm); // create a new item instance
						itemContainer.add(newItem); // add new item into the container
						itemNameContainer.add(newItem.getCardName());
						cardList.updateUI();	// Update the list after adding new item.
						cardnm.setText(null);
						cardNumber.setText(null);
						address1Entry.setText(null);
						cvvNum.setText(null);
						stateEntry.setText(null);
						stateEntry.setText(null);
						zipCEntry.setText(null);
						cityEntry.setText(null);
						address2Entry.setText(null);
						
						/*String nm = nameText.getText(); // get name from textbox
						String bd = brandText.getText(); // get brand from textbox
						double wt = Double.parseDouble(weightText.getText()); //cast text to double
						Component newItem= new Component(wt, nm, bd); // create a new item instance
						itemContainer.add(newItem); // add new item into the container
						itemNameContainer.add(newItem.getName());
						jList1.updateUI();	// Update the list after adding new item.
						nameText.setText(null); // clean up the textbox
						brandText.setText(null);
						weightText.setText(null);
						*/
					}
				});
			}
			{
				deleteCard = new JButton();
				getContentPane().add(deleteCard);
				deleteCard.setText("Delete Card");
				deleteCard.setBounds(157, 337, 87, 22);
				deleteCard.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("deleteCard.actionPerformed, event="+evt);
						//TODO add your code for deleteCard.actionPerformed
						int selindex = cardList.getSelectedIndex();
						String itm = (String) cardList.getSelectedValue(); //get selected item from list
						itemNameContainer.remove(itm);
						itemContainer.remove(selindex); // remove the selected item from the container
						cardList.updateUI(); // then update the list to reflect the delete.
					}
				});
			}
			{
				verify = new JButton();
				getContentPane().add(verify);
				verify.setText("Verify Card");
				verify.setBounds(302, 337, 91, 22);
				verify.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("verify.actionPerformed, event="+evt);
						//TODO add your code for verify.actionPerformed
						VerificationDialog provDialog = new VerificationDialog ();
						provDialog.show();
					}
				});
			}
			{
				cardnum = new JLabel();
				getContentPane().add(cardnum);
				cardnum.setText("Save Card As");
				cardnum.setBounds(21, 257, 89, 15);
				cardnum.setFont(new java.awt.Font("Dialog",1,12));
			}
			{
				cardname = new JLabel();
				getContentPane().add(cardname);
				cardname.setText("Card Name:");
				cardname.setBounds(21, 287, 76, 15);
			}
			{
				cardnm = new JTextField();
				getContentPane().add(cardnm);
				cardnm.setText("");
				cardnm.setBounds(103, 284, 86, 22);
			}
			pack();
			this.setSize(655, 392);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
