package com.example.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.User;
import com.example.model.UserChoiceMatch;
import com.example.model.UserChoiceMatchId;

@Repository("userBidRepository")
@NamedNativeQueries({
		@NamedNativeQuery(name = "selectByTest", query = "SELECT a.firstname, a.lastname FROM Author a"), })
public interface UserBidRepository extends JpaRepository<UserChoiceMatch, Integer> {

	UserChoiceMatch findBychoiceMatchId(UserChoiceMatchId choiceMatchId);

	// List<UserChoiceMatch> findBychoiceMatchId_Id(UserChoiceMatchId
	// choiceMatchId);
	
	@Query("SELECT t FROM UserChoiceMatch t where t.choiceMatchId.matchId = ?1 ")
    public List<UserChoiceMatch> findBychoiceMatchId(Integer matchId);
	
	@Query("SELECT t FROM UserChoiceMatch t where t.choiceMatchId.Id = ?1 ")
    public List<UserChoiceMatch> findBychoiceMatchIdId(Integer Id);
	
     
	// Page<UserChoiceMatch> find(Integer matchId, Pageable pageable);
//	void findChoiceMatchIdById(Integer matchId);
//
//	List<UserChoiceMatch> findByChoiceMatchID(UserChoiceMatchId choicematchid);
	// Page<UserChoiceMatchId> findByMatchId(Integer matchId,Pageable pageable);
	//
	// List<UserChoiceMatch> findByChoiceMatchIdId(Integer Id);
	//
	// UserChoiceMatch findByChoiceMatchIdMatchId(Integer matchid);
}
