$(document)
		.ready(
				function() {
					$('#selected')
							.on(
									'change',
									function() {

										// getList<IPLTeams> for That match and
										// iterate and show
										$('#teamselect').children(
												'option:not(:first)').remove();
										var firstTeam = this.options[this.selectedIndex]
												.getAttribute('firstTeam');
										var firstTeamId = this.options[this.selectedIndex]
												.getAttribute('firstTeamId');

										var secondTeam = this.options[this.selectedIndex]
												.getAttribute('secondTeam');
										var secondTeamId = this.options[this.selectedIndex]
												.getAttribute('secondTeamId');
										$('#teamselect').append(
												$("<option></option>").attr(
														"value", firstTeamId)
														.text(firstTeam));

										$('#teamselect').append(
												$("<option></option>").attr(
														"value", secondTeamId)
														.text(secondTeam));

										var price = this.options[this.selectedIndex]
												.getAttribute('price');
										document
												.getElementById("optionMatchPrice").value = price

									})
				})