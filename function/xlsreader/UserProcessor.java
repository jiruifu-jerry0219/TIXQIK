package com.tixqik.function.xlsreader;
import java.util.Vector;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.tixqik.behavior.Login;
import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.manage.UserManager;
import com.tixqik.object.UserBuilder;

public class UserProcessor implements RowProcessor
{
	private static final short COLUMN_Name = 1;
	private static final short COLUMN_KEY = 2;
	private static final short COLUMN_TYPE = 3;
	private static final short COLUMN_PAY = 4;
	private static final short COLUMN_ADD = 5;
	private static final short COLUMN_CITY = 6;
	private static final short COLUMN_ZIP = 7;
	private static final short COLUMN_ST = 8;
	private static final short COLUMN_EMAIL = 9;
	private static final short COLUMN_FIRST = 10;
	private static final short COLUMN_LAST = 11;
	private static final short COLUMN_CN = 12;
	
	private static UserProcessor thisProcessor;
	
	private UserProcessor()
	{
		//Private so no outside instantiation
	}
	
	
	public static RowProcessor getInstance()
	{
		if(thisProcessor == null)
		{
			thisProcessor = new UserProcessor();
		}
		return thisProcessor;
	}
	public Vector process(HSSFSheet sheet) throws Exception
	{
		if(sheet != null)
		{
			   int first = sheet.getFirstRowNum();
			   int last = sheet.getLastRowNum();
			   HSSFRow row = null;
			   Vector itemContainer = new Vector ();
			   
			   UserBuilder item = null; //Change this line to your own DataObject
			   
			   first += 1; //Ignore first 2 rows - they are headers
			   
			   for(int i= first; i<=last; i++)
			   {
				   row = sheet.getRow(i);
				   if(row != null && row.getCell(COLUMN_Name) != null)
				   {
					   item = new UserBuilder();
					   item.setUsername(row.getCell(COLUMN_Name).getRichStringCellValue().getString()); //For String value
					   item.setPassword(row.getCell(COLUMN_KEY).getRichStringCellValue().getString());  //For numerical value
					   item.setType(row.getCell(COLUMN_TYPE).getRichStringCellValue().getString());
					   item.setPayment(row.getCell(COLUMN_PAY).getRichStringCellValue().getString());
					   item.setAddress(row.getCell(COLUMN_ADD).getRichStringCellValue().getString());
					   item.setCity(row.getCell(COLUMN_CITY).getRichStringCellValue().getString());
					   item.setZipcode(row.getCell(COLUMN_ZIP).getRichStringCellValue().getString());
					   item.setState(row.getCell(COLUMN_ST).getRichStringCellValue().getString());
					   item.setEmail(row.getCell(COLUMN_EMAIL).getRichStringCellValue().getString());
					   item.setFirstname(row.getCell(COLUMN_FIRST).getRichStringCellValue().getString());
					   item.setLastname(row.getCell(COLUMN_LAST).getRichStringCellValue().getString());		
					   item.setCompanyname(row.getCell(COLUMN_CN).getRichStringCellValue().getString());
					   itemContainer.add(item); //Add newly created item into the container.
				   }
			   }
			   
			   return itemContainer; // Return the container
		}
		
		return null;
	}
}


