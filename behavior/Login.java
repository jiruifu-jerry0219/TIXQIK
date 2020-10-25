package com.tixqik.behavior;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.Container;  
import java.awt.Font;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.event.ComponentAdapter;
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.Writer;  
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ListModel;
import javax.swing.SpinnerListModel;
import javax.swing.SwingUtilities;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.tixqik.entity.MainSearch;
import com.tixqik.entity.MainStudent;
import com.tixqik.entity.PopularQA;
import com.tixqik.entity.aboutUS;
import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.function.xlsreader.UserProcessor;
import com.tixqik.manage.ControlPanel;
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
@SuppressWarnings({ "serial", "unused" })
public class Login extends javax.swing.JDialog {
	
	private JLabel logo;
	private JLabel huanying;
	private JButton aboutBtn;
	private JTextField usernameEntry;
	private JComboBox typeSelect;
	private JButton exitSys;
	private JButton helpMe;
	private JButton signUp;
	private JButton signIn;
	private JLabel jLabel1;
	private JPasswordField userpassword;
	private JLabel passcode;
	private JLabel username;
	public static  int pt = 0;
    public static String ak1 = null, ak2 = null;  
	private Container contentPane = this.getContentPane();  
	private Vector itemContainer = new Vector();
	private Vector itemNameContainer = new Vector();
	public static String rt = null, ut = null, kt = null;
    	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				Login inst = new Login(frame);
				inst.setVisible(true);
			}
		});		
	}
	
