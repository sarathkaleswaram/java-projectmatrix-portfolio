package com.projectMatrix.model;

// Generated Nov 16, 2017 1:21:18 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Client generated by hbm2java
 */
@Entity
@Table(name = "client", catalog = "project_matrix")
public class Client implements java.io.Serializable {

	private Integer clientId;
	private ClientVertical clientVertical;
	private String clientName;
	private Set<Project> projects = new HashSet<Project>(0);

	public Client() {
	}

	public Client(ClientVertical clientVertical, String clientName,
			Set<Project> projects) {
		this.clientVertical = clientVertical;
		this.clientName = clientName;
		this.projects = projects;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "client_id", unique = true, nullable = false)
	public Integer getClientId() {
		return this.clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "client_vertical_id")
	public ClientVertical getClientVertical() {
		return this.clientVertical;
	}

	public void setClientVertical(ClientVertical clientVertical) {
		this.clientVertical = clientVertical;
	}

	@Column(name = "client_name", length = 250)
	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	public Set<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

}