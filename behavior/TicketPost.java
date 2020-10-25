package com.tixqik.behavior;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

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
public class TicketPost extends javax.swing.JDialog {
	private JScrollPane jScrollPane1;
	private JList viewerList;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JComboBox typeSelect;
	private JLabel jLabel6;
	private JButton backbtn;
	private JButton clc;
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
	private Vector Container = new Vector();
	private Vector NameContainer = new Vector();
	private JButton DeleteButton;
	private JButton CancelButton;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				TicketPost inst = new TicketPost(frame);
				inst.setVisible(true);
			}
		});
	}
public TicketPost(Vector items, Vector names) {
		
		super();
		Container = items;
		NameContainer = names;
		initGUI();
	}
	public TicketPost(JFrame frame) {
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
					jScrollPane1.setBounds(49, 51, 345, 511);
					{
						ListModel viewerListModel = 
								new DefaultComboBoxModel(NameContainer);
						viewerList = new JList();
						jScrollPane1.setViewportView(viewerList);
						viewerList.setModel(viewerListModel);
						viewerList.setBounds(366, 39, 342, 508);
						viewerList.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								int indx =viewerList.getSelectedIndex();
								Ticket ub = (Ticket) Container
										.get(indx);
								eventEntry.setText(ub.getEvent());
								jTextField1.setText(ub.getLocation());
								jTextField2.setText(ub.getPrice());
								jTextField3.setText(ub.getOrganizer());
								date.setText(ub.getDate());
								jTextField4.setText(ub.getTime());
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
					jLabel3.setText("Organizer:");
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
					clc = new JButton();
					getContentPane().add(clc);
					clc.setText("Clear");
					clc.setBounds(49, 637, 174, 52);
					clc.setFont(new java.awt.Font("Times New Roman",0,18));
					clc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("CancelButton.actionPerformed, event="+evt);
							eventEntry.setText(null);
							jTextField1.setText(null);
							jTextField2.setText(null);
							jTextField3.setText(null);
							jTextField4.setText(null);
							date.setText(null);
						}
					});
				}
				{
					DeleteButton = new JButton();
					getContentPane().add(DeleteButton);
					DeleteButton.setText("Add");
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
							String tp = (String) typeSelect.getSelectedItem();
							String excelFilePath0 = "ticketinfo.xls";
							String excelFilePath = "ticketclass.xls";
							try {
					        	
					            FileInputStream inputStream = new FileInputStream(new File(excelFilePath0));
					            Workbook workbook =WorkbookFactory.create(inputStream);
					 
					            Sheet sheet = workbook.getSheetAt(0);
					            Object[][]bookData = {{eventEntry.getText(),jTextField1.getText(),
					            	jTextField3.getText(),date.getText(),
					            	jTextField4.getText(), jTextField2.getText(),typeSelect.getSelectedItem()}};
					            
					 
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
					            FileOutputStream outputStream = new FileOutputStream("ticketinfo.xls");
					            workbook.write(outputStream);
					            workbook.close();
					            outputStream.flush();
					            outputStream.close();
					             
					        } catch (IOException | EncryptedDocumentException | InvalidFormatException ex) {
					            ex.printStackTrace();
					        }
							if(tp == "Sports Game"){
							try {
					        	
					            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
					            Workbook workbook =WorkbookFactory.create(inputStream);
					 
					            Sheet sheet = workbook.getSheet("Sports");
					            Object[][]bookData = {{eventEntry.getText(),jTextField1.getText(),
					            	jTextField3.getText(),date.getText(),
					            	jTextField4.getText(), jTextField2.getText(),typeSelect.getSelectedItem()}};					            					 
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
					            FileOutputStream outputStream = new FileOutputStream("ticketclass.xls");
					            workbook.write(outputStream);
					            workbook.close();
					            outputStream.flush();
					            outputStream.close();
					             
					        } catch (IOException | EncryptedDocumentException | InvalidFormatException ex) {
					            ex.printStackTrace();
					        }
							}
							if(tp == "Concert"){
								try {
						        	
						            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
						            Workbook workbook =WorkbookFactory.create(inputStream);
						 
						            Sheet sheet = workbook.getSheet("Concert");
						            Object[][]bookData = {{eventEntry.getText(),jTextField1.getText(),
						            	jTextField3.getText(),date.getText(),
						            	jTextField4.getText(), jTextField2.getText(),typeSelect.getSelectedItem()}};
						            
						 
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
						            FileOutputStream outputStream = new FileOutputStream("ticketclass.xls");
						            workbook.write(outputStream);
						            workbook.close();
						            outputStream.flush();
						            outputStream.close();
						             
						        } catch (IOException | EncryptedDocumentException | InvalidFormatException ex) {
						            ex.printStackTrace();
						        }
							}
							if(tp == "Drama"){
								try {
						        	
						            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
						            Workbook workbook =WorkbookFactory.create(inputStream);
						 
						            Sheet sheet = workbook.getSheet("Drama");
						            Object[][]bookData = {{eventEntry.getText(),jTextField1.getText(),
						            	jTextField3.getText(),date.getText(),
						            	jTextField4.getText(), jTextField2.getText(),typeSelect.getSelectedItem()}};
						            
						 
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
						            FileOutputStream outputStream = new FileOutputStream("ticketclass.xls");
						            workbook.write(outputStream);
						            workbook.close();
						            outputStream.flush();
						            outputStream.close();
						             
						        } catch (IOException | EncryptedDocumentException | InvalidFormatException ex) {
						            ex.printStackTrace();
						        }
							}
							Ticket newItem= new Ticket(event, location, organizer, dt, tm, price, tp); // create a new item instance
							Container.add(newItem); // add new item into the container
							NameContainer.add(newItem.getEvent());
							viewerList.updateUI();
								
							
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
							Container.clear();
							NameContainer.clear();
							CompanyHomepage chp = new CompanyHomepage (Container, NameContainer);
							chp.show();
							dispose();
						}
					});
				}
				{
					jLabel6 = new JLabel();
					getContentPane().add(jLabel6);
					jLabel6.setText("Select a Type:");
					jLabel6.setFont(new java.awt.Font("Times New Roman",0,25));
					jLabel6.setBounds(473, 51, 150, 35);
				}
				{
					ComboBoxModel typeSelectModel = 
							new DefaultComboBoxModel(
									new String[] { null,"Sports Game", "Concert","Drama" });
					typeSelect = new JComboBox();
					getContentPane().add(typeSelect);
					typeSelect.setModel(typeSelectModel);
					typeSelect.setBounds(635, 51, 377, 35);
				}

			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
