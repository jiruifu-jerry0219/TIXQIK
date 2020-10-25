package com.tixqik.manage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

import com.tixqik.function.xlsreader.UserProcessor;
import com.tixqik.object.UserBuilder;

public class UserManager extends javax.swing.JDialog {

	private Vector itemNameContainer = new Vector();
	private Vector itemContainer = new Vector();
	private JLabel titleLabel;
	private JScrollPane jScrollPane1;
	private JLabel tyLabel;
	private JTextField email;
	private JLabel eLabel;
	private JTextField zip;
	private JLabel stLabel;
	private JTextField state;
	private JLabel zLabel;
	private JTextField city;
	private JLabel ciLabel;
	private JTextField Street;
	private JButton baBtn;
	private JButton deBtn;
	private JButton reBtn;
	private JList userList;
	private JTextField type;
	private JLabel cLabel;
	private JLabel sLabel;
	private JTextField CompanyName;
	private JTextField FirstName;
	private JLabel fLabel;
	private JTextField LastName;
	private JLabel lLabel;
	private JTextField password;
	private JLabel keyL;
	private JLabel unameL;
	private JTextField Uname;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				UserManager inst = new UserManager(frame);
				inst.setVisible(true);
			}
		});
	}
	public UserManager(Vector items, Vector names) {	
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	public UserManager(JFrame frame) {
		super(frame);
		initGUI();
	}	
	@SuppressWarnings("unchecked")
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					titleLabel = new JLabel();
					getContentPane().add(titleLabel);
					titleLabel.setText("User Management");
					titleLabel.setBounds(413, 3, 296, 49);
					titleLabel.setFont(new java.awt.Font("Times New Roman",1,36));
				}
				{
					jScrollPane1 = new JScrollPane();
					getContentPane().add(jScrollPane1);
					jScrollPane1.setBounds(12, 73, 341, 467);
					{
						ListModel userListModel = 
								new DefaultComboBoxModel(itemNameContainer);
						userList = new JList();
						jScrollPane1.setViewportView(userList);
						userList.setModel(userListModel);
						userList.setPreferredSize(new java.awt.Dimension(338, 377));
						userList.addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent evt) {
								int indx =userList.getSelectedIndex();
								UserBuilder ub = (UserBuilder) itemContainer
									.get(indx);
								Uname.setText(ub.getUsername());
								password.setText(ub.getPassword());
								LastName.setText(ub.getLastname());
								FirstName.setText(ub.getFirstname());
								Street.setText(ub.getAddress());
								state.setText(ub.getState());
								city.setText(ub.getCity());
								zip.setText(ub.getZipcode());
								type.setText(ub.getType());
								CompanyName.setText(ub.getCompanyname());	
								email.setText(ub.getEmail());
							}
						});
					}
				}
				{
					Uname = new JTextField();
					getContentPane().add(Uname);
					Uname.setBounds(484, 69, 197, 28);
				}
				{
					unameL = new JLabel();
					getContentPane().add(unameL);
					unameL.setText("Username:");
					unameL.setBounds(365, 72, 101, 21);
					unameL.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					keyL = new JLabel();
					getContentPane().add(keyL);
					keyL.setText("Password:");
					keyL.setBounds(722, 73, 90, 21);
					keyL.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					password = new JTextField();
					getContentPane().add(password);
					password.setBounds(824, 69, 197, 28);
				}
				{
					lLabel = new JLabel();
					getContentPane().add(lLabel);
					lLabel.setText("Last Name:");
					lLabel.setBounds(365, 132, 101, 21);
					lLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					LastName = new JTextField();
					getContentPane().add(LastName);
					LastName.setBounds(484, 129, 197, 28);
				}
				{
					fLabel = new JLabel();
					getContentPane().add(fLabel);
					fLabel.setText("First Name:");
					fLabel.setBounds(709, 133, 115, 21);
					fLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					FirstName = new JTextField();
					getContentPane().add(FirstName);
					FirstName.setBounds(824, 129, 197, 28);
				}
				{
					cLabel = new JLabel();
					getContentPane().add(cLabel);
					cLabel.setText("Company Name:");
					cLabel.setBounds(365, 192, 151, 21);
					cLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					CompanyName = new JTextField();
					getContentPane().add(CompanyName);
					CompanyName.setBounds(522, 189, 481, 28);
				}
				{
					sLabel = new JLabel();
					getContentPane().add(sLabel);
					sLabel.setText("Street:");
					sLabel.setBounds(365, 252, 62, 21);
					sLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					Street = new JTextField();
					getContentPane().add(Street);
					Street.setBounds(445, 249, 576, 28);
				}
				{
					ciLabel = new JLabel();
					getContentPane().add(ciLabel);
					ciLabel.setText("City:");
					ciLabel.setBounds(365, 312, 55, 21);
					ciLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					city = new JTextField();
					getContentPane().add(city);
					city.setBounds(445, 309, 189, 28);
				}
				{
					zLabel = new JLabel();
					getContentPane().add(zLabel);
					zLabel.setText("Zip:");
					zLabel.setBounds(671, 313, 46, 21);
					zLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					zip = new JTextField();
					getContentPane().add(zip);
					zip.setBounds(716, 309, 127, 28);
				}
				{
					state = new JTextField();
					getContentPane().add(state);
					state.setBounds(925, 309, 96, 28);
				}
				{
					stLabel = new JLabel();
					getContentPane().add(stLabel);
					stLabel.setText("State:");
					stLabel.setBounds(866, 313, 59, 21);
					stLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					eLabel = new JLabel();
					getContentPane().add(eLabel);
					eLabel.setText("Email Address:");
					eLabel.setBounds(365, 372, 163, 21);
					eLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					email = new JTextField();
					getContentPane().add(email);
					email.setBounds(528, 369, 493, 28);
				}
				{
					tyLabel = new JLabel();
					getContentPane().add(tyLabel);
					tyLabel.setText("Account Type:");
					tyLabel.setBounds(365, 433, 126, 21);
					tyLabel.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					type = new JTextField();
					getContentPane().add(type);
					type.setBounds(528, 430, 493, 28);
				}
				{
					reBtn = new JButton();
					getContentPane().add(reBtn);
					reBtn.setText("Refresh");
					reBtn.setBounds(365, 608, 126, 35);
					reBtn.setFont(new java.awt.Font("Times New Roman",1,20));
					reBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("reBtn.actionPerformed, event="+evt);
							//TODO add your code for reBtn.actionPerformed
							userList.updateUI();
							Uname.setText(null);
							password.setText(null);
							LastName.setText(null);
							FirstName.setText(null);
							Street.setText(null);
							state.setText(null);
							city.setText(null);
							zip.setText(null);
							type.setText(null);
							CompanyName.setText(null);	
							email.setText(null);
							
						}
					});
				}
				{
					deBtn = new JButton();
					getContentPane().add(deBtn);
					deBtn.setText("Delete");
					deBtn.setBounds(619, 608, 126, 35);
					deBtn.setFont(new java.awt.Font("Times New Roman",1,20));
					deBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("deBtn.actionPerformed, event="+evt);
							//TODO add your code for deBtn.actionPerformed
							int indx = userList.getSelectedIndex();
							itemNameContainer.remove(indx);
							itemContainer.remove(indx);
							Uname.setText(null);
							password.setText(null);
							LastName.setText(null);
							FirstName.setText(null);
							Street.setText(null);
							state.setText(null);
							city.setText(null);
							zip.setText(null);
							type.setText(null);
							CompanyName.setText(null);	
							email.setText(null);
							userList.updateUI();
						}
					});
				}
				{
					baBtn = new JButton();
					getContentPane().add(baBtn);
					baBtn.setText("Back");
					baBtn.setBounds(866, 608, 126, 35);
					baBtn.setFont(new java.awt.Font("Times New Roman",1,20));
					baBtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("baBtn.actionPerformed, event="+evt);
							//TODO add your code for baBtn.actionPerformed
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
