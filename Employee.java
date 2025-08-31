// Employee.java
public class Employee {
    // Fields (attributes)
    private int id;
    private String name;
    private String role;
    private double hourlyWage;
    private int hoursWorked;

    // Constructor
    public Employee(int id, String name, String role, double hourlyWage) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = 0;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    // Setters
    public void setRole(String role) {
        this.role = role;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    // Methods
    public void logHours(int hours) {
        if (hours > 0) {
            this.hoursWorked += hours;
        } else {
            System.out.println("Invalid hours. Must be greater than 0.");
        }
    }

    public double calculatePay() {
        return this.hourlyWage * this.hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", hourlyWage(ManIJustDontCare)=" + hourlyWage +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
