package com.example.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.controller.SameDataUtil;
import com.example.repository.UserRepository;

@Embeddable
public class UserChoiceMatchId implements Serializable {

	private Integer matchId;
	private Integer Id;

	@OneToOne
	@JoinColumn(name = "user")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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

	@Override
	public boolean equals(Object obj) {
		UserChoiceMatchId choiceMatchId = (UserChoiceMatchId) obj;
		return choiceMatchId.getId() == (this.Id) && choiceMatchId.getMatchId() == this.getMatchId();
	}

	@Override
	public int hashCode() {
		return 7 * this.Id * this.getMatchId();
	}

}