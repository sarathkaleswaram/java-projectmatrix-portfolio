package com.projectMatrix.model;

// Generated Jul 23, 2017 3:14:16 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Uom generated by hbm2java
 */
public class Uom implements java.io.Serializable {

	private Integer uomId;
	private Project project;
	private String uomName;
	private Set uomStoreds = new HashSet(0);

	public Uom() {
	}

	public Uom(Project project, String uomName, Set uomStoreds) {
		this.project = project;
		this.uomName = uomName;
		this.uomStoreds = uomStoreds;
	}

	public Integer getUomId() {
		return this.uomId;
	}

	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getUomName() {
		return this.uomName;
	}

	public void setUomName(String uomName) {
		this.uomName = uomName;
	}

	public Set getUomStoreds() {
		return this.uomStoreds;
	}

	public void setUomStoreds(Set uomStoreds) {
		this.uomStoreds = uomStoreds;
	}

}
