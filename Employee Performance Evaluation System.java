import java.util.*;

class Employee {
    private String employeeId;
    private String name;
    private int performanceScore;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        this.performanceScore = 0;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }
}

public class PerformanceEvaluationSystem {
    private Map<String, Employee> employees;

    public PerformanceEvaluationSystem() {
        employees = new HashMap<>();
    }

    public void addEmployee(String employeeId, String name) {
        Employee employee = new Employee(employeeId, name);
        employees.put(employeeId, employee);
    }

    public Employee getEmployee(String employeeId) {
        return employees.get(employeeId);
    }

    public void evaluateEmployee(String employeeId, int performanceScore) {
        Employee employee = employees.get(employeeId);
        if (employee != null) {
            employee.setPerformanceScore(performanceScore);
            System.out.println("Employee " + employee.getName() + " (" + employeeId + ") evaluated successfully.");
        } else {
            System.out.println("Employee with ID " + employeeId + " does not exist.");
        }
    }

    public void printEmployeePerformance(String employeeId) {
        Employee employee = employees.get(employeeId);
        if (employee != null) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Performance Score: " + employee.getPerformanceScore());
        } else {
            System.out.println("Employee with ID " + employeeId + " does not exist.");
        }
    }

    public static void main(String[] args) {
        PerformanceEvaluationSystem evaluationSystem = new PerformanceEvaluationSystem();
        evaluationSystem.addEmployee("001", "John Doe");
        evaluationSystem.addEmployee("002", "Jane Smith");

        evaluationSystem.evaluateEmployee("001", 80);
        evaluationSystem.evaluateEmployee("002", 90);

        evaluationSystem.printEmployeePerformance("001");
        evaluationSystem.printEmployeePerformance("002");
        evaluationSystem.printEmployeePerformance("003"); // Non-existing employee
    }
}
