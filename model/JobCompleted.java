package com.projectMatrix.model;

// Generated Aug 22, 2017 2:42:09 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * JobCompleted generated by hbm2java
 */
@Entity
@Table(name = "job_completed", catalog = "project_matrix")
public class JobCompleted implements java.io.Serializable {

	private long jobCompletedId;
	private Job job;
	private String jobCompletedName;
	private Set<Invoice> invoices = new HashSet<Invoice>(0);

	public JobCompleted() {
	}

	public JobCompleted(long jobCompletedId) {
		this.jobCompletedId = jobCompletedId;
	}

	public JobCompleted(long jobCompletedId, Job job, String jobCompletedName,
			Set<Invoice> invoices) {
		this.jobCompletedId = jobCompletedId;
		this.job = job;
		this.jobCompletedName = jobCompletedName;
		this.invoices = invoices;
	}

	@Id
	@Column(name = "job_completed_id", unique = true, nullable = false)
	public long getJobCompletedId() {
		return this.jobCompletedId;
	}

	public void setJobCompletedId(long jobCompletedId) {
		this.jobCompletedId = jobCompletedId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Column(name = "job_completed_name", length = 100)
	public String getJobCompletedName() {
		return this.jobCompletedName;
	}

	public void setJobCompletedName(String jobCompletedName) {
		this.jobCompletedName = jobCompletedName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobCompleted")
	public Set<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}

}