package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_LEAD")
public class LeadDTO extends BaseDTO {

	@Column(name = "FIRST_NAME", length = 45)
	private String firstName;

	@Column(name = "LAST_NAME", length = 45)
	private String lastName;

	@Column(name = "TARGET", length = 45)
	private String target;

	@Column(name = "DEPARTMENT", length = 45)
	private String department;

	@Column(name = "PROJECT", length = 45)
	private String project;

	@Column(name = "STATUS", length = 45)
	private String status;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
