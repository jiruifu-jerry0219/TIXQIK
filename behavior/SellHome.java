package com.tixqik.behavior;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.tixqik.entity.SearchResultSportN;
import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.function.xlsreader.TicketProcessor;
import com.tixqik.function.xlsreader.WalletProcessor;
import com.tixqik.object.Ticket;


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
public class SellHome extends javax.swing.JDialog {
	private JLabel head;
	private JTextField uEntry;
	private JButton vBtn;
	private Vector itemContainer1 = new Vector();
	private Vector itemNameContainer1 = new Vector();

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				SellHome inst = new SellHome(frame);
				inst.setVisible(true);
			}
		});
	}
	public SellHome(Vector items, Vector names) {
		
		super();
		itemContainer1 = items;
		itemNameContainer1 = names;
		initGUI();
	}
	
	public SellHome(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					head = new JLabel();
					getContentPane().add(head);
					head.setText("Enter you username to verify:");
					head.setBounds(77, 67, 236, 21);
					head.setFont(new java.awt.Font("Times New Roman",1,18));
				}
				{
					uEntry = new JTextField();
					getContentPane().add(uEntry);
					uEntry.setBounds(77, 125, 236, 28);
				}
				{
					vBtn = new JButton();
					getContentPane().add(vBtn);
					vBtn.setText("Verify");
					vBtn.setBounds(153, 194, 73, 28);
					vBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("vBtn.actionPerformed, event="+evt);
							//TODO add your code for vBtn.actionPerformed
							String in = uEntry.getText();
							try{
								POIFSFileSystem fs =
										new POIFSFileSystem(new FileInputStream("userwallet.xls"));
								HSSFWorkbook wb = new HSSFWorkbook(fs);
								HSSFSheet sheet1 = wb.getSheet(in);
								RowProcessor cpip1 = WalletProcessor.getInstance();
								Vector items1 = cpip1.process(sheet1);
								for (int i=0; i<items1.size(); i++)
								{
									Ticket item = (Ticket)items1.get(i);
									itemContainer1.add(item);
									itemNameContainer1.add(item.getEvent());
									System.out.println( item.getEvent() + " " + item.getLocation() + " " + item.getOrganizer()+" "+item.getDate()+" "+item.getTime()+" "+item.getPrice()+" "
											+item.getType());
								}
							}catch (FileNotFoundException e1) {
								e1.printStackTrace();
							}catch (Exception e) {
								e.printStackTrace();
							}
							SellAction srsn = new SellAction(itemContainer1, itemNameContainer1);
							srsn.show();
							dispose();
							
						}
					});
				}
			}
			setSize(400,300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
