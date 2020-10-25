package com.tixqik.behavior;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.function.xlsreader.StudentProcessor;
import com.tixqik.function.xlsreader.TicketProcessor;
import com.tixqik.function.xlsreader.UserProcessor;
import com.tixqik.object.StudentGame;
import com.tixqik.object.Ticket;
import com.tixqik.object.UserBuilder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
public class GameHomepage extends javax.swing.JDialog {
	
	private JLabel logo;
	private JButton jButton1;
	private JLabel welcome;
	private JButton jButton3;
	private JButton jButton2;
	private JButton viewer;
	private JLabel title;
	private Vector Container = new Vector();
	private Vector NameContainer = new Vector();

	
public GameHomepage(Vector items, Vector names) {
		
		super();
		Container = items;
		NameContainer = names;
		initGUI();
	}

	public GameHomepage(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try{
			POIFSFileSystem fs =
					new POIFSFileSystem(new FileInputStream("studentgame.xls"));
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet1 = wb.getSheet("Games");
			RowProcessor cpip1 = StudentProcessor.getInstance();
			Vector items1 = cpip1.process(sheet1);
			for (int i=0; i<items1.size(); i++)
			{
				StudentGame item = (StudentGame)items1.get(i);
				Container.add(item);
				NameContainer.add(item.getName());
				System.out.println( item.getName() + " " + item.getLocation() + " " + item.getDate()+" "+item.getTime()+" "+item.getType()+" "+item.getCapacity()+" "
						+item.getType());
			}
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			{
				getContentPane().setLayout(null);
				{
					logo = new JLabel();
					ImageIcon icon = new ImageIcon("database/image/tlogo.png");
					logo.setIcon(icon);
					getContentPane().add(logo);
					logo.setBounds(55, 40, 178, 159);
					logo.setText("TIXQIK LOGO");
				}
				{
					title = new JLabel();
					getContentPane().add(title);
					title.setText("Game Organizer");
					title.setBounds(360, 106, 525, 73);
					title.setFont(new java.awt.Font("Times New Roman",1,60));
				}
				{
					viewer = new JButton();
					getContentPane().add(viewer);
					viewer.setText("Game Viewer");
					viewer.setBounds(360, 304, 229, 49);
					viewer.setFont(new java.awt.Font("Times New Roman",0,25));
					viewer.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("viewer.actionPerformed, event="+evt);
							//TODO add your code for viewer.actionPerformed
							GameViewer tv = new GameViewer(Container, NameContainer);
							tv.show();
							dispose();
						}
					});
				}
				{
					jButton1 = new JButton();
					getContentPane().add(jButton1);
					jButton1.setText("Organize Game");
					jButton1.setFont(new java.awt.Font("Times New Roman",0,25));
					jButton1.setBounds(656, 304, 229, 49);
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton1.actionPerformed, event="+evt);
							//TODO add your code for jButton1.actionPerformed
							GamePost tp = new GamePost(Container, NameContainer);
							tp.show();
							dispose();
						}
					});
				}
				{
					jButton2 = new JButton();
					getContentPane().add(jButton2);
					jButton2.setText("Back to Search");
					jButton2.setFont(new java.awt.Font("Times New Roman",0,25));
					jButton2.setBounds(360, 498, 229, 49);
					jButton2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton2.actionPerformed, event="+evt);
							//TODO add your code for jButton2.actionPerformed
							Login lg = new Login(Container,NameContainer);
							lg.show();
							dispose();
						}
					});
				}
				{
					jButton3 = new JButton();
					getContentPane().add(jButton3);
					jButton3.setText("Quit System");
					jButton3.setFont(new java.awt.Font("Times New Roman",0,25));
					jButton3.setBounds(656, 498, 229, 49);
					jButton3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							System.out.println("jButton3.actionPerformed, event="+evt);
							//TODO add your code for jButton3.actionPerformed
							dispose();
						}
					});
				}
				{
					welcome = new JLabel();
					getContentPane().add(welcome);
					welcome.setText("Welcome Back");
					welcome.setBounds(67, 304, 204, 49);
					welcome.setFont(new java.awt.Font("Times New Roman",0,30));
				}
			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
