package com.tixqik.behavior;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseAdapter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;
import javax.swing.WindowConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  

import com.tixqik.function.datawriter.UserXlsWriterUdgrade;
import com.tixqik.manage.*;
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
public class UserReg extends javax.swing.JDialog {
	private JLabel w1;
	private JLabel w2;
	private JLabel labelUser;
	private JFormattedTextField nameEntry;
	private JLabel labelKey;
	private JPasswordField keyEntry;
	private JLabel firstNameLabel;
	private JTextField firstNameFieldEntry;
	private JLabel LastName;
	private JTextField LastEntry;
	private JButton stpBtn;
	private JTextField comEntry;
	private JLabel companyName;
	private JLabel TipL3;
	private JLabel tipL2;
	private JLabel tipL1;
	private JFormattedTextField zEntry;
	private JFormattedTextField unEntry;
	private JButton helpBtn;
	private JButton clcBtn;
	private JButton suBtn;
	@SuppressWarnings("rawtypes")
	private JComboBox typeSelect;
	private JLabel typeLabel;
	@SuppressWarnings("rawtypes")
	private JComboBox paySelect;
	private JLabel locationLabel;
	private JTextField locationFieldEntry;
	private JFormattedTextField cityEntry;
	@SuppressWarnings("rawtypes")
	private JComboBox stateEntry;
	private Component zipEntry;
	private JLabel emailLabel;
	private JTextField emailFieldEntry;
	private JLabel payLabel;
	private JButton exitBtn;
	public static String ak1, ak2, ak3, ak4, ak5, ak6, ak7, ak8, ak9, ak10, ak11, ak12;	
	private Vector itemContainer = new Vector();
    private Vector itemNameContainer = new Vector();    
    public boolean agree = true;
    
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				UserReg inst = new UserReg(frame);
				inst.setVisible(true);
			}
		});
	}

