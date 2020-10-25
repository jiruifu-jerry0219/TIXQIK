package com.tixqik.manage;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class EventManager extends javax.swing.JDialog {

	/**
	* Auto-generated main method to display this JDialog
	*/
	private Vector itemNameContainer = new Vector();
	private Vector itemContainer = new Vector();
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				EventManager inst = new EventManager(frame);
				inst.setVisible(true);
			}
		});
	}

	public EventManager(Vector items, Vector names) {	
		super();
		itemContainer = items;
		itemNameContainer = names;
		initGUI();
	}
	
	public EventManager(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
			}
			setSize(1080, 768);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
