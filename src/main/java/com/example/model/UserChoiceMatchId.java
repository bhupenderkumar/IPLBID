package com.example.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.controller.SameDataUtil;
import com.example.repository.UserRepository;

@Embeddable
public class UserChoiceMatchId implements Serializable {

	// @Autowired
	// private UserRepository repository;
	private Integer matchId;
	private Integer Id;

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

}