package com.tixqik.behavior;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.tixqik.entity.MainSearch;
import com.tixqik.object.Ticket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
public class PurchaseResult extends javax.swing.JDialog {
	private JLabel title;
	private JLabel logo;
	private JLabel priceLabel;
	private JTextField uEntry;
	private JTextField jTextField1;
	private JLabel totalLabel;
	private JList eventName;
	private JButton backBtn;
	private JButton firmBtn;
	private JTextField priceEntry;
	private JLabel ename;
	private JTextField unameEntry;
	private JLabel nameLabel;
	private Vector itemContainer1 = new Vector();
	private Vector itemNameContainer1 = new Vector();
	public String finalprice;
	public String previousprice;
	public Double p1, p2;
	public String a1, a2, a3, a4, a5, a6, a7;

	/**
	* Auto-generated main method to display this JDialog
	*/

public PurchaseResult(Vector items, Vector names) {
		
		super();
		itemContainer1 = items;
		itemNameContainer1 = names;
		initGUI();
	}
	
	public PurchaseResult(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					title = new JLabel();
					getContentPane().add(title);
					title.setText("Purchase Successfully!");
					title.setBounds(429, 88, 500, 84);
					title.setFont(new java.awt.Font("Times New Roman",1,48));
				}
				{
					logo = new JLabel();
					ImageIcon icon = new ImageIcon("database/image/tlogo.png");
					getContentPane().add(logo);
					logo.setIcon(icon);
					logo.setBounds(68, 67, 178, 159);
				}
				{
					nameLabel = new JLabel();
					getContentPane().add(nameLabel);
					nameLabel.setText("Enter your username to verify:");
					nameLabel.setBounds(86, 255, 337, 39);
					nameLabel.setFont(new java.awt.Font("Times New Roman",1,25));
				}
				{
					ename = new JLabel();
					getContentPane().add(ename);
					ename.setText("Event Name:");
					ename.setBounds(275, 350, 154, 39);
					ename.setFont(new java.awt.Font("Times New Roman",1,25));
				}
				{
					priceLabel = new JLabel();
					getContentPane().add(priceLabel);
					priceLabel.setText("Price:");
					priceLabel.setBounds(345, 449, 72, 39);
					priceLabel.setFont(new java.awt.Font("Times New Roman",1,25));
				}
				{
					priceEntry = new JTextField();
					getContentPane().add(priceEntry);
					priceEntry.setBounds(441, 452, 487, 39);
				}
				{
					firmBtn = new JButton();
					getContentPane().add(firmBtn);
					firmBtn.setText("Confirm");
					firmBtn.setBounds(442, 625, 125, 44);
					firmBtn.setFont(new java.awt.Font("Times New Roman",1,25));
					firmBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("firmBtn.actionPerformed, event="+evt);
							//TODO add your code for firmBtn.actionPerformed
							String at = uEntry.getText();
							String excelFilePath0 = "userwallet.xls";
							try {
					        	
					            FileInputStream inputStream = new FileInputStream(new File(excelFilePath0));
					            Workbook workbook =WorkbookFactory.create(inputStream);
					 
					            Sheet sheet = workbook.getSheet(at);
					            Object[][]bookData = {{a1,a2,a3,a4,a5,a6,a7}};					            						            					 
					            int rowCount = sheet.getLastRowNum();
					 
					            for (Object[] aBook : bookData) {
					                Row row = sheet.createRow(++rowCount);
					 
					                int columnCount = 0;
					                 
					                Cell cell = row.createCell(columnCount);
					                cell.setCellValue(rowCount);
					                 
					                for (Object field : aBook) {
					                    cell = row.createCell(++columnCount);
					                    if (field instanceof String) {
					                        cell.setCellValue((String) field);
					                    } else if (field instanceof Integer) {
					                        cell.setCellValue((Integer) field);
					                    }
					                }					 
					            }					            
					            inputStream.close();					 
					            FileOutputStream outputStream = new FileOutputStream("userwallet.xls");
					            workbook.write(outputStream);
					            workbook.close();
					            outputStream.flush();
					            outputStream.close();
					             
					        } catch (IOException | EncryptedDocumentException | InvalidFormatException ex) {
					            ex.printStackTrace();
					        }
							JOptionPane.showMessageDialog(null, "Purchase Successfully!");
							itemNameContainer1.clear();
							itemContainer1.clear();
							MainSearch ms = new MainSearch(itemContainer1, itemNameContainer1);
							ms.show();
							dispose();
						}
					});
				}
				{
					backBtn = new JButton();
					getContentPane().add(backBtn);
					backBtn.setText("Back to Search");
					backBtn.setBounds(718, 625, 211, 44);
					backBtn.setFont(new java.awt.Font("Times New Roman",1,25));
					backBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("backBtn.actionPerformed, event="+evt);
							//TODO add your code for backBtn.actionPerformed
							itemNameContainer1.clear();
							itemContainer1.clear();
							MainSearch ms = new MainSearch(itemContainer1, itemNameContainer1);
							ms.show();
							dispose();
						}
					});
				}
				{
					ListModel eventNameModel = 
							new DefaultComboBoxModel(itemNameContainer1);
					eventName = new JList();
					getContentPane().add(eventName);
					eventName.setModel(eventNameModel);
					eventName.setBounds(441, 350, 488, 39);
					eventName.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {
							int indx =eventName.getSelectedIndex();
							Ticket ub = (Ticket) itemContainer1
									.get(indx);
							a1 = ub.getEvent();
							a2 = ub.getLocation();
							a3 = ub.getOrganizer();
							a4 = ub.getDate();
							a5 = ub.getTime();
							a6 = ub.getPrice();
							a7 = ub.getType();
							
							priceEntry.setText(ub.getPrice());
							previousprice = ub.getPrice();
							p1 = Double.parseDouble(previousprice);
							p2 = 1.015 * p1;
							finalprice = Double.toString(p2);
							jTextField1.setText(finalprice);							
						}
					});
				}
				{
					totalLabel = new JLabel();
					getContentPane().add(totalLabel);
					totalLabel.setText("Total Price:");
					totalLabel.setBounds(287, 536, 128, 39);
					totalLabel.setFont(new java.awt.Font("Times New Roman",1,25));
				}
				{
					jTextField1 = new JTextField();
					getContentPane().add(jTextField1);
					jTextField1.setText(null);
					jTextField1.setBounds(442, 536, 486, 39);
				}
				{
					uEntry = new JTextField();
					getContentPane().add(uEntry);
					uEntry.setBounds(441, 257, 488, 37);
				}

			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
