package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.model.UserChoiceMatch;;

@Entity
@Table(name = "ipl_matches")
public class IPL_MATCHES {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@OneToMany(targetEntity = UserChoiceMatch.class, mappedBy = "matchid", fetch = FetchType.EAGER)
	List<UserChoiceMatch> userChoiceMatchs = new ArrayList<UserChoiceMatch>();

	public List<UserChoiceMatch> getUserChoiceMatchs() {
		return userChoiceMatchs;
	}

	public void setUserChoiceMatchs(List<UserChoiceMatch> userChoiceMatchs) {
		this.userChoiceMatchs = userChoiceMatchs;
	}

	private Integer price;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	String DATE;
	String TEAM1;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDATE() {
		return DATE;
	}

	public void setDATE(String dATE) {
		DATE = dATE;
	}

	public boolean isDisabled() {
		Date date1 = new Date();
		String[] token = this.getDATE().split(" ");
//		System.out.println((Integer.parseInt(token[1]) < date1.getDate()));
		if (token[0].equals("APRIL")) {

			return ((Integer.parseInt(token[1])) < date1.getDate());
		} else if (token[0].equals("MAY")) {
			return ((Integer.parseInt(token[1])) < date1.getDate());

		}
		return ((Integer.parseInt(token[1])) < date1.getDate());

	}

	public String getTEAM1() {
		return TEAM1;
	}

	public void setTEAM1(String tEAM1) {
		TEAM1 = tEAM1;
	}

	public String getTEAM2() {
		return TEAM2;
	}

	public void setTEAM2(String tEAM2) {
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

	String TEAM2;
	String venue;
	String TIME;

}
