package com.tixqik.entity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.SwingUtilities;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.tixqik.behavior.GameHomepage;
import com.tixqik.behavior.Login;
import com.tixqik.behavior.NewJDialog;
import com.tixqik.behavior.SellHome;
import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.function.xlsreader.StudentProcessor;
import com.tixqik.function.xlsreader.TicketProcessor;
import com.tixqik.object.StudentGame;
import com.tixqik.object.Ticket;



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
public class MainStudent extends javax.swing.JFrame {
	protected static MainStudent h1;
	private JButton searchButton;
	private JButton quitButton;
	private JButton aboutUsButton;
	private JButton contactusbutton;
	private JLabel guessLabel;
	private JLabel recentEventLabel;
	private JTextField searchFieldEntry;
	private JButton jButton1;
	private JLabel logo;
	private JLabel welcome;
	private JList preference;
	private JList recentEvents;
	private JButton helpButton;
	private Vector itemContainer1 = new Vector();
	private Vector itemNameContainer1 = new Vector();
	private JList jList1;
	private JLabel jLabel1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public MainStudent(Vector items, Vector names) {
		
		super();
		itemContainer1 = items;
		itemNameContainer1 = names;
		initGUI();
	}
	
	
	public MainStudent() {
		// TODO Auto-generated constructor stub
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				helpButton = new JButton();
				getContentPane().add(helpButton);
				helpButton.setText("help");
				helpButton.setBounds(912, 33, 130, 27);
				helpButton.setFont(new java.awt.Font("Times New Roman",1,15));
				helpButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("helpButton.actionPerformed, event="+evt);
						//TODO add your code for helpButton.actionPerformed
						PopularQA hd = new PopularQA(itemContainer1, itemNameContainer1);
						hd.show();
						dispose();					
						}
				});
			}
			{
				searchFieldEntry = new JTextField();
				getContentPane().add(searchFieldEntry);
				searchFieldEntry.setText(null);
				searchFieldEntry.setBounds(41, 195, 882, 43);
			}
			{
				searchButton = new JButton();
				getContentPane().add(searchButton);
				searchButton.setText("search");
				searchButton.setBounds(935, 195, 107, 43);
				searchButton.setFont(new java.awt.Font("Times New Roman",1,25));
				searchButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("searchButton.actionPerformed, event="+evt);
						//TODO add your code for searchButton.actionPerformed
						String goal = searchFieldEntry.getText();
						
						if(goal.equals("Sports")|goal.equals("Basketball")|goal.equals("Football") ){
							try{
								POIFSFileSystem fs =
										new POIFSFileSystem(new FileInputStream("ticketclass.xls"));
								HSSFWorkbook wb = new HSSFWorkbook(fs);
								HSSFSheet sheet1 = wb.getSheet("Sports");
								RowProcessor cpip1 = TicketProcessor.getInstance();
								Vector items1 = cpip1.process(sheet1);
								for (int i=0; i<items1.size(); i++)
								{
									Ticket item = (Ticket)items1.get(i);
									itemContainer1.add(item);
									itemNameContainer1.add(item.getEvent());
									System.out.println( item.getEvent() + " " + item.getLocation() + " " + item.getOrganizer()+" "+item.getDate()+" "+item.getTime()+" "+item.getPrice()+" "
											+item.getType());
								}
							}catch (FileNotFoundException e1) {
								e1.printStackTrace();
							}catch (Exception e) {
								e.printStackTrace();
							}
							StudentResult srsn = new StudentResult(itemContainer1, itemNameContainer1);
							srsn.show();
							dispose();
						}
						if(goal.equals("Concert")){
							try{
								POIFSFileSystem fs =
										new POIFSFileSystem(new FileInputStream("ticketclass.xls"));
								HSSFWorkbook wb = new HSSFWorkbook(fs);
								HSSFSheet sheet1 = wb.getSheet("Concert");
								RowProcessor cpip1 = TicketProcessor.getInstance();
								Vector items1 = cpip1.process(sheet1);
								for (int i=0; i<items1.size(); i++)
								{
									Ticket item = (Ticket)items1.get(i);
									itemContainer1.add(item);
									itemNameContainer1.add(item.getEvent());
									System.out.println( item.getEvent() + " " + item.getLocation() + " " + item.getOrganizer()+" "+item.getDate()+" "+item.getTime()+" "+item.getPrice()+" "
											+item.getType());
								}
							}catch (FileNotFoundException e1) {
								e1.printStackTrace();
							}catch (Exception e) {
								e.printStackTrace();
							}
							StudentResult srsn = new StudentResult(itemContainer1, itemNameContainer1);
							srsn.show();
							dispose();
						}
						if(goal.equals("Drama")){
							try{
								POIFSFileSystem fs =
										new POIFSFileSystem(new FileInputStream("ticketclass.xls"));
								HSSFWorkbook wb = new HSSFWorkbook(fs);
								HSSFSheet sheet1 = wb.getSheet("Sports");
								RowProcessor cpip1 = TicketProcessor.getInstance();
								Vector items1 = cpip1.process(sheet1);
								for (int i=0; i<items1.size(); i++)
								{
									Ticket item = (Ticket)items1.get(i);
									itemContainer1.add(item);
									itemNameContainer1.add(item.getEvent());
									System.out.println( item.getEvent() + " " + item.getLocation() + " " + item.getOrganizer()+" "+item.getDate()+" "+item.getTime()+" "+item.getPrice()+" "
											+item.getType());
								}
							}catch (FileNotFoundException e1) {
								e1.printStackTrace();
							}catch (Exception e) {
								e.printStackTrace();
							}
							StudentResult srsn = new StudentResult(itemContainer1, itemNameContainer1);
							srsn.show();
							dispose();
							
						}
						if(goal.equals("Game")){
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
									itemContainer1.add(item);
									itemNameContainer1.add(item.getName());
									System.out.println( item.getName() + " " + item.getDate() + " " + item.getTime()+" "+item.getType()+" "+item.getLocation()+" "+item.getCapacity());
								}
							}catch (FileNotFoundException e1) {
								e1.printStackTrace();
							}catch (Exception e) {
								e.printStackTrace();
							}
							GameResult srsn = new GameResult(itemContainer1, itemNameContainer1);
							srsn.show();
							dispose();
							
						}
						
					}
				});
			}
			{
				recentEventLabel = new JLabel();
				getContentPane().add(recentEventLabel);
				recentEventLabel.setText("Upcoming Events: ");
				recentEventLabel.setBounds(41, 293, 279, 41);
				recentEventLabel.setFont(new java.awt.Font("Times New Roman",1,25));
			}
			{
				guessLabel = new JLabel();
				getContentPane().add(guessLabel);
				guessLabel.setText("Events You'll Like:");
				guessLabel.setBounds(753, 292, 321, 39);
				guessLabel.setFont(new java.awt.Font("Times New Roman",1,25));
			}
			{
				contactusbutton = new JButton();
				getContentPane().add(contactusbutton);
				contactusbutton.setText("contact us");
				contactusbutton.setBounds(733, 675, 130, 27);
				contactusbutton.setFont(new java.awt.Font("Times New Roman",1,15));
				contactusbutton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("contactusbutton.actionPerformed, event="+evt);
						//TODO add your code for contactusbutton.actionPerformed
						NewJDialog njd = new NewJDialog(itemContainer1, itemNameContainer1);
						njd.show();					
					}
				});
			}
			{
				aboutUsButton = new JButton();
				getContentPane().add(aboutUsButton);
				aboutUsButton.setText("about us");
				aboutUsButton.setBounds(564, 675, 130, 27);
				aboutUsButton.setFont(new java.awt.Font("Times New Roman",1,15));
				aboutUsButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("aboutUsButton.actionPerformed, event="+evt);
						//TODO add your code for aboutUsButton.actionPerformed
						aboutUS au = new aboutUS(itemContainer1, itemNameContainer1);
						au.show();
					}
				});

			}
			{
				quitButton = new JButton();
				getContentPane().add(quitButton);
				quitButton.setText("quit");
				quitButton.setBounds(902, 675, 130, 27);
				quitButton.setFont(new java.awt.Font("Times New Roman",1,15));
				quitButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("quitButton.actionPerformed, event="+evt);
						//TODO add your code for quitButton.actionPerformed
						itemContainer1.clear();
						itemNameContainer1.clear();
						Login lg = new Login(itemContainer1, itemNameContainer1);
						lg.show();
						dispose();
					}
				});
			}
			{
				logo = new JLabel();
				ImageIcon icon = new ImageIcon("database/image/tlogo.png");
				getContentPane().add(logo);
				logo.setIcon(icon);
				logo.setBounds(53, 12, 178, 159);
			}
			{
				ListModel recentEventsModel = 
						new DefaultComboBoxModel(
								new String[] { "Los Angeles Dodgers Game", "T3R Elemento", "Krush Groove", "Justin Timberlake Concert", "Elton John Concert", "Los Angeles Rams Game", "LA Galaxy Game", "Light Up the Blues Live", "LCD Soundsystem", "Mexico National Soccer Team Game", "Los Angeles Philharmonic Concert" });
				recentEvents = new JList();
				getContentPane().add(recentEvents);
				recentEvents.setModel(recentEventsModel);
				recentEvents.setBounds(41, 346, 279, 310);
			}
			{
				ListModel preferenceModel = 
						new DefaultComboBoxModel(
								new String[] { "Los Angeles Dodgers Game", "Justin Timberlake Concert", "Beyonce Concert", "Krush Groove", "Los Angeles Rams Game", "Bad Bunny Concert", "LAFC Game", "Kendrick Lamar Concert", "International Champions Cup", "Premier Boxing Champtions", "Snow Patrol Concert" });
				preference = new JList();
				getContentPane().add(preference);
				preference.setModel(preferenceModel);
				preference.setBounds(753, 344, 279, 310);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("organize");
				jButton1.setFont(new java.awt.Font("Times New Roman",1,15));
				jButton1.setBounds(396, 675, 130, 27);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("helpButton.actionPerformed, event="+evt);
						//TODO add your code for helpButton.actionPerformed
						itemNameContainer1.clear();
						itemContainer1.clear();
						GameHomepage nmw = new GameHomepage(itemContainer1, itemNameContainer1);
						nmw.show();
						dispose();						
					}
				});
			}
			{
				welcome = new JLabel();
				getContentPane().add(welcome);
				welcome.setText("Welcome back, Student Customer");
				welcome.setBounds(564, 39, 327, 21);
				welcome.setFont(new java.awt.Font("Times New Roman",1,20));
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Student Events: ");
				jLabel1.setFont(new java.awt.Font("Times New Roman",1,25));
				jLabel1.setBounds(396, 293, 279, 41);
			}
			{
				ListModel jList1Model = 
						new DefaultComboBoxModel(
								new String[] { "Chamber Music Festival", "Senior Scendoff 2018","Congregations Ending Homelessness in LA","Women's Rowing vs UCLA","USC Alumni Awards",
										"Grand Opening of the Archive","Pop-up Dream Center","USC Stem Cell Seminar","Lute Masterclass with Paul O'Dette","Flow & Restore Yoga","Trojan Talk with Morgan Stanley"});
				jList1 = new JList();
				getContentPane().add(jList1);
				jList1.setModel(jList1Model);
				jList1.setBounds(396, 346, 279, 310);
			}
			pack();
			setSize(1080,760);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
