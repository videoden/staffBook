public class Main {

    private static Employee[] employees = new Employee[10];

    public static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary () {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee result = employees[0];
        int minSalary = result.getSalary();
        for (Employee employee : employees) {
            if (employee != null && minSalary > employee.getSalary()) {

                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findMaxSalary() {
        Employee result = employees[0];
        int maxSalary = result.getSalary();
        for (Employee employee : employees) {
            if (employee != null && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                result = employee;
            }
            }
        return result;
    }

    public static float findAverageSalary() {
        return calculateTotalSalary() / Employee.getCounter();
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public static void main(String[] args) {

        employees = new Employee[]{
                new Employee("Псой Галактионович Короленко", 1, 500000),
                new Employee("Терренс Маккена", 2, 15000),
                new Employee("Станислав Дробышевский", 3, 80000),
                new Employee("Станислав Гроф", 4, 55000),
                new Employee("Стас Борецкий", 5, 100000)

        };
        printEmployee();
        printFullName();
        System.out.println("findMinSalary() = " + findMinSalary());
        System.out.println("findMaxSalary() = " + findMaxSalary());
        System.out.println("findAverageSalary() = " + findAverageSalary());
        System.out.println("calculateTotalSalary() = " + calculateTotalSalary());
    }

}