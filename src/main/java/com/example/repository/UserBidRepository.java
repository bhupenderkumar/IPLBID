package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.model.User;
import com.example.model.UserChoiceMatch;

@Repository("userBidRepository")
public interface UserBidRepository extends JpaRepository<UserChoiceMatch, Integer> {

	List<UserChoiceMatch> findByIdAndMatchid(Integer userId, Integer matchid);

	List<UserChoiceMatch> findById(Integer userId);

	List<UserChoiceMatch> findByMatchid(Integer matchid);
}
