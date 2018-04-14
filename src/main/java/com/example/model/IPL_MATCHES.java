package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;;

@Entity
@Table(name = "ipl_matches")
public class IPL_MATCHES {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer price;
	@OneToOne
	@JoinColumn(name = "TEAMWONID")
	private IPLTeams teamWon;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@OneToOne
	@JoinColumn(name = "TEAM1ID")
	private IPLTeams TEAM1;
	@OneToOne
	@JoinColumn(name = "TEAM2ID")
	private IPLTeams TEAM2;

	// @get
	@Temporal(TemporalType.DATE)
	private Date DATE;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDATE() {
		return DATE;
	}

	public void setDATE(Date dATE) {
		DATE = dATE;
	}

	public IPLTeams getTeamWon() {
		return teamWon;
	}

	public void setTeamWon(IPLTeams teamWon) {
		this.teamWon = teamWon;
	}

	public IPLTeams getTEAM1() {
		return TEAM1;
	}

	public void setTEAM1(IPLTeams tEAM1) {
		TEAM1 = tEAM1;
	}

	public IPLTeams getTEAM2() {
		return TEAM2;
	}

	public void setTEAM2(IPLTeams tEAM2) {
		TEAM2 = tEAM2;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getTIME() {
		return TIME;
	}

	public void setTIME(String tIME) {
		TIME = tIME;
	}

	// String TEAM2;
	String venue;
	String TIME;

}
