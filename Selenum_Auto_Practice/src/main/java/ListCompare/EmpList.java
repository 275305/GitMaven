package ListCompare;

import java.util.ArrayList;
import java.util.List;

public class EmpList {
	private static String empName = "Miller";
	private static String empCity = "Hyderabad";
	private static int empAge = 21;
	private static List<Object> empList;
	private static EmpDetails empDetails;
	private static List<Object> empDetailsList;

	public static void main(String[] args) {
		empDetails = new EmpDetails();

		empDetailsList = empDetails.getListData();
		System.out.println();
		empList = new ArrayList<Object>();
		empList.add(empName);
		empList.add(empCity);
		empList.add(empAge);

	}

}
