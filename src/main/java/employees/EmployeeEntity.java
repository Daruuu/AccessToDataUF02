package employees;

import java.sql.Date;
import java.util.Objects;

public class EmployeeEntity {
    private short employeeNumber;
    private String employeeName;
    private String job;
    private Date hiredate;
    private Integer salary;
    private Integer commision;

    public short getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(short employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getCommision() {
        return commision;
    }

    public void setCommision(Integer commision) {
        this.commision = commision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return employeeNumber == that.employeeNumber && Objects.equals(employeeName, that.employeeName) && Objects.equals(job, that.job) && Objects.equals(hiredate, that.hiredate) && Objects.equals(salary, that.salary) && Objects.equals(commision, that.commision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, employeeName, job, hiredate, salary, commision);
    }
}