public UserReg(Vector items, Vector names) {
		
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	
	public UserReg(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	@SuppressWarnings("unchecked")
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				this.addComponentListener(new ComponentAdapter() {
				});
				{
					w1 = new JLabel();
					getContentPane().add(w1);
					w1.setText("Welcome to TIXQIK");
					w1.setBounds(12, 0, 271, 40);
					w1.setFont(new java.awt.Font("Times New Roman",1,30));
				}
				{
					w2 = new JLabel();
					getContentPane().add(w2);
					w2.setText("Please Create an Username and Password");
					w2.setBounds(12, 40, 545, 40);
					w2.setFont(new java.awt.Font("Times New Roman",1,30));
				}
				{
					labelUser = new JLabel();
					getContentPane().add(labelUser);
					labelUser.setText("*Username:");
					labelUser.setBounds(12, 103, 105, 30);
					labelUser.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				
				{
					labelKey = new JLabel();
					getContentPane().add(labelKey);
					labelKey.setText("*Password:");
					labelKey.setBounds(561, 103, 99, 30);
					labelKey.setFont(new java.awt.Font("Times New Roman",1,20));
					
				}
				{
					keyEntry = new JPasswordField();
					getContentPane().add(keyEntry);
					keyEntry.setText(null);
					keyEntry.setBounds(702, 102, 321, 34);
				}
				{
					firstNameLabel = new JLabel();
					getContentPane().add(firstNameLabel);
					firstNameLabel.setText("*First Name :");
					firstNameLabel.setBounds(6, 215, 125, 32);
					firstNameLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					firstNameFieldEntry = new JTextField();
					getContentPane().add(firstNameFieldEntry);
					firstNameFieldEntry.setText(null);
					firstNameFieldEntry.setBounds(149, 218, 321, 31);
				}
				{
					LastName = new JLabel();
					getContentPane().add(LastName);
					LastName.setText("*Last Name:");
					LastName.setBounds(561, 215, 125, 32);
					LastName.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					LastEntry = new JTextField();
					getContentPane().add(LastEntry);
					LastEntry.setText(null);
					LastEntry.setBounds(704, 217, 318, 31);
				}
				{
					locationLabel = new JLabel();
					getContentPane().add(locationLabel);
					locationLabel.setText("*Address:");
					locationLabel.setBounds(6, 327, 106, 34);
					locationLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					locationFieldEntry = new JTextField();
					getContentPane().add(locationFieldEntry);
					locationFieldEntry.setText(null);
					locationFieldEntry.setBounds(149, 331, 321, 31);
				}
				{
					cityEntry = new JFormattedTextField();
					getContentPane().add(cityEntry);
					cityEntry.setText(null);
					cityEntry.setBounds(543, 331, 147, 31);
				}
				
				{
					@SuppressWarnings("unchecked")
					ComboBoxModel<?> stateEntryModel = 
							new DefaultComboBoxModel<Object>(
									new String[] { null,"AL", "AK","AR","AZ","CA","CO","CT","DE",
											"FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD",
											"MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY",
											"NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT",
											"VA","WA","WV","WI","WY" });
					stateEntry = new JComboBox<Object>();
					getContentPane().add(stateEntry);
					stateEntry.setModel(stateEntryModel);
					stateEntry.setBounds(936, 329, 92, 32);
				}
				
				{
					emailLabel = new JLabel();
					getContentPane().add(emailLabel);
					emailLabel.setText("*Email Address :");
					emailLabel.setBounds(6, 439, 152, 34);
					emailLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					emailFieldEntry = new JTextField();
					getContentPane().add(emailFieldEntry);
					emailFieldEntry.setText(null);
					emailFieldEntry.setBounds(170, 443, 373, 31);
				}
				{
					payLabel = new JLabel();
					getContentPane().add(payLabel);
					payLabel.setText("*Payment Method: ");
					payLabel.setBounds(6, 551, 171, 34);
					payLabel.setFont(new java.awt.Font("Times New Roman",1,20));
					
				}
				{
					ComboBoxModel paySelectModel = 
							new DefaultComboBoxModel(
									new String[] { null,"Credit Card", "Debt Card" ,"Paypal"});
					paySelect = new JComboBox();
					getContentPane().add(paySelect);
					paySelect.setModel(paySelectModel);
					paySelect.setBounds(189, 554, 229, 30);
					paySelect.setFont(new java.awt.Font("Times New Roman",0,15));
				}
				{
					typeLabel = new JLabel();
					getContentPane().add(typeLabel);
					typeLabel.setText("*Account Type: ");
					typeLabel.setBounds(573, 444, 141, 34);
					typeLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					ComboBoxModel typeSelectModel = 
							new DefaultComboBoxModel(
									new String[] { null,"Normal Customer", "Student Customer","Company User" });
					typeSelect = new JComboBox();
					getContentPane().add(typeSelect);
					typeSelect.setModel(typeSelectModel);
					typeSelect.setBounds(719, 444, 309, 30);
					typeSelect.setFont(new java.awt.Font("Times New Roman",0,15));
				}
				{
					suBtn = new JButton();
					getContentPane().add(suBtn);
					suBtn.setText("Create an Account");
					suBtn.setBounds(36, 656, 146, 30);
					suBtn.setFont(new java.awt.Font("Times New Roman",0,15));
					suBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("suBtn.actionPerformed, event="+evt);
							//TODO add your code for suBtn.actionPerformed
							ak1 = unEntry.getText();
							ak2 = keyEntry.getText();
							ak3 = (String) typeSelect.getSelectedItem();
							ak4 = (String) paySelect.getSelectedItem();
							ak5 = locationFieldEntry.getText();
							ak6 = cityEntry.getText();
							ak7 = zEntry.getText();
							ak8 = (String) stateEntry.getSelectedItem();
							ak9 = emailFieldEntry.getText();
							ak10 = firstNameFieldEntry.getText();
							ak11 = LastEntry.getText();
							ak12 = comEntry.getText();
							if(ak1 != null && ak2 != null && ak3 != null && ak4 != null && ak5 != null && 
									ak6 != null && ak7 != null && ak8 != null && ak9 != null && ak10 != null && ak11 != null)
							{
							if(agree == true){												                
							String excelFilePath = "userInfo.xls";		
							try {
					        	
					            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
					            Workbook workbook =WorkbookFactory.create(inputStream);
					 
					            Sheet sheet = workbook.getSheetAt(0);
					            Object[][]bookData = {{unEntry.getText(),keyEntry.getText(),typeSelect.getSelectedItem(),paySelect.getSelectedItem(),
					            		locationFieldEntry.getText(),cityEntry.getText(),zEntry.getText(),stateEntry.getSelectedItem(),
					            		emailFieldEntry.getText(),firstNameFieldEntry.getText(),LastEntry.getText(),comEntry.getText()}};
					 
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
					            FileOutputStream outputStream = new FileOutputStream("userInfo.xls");
					            workbook.write(outputStream);
					            workbook.close();
					            outputStream.flush();
					            outputStream.close();
					             
					        } catch (IOException | EncryptedDocumentException | InvalidFormatException ex) {
					            ex.printStackTrace();
					        }
							if(ak3 != "Company User"){
							String excelFilePath1 = "userwallet.xls";		
							try {
					        	
					            FileInputStream inputStream = new FileInputStream(new File(excelFilePath1));
					            Workbook workbook =WorkbookFactory.create(inputStream);
					 
					            Sheet sheet = workbook.createSheet(unEntry.getText());					            
					            inputStream.close();					 
					            FileOutputStream outputStream = new FileOutputStream("userwallet.xls");
					            workbook.write(outputStream);
					            workbook.close();
					            outputStream.flush();
					            outputStream.close();
					             
					        } catch (IOException | EncryptedDocumentException | InvalidFormatException ex) {
					            ex.printStackTrace();
					        }
							}
			                String fileName = "database/dat/userlog.dat";  
			                try {  
			                    FileWriter writer = new FileWriter(fileName,true);  
			                    BufferedWriter outWriter=new BufferedWriter(writer);
			                    outWriter.write("Username:" + ak1 +"&&"+"Password:" + ak2 +"&&"+"Account type:"+ak3);
			                    outWriter.newLine();  
			                    outWriter.close();  
			                    writer.close();  
			                }catch (IOException e1) {  
			                    e1.printStackTrace();  
			                }  	  			             
			                if(ak3.equals("Normal Customer")){
			                	JOptionPane.showMessageDialog(null,"Thanks for Registration!" +"\n" +"Your Username is: "+ak1+"\n" +"Password is  "+ ak2 +"\n");
			                	Login ms = new Login(itemContainer, itemNameContainer);
			                	ms.show();
			                	dispose();			                	
			                }
			                if(ak3.equals("Student Customer")){
			                	JOptionPane.showMessageDialog(null,"Thanks for Registration!" +"\n" +"Your Username is: "+ak1+"\n" +"Password is  "+ ak2 +"\n" + "According to our policy, please click ok to verify your student identity.");
			                	StudentIdentify si = new StudentIdentify(itemContainer, itemNameContainer);
			                	si.show();
			                	dispose();
			                }
			                if(ak3.equals("Company User")){
			                	JOptionPane.showMessageDialog(null,"Thanks for Registration!" +"\n" +"Your Username is: "+ak1+"\n" +"Password is  "+ ak2 +"\n"+"According to our policy, please click ok to verify your company.");
			                    OrgReg or = new OrgReg(itemContainer, itemNameContainer);
			                    or.show();
			                    dispose();			                
			                }
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Please agree to the terms and conditions.");
							}
							}
							else
							{
								JOptionPane.showMessageDialog(null,"All of the boxes need to be filled.");
							}
						}						
					});
				}
				{
					clcBtn = new JButton();
					getContentPane().add(clcBtn);
					clcBtn.setText("Clear the form");
					clcBtn.setBounds(418, 656, 141, 30);
					clcBtn.setFont(new java.awt.Font("Times New Roman",0,15));
					clcBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("clcBtn.actionPerformed, event="+evt);
							unEntry.setText(null);
							keyEntry.setText(null);
							typeSelect.setSelectedItem(null);
							paySelect.setSelectedItem(null);
							locationFieldEntry.setText(null);
							cityEntry.setText(null);
							zEntry.setText(null);
							stateEntry.setSelectedItem(null);
							emailFieldEntry.setText(null);
							firstNameFieldEntry.setText(null);
							LastEntry.setText(null);
							comEntry.setText(null);
						}
					});
				}
				{
					exitBtn = new JButton();
					getContentPane().add(exitBtn);
					exitBtn.setText("Leave the page");
					exitBtn.setBounds(762, 656, 141, 30);
					exitBtn.setFont(new java.awt.Font("Times New Roman",0,15));
					exitBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("exitBtn.actionPerformed, event="+evt);
							//TODO add your code for exitBtn.actionPerformed
							dispose();
						}
					});
				}
				{
					helpBtn = new JButton();
					getContentPane().add(helpBtn);
					helpBtn.setText("Click here for help");
					helpBtn.setBounds(852, 11, 171, 30);
					helpBtn.setFont(new java.awt.Font("Times New Roman",0,15));
					
				}
				{
					unEntry = new JFormattedTextField();
					getContentPane().add(unEntry);
					unEntry.setText(null);
					unEntry.setBounds(149, 102, 321, 34);
				}
				{
					zEntry = new JFormattedTextField(5);
					getContentPane().add(zEntry);
					zEntry.setText(null);
					zEntry.setBounds(750, 331, 103, 31);
				}
				{
					tipL1 = new JLabel();
					getContentPane().add(tipL1);
					tipL1.setText("Street");
					tipL1.setBounds(283, 368, 39, 21);
				}
				{
					tipL2 = new JLabel();
					getContentPane().add(tipL2);
					tipL2.setText("City");
					tipL2.setBounds(585, 368, 25, 21);
				}
				{
					TipL3 = new JLabel();
					getContentPane().add(TipL3);
					TipL3.setText("Zip");
					TipL3.setBounds(774, 368, 28, 21);
				}
				
				{
					companyName = new JLabel();
					getContentPane().add(companyName);
					companyName.setText("(or Company Name:)");
					companyName.setBounds(170, 274, 152, 21);
				}
				{
					comEntry = new JTextField();
					getContentPane().add(comEntry);
					comEntry.setBounds(322, 271, 555, 28);
					comEntry.setText(null);
				}
				{
					stpBtn = new JButton();
					getContentPane().add(stpBtn);
					stpBtn.setText("Setup Payment Method");
					stpBtn.setBounds(454, 559, 174, 22);
					stpBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("stpBtn.actionPerformed, event="+evt);
							//TODO add your code for stpBtn.actionPerformed
							itemContainer.clear();
							itemNameContainer.clear();
							PurchasingTopFrame pmd = new PurchasingTopFrame(itemContainer, itemNameContainer);
							pmd.show();
						}
					});
				}

			}
			pack();
			this.setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	
}
