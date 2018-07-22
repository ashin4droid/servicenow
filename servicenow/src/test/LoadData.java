package test;

import com.wipro.automation.snow.utils.ExcelUtil;

public class LoadData implements Runnable
{
	
	@Override
	public void run()
	{
		try {
			System.out.println("Data loading started");
			RouteTicketsGeneral.qDataNew = ExcelUtil.getQueueDataFinal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
