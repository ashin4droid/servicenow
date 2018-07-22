package com.wipro.automation.snow.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil
{
	
	public static List<QueueData> getQueueData() throws Exception
	{
		List<QueueData> queueDataList = new ArrayList<QueueData>();
		
		FileInputStream fis = new FileInputStream("resources/ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("QueueData");
		
		String queue, keywords, assignee;
		int rows = sheet.getLastRowNum();
		
		for (int i = 1; i <= rows; i++)
		{
			QueueData qData = new QueueData();
			
			try
			{
				//sheet.getRow(row-1).getCell(col-1).setCellType(Cell.CELL_TYPE_STRING);
				queue	= (sheet.getRow(i).getCell(0)==null) ? "" : sheet.getRow(i).getCell(0).getStringCellValue();
				keywords= (sheet.getRow(i).getCell(1)==null) ? "" : sheet.getRow(i).getCell(1).getStringCellValue();
				assignee= (sheet.getRow(i).getCell(2)==null) ? "" : sheet.getRow(i).getCell(2).getStringCellValue();
				
				if (queue.isEmpty() || queue.trim().equals("")) {
					break;
				}
				
				qData.setQueue(queue);
				qData.setKeywords(keywords);
				qData.setAssigneeName(assignee);
				
				queueDataList.add(qData);
			}
			catch (Exception e) { e.printStackTrace(); }
		}
		
		workbook.close();
		fis.close();
		
		return queueDataList;
	}
	
	
	public static List<QueueDataNew> getQueueDataFinal() throws Exception
	{
		List<QueueDataNew> queueDataList = new ArrayList<QueueDataNew>();
		
		FileInputStream fis = new FileInputStream("resources/ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("QueueDataFinal");
		
		String queue, keyword, assignee;
		int rows = sheet.getLastRowNum();
		
		for (int i = 1; i <= rows; i++)
		{
			QueueDataNew qData = new QueueDataNew();
			
			try
			{
				//sheet.getRow(row-1).getCell(col-1).setCellType(Cell.CELL_TYPE_STRING);
				keyword	= (sheet.getRow(i).getCell(0)==null) ? "" : sheet.getRow(i).getCell(0).getStringCellValue();
				queue	= (sheet.getRow(i).getCell(1)==null) ? "" : sheet.getRow(i).getCell(1).getStringCellValue();
				assignee= (sheet.getRow(i).getCell(2)==null) ? "" : sheet.getRow(i).getCell(2).getStringCellValue();
				
				if (keyword.isEmpty() || keyword.trim().equals("")) {
					break;
				}
				
				qData.setQueue(queue);
				qData.setKeyword(keyword);
				qData.setAssignee(assignee);
				
				queueDataList.add(qData);
			}
			catch (Exception e) { e.printStackTrace(); }
		}
		
		workbook.close();
		fis.close();
		
		return queueDataList;
	}
	
	
	public static List<TempClosureData> getTempClosureData() throws Exception
	{
		List<TempClosureData> closureDataList = new ArrayList<TempClosureData>();
		
		FileInputStream fis = new FileInputStream("resources/ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("TempClosureData");
		
		String queue, raisedBy, issueType, keywords, action, comments, actionType;
		
		int rows = sheet.getLastRowNum();
		
		for (int i = 1; i <= rows; i++)
		{
			TempClosureData cData = new TempClosureData();
			
			try
			{
				//sheet.getRow(row-1).getCell(col-1).setCellType(Cell.CELL_TYPE_STRING);
				queue		= (sheet.getRow(i).getCell(0)==null) ? "" : sheet.getRow(i).getCell(0).getStringCellValue();
				raisedBy	= (sheet.getRow(i).getCell(1)==null) ? "" : sheet.getRow(i).getCell(1).getStringCellValue();
				issueType	= (sheet.getRow(i).getCell(2)==null) ? "" : sheet.getRow(i).getCell(2).getStringCellValue();
				keywords	= (sheet.getRow(i).getCell(3)==null) ? "" : sheet.getRow(i).getCell(3).getStringCellValue();
				action		= (sheet.getRow(i).getCell(4)==null) ? "" : sheet.getRow(i).getCell(4).getStringCellValue();
				comments	= (sheet.getRow(i).getCell(5)==null) ? "" : sheet.getRow(i).getCell(5).getStringCellValue();
				actionType	= (sheet.getRow(i).getCell(6)==null) ? "" : sheet.getRow(i).getCell(6).getStringCellValue();
				
				if (queue.isEmpty() || queue.trim().equals("")) {
					break;
				}
				
				cData.setQueue(queue);
				cData.setRaisedBy(raisedBy);
				cData.setIssueType(issueType);
				cData.setKeywords(keywords);
				cData.setAction(action);
				cData.setComments(comments);
				cData.setActionType(actionType);
				
				closureDataList.add(cData);
			}
			catch (Exception e) { e.printStackTrace();}
		}
		
		workbook.close();
		fis.close();
		
		return closureDataList;
	}
	
	
	public static List<ClosureData> getClosureData() throws Exception
	{
		List<ClosureData> closureDataList = new ArrayList<ClosureData>();
		
		FileInputStream fis = new FileInputStream("resources/ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("ClosureData");
		
		String keywords, comments;
		
		int rows = sheet.getLastRowNum();
		
		for (int i = 1; i <= rows; i++)
		{
			ClosureData cData = new ClosureData();
			
			try
			{
				//sheet.getRow(row-1).getCell(col-1).setCellType(Cell.CELL_TYPE_STRING);
				keywords	= (sheet.getRow(i).getCell(0)==null) ? "" : sheet.getRow(i).getCell(0).getStringCellValue();
				comments	= (sheet.getRow(i).getCell(1)==null) ? "" : sheet.getRow(i).getCell(1).getStringCellValue();
				
				if (keywords.isEmpty() || keywords.trim().equals("")) {
					break;
				}
				
				cData.setKeywords(keywords);
				cData.setComments(comments);
				
				closureDataList.add(cData);
			}
			catch (Exception e) { e.printStackTrace();}
		}
		
		workbook.close();
		fis.close();
		
		return closureDataList;
	}
	
	
	public static String getCommentsForKeyword(String shortDesc) throws Exception
	{
		String finalComments = null;
		
		FileInputStream fis = new FileInputStream("resources/ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("ClosureData");
		
		String keywords, comments;
		int rows = sheet.getLastRowNum();
		
		for (int i = 1; i <= rows; i++)
		{
			try
			{
				//sheet.getRow(row-1).getCell(col-1).setCellType(Cell.CELL_TYPE_STRING);
				keywords	= (sheet.getRow(i).getCell(0)==null) ? "" : sheet.getRow(i).getCell(0).getStringCellValue();
				comments	= (sheet.getRow(i).getCell(1)==null) ? "" : sheet.getRow(i).getCell(1).getStringCellValue();
				
				if (shortDesc.contains(keywords)) {
					return comments;
				}
			}
			catch (Exception e) { e.printStackTrace();}
		}
		
		workbook.close();
		fis.close();
		
		return finalComments;
	}
	
	
	
	public static void updateRunInExcel(Date start, List<String> routedList, List<String> resolvedList)
	{
		File f = null;
		FileInputStream fis = null;
		Workbook workbook = null;
		try
		{
			f = new File("resources/ExcelData.xlsx");
			fis = new FileInputStream(f);
			
			workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("Statistics");
			
			int lastrow = sheet.getLastRowNum();
			System.out.println(lastrow);
			
			
			Row r = (sheet.getRow(lastrow) == null) ? sheet.createRow(lastrow) : sheet.createRow(lastrow+1);
			
			r.createCell(0).setCellValue(start.toString());
			r.createCell(1).setCellValue(new Date().toString());
			r.createCell(2).setCellValue(routedList.toString());
			r.createCell(3).setCellValue(resolvedList.toString());
		}
		catch (Exception e) { e.printStackTrace();}
		finally
		{
			try {
				fis.close();
				FileOutputStream fileOut = new FileOutputStream(f);
				workbook.write(fileOut);
				fileOut.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	public static void updateGenRoutingRunInExcel(Date start, List<String> routedList)
	{
		File f = null;
		FileInputStream fis = null;
		Workbook workbook = null;
		try
		{
			f = new File("resources/ExcelData.xlsx");
			fis = new FileInputStream(f);
			
			workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("GeneralRouting");
			
			int lastrow = sheet.getLastRowNum();
			System.out.println(lastrow);
			
			
			Row r = (sheet.getRow(lastrow) == null) ? sheet.createRow(lastrow) : sheet.createRow(lastrow+1);
			
			r.createCell(0).setCellValue(start.toString());
			r.createCell(1).setCellValue(new Date().toString());
			r.createCell(2).setCellValue(routedList.toString());
		}
		catch (Exception e) { e.printStackTrace();}
		finally
		{
			try {
				fis.close();
				FileOutputStream fileOut = new FileOutputStream(f);
				workbook.write(fileOut);
				fileOut.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		//String comments = getCommentsForKeyword("P10: Abap Dump: CALL_FUNCTION_SEND_ERROR in program: /GRCPI/SAPLGRIA_USR");
		//updateRunInExcel(new Date(), new ArrayList<>(), new ArrayList<>());
		System.out.println("Started");
		List<QueueDataNew> qDataNew = getQueueDataFinal();
		System.out.println("Done");
	}
	
	
	
	
	
	
	
	
	
}