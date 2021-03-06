package com.tixqik.entity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.tixqik.behavior.PurchaseResult;
import com.tixqik.behavior.TicketPost;
import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.function.xlsreader.TicketProcessor;
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
public class SearchResultSportN extends javax.swing.JDialog {
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
	private Vector itemContainer1 = new Vector();
	private Vector itemNameContainer1 = new Vector();
	private JButton DeleteButton;

	/**
	* Auto-generated main method to display this JDialog
	 * @return 
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				SearchResultSportN inst = new SearchResultSportN(frame);
				inst.setVisible(true);
			}
		});
	}
public SearchResultSportN(Vector items, Vector names) {
		
		super();
		itemContainer1 = items;
		itemNameContainer1 = names;
		initGUI();
	}
	public SearchResultSportN(JFrame frame) {
		super(frame);
		
		initGUI();
	}
	public SearchResultSportN(){
		super();
		
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
								new DefaultComboBoxModel(itemNameContainer1);
						viewerList = new JList();
						jScrollPane1.setViewportView(viewerList);
						viewerList.setModel(viewerListModel);
						viewerList.setBounds(266, 96, 342, 497);
						viewerList.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								int indx =viewerList.getSelectedIndex();
								Ticket ub = (Ticket) itemContainer1
										.get(indx);
								eventEntry.setText(ub.getEvent());
								jTextField1.setText(ub.getLocation());
								jTextField2.setText(ub.getPrice());
								jTextField3.setText(ub.getOrganizer());
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
					eventEntry.setText(null);
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
					jTextField1.setText(null);
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
					jTextField2.setText(null);
					jTextField2.setBounds(605, 287, 407, 35);
				}
				{
					jLabel3 = new JLabel();
					getContentPane().add(jLabel3);
					jLabel3.setText("Organizer:");
					jLabel3.setFont(new java.awt.Font("Times New Roman",0,25));
					jLabel3.setBounds(479, 367, 111, 35);
				}
				{
					jTextField3 = new JTextField();
					getContentPane().add(jTextField3);
					jTextField3.setText(null);
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
					date.setText(null);
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
					jTextField4.setText(null);
					jTextField4.setBounds(608, 527, 407, 35);
				}
				{
					DeleteButton = new JButton();
					getContentPane().add(DeleteButton);
					DeleteButton.setText("Purchase");
					DeleteButton.setBounds(549, 635, 174, 52);
					DeleteButton.setFont(new java.awt.Font("Times New Roman",0,18));
					DeleteButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("DeleteButton.actionPerformed, event="+evt);
							//TODO add your code for DeleteButton.actionPerformed
							String event = eventEntry.getText();
							String location = jTextField1.getText();
							String price = jTextField2.getText();
							String organizer = jTextField3.getText();
							String dt = date.getText();
							String tm = jTextField4.getText();
							String tp = jTextField5.getText();
							Ticket newItem= new Ticket(event, location, organizer, dt, tm, price, tp);
							itemNameContainer1.clear();
							itemContainer1.clear();
							itemNameContainer1.add(newItem.getEvent());							
							itemContainer1.add(newItem);
							PurchaseResult pr = new PurchaseResult(itemContainer1, itemNameContainer1);
							pr.show();
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
							itemNameContainer1.clear();
							itemContainer1.clear();
							MainSearch chp = new MainSearch (itemContainer1, itemNameContainer1);
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
					jTextField5.setText(null);
					jTextField5.setBounds(605, 63, 407, 34);
				}

			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
