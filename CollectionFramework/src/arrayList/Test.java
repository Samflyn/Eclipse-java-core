package arrayList;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		String record1 = "1001:akhil:5000:M";
		String record2 = "1001:akhil:5000:M";
		String record3 = "1001:akhil:5000:M";
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee employee = new Employee();
		String[] fields = record1.split(":");
		employee.setEmpNum(Integer.parseInt(fields[0]));
		employee.setEmpName(fields[1]);
		employee.setEmpSalary(Double.parseDouble(fields[2]));
		employee.setEmpGender(fields[3].charAt(0));
		al.add(employee);
		
	}
}
