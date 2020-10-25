package com.tixqik.behavior;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


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
public class NewJDialog extends javax.swing.JDialog {
	private JLabel jLabel1;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton jButton1;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JLabel jLabel4;
	private JButton jButton3;
	private JButton jButton2;
	private JTextField jTextField2;
	private Vector itemContainer1 = new Vector();
	private Vector itemNameContainer1 = new Vector();

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				NewJDialog inst = new NewJDialog(frame);
				inst.setVisible(true);
			}
		});
	}
	
public NewJDialog(Vector items, Vector names) {
		
		super();
		itemContainer1 = items;
		itemNameContainer1 = names;
		initGUI();
	}
	
	public NewJDialog(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Title ");
					jLabel1.setBounds(148, 108, 150, 65);
					jLabel1.setFont(new java.awt.Font("Times New Roman",0,28));
				}
				{
					jTextField1 = new JTextField();
					getContentPane().add(jTextField1);
					jTextField1.setBounds(253, 129, 614, 28);
				}
				{
					jLabel2 = new JLabel();
					getContentPane().add(jLabel2);
					jLabel2.setText("Email");
					jLabel2.setBounds(147, 215, 136, 21);
					jLabel2.setFont(new java.awt.Font("Times New Roman",0,28));
				}
				{
					jTextField2 = new JTextField();
					getContentPane().add(jTextField2);
					jTextField2.setBounds(255, 214, 614, 28);
				}
				{
					jLabel3 = new JLabel();
					getContentPane().add(jLabel3);
					jLabel3.setText("Content");
					jLabel3.setBounds(150, 288, 93, 21);
					jLabel3.setFont(new java.awt.Font("Times New Roman",0,28));
				}
				{
					jButton1 = new JButton();
					getContentPane().add(jButton1);
					jButton1.setText("Send");
					jButton1.setBounds(218, 609, 137, 57);
					jButton1.setFont(new java.awt.Font("Times New Roman",1,20));
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton1.actionPerformed, event="+evt);
							//TODO add your code for jButton1.actionPerformed
							String ak1 = jTextField1.getText();
							String ak2 = jTextField2.getText();
							String ak3 = jTextArea1.getText();
							String excelFilePath = "message.xls";		
							try {
					        	
					            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
					            Workbook workbook =WorkbookFactory.create(inputStream);
					 
					            Sheet sheet = workbook.getSheetAt(0);
					            Object[][]bookData = {{jTextField1.getText(),jTextField2.getText(),jTextArea1.getText()}};
					 
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
					            FileOutputStream outputStream = new FileOutputStream("message.xls");
					            workbook.write(outputStream);
					            workbook.close();
					            outputStream.flush();
					            outputStream.close();
					             
					        } catch (IOException | EncryptedDocumentException | InvalidFormatException ex) {
					            ex.printStackTrace();
					        }
							JOptionPane.showMessageDialog(null, "Message Send Successfully! You will receive the reply within 3 days.");  
							jTextField1.setText(null);
							jTextField2.setText(null);
							jTextArea1.setText(null);

						}
					});
				}
				{
					jButton2 = new JButton();
					getContentPane().add(jButton2);
					jButton2.setText("Back");
					jButton2.setBounds(500, 610, 140, 56);
					jButton2.setFont(new java.awt.Font("Times New Roman",1,20));
					jButton2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton1.actionPerformed, event="+evt);
					Login lb = new Login(itemContainer1, itemNameContainer1);
					lb.show();
					dispose();
						}
					});
				}
				{
					jButton3 = new JButton();
					getContentPane().add(jButton3);
					jButton3.setText("Exit");
					jButton3.setBounds(768, 608, 143, 60);
					jButton3.setFont(new java.awt.Font("Times New Roman",1,20));
					jButton3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton1.actionPerformed, event="+evt);					
					dispose();
						}
					});
				}
				{
					jLabel4 = new JLabel();
					getContentPane().add(jLabel4);
					jLabel4.setText("Contact Us");
					jLabel4.setBounds(471, 43, 241, 59);
					jLabel4.setFont(new java.awt.Font("Times New Roman",0,28));
				}
				{
					jScrollPane1 = new JScrollPane();
					getContentPane().add(jScrollPane1);
					jScrollPane1.setBounds(255, 288, 614, 267);
					{
						jTextArea1 = new JTextArea();
						jScrollPane1.setViewportView(jTextArea1);
						jTextArea1.setLineWrap(true);
						jTextArea1.setWrapStyleWord(true);
					}
				}
			}
			setSize(1080,768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
