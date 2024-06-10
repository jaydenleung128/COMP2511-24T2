import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    /**
     * Create a manager with the given name, salary and hiring date.
     * @param name The full name of the manager.
     * @param salary The manager's salary in dollars.
     * @param hireDate The date the manager was hired.
     */
    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    /**
     * Create a manager with the given name and salary.
     *
     * The manager is recorded as having been hired today.
     *
     * @param name The full name of the manager.
     * @param salary The manager's salary in dollars.
     * @param hireDate The date the manager was hired.
     */
    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    /**
     * Get the manager's hire date.
     * @return The date the manager was hired.
     */
    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }

    @Override
    public boolean equals(Object o) {
        // Check if the compared object is the same instance
        if (this == o) return true;
        
        // Check if the compared object is null
        if (o == null) return false;
        
        // Check if the compared object is of a different class
        if (o.getClass() != this.getClass()) return false;
    
        // Cast the compared object to Manager
        Manager manager = (Manager)o;
        
        // Check equality of superclass (Employee) attributes
        if (!super.equals(o)) return false;
        
        // Check equality of hireDate attribute
        return hireDate.equals(manager.getHireDate());
    }
}
