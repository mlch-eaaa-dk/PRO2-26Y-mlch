package architecture1stsem.model;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class Employee {
    private String name;
    private int wage; // hourly wage

    // Employee --> 0..1 Company
    private @Nullable Company company; // nullable

    /**
     * Pre: name is not empty, wage >= 0.
     */
    public Employee(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    /**
     * Pre: name is not empty.
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    /**
     * Pre: wage >= 0.
     */
    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return name + " (kr " + wage + ")";
    }

    // -----------------------------------------------------------------------------

    /**
     * Note: Nullable return value.
     */
    public @Nullable Company getCompany() {
        return company;
    }

    /**
     * Note: Nullable param company.
     */
    public void setCompany(@Nullable Company company) {
        this.company = company;
    }

    // -----------------------------------------------------------------------------

    /**
     * Return the weekly salary of this employee.
     * Return 0 if this employee does not have a company.
     */
    public int weeklySalary() {
        int salary = 0;
        if (company != null) {
            salary = wage * company.getHours();
        }
        return salary;
    }
}
