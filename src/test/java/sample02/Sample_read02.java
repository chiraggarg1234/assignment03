package sample02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Sample_read02 
{
   @Test
	public void getdata() throws IOException
	{
	  String path="/Users/chirag.garg/eclipse-workspace/sample02/Book03.xlsx";
      int rownum=XLUtils.getRowCount(path, "Sheet1");
   
      
       for(int i=1;i<= rownum;i++)
       {
	      int colcount=XLUtils.getcellcount(path,"sheet1", i);
	      int flag=0;
	      traveler t=new traveler();
	      
	      for(int j=0;j<colcount;j++)
	      {
	    	  
	    	  
	    	  String d=XLUtils.getcelldata(path, "Sheet1",i,j);
	    	  System.out.println(d);
	    	  
	    	 if(j==1)
	    	  {
	    		t.setbase(d);
	    		 //t.base=d;
	    	  }
	    	  if(j==2)
	    	  {
	    		  t.setex(d);
	    		  //t.ex=d;
	    	  }
	    	  if(j==3)
	    	  {
	    		  t.setcode(Integer.parseInt(d)); 
	    	  }
	    	  if(j==5)
	    	  {
	    		  t.setbody(d);
	    		  //t.res=d;
	    	  }
	    	  
	    	  if(j==4)
	    	  {
	    		  t.setres(d);
	    		  //t.body=d;
	    	  }
	    	  
	    	  
	   	  if(d.contentEquals("GET"))
	    	  {
	    		  flag=1;
	    		  
	    	  }
	    	  if(d.contentEquals("POST"))
	    	  {
	    		  flag=2;
	    	  }
	    	  
	      }
	     // System.out.println(t.code);
	          testcases tt=new testcases();
	       //  tt.getreq(t);
	         
	         if(flag ==1)
	         {
	        	 tt.getreq(t);
	         }
	         
	         if(flag ==2)
	         {
	        	 tt.postreq(t);
	         }
	         
       }
       
  
       
       
	}
}
