package employeemanagement;

public class EmployeeManagementSystem {
	private Employee[] employees;
    private int size;
    private int capacity;

    public EmployeeManagementSystem(int capacity) {
        this.capacity = capacity;
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size == capacity) {
            System.out.println("Employee array is full. Cannot add more employees.");
            return;
        }
        employees[size++] = employee;
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[--size] = null;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        Employee e1 = new Employee("E001", "A", "Manager", 75000);
        Employee e2 = new Employee("E002", "B", "Developer", 60000);
        Employee e3 = new Employee("E003", "C", "Designer", 55000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        ems.traverseEmployees();

        Employee searchResult = ems.searchEmployee("E002");
        if (searchResult != null) {
            System.out.println("Employee found: " + searchResult);
        } else {
            System.out.println("Employee not found.");
        }

        ems.deleteEmployee("E002");

        ems.traverseEmployees();
    }
}
