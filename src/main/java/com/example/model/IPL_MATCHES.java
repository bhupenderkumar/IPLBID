package com.example.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ipl_matches")
public class IPL_MATCHES {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DATE")
	String DATE;
	String TEAM1;

	public String getDATE() {
		return DATE;
	}

	public void setDATE(String dATE) {
		DATE = dATE;
	}

	public boolean isDisabled() {
		Date date1 = new Date();
		String[] token = this.getDATE().split(" ");
		System.out.println((Integer.parseInt(token[1]) < date1.getDate()));
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