public Login(Vector items, Vector names) {
		
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}

	public Login(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	
	
	private void initGUI() {
		//super();
		
		
		try {
			{
				this.addComponentListener(new ComponentAdapter() {
				});
			}
			{
				getContentPane().setLayout(null);
				contentPane.setBackground(new java.awt.Color(254,255,255));
				{					
					logo = new JLabel();
					ImageIcon icon = new ImageIcon("database/image/tlogo.png");
					logo.setIcon(icon);
					getContentPane().add(logo);
					logo.setBounds(55, 40, 178, 159);
					logo.setText("TIXQIK LOGO");
				}
				{
					username = new JLabel();
					getContentPane().add(username);
					username.setText("Username:");
					username.setBounds(375, 181, 143, 53);
					username.setFont(new java.awt.Font("Times New Roman",1,30));
				}
				{
					passcode = new JLabel();
					getContentPane().add(passcode);
					passcode.setText("Password:");
					passcode.setBounds(375, 305, 143, 54);
					passcode.setFont(new java.awt.Font("Times New Roman",1,30));
				}
				{
					userpassword = new JPasswordField();
					getContentPane().add(userpassword);
					userpassword.setText(null);
					userpassword.setBounds(567, 309, 399, 54);
				}
				{
					huanying = new JLabel();
					getContentPane().add(huanying);
					huanying.setText("Welcome");
					huanying.setBounds(55, 249, 233, 56);
					huanying.setFont(new java.awt.Font("Times New Roman",1,56));
				}
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setText("Back");
					jLabel1.setFont(new java.awt.Font("Times New Roman",1,56));
					jLabel1.setBounds(55, 334, 197, 51);
				}
				{
					signIn = new JButton();
					getContentPane().add(signIn);
					signIn.setText("Login");
					signIn.setBounds(567, 560, 127, 40);
					signIn.setFont(new java.awt.Font("Times New Roman",1,24));
					signIn.addActionListener(new ActionListener() {
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent evt) {
							System.out.println("signIn.actionPerformed, event="+evt);
							//TODO add your code for signIn.actionPerformed
							//method to approach login function
							
					        ut = usernameEntry.getText();
					        kt = userpassword.getText();
					        String tt = (String) typeSelect.getSelectedItem();
					        if(ut.equals("admin")){ //check hidden administrator account
					        	if(kt.equals("Admin365")){
					        		JOptionPane.showMessageDialog(null, "Welcome back, administrator");
					        		usernameEntry.setText("");  
			                        userpassword .setText(""); 
			                        ControlPanel cp = new ControlPanel(itemContainer, itemNameContainer);
			                        cp.show();
			                        dispose();	
					        	}
					        	else
					        	{
					          		JOptionPane.showMessageDialog(null, "Wrong username or password, please check your username or password!");
					          		usernameEntry.setText(null);  
			                         userpassword .setText(null); 
					        	}
					        }
					        else{
					    
					                    File fileName=new File("database/dat/userlog.dat");    // read data from file
					                    try{  
					                    FileReader inOne=new FileReader(fileName);  
					                    BufferedReader inTwo=new BufferedReader(inOne);   
					                    String s=null;  
					                    int judge=1;  
					                    while((s=inTwo.readLine())!=null)  
					                    {  
					                      StringBuilder stringBuilder = new StringBuilder();  
					                        stringBuilder.append("Username:");  
					                        stringBuilder.append(usernameEntry.getText());  
					                        stringBuilder.append("&&");  
					                        stringBuilder.append("Password:");  
					                        stringBuilder.append(userpassword.getText()); 
					                        stringBuilder.append("&&");
					                        stringBuilder.append("Account type:");
					                        stringBuilder.append((String)typeSelect.getSelectedItem());
					                        String ak=stringBuilder.toString();  
					                        System.out.println(ak);
					                        
					                        
					                      if(s.equals(ak)) {   //match input with database
					                        JOptionPane.showMessageDialog(null, "Login Successfully! Welcome Back");  

					                        judge=0;  
					                          
					                        break;  
					                      }  
					                    }    
					                    inTwo.close();  
					                    inOne.close();  
					                    if(judge==1) {  
					                         JOptionPane.showMessageDialog(null,"Wrong username or password, please check your username or password!",null,JOptionPane.ERROR_MESSAGE, null);  
					                         usernameEntry.setText(null);  
					                         userpassword .setText(null);  
					                      }  
					                     if(judge==0){
					                    	 if(tt == "Normal Customer"){
					                    		 itemContainer.clear();
					                    		 itemNameContainer.clear();
					                    		 MainSearch hp = new MainSearch(itemContainer, itemNameContainer);
					                    		 hp.show();
					                    		 dispose();}
					                    	 if(tt == "Company User"){
					                    		 itemContainer.clear();
					                    		 itemNameContainer.clear();
					                    		 CompanyHomepage pf = new CompanyHomepage(itemContainer, itemNameContainer);
					                    		 pf.show();
					                    		 dispose();					                    		 
					                    	 }
					                    	 if(tt == "Student Customer"){
					                    		 itemContainer.clear();
					                    		 itemNameContainer.clear();
					                    		 MainStudent sh = new MainStudent(itemContainer, itemNameContainer);
					                    		 sh.show();
					                    		 dispose();
					                    	 }
					                         return;   
					                     }  
					                     
					                    }catch(IOException event){  
					                        JOptionPane.showMessageDialog(null,"System Error"+event,null,JOptionPane.ERROR_MESSAGE, null);  
					                    }
					        }
					                 						
									               					                					                
					}      										                						
				});				
				{
					signUp = new JButton();
					getContentPane().add(signUp);
					signUp.setText("Click here to create a new account!");
					signUp.setBounds(567, 639, 399, 40);
					signUp.setFont(new java.awt.Font("Times New Roman",0,22));
					signUp.addActionListener(new ActionListener() {
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent evt) {
							System.out.println("signUp.actionPerformed, event="+evt);
							//TODO add your code for signUp.actionPerformed
							 UserReg sp = new UserReg(itemContainer, itemNameContainer);
		                        sp.show();
		                        dispose();
							
						}
					});
				}
				{
					helpMe = new JButton();
					getContentPane().add(helpMe);
					helpMe.setText("need help?");
					helpMe.setBounds(836, 12, 215, 41);
					helpMe.setFont(new java.awt.Font("Times New Roman",0,12));
					helpMe.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("helpMe.actionPerformed, event="+evt);
							//TODO add your code for helpMe.actionPerformed
							PopularQA hd = new PopularQA(itemContainer,itemNameContainer);
							hd.show();
							dispose();							
						}
					});
				}
				{
					exitSys = new JButton();
					getContentPane().add(exitSys);
					exitSys.setText("Leave");
					exitSys.setBounds(848, 560, 118, 40);
					exitSys.setFont(new java.awt.Font("Times New Roman",1,24));
					exitSys.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("exitSys.actionPerformed, event="+evt);
							//TODO add your code for exitSys.actionPerformed
							dispose();
							
						}
					});
					
				}
				{
					ComboBoxModel typeSelectModel = 
							new DefaultComboBoxModel(
									new String[] { null,"Normal Customer", "Student Customer","Company User" });
					typeSelect = new JComboBox();
					contentPane.add(typeSelect);
					typeSelect.setModel(typeSelectModel);
					typeSelect.setBounds(567, 416, 399, 58);
				}
				{
					usernameEntry = new JTextField();
					contentPane.add(usernameEntry);
					usernameEntry.setBounds(567, 184, 399, 54);
				}
				{
					aboutBtn = new JButton();
					contentPane.add(aboutBtn);
					aboutBtn.setText("about us");
					aboutBtn.setBounds(676, 12, 215, 41);
					aboutBtn.setFont(new java.awt.Font("Times New Roman",0,12));
					aboutBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("aboutBtn.actionPerformed, event="+evt);
							//TODO add your code for aboutBtn.actionPerformed
							aboutUS as = new aboutUS(itemContainer, itemNameContainer);
							as.show();
							dispose();
						}
					});
				}
				}

			}
			this.setSize(1080, 768);
		}catch (Exception e) {
			e.printStackTrace();
	  }
		}
	
	}

