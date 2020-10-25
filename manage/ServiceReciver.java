package com.tixqik.manage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.tixqik.entity.SearchResultSportN;
import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.function.xlsreader.MessageProcessor;
import com.tixqik.function.xlsreader.TicketProcessor;
import com.tixqik.function.xlsreader.UserProcessor;
import com.tixqik.object.Message;
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
public class ServiceReciver extends javax.swing.JDialog {

	private Vector itemNameContainer = new Vector();
	private Vector itemContainer = new Vector();
	private JLabel titleLabel;
	private JTextArea messageArea;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JButton baBtn;
	private JButton deBtn;
	private JButton reBtn;
	private JList userList;
	private JLabel lLabel;
	private JTextField password;
	private JLabel keyL;
	private JLabel unameL;
	private JTextField Uname;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				ServiceReciver inst = new ServiceReciver(frame);
				inst.setVisible(true);
			}
		});
	}
	public ServiceReciver(Vector items, Vector names) {	
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	public ServiceReciver(JFrame frame) {
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
					titleLabel.setText("Service Management");
					titleLabel.setBounds(413, 3, 337, 49);
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
								Message ub = (Message) itemContainer
										.get(indx);
								Uname.setText(ub.getTitle());
								password.setText(ub.getEmail());
								messageArea.setText(ub.getContent());								
							}
						});
					}
				}
				{
					Uname = new JTextField();
					getContentPane().add(Uname);
					Uname.setBounds(484, 69, 508, 28);
				}
				{
					unameL = new JLabel();
					getContentPane().add(unameL);
					unameL.setText("Title:");
					unameL.setBounds(365, 72, 101, 21);
					unameL.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					keyL = new JLabel();
					getContentPane().add(keyL);
					keyL.setText("Email:");
					keyL.setBounds(365, 144, 90, 21);
					keyL.setFont(new java.awt.Font("Times New Roman",1,20));
				}
				{
					password = new JTextField();
					getContentPane().add(password);
					password.setBounds(484, 137, 508, 28);
				}
				{
					lLabel = new JLabel();
					getContentPane().add(lLabel);
					lLabel.setText("Message:");
					lLabel.setBounds(365, 217, 101, 21);
					lLabel.setFont(new java.awt.Font("Times New Roman",1,20));
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
				{
					jScrollPane2 = new JScrollPane();
					getContentPane().add(jScrollPane2);
					jScrollPane2.setBounds(484, 217, 508, 323);
					{
						messageArea = new JTextArea();
						jScrollPane2.setViewportView(messageArea);
						messageArea.setEditable(false);
						messageArea.setLineWrap(true);
						messageArea.setWrapStyleWord(true);
					}
				}

			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
