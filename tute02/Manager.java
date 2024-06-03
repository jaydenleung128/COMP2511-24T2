class Employee {
    private String name;
    private int salary;

    /**
     * Creates an Employee with the given name and salary.
     * @param name The full name of the employee.
     * @param salary The employee's yearly salary in dollars.
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns the employee's name
     * @return The full name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name
     * @param name The employee's new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the employee's salary.
     * @return The employee's yearly salary in dollars.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the employee's salary.
     * @param salary The employee's yearly salary in dollars.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
    }

    
    @Override
    public boolean equals(Object o) {
        // Check if the compared object is the same instance
        if (this == o) return true;
        
        // Check if the compared object is null or of different class
        if (o == null || o.getClass() != this.getClass()) return false;
        
        // Cast the compared object to Employee
        Employee e = (Employee)o;
        
        // Check if the names are not equal
        if (!name.equals(e.getName())) return false;
        
        // Check if the salaries are not equal
        if (salary != e.getSalary()) return false;
        
        // If all conditions are satisfied, the objects are considered equal
        return true;
    }
    
}