package com.example.controller;

import static org.assertj.core.api.Assertions.useRepresentation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.repository.core.support.ExampleMatcherAccessor;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.IPLTeams;
import com.example.model.IPL_MATCHES;
import com.example.model.User;
import com.example.model.UserChoiceMatch;
import com.example.model.UserChoiceMatchId;
import com.example.repository.IPLTeamsRepository;
import com.example.repository.IPL_MATCHESREPOSITORY;
import com.example.repository.UserBidRepository;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Controller
@RestController
public class BidController {

	@Autowired
	private UserBidRepository bidRepository;
	@Autowired
	private IPL_MATCHESREPOSITORY iplTeamsRepository;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/bid/userbid", method = RequestMethod.POST)
	public ModelAndView createNewUser(@Valid UserChoiceMatch choiceMatch, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		List<IPL_MATCHES> matches = iplMatchRepo.findAll();
		modelAndView.addObject("matches", matches);
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("user", user);
		if (bindingResult.hasErrors()) {
			System.out.println("error in binding for /bid/userbid");
			System.out.println(bindingResult.getAllErrors());
			modelAndView.setViewName("admin/bid");
		} else {
			UserChoiceMatch choiceMatchs = bidRepository.findBychoiceMatchId(choiceMatch.getChoiceMatchID());
			// choiceMatch.getChoiceMatchID().getId(),
			// choiceMatch.getChoiceMatchID().getMatchId());
			if (choiceMatchs != null) {
				modelAndView.addObject("successMessage",
						"satta already exist for user id " + choiceMatch.getChoiceMatchID().getId() + " with match id "
								+ choiceMatch.getChoiceMatchID().getMatchId().toString());
			} else {
				IPL_MATCHES matche = iplTeamsRepository.findById(choiceMatch.getChoiceMatchID().getMatchId());
				choiceMatch.setIpl_MATCHES(matche);
				modelAndView.addObject("successMessage",
						"satta created for user id " + choiceMatch.getChoiceMatchID().getId() + " with match number "
								+ choiceMatch.getChoiceMatchID().getMatchId());
				bidRepository.save(choiceMatch);
			}
			modelAndView.setViewName("admin/bid");
		}
		return modelAndView;
	}

	@Autowired
	private IPL_MATCHESREPOSITORY iplMatchRepo;

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/admin/bid" }, method = RequestMethod.GET)
	public ModelAndView bid(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		List<IPL_MATCHES> matches = iplMatchRepo.findAll();
		modelAndView.addObject("matches", matches);
		// modelAndView.addObject("userChoi", attributeValue)
		// modelAndView.addObject("userChoiceMatch", new UserChoiceMatch());
		model.addAttribute("userChoiceMatch", new UserChoiceMatch());
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("user", user);
		modelAndView.addObject("userName",
				"Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
		modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
		return modelAndView;
	}

	@RequestMapping(value = { "/admin/seeOtherBid" }, method = RequestMethod.GET)
	public ModelAndView findAllBid() {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
		modelAndView.setViewName("admin/seeOtherBid");
		List<IPL_MATCHES> matches = iplMatchRepo.findAll();
		modelAndView.addObject("matches", matches);
		List<User> allUsers = userRepository.findAll();
		System.out.println("All object Size is " + allUsers.size());
		modelAndView.addObject("allUsers", allUsers);
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("user", user);
		modelAndView.addObject("allBids", bidRepository.findAll());
		return modelAndView;
	}

	@RequestMapping(value = { "/admin/getBidedRecord" }, method = RequestMethod.POST)
	public ModelAndView getBidedRecord(@Valid UserChoiceMatchId choiceMatchId) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		ModelAndView modelAndView = new ModelAndView();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("dataSelected", true);
		List<IPL_MATCHES> matches = iplMatchRepo.findAll();
		modelAndView.addObject("matches", matches);
		List<User> allUsers = userRepository.findAll();
		System.out.println("All object Size is " + allUsers.size());
		modelAndView.addObject("allUsers", allUsers);
		modelAndView.addObject("userName",
				"Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
		List<UserChoiceMatch> userChoiceMatchs = new ArrayList<>();
		int matchid = choiceMatchId.getMatchId();
		int userId = choiceMatchId.getId();
		if (matchid > 0 && userId > 0) {
			userChoiceMatchs.add(bidRepository.findBychoiceMatchId(choiceMatchId));
		} else if (matchid > 0 && userId < 0) {
			choiceMatchId.setId(null);
			userChoiceMatchs.add(bidRepository.findBychoiceMatchId(choiceMatchId));
		} else if (matchid < 0 && userId > 0) {
			choiceMatchId.setMatchId(null);
			userChoiceMatchs.add(bidRepository.findBychoiceMatchId(choiceMatchId));
			// userChoiceMatchs = bidRepository.findByChoiceMatchIdId(userId);
		} else {
			userChoiceMatchs = bidRepository.findAll();
		}

		modelAndView.addObject("allBids", userChoiceMatchs);
		modelAndView.setViewName("admin/seeOtherBid");
		return modelAndView;
		// iplTeamsRepository.findAll(example)
	}

	// @RequestMapping(value = { "/admin/getTeamsByMatch" }, method =
	// RequestMethod.GET)
	// public List<IPLTeams> getTeamsByMatch(@Valid Integer matchid) {
	// if (matchid == null)
	// matchid = 1;
	// Authentication auth =
	// SecurityContextHolder.getContext().getAuthentication();
	// // return iplTeamsRepository.findById(matchid);
	// return ipl.findAll();
	// // iplTeamsRepository.findAll(example)
	// }

}
