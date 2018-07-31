package com.projectMatrix.model;

// Generated Aug 22, 2017 2:42:09 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SubDept generated by hbm2java
 */
@Entity
@Table(name = "sub_dept", catalog = "project_matrix")
public class SubDept implements java.io.Serializable {

	private Integer subDeptId;
	private String subDeptName;
	private Set<Resource> resources = new HashSet<Resource>(0);

	public SubDept() {
	}

	public SubDept(String subDeptName, Set<Resource> resources) {
		this.subDeptName = subDeptName;
		this.resources = resources;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sub_dept_id", unique = true, nullable = false)
	public Integer getSubDeptId() {
		return this.subDeptId;
	}

	public void setSubDeptId(Integer subDeptId) {
		this.subDeptId = subDeptId;
	}

	@Column(name = "sub_dept_name", length = 100)
	public String getSubDeptName() {
		return this.subDeptName;
	}

	public void setSubDeptName(String subDeptName) {
		this.subDeptName = subDeptName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subDept")
	public Set<Resource> getResources() {
		return this.resources;
	}

	public void setResources(Set<Resource> resources) {
		this.resources = resources;
	}

}