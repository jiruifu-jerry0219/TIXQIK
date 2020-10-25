package com.tixqik.manage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.tixqik.behavior.Login;
import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.function.xlsreader.MessageProcessor;
import com.tixqik.function.xlsreader.UserProcessor;
import com.tixqik.object.Message;
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
public class ControlPanel extends javax.swing.JFrame {

	private Vector itemContainer = new Vector();
	private JButton addschoolBtn;
	private JLabel welcomeLabel;
	private Vector itemNameContainer = new Vector();
	private JButton userBtn;
	private JButton companyBtn;
	private JButton jButton2;
	private JButton backBtn;
	private JButton exitBtn;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ControlPanel inst = new ControlPanel();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	public ControlPanel(Vector items, Vector names) {	
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	
	public ControlPanel() {
		super();
		initGUI();
	}
	
	private void initGUI() { 
		
		
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				welcomeLabel = new JLabel();
				getContentPane().add(welcomeLabel);
				welcomeLabel.setText("Welcome to the Control Center, Please Make a Selection.");
				welcomeLabel.setBounds(62, 55, 742, 45);
				welcomeLabel.setFont(new java.awt.Font("Times New Roman",1,30));
			}
			{
				addschoolBtn = new JButton();
				getContentPane().add(addschoolBtn);
				addschoolBtn.setText("School List Mangement");
				addschoolBtn.setBounds(12, 212, 260, 63);
				addschoolBtn.setFont(new java.awt.Font("Times New Roman",1,20));
				addschoolBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("addschoolBtn.actionPerformed, event="+evt);
						//TODO add your code for addschoolBtn.actionPerformed
						SchoolManager sm = new SchoolManager(itemContainer, itemNameContainer);
						sm.show();
						dispose();
					}
				});
			}
			{
				userBtn = new JButton();
				getContentPane().add(userBtn);
				userBtn.setText("User Mangement");
				userBtn.setBounds(571, 212, 260, 63);
				userBtn.setFont(new java.awt.Font("Times New Roman",1,20));
				userBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("userBtn.actionPerformed, event="+evt);
						//TODO add your code for userBtn.actionPerformed
						itemContainer.clear();
						itemNameContainer.clear();
						try{
							POIFSFileSystem fs =
								new POIFSFileSystem(new FileInputStream("userinfo.xls"));
							HSSFWorkbook wb = new HSSFWorkbook(fs);
							HSSFSheet sheet1 = wb.getSheet("user");		
							RowProcessor cpip = UserProcessor.getInstance();		
							Vector items = cpip.process(sheet1);		
							for (int i=0; i<items.size(); i++)
							{
								UserBuilder item = (UserBuilder)items.get(i);
								itemContainer.add(item);
								itemNameContainer.add(item.getUsername());
								System.out.println( item.getUsername() + " " + item.getPassword() + " " + item.getType()+" "+item.getAddress()+" "+item.getEmail()+" "+item.getCity()+" "
										+item.getState()+" "+item.getZipcode()+" "+item.getFirstname()+" "+item.getLastname()+" "+item.getPayment()+" "+item.getCompanyname());
							}
							
						}catch (FileNotFoundException e1) {
							e1.printStackTrace();
						}catch (Exception e) {
							e.printStackTrace();
						}
						UserManager um = new UserManager(itemContainer, itemNameContainer);
						um.show();
						dispose();
					}
				});
			}
			{
				companyBtn = new JButton();
				getContentPane().add(companyBtn);
				companyBtn.setText("Company Mangement");
				companyBtn.setFont(new java.awt.Font("Times New Roman",1,20));
				companyBtn.setBounds(12, 388, 260, 63);
				companyBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("companyBtn.actionPerformed, event="+evt);
						//TODO add your code for companyBtn.actionPerformed
						CompanyManager cm = new CompanyManager(itemContainer, itemNameContainer);
						cm.show();
						dispose();
					}
				});
			}
			{
				backBtn = new JButton();
				getContentPane().add(backBtn);
				backBtn.setText("Return to Login");
				backBtn.setFont(new java.awt.Font("Times New Roman",1,20));
				backBtn.setBounds(12, 558, 260, 63);
				backBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("backBtn.actionPerformed, event="+evt);
						//TODO add your code for backBtn.actionPerformed
						Login ln = new Login(itemContainer, itemNameContainer);
						ln.show();
						dispose();						
					}
				});
			}
			{
				exitBtn = new JButton();
				getContentPane().add(exitBtn);
				exitBtn.setText("Leave");
				exitBtn.setFont(new java.awt.Font("Times New Roman",1,20));
				exitBtn.setBounds(571, 558, 260, 63);
				exitBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("exitBtn.actionPerformed, event="+evt);
						//TODO add your code for exitBtn.actionPerformed
						dispose();
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Customer Service");
				jButton2.setFont(new java.awt.Font("Times New Roman",1,20));
				jButton2.setBounds(571, 388, 260, 63);
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("userBtn.actionPerformed, event="+evt);
						//TODO add your code for userBtn.actionPerformed
						itemContainer.clear();
						itemNameContainer.clear();
						try{
							POIFSFileSystem fs =
									new POIFSFileSystem(new FileInputStream("message.xls"));
							HSSFWorkbook wb = new HSSFWorkbook(fs);
							HSSFSheet sheet1 = wb.getSheet("message");
							RowProcessor cpip1 = MessageProcessor.getInstance();
							Vector items1 = cpip1.process(sheet1);
							for (int i=0; i<items1.size(); i++)
							{
								Message item = (Message)items1.get(i);
								itemContainer.add(item);
								itemNameContainer.add(item.getTitle());
								System.out.println( item.getTitle() + " " + item.getEmail() + " " + item.getContent());
							}
						}catch (FileNotFoundException e1) {
							e1.printStackTrace();
						}catch (Exception e) {
							e.printStackTrace();
						}		
						ServiceReciver um = new ServiceReciver(itemContainer, itemNameContainer);
								um.show();
								dispose();
					}
				});
			}
			pack();
			this.setSize(860, 768);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
