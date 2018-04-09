package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.model.IPLTeams;
import com.example.model.IPL_MATCHES;

@Repository("IPL_MATCHESREPOSITORY")
public interface IPL_MATCHESREPOSITORY extends JpaRepository<IPL_MATCHES, String> {

//	@Query("select teamNames from IPLTeams where id in (select firstTeamId , secondTeamId from Matches where id=?1 ) ")
//	public List<IPLTeams> findAll(Integer matchId);

//	public List<IPLTeams> findById(Integer matchId);
}