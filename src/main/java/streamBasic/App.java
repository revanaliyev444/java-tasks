package streamBasic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        List<Project> descend = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .distinct()
                .sorted(Comparator.comparing(Project::getName).reversed())
                .toList();
        System.out.println("--- Descend list of Projects ---");
        descend.forEach(project -> System.out.println(project.getName()));

        List<Employee> nameWithA = employeeList.stream()
                .filter(employee -> employee.getFirstName().startsWith("A"))
                .toList();
        System.out.println("--- Name with A ---");
        nameWithA.forEach(employee -> System.out.println(employee.getFirstName()));

        List<Employee> joinYear = employeeList.stream()
                .filter(employee -> employee.getId().contains("2023"))
                .toList();
        System.out.println("--- Join year is 2023 ---");
        joinYear.forEach(employee -> System.out.println(employee.getId()));

        List<Employee> salary = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .findFirst()
                .stream().toList();
        System.out.println("--- 3th high salary ---");
        salary.forEach(employee -> System.out.println(employee.getSalary()));

        Optional<Employee> minSalary = employeeList.stream()
                .min(Comparator.comparingInt(Employee::getSalary));
        System.out.println("--- Minimum salary ---");
        minSalary.ifPresent(employee -> System.out.println(employee.getSalary()));

        var employess = employeeFactory.getAllEmployee();

        System.out.println("--- Project more than 2 ---");
        employess.stream()
                .filter(employee -> employee.getProjects().size()>=2)
                .forEach(employee -> {
                    employee.getProjects().stream()
                            .forEach(project -> System.out.println(project.getName()));
                });

        System.out.println("--- Total Laptop Assigned --- ");
        long totalLaptopAssigned = employeeList.stream()
                .map(Employee::getTotalLaptopsAssigned)
                .reduce(0, Integer::sum);
        System.out.println(totalLaptopAssigned);

        System.out.println("--- Robert's projects --- ");
        long projects = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .filter(project -> "Robert Downey Jr".equals(project.getProjectManager()))
                .count();
        System.out.println(projects);

        System.out.println("--- Delta ---");
        long delta = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .filter(project -> "Delta Model".equals(project.getName()))
                .count();
        System.out.println(delta);

        System.out.println("--- Common UI --- ");
        long commonUI = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .filter(project -> "Common UI".equals(project.getName()))
                .count();
        System.out.println(commonUI);


        List<Employee> employees = employeeFactory.getAllEmployee();

        List<String> deltaModelEmployees = employees.stream()
                .filter(employee -> employee.getProjects().stream()
                        .anyMatch(project -> project.getName().equals("Delta Model")))
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .collect(Collectors.toList());

        System.out.println("Delta Model: ");
        deltaModelEmployees.forEach(System.out::println);
    }
}