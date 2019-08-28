package com.dbs.emp_mgmt.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Dependent {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long depid;
	private String depname;
	private int dage;
	
    @ManyToOne
    @JoinColumn(name = "emp_id", nullable = false)
    private Employee employee;

	public long getDepid() {
		return depid;
	}
	
	public void setDepid(long depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public int getDage() {
		return dage;
	}

	public void setDage(int dage) {
		this.dage = dage;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Dependent that = (Dependent) o;
		return depid == that.depid && Objects.equals(depname, that.depname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(depid, depname);
	}

}
