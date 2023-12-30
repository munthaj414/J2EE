package com.sathya.emp;

public class Empolyee {
private String empId;
private String empName;
private String empSalary;
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(String empSalary) {
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "Empolyee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
}

}
