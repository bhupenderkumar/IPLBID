package com.example.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "UserChoiceMatch")
public class UserChoiceMatch implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	@AttributeOverride(name = "matchId", column = @Column(name = "matchId"))
	UserChoiceMatchId choiceMatchId;

	public IPL_MATCHES getIpl_MATCHES() {
		return ipl_MATCHES;
	}

	public void setIpl_MATCHES(IPL_MATCHES ipl_MATCHES) {
		this.ipl_MATCHES = ipl_MATCHES;
	}

	@ManyToOne
	@JoinColumn(name = "ipl_matches")
	private IPL_MATCHES ipl_MATCHES = new IPL_MATCHES();

	public UserChoiceMatchId getChoiceMatchID() {
		return choiceMatchId;
	}

	public void setChoiceMatchID(UserChoiceMatchId choiceMatchID) {
		this.choiceMatchId = choiceMatchID;
	}

	public UserChoiceMatchId getChoiceMatchId() {
		return choiceMatchId;
	}

	public void setChoiceMatchId(UserChoiceMatchId choiceMatchId) {
		this.choiceMatchId = choiceMatchId;
	}

	public IPLTeams getTeamSelected() {
		return teamSelected;
	}

	public void setTeamSelected(IPLTeams teamSelected) {
		this.teamSelected = teamSelected;
	}

	@OneToOne
	@JoinColumn(name = "teamSelected")
	private IPLTeams teamSelected;

}
