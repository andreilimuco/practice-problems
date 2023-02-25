package problem_solving;

import java.util.*;
import java.util.stream.Collectors;

public class ProblemSolving {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<Record> records = new ArrayList<>();

        initiateEmployees(employees);
        initiateRecords(records);

        Map<String, List<Record>> recordMap = groupRecords(employees, records);
        System.out.println(recordMap);
    }

    private static void initiateEmployees(List<Employee> employeeList) {
        employeeList.add(new Employee(1, "Ross", "Geller"));
        employeeList.add(new Employee(2, "Monica", "Geller"));
        employeeList.add(new Employee(3, "Rachel", "Green"));
        employeeList.add(new Employee(4, "Phoebe", "Buffay"));
        employeeList.add(new Employee(5, "Chandler", "Bing"));
        employeeList.add(new Employee(6, "Joey", "Tribbiani"));
    }

    private static void initiateRecords(List<Record> recordList) {
        recordList.add(new Record(1, 1, 1562232863, "Nulla sodales"));
        recordList.add(new Record(5, 2, 1562223863, "egestas arcu auctor"));
        recordList.add(new Record(2, 3, 1500547284, "laoreet eget"));
        recordList.add(new Record(5, 4, 1297759143, "elementum turpis"));
        recordList.add(new Record(4, 5, 1551412563, "Orci varius natoque penatibus et magnis"));
        recordList.add(new Record(3, 6, 1080857075, "Lorem ipsum"));
        recordList.add(new Record(1, 7, 1408551167, "consectetur adipiscing elit"));
        recordList.add(new Record(1, 8, 1239935189, "Fusce blandit"));
        recordList.add(new Record(4, 9, 1415716370, "Nulla eget purus ut massa"));
        recordList.add(new Record(3, 10, 1237623443, "non lectus laoreet sollicitudin"));
        recordList.add(new Record(3, 11, 1619569292, "Vivamus a semper"));
        recordList.add(new Record(2, 12, 1078742117, "estibulum blandit"));
    }

    private static Map<String, List<Record>> groupRecords(List<Employee> employees, List<Record> records) {

        /**
         * Implement this method wherein all records are grouped by its employeeId.
         *
         * Output:
         * Key should be a full name of each employee
         *
         * Bonus:
         * 1. Arrange names alphabetically
         * 2. List of record/s should also be arranged latest first.
         **/










        return null;
    }
}

class Record {

    int employeeId;
    int id;
    int timestamp;
    String description;

    public Record(int employeeId, int id, int timestamp, String description) {
        this.id = id;
        this.timestamp = timestamp;
        this.description = description;
        this.employeeId = employeeId;
    }



    @Override
    public String toString() {
        return "Record{" +
                "employeeId=" + employeeId +
                ", id=" + id +
                ", timestamp=" + timestamp +
                ", description='" + description + '\'' +
                '}';
    }
}

class Employee {
    int id;
    String firstName;
    String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    //added this
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
