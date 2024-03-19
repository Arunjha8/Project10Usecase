package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LeadDTO;

public class LeadForm extends BaseForm {

	@NotEmpty(message = "FirstName is required")
	private String firstName;

	@NotEmpty(message = "LastName is required")
	private String lastName;

	private String target;

	@NotEmpty(message = "Department is required")
	private String department;

	@NotEmpty(message = "Project is required")
	private String project;

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

	@Override
	public BaseDTO getDto() {
		LeadDTO dto = initDTO(new LeadDTO());
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setDepartment(department);
		dto.setProject(project);
		dto.setStatus(status);
		dto.setTarget(target);

		return dto;
	}

}
