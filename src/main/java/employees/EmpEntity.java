package employees;

import java.sql.Date;
import java.util.Objects;

public class EmpEntity {
    private short employee;
    private String employeeName;
    private String job;
    private Date hiredate;
    private Integer salary;
    private Byte department;

    public short getEmployee() {
        return employee;
    }

    public void setEmployee(short employee) {
        this.employee = employee;
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

    public Byte getDepartment() {
        return department;
    }

    public void setDepartment(Byte department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpEntity empEntity = (EmpEntity) o;
        return employee == empEntity.employee && Objects.equals(employeeName, empEntity.employeeName) && Objects.equals(job, empEntity.job) && Objects.equals(hiredate, empEntity.hiredate) && Objects.equals(salary, empEntity.salary) && Objects.equals(department, empEntity.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, employeeName, job, hiredate, salary, department);
    }
}
