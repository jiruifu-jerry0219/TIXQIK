package com.tixqik.behavior;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.tixqik.entity.MainSearch;



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
public class OrgReg extends javax.swing.JDialog {

	/**
	* Auto-generated main method to display this JDialog
	*/
	private Vector itemContainer = new Vector();
    private Vector itemNameContainer = new Vector();
	private JLabel title;
	private JLabel CompanyNameLabel;
	private JTextField NameFieldEntry;
	private JTextField locationFieldEntry;
	private JLabel locationLabel;
	private JFormattedTextField cityEntry;
	private JComboBox stateEntry;
	private JLabel companyLabel;
	private JTextField companyFieldEntry;
	private JLabel emailLabel;
	private JLabel tipL2;
	private JLabel tipL1;
	private JTextField emailFieldEntry;
	private JButton signupButton;
	private JButton cancelButton;
	private boolean vresult;
	private String ak1, ak2, ak3, ak4, ak5, ak6;
	private JLabel logo;
    
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				OrgReg inst = new OrgReg(frame);
				inst.setVisible(true);
			}
		});
	}
	
public OrgReg(Vector items, Vector names) {
		
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	
	public OrgReg(JFrame frame) {
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
					title.setText("Company Verification");
					title.setBounds(413, 77, 350, 42);
					title.setFont(new java.awt.Font("Times New Roman",1,36));
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
					emailLabel.setBounds(101, 445, 154, 34);
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
					signupButton.setBounds(267, 624, 208, 49);
					signupButton.setFont(new java.awt.Font("Times New Roman",1,20));
					signupButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("signupButton.actionPerformed, event="+evt);
							//TODO add your code for signupButton.actionPerformed
							String ak1 = NameFieldEntry.getText();
							String ak2 = locationFieldEntry.getText();
							String ak3 = cityEntry.getText();
							String ak4 = (String)stateEntry.getSelectedItem();
							String ak5 = emailFieldEntry.getText();
							String ak6 = companyFieldEntry.getText();
							 File fileName=new File("database/dat/companyinfo.dat");    // read data from file
			                    try{  
			                    FileReader inOne=new FileReader(fileName);  
			                    BufferedReader inTwo=new BufferedReader(inOne);   
			                    String s=null;  
			                    int judge=1;  
			                    while((s=inTwo.readLine())!=null)  
			                    {  
			                      StringBuilder stringBuilder = new StringBuilder();  			                    
			                        stringBuilder.append(" ID ");
			                        stringBuilder.append(ak6);
			                        String ak=stringBuilder.toString();  
			                        System.out.println(ak);
			                        
			                        
			                      if(s.equals(ak)) {   //match input with database
			                        JOptionPane.showMessageDialog(null, ak1 + "Verify Successfully!");  
			                        NameFieldEntry.setText(null);
									locationFieldEntry.setText(null);
									cityEntry.setText(null);
									stateEntry.setSelectedItem(null);
									emailFieldEntry.setText(null);
									companyFieldEntry.setText(null);
			                        judge=0;  			                          
			                        break;  
			                      }  
			                    }    
			                    inTwo.close();  
			                    inOne.close();  
			                    if(judge==1) {  
			                         JOptionPane.showMessageDialog(null,"Wrong Company Information!",null,JOptionPane.ERROR_MESSAGE, null);  
			                            NameFieldEntry.setText(null);
										locationFieldEntry.setText(null);
										cityEntry.setText(null);
										stateEntry.setSelectedItem(null);
										emailFieldEntry.setText(null);
										companyFieldEntry.setText(null); 
			                      }  
			                     if(judge==0){  
			                  
			                         Login hp = new Login(itemContainer, itemNameContainer);
			                         hp.show();
			                    	 dispose();   
			                         return;   
			                     }  
			                     
			                    }catch(IOException event){  
			                        JOptionPane.showMessageDialog(null,"System Error"+event,null,JOptionPane.ERROR_MESSAGE, null);  
			                    }
							
							
						}
					});
				}
				{
					cancelButton = new JButton();
					getContentPane().add(cancelButton);
					cancelButton.setText("Cancel");
					cancelButton.setBounds(755, 624, 208, 49);
					cancelButton.setFont(new java.awt.Font("Times New Roman",1,20));
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("cancelButton.actionPerformed, event="+evt);
							//TODO add your code for cancelButton.actionPerformed
							Login lg = new Login(itemContainer, itemNameContainer);
							lg.show();							
							dispose();
						}
					});
				
				}
				{
					tipL1 = new JLabel();
					getContentPane().add(tipL1);
					tipL1.setText("Street");
					tipL1.setBounds(379, 320, 39, 21);
				}
				{
					tipL2 = new JLabel();
					getContentPane().add(tipL2);
					tipL2.setText("City");
					tipL2.setBounds(661, 320, 25, 21);
				}
				{
					logo = new JLabel();
					ImageIcon icon = new ImageIcon("database/image/tlogo.png");
					logo.setIcon(icon);
					getContentPane().add(logo);
					logo.setBounds(71, 12, 178, 159);
					logo.setText("TIXQIK LOGO");
				}

			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
