package day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import day23.LoginActions;

public class LoginUsingReflections {
	LoginActions keys=new LoginActions();
	Method[] myMethods=keys.getClass().getMethods();
	@Test
	public void loginTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
		
		
		FileInputStream file=new FileInputStream(".\\src\\com\\projectname\\keywords\\LoginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			Row r=ws.getRow(i);
			String runMode=r.getCell(4).getStringCellValue();
			if(runMode.equals("Y"))
			{
				String action=r.getCell(3).getStringCellValue();
				invokeActions(action);
			}
			
		}
	}
	public void invokeActions(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<myMethods.length;i++)
		{
			if(action.equals(myMethods[i].getName()))
			{
				myMethods[i].invoke(keys);
			}
			
		}
	}

}
