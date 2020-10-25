package com.tixqik.manage;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.tixqik.function.datawriter.CompanyXlsWriter;
import com.tixqik.object.Company;

public class CompanyManager extends javax.swing.JDialog {

	private Vector itemNameContainer = new Vector();
	private Vector itemContainer = new Vector();
	private JLabel title;
	private JLabel CompanyNameLabel;
	private JLabel locationLabel;
	private JTextField NameFieldEntry;
	private JTextField locationFieldEntry;
	private JFormattedTextField cityEntry;
	private JComboBox stateEntry;
	private JLabel companyLabel;
	private JTextField companyFieldEntry;
	private JLabel emailLabel;
	private JTextField emailFieldEntry;
	private JButton signupButton;
	private Component cancelButton;
	private JButton backButton;
	private JLabel logo;
	private String ak1, ak2, ak3, ak4, ak5, ak6;
			
	public CompanyManager(Vector items, Vector names) {
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	
	public CompanyManager(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					logo = new JLabel();
					ImageIcon icon = new ImageIcon("database/image/tlogo.png");
					logo.setIcon(icon);
					getContentPane().add(logo);
					logo.setBounds(12, 12, 178, 159);
					logo.setText("TIXQIK LOGO");
				}
				{
					title = new JLabel();
					getContentPane().add(title);
					title.setText("Company Registration");
					title.setBounds(326, 12, 486, 74);
					title.setFont(new java.awt.Font("Times New Roman",1,50));
				}
				
				{
					CompanyNameLabel = new JLabel();
					getContentPane().add(CompanyNameLabel);
					CompanyNameLabel.setText("Company Name:");
					CompanyNameLabel.setBounds(105, 195, 154, 32);
					CompanyNameLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					NameFieldEntry = new JTextField();
					getContentPane().add(NameFieldEntry);
					NameFieldEntry.setText(null);
					NameFieldEntry.setBounds(267, 197, 637, 31);
				}
				{
					locationLabel = new JLabel();
					getContentPane().add(locationLabel);
					locationLabel.setText("*Company Address:");
					locationLabel.setBounds(76, 280, 183, 34);
					locationLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					locationFieldEntry = new JTextField();
					getContentPane().add(locationFieldEntry);
					locationFieldEntry.setText(null);
					locationFieldEntry.setBounds(267, 283, 288, 31);
				}
				{
					cityEntry = new JFormattedTextField();
					getContentPane().add(cityEntry);
					cityEntry.setText(null);
					cityEntry.setBounds(608, 284, 147, 28);
				}
				{
					ComboBoxModel stateEntryModel = 
							new DefaultComboBoxModel(
									new String[] { null,"AL", "AK","AR","AZ","CA","CO","CT","DE","FL","GA","HI","ID",
											"IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT",
											"NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT",
											"VT","VA","WA","WV","WI","WY" });
					stateEntry = new JComboBox();
					getContentPane().add(stateEntry);
					stateEntry.setModel(stateEntryModel);
					stateEntry.setBounds(812, 281, 92, 32);
				}
				{
					companyLabel = new JLabel();
					getContentPane().add(companyLabel);
					companyLabel.setText("*Company ID:");
					companyLabel.setBounds(122, 362, 127, 34);
					companyLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					companyFieldEntry = new JTextField();
					getContentPane().add(companyFieldEntry);
					companyFieldEntry.setText(null);
					companyFieldEntry.setBounds(267, 365, 637, 31);
				}
				{
					emailLabel = new JLabel();
					getContentPane().add(emailLabel);
					emailLabel.setText("Company Email:");
					emailLabel.setBounds(100, 445, 149, 34);
					emailLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					emailFieldEntry = new JTextField();
					getContentPane().add(emailFieldEntry);
					emailFieldEntry.setText(null);
					emailFieldEntry.setBounds(267, 449, 637, 31);
				}
				{
					signupButton = new JButton();
					getContentPane().add(signupButton);
					signupButton.setText("Submit");
					signupButton.setBounds(427, 624, 208, 49);
					signupButton.setFont(new java.awt.Font("Times New Roman",1,20));
					signupButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("signupButton.actionPerformed, event="+evt);
							ak1 = NameFieldEntry.getText();
							ak2 = locationFieldEntry.getText();
							ak3 = cityEntry.getText();
							ak4 = (String) stateEntry.getSelectedItem();
							ak5 = companyFieldEntry.getText();
							ak6 = emailFieldEntry.getText();
							if(ak1 != null && ak2 != null && ak3 != null && ak4 != null && ak5 != null && 
									ak6 != null){
								String excelFilePath = "companyInfo.xls";		
								try {
						        	
						            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
						            Workbook workbook =WorkbookFactory.create(inputStream);
						 
						            Sheet sheet = workbook.getSheetAt(0);
						            Object[][]bookData = {{NameFieldEntry.getText(),locationFieldEntry.getText(),cityEntry.getText(),stateEntry.getSelectedItem(),
						            	companyFieldEntry.getText(),emailFieldEntry.getText()}};
						 
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
						            FileOutputStream outputStream = new FileOutputStream("companyInfo.xls");
						            workbook.write(outputStream);
						            workbook.close();
						            outputStream.flush();
						            outputStream.close();
						             
						        } catch (IOException | EncryptedDocumentException | InvalidFormatException ex) {
						            ex.printStackTrace();
						        }	
								 String fileName = "database/dat/companyinfo.dat";  
								 try {  
					                    FileWriter writer = new FileWriter(fileName,true);  
					                    BufferedWriter outWriter=new BufferedWriter(writer);
					                    outWriter.write(" ID "+ak5);
					                    outWriter.newLine();  
					                    outWriter.close();  
					                    writer.close();  
					                }catch (IOException e1) {  
					                    e1.printStackTrace();  
					                }  
								 
								 				
								 
								 JOptionPane.showMessageDialog(null,ak1 + "Company Registered Successfully!");
								 
								 
							}
							
							
						}
					});
				}
				{
					backButton = new JButton();
					getContentPane().add(backButton);
					backButton.setText("Back");
					backButton.setBounds(755, 624, 208, 49);
					backButton.setFont(new java.awt.Font("Times New Roman",1,20));
					backButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("backButton.actionPerformed, event="+evt);
							ControlPanel cp = new ControlPanel(itemContainer, itemNameContainer);
							cp.show();
							dispose();
						}
					});
				}
				
							
				
			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
