package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserChoiceMatch")
public class UserChoiceMatch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "matchid")
	private Integer matchid;

	public IPL_MATCHES getIpl_MATCHES() {
		return ipl_MATCHES;
	}

	public void setIpl_MATCHES(IPL_MATCHES ipl_MATCHES) {
		this.ipl_MATCHES = ipl_MATCHES;
	}

	
	private IPL_MATCHES ipl_MATCHES;
	private Integer id;
	private String price;
	@Column(name = "team_selection")
	private String teamSelection;
	private boolean won;
	private Integer priceSelection;

	public boolean isWon() {
		return won;
	}

	public void setWon(boolean won) {
		this.won = won;
	}

	public Integer getPriceSelection() {
		return priceSelection;
	}

	public void setPriceSelection(Integer priceSelection) {
		this.priceSelection = priceSelection;
	}

	public Integer getMatchid() {
		return matchid;
	}

	public void setMatchid(Integer matchid) {
		this.matchid = matchid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTeamSelection() {
		return teamSelection;
	}

	public void setTeamSelection(String teamSelection) {
		this.teamSelection = teamSelection;
	}

}

// Desigining Database
