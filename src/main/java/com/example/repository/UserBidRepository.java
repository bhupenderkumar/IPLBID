package com.example.repository;

import java.util.List;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.model.User;
import com.example.model.UserChoiceMatch;
import com.example.model.UserChoiceMatchId;

@Repository("userBidRepository")
@NamedNativeQueries({
		@NamedNativeQuery(name = "selectByTest", query = "SELECT a.firstname, a.lastname FROM Author a"), })
public interface UserBidRepository extends JpaRepository<UserChoiceMatch, Integer> {

	UserChoiceMatch findBychoiceMatchId(UserChoiceMatchId choiceMatchId);
	//
	// List<UserChoiceMatch> findByChoiceMatchIdId(Integer Id);
	//
	// UserChoiceMatch findByChoiceMatchIdMatchId(Integer matchid);
}
