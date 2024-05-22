class Secretary extends Employee {
    private double bonus;
        public Secretary(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }
        @Override
        public void calculateSalary(){
            double totalSalary = salary + bonus;
            System.out.println(name + "'s monthly salary is: $" + totalSalary);
        }
    }
    public class EmployeeSalary {
        public static void main(String[] args) {
            Employee[] employees = new Employee[4];
            employees[0] = new Professor("Dr. Smith", 5000, 40);
            employees[1] = new AdministrativeStaff("John Doe", 3000, "HR");
            employees[2] = new Janitor("Jane Doe", 2000, 80);
            employees[3] = new Secretary("Alice", 2500, 200);
            double totalSalary = 0;
            for (Employee employee : employees) {
                employee.calculateSalary();
                totalSalary += employee.salary;
            }
            System.out.println("Total monthly salary for all employees: $" + totalSalary);
        }
    }
