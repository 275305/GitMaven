package ListCompare;

import java.util.ArrayList;
import java.util.List;

public class EmpDetails {
	
	private static String empName="Miller";
	private static String empCity="Hyderabad";
	private static int empAge=21;
	private List<Object> empList;
	
	public List<Object> getListData(){
		
		  empList=new ArrayList<Object>();
		  empList.add(empName);
		  empList.add(empCity);
		  empList.add(empAge);
		  return empList;
	}

}
