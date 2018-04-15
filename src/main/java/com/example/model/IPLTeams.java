package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import groovy.transform.EqualsAndHashCode;

@Entity
@Table(name = "iplTeams")
public class IPLTeams {
	@Id
	@Column(name = "id")
	private int id;
	private String teamNames;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamNames;
	}

	public void setTeamName(String teamNames) {
		this.teamNames = teamNames;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.teamNames;
	}

	@Override
	public boolean equals(Object obj) {
		return this.id == ((IPLTeams) obj).id;
	}

}
