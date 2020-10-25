package com.tixqik.entity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import com.tixqik.behavior.GameHomepage;
import com.tixqik.object.StudentGame;
import com.tixqik.object.Ticket;
import com.tixqik.object.UserBuilder;

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
public class GameResult extends javax.swing.JDialog {
	private JScrollPane jScrollPane1;
	private JList viewerList;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JTextField jTextField5;
	private JLabel jLabel6;
	private JButton backbtn;
	private JTextField jTextField4;
	private JTextField date;
	private JTextField jTextField3;
	private JLabel jLabel3;
	private JTextField jTextField2;
	private JLabel jLabel2;
	private JTextField jTextField1;
	private JLabel jLabel1;
	private JTextField eventEntry;
	private JLabel name;
	private Vector itemContainer = new Vector();
	private Vector itemNameContainer = new Vector();
	private JButton DeleteButton;
	private JButton CancelButton;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				GameResult inst = new GameResult(frame);
				inst.setVisible(true);
			}
		});
	}
public GameResult(Vector items, Vector names) {
		
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	public GameResult(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					jScrollPane1 = new JScrollPane();
					getContentPane().add(jScrollPane1);
					jScrollPane1.setBounds(49, 63, 345, 537);
					{
						ListModel viewerListModel = 
								new DefaultComboBoxModel(itemNameContainer);
						viewerList = new JList();
						jScrollPane1.setViewportView(viewerList);
						viewerList.setModel(viewerListModel);
						viewerList.setBounds(266, 96, 342, 497);
						viewerList.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								int indx =viewerList.getSelectedIndex();
								StudentGame ub = (StudentGame) itemContainer
										.get(indx);
								eventEntry.setText(ub.getName());
								jTextField1.setText(ub.getLocation());
								//jTextField2.setText(ub.getPrice());
								jTextField3.setText(ub.getCapacity());
								date.setText(ub.getDate());
								jTextField4.setText(ub.getTime());
								jTextField5.setText(ub.getType());
							}
						});
					}
				}
				{
					name = new JLabel();
					getContentPane().add(name);
					name.setText("Event:");
					name.setBounds(518, 127, 75, 35);
					name.setFont(new java.awt.Font("Times New Roman",0,25));
				}
				{
					eventEntry = new JTextField();
					getContentPane().add(eventEntry);
					eventEntry.setBounds(605, 127, 407, 35);
				}
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Location:");
					jLabel1.setFont(new java.awt.Font("Times New Roman",0,25));
					jLabel1.setBounds(493, 207, 100, 35);
				}
				{
					jTextField1 = new JTextField();
					getContentPane().add(jTextField1);
					jTextField1.setBounds(605, 207, 407, 35);
				}
				{
					jLabel2 = new JLabel();
					getContentPane().add(jLabel2);
					jLabel2.setText("Price:");
					jLabel2.setFont(new java.awt.Font("Times New Roman",0,25));
					jLabel2.setBounds(530, 287, 60, 35);
				}
				{
					jTextField2 = new JTextField();
					getContentPane().add(jTextField2);
					jTextField2.setBounds(605, 287, 407, 35);
				}
				{
					jLabel3 = new JLabel();
					getContentPane().add(jLabel3);
					jLabel3.setText("Capacity:");
					jLabel3.setFont(new java.awt.Font("Times New Roman",0,25));
					jLabel3.setBounds(479, 367, 111, 35);
				}
				{
					jTextField3 = new JTextField();
					getContentPane().add(jTextField3);
					jTextField3.setBounds(608, 367, 407, 35);
				}
				{
					jLabel4 = new JLabel();
					getContentPane().add(jLabel4);
					jLabel4.setText("Date:");
					jLabel4.setFont(new java.awt.Font("Times New Roman",0,25));
					jLabel4.setBounds(529, 447, 61, 35);
				}
				{
					date = new JTextField();
					getContentPane().add(date);
					date.setBounds(608, 447, 407, 35);
				}
				{
					jLabel5 = new JLabel();
					getContentPane().add(jLabel5);
					jLabel5.setText("Time:");
					jLabel5.setFont(new java.awt.Font("Times New Roman",0,25));
					jLabel5.setBounds(529, 527, 61, 35);
				}
				{
					jTextField4 = new JTextField();
					getContentPane().add(jTextField4);
					jTextField4.setBounds(608, 527, 407, 35);
				}
				{
					DeleteButton = new JButton();
					getContentPane().add(DeleteButton);
					DeleteButton.setText("Join");
					DeleteButton.setBounds(549, 635, 174, 52);
					DeleteButton.setFont(new java.awt.Font("Times New Roman",0,18));
					DeleteButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("DeleteButton.actionPerformed, event="+evt);
							//TODO add your code for DeleteButton.actionPerformed
							JOptionPane.showMessageDialog(null, "Join Successfully!"); 
							itemNameContainer.clear();
							itemContainer.clear();
						    MainStudent chp = new MainStudent (itemContainer, itemNameContainer);
							chp.show();
							dispose();
						}
					});
				}
				{
					CancelButton = new JButton();
					getContentPane().add(CancelButton);
					CancelButton.setText("Cancel");
					CancelButton.setBounds(299, 635, 174, 52);
					CancelButton.setFont(new java.awt.Font("Times New Roman",0,18));
					CancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("CancelButton.actionPerformed, event="+evt);
							itemNameContainer.clear();
							itemContainer.clear();
							dispose();
						}
					});
				}
				{
					backbtn = new JButton();
					getContentPane().add(backbtn);
					backbtn.setText("Back");
					backbtn.setBounds(799, 635, 174, 52);
					backbtn.setFont(new java.awt.Font("Times New Roman",0,18));
					backbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("CancelButton.actionPerformed, event="+evt);
							itemNameContainer.clear();
							itemContainer.clear();
						    MainStudent chp = new MainStudent (itemContainer, itemNameContainer);
							chp.show();
							dispose();
						}
					});
				}
				{
					jLabel6 = new JLabel();
					getContentPane().add(jLabel6);
					jLabel6.setText("Type:");
					jLabel6.setFont(new java.awt.Font("Times New Roman",0,25));
					jLabel6.setBounds(518, 63, 75, 35);
				}
				{
					jTextField5 = new JTextField();
					getContentPane().add(jTextField5);
					jTextField5.setBounds(605, 63, 407, 34);
				}

			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
