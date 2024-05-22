class Employee {
    protected String name;
    protected double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }public void calculateSalary() {
        System.out.println(name + "'s monthly salary is: $" + salary);
    }
}class Professor extends Employee {
        private int teachingHours;
        public Professor(String name, double salary, int teachingHours) {
            super(name, salary);
            this.teachingHours = teachingHours;
        }
        @Override
        public void calculateSalary() {
            double totalSalary = salary + (teachingHours * 50); // Assume $50 per teaching hour
            System.out.println(name + "'s monthly salary is: $" + totalSalary);
        }
    }class AdministrativeStaff extends Employee {
    private String department;
        public AdministrativeStaff(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
        @Override
        public void calculateSalary() {
            double totalSalary = salary + 500;
            System.out.println(name + "'s monthly salary is: $" + totalSalary);
        }
    }class Janitor extends Employee {
    private int hoursWorked;
        public Janitor(String name, double salary, int hoursWorked) {
            super(name, salary);
            this.hoursWorked = hoursWorked;
        }
        @Override
        public void calculateSalary() {
            double totalSalary = salary + (hoursWorked * 10);
            System.out.println(name + "'s monthly salary is: $" + totalSalary);
        }
    }
    public class UniversitySystem {
        public static void main(String[] args) {
            Employee[] employees = new Employee[3];
            employees[0] = new Professor("Dr. Smith", 5000, 40);
            employees[1] = new AdministrativeStaff("John Doe", 3000, "HR");
            employees[2] = new Janitor("Jane Doe", 2000, 80);
            double totalSalary = 0;
            for (Employee employee : employees) {
                employee.calculateSalary();
                totalSalary += employee.salary;
            }
            System.out.println("Total monthly salary for all employees: $" + totalSalary);
        }
    }
