import java.util.ArrayList;


class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}

public class Assignment2Q2 { 
    static int salary = 10000;
    static int sum = 0,i;
    public int getSalary(int salary){
		return 0;
    	
    }
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	for (i=0;i<=employeeSalaries.size()-1;i++) {
    		sum = sum   + employeeSalaries.get(i);
    	}
    	return sum;
    }
    public static void main(String[] args) {
    	ArrayList<Integer> employeeSalaries = new ArrayList<>();
    	Labour labour = new Labour();
    	Manager manager = new Manager();
    	employeeSalaries.add(labour.getSalary(salary));
    	employeeSalaries.add(manager.getSalary(salary));
    	System.out.println(totalEmployeesSalary(employeeSalaries));
    	
    }
}