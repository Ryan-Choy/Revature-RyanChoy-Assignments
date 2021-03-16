package com.app.player.main;

import java.util.List;
import java.util.Scanner;

import com.app.player.dao.PlayerCRUDDAO;
import com.app.player.exception.BusinessException;
import com.app.player.model.Player;
import com.app.player.model.Team;
import com.app.player.service.PlayerCRUDService;
import com.app.player.service.PlayerSearchService;
import com.app.player.service.impl.PlayerCRUDServiceImpl;
import com.app.player.service.impl.PlayerSearchServiceImpl;
import com.app.player.team.service.TeamService;
import com.app.player.team.service.impl.TeamServiceImpl;

public class PlayerMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Ryan Choy's Player App V1.0");
		System.out.println("========================================================");

		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		TeamService teamService = new TeamServiceImpl();
		PlayerCRUDService playercrudService = new PlayerCRUDServiceImpl();

		do {
			System.out.println("PLAYER MENU");
			System.out.println("----------------------------------------------");
			System.out.println("Please enter an appropriate search option (1-8)");
			System.out.println("1] Add Player");
			System.out.println("2] Update Player");
			System.out.println("3] Delete Player");
			System.out.println("4] List All Players");
			System.out.println("5] Search Players by the following: id, name, city, gender, or team name");
			System.out.println("6] List All Teams");
			System.out.println("7] Add Team");
			System.out.println("8] EXIT THE PROGRAM");

			try {
				choice = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (choice) {
			case 1:
				System.out.println("Enter the following details to create a Player");
				Player player = new Player();
				try {
					System.out.println("Enter Player Id:");
					player.setId(Integer.parseInt(scanner.nextLine()));
				} catch (NumberFormatException e) {
					System.out.println("Player id should be number only.");
					break;
				}
				try {
					System.out.println("Enter Player Age:");
					player.setAge(Integer.parseInt(scanner.nextLine()));
				} catch (NumberFormatException e) {
					System.out.println("Player age should be number only.");
					break;
				}

				System.out.println("Enter Player Name: ");
				player.setName(scanner.nextLine());
				System.out.println("Enter Player City: ");
				player.setCity(scanner.nextLine());
				System.out.println("Enter Player Gender [m/f/M/F]: ");
				player.setGender(scanner.nextLine());
				System.out.println("Please select the team from the list below.");
				try {
					List<Team> teamList = teamService.getAllTeams();
					for (int i = 0; i < teamList.size(); i++) {
						System.out.println((i + 1) + ") " + teamList.get(i).getTeamName());
					}
					System.out.println(teamList.size() + 1 + ") Not preferred for now");
					try {
						System.out.println("Please enter your choice between 1 - " + (teamList.size() + 1));
						int cho = Integer.parseInt(scanner.nextLine());

						if (cho > 0 && cho <= teamList.size() + 1) {
							if (cho == teamList.size() + 1) {
								player.setTeam(new Team());
							} else {
								player.setTeam(teamList.get(cho - 1));
							}
						} else {
							System.out.println("Invalid choice");
						}
					} catch (NumberFormatException e) {
						System.out.println("Player team choice should be number only.");
						break;
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
					break;
				}
				// call dao
				try {
					if (playercrudService.createPlayer(player) == 1) {
						System.out.println("Player registered successfully with below details...");
						System.out.println(player);

					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}

				break;

			case 2:
				System.out.println("Under Construction");
				break;

			case 3:
				System.out.println("Under Construction");
				break;

			case 4:
				System.out.println("Under Construction");
				break;

			case 5:
				int option = 0;
				PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
				do {
					System.out.println("Select one of the following options to search for a player...");
					System.out.println("Please enter a choice between 1-7");
					System.out.println("1) By Id");
					System.out.println("2) By Name");
					System.out.println("3) By Age");
					System.out.println("4) By City");
					System.out.println("5) By Team Name");
					System.out.println("6) By Gender");
					System.out.println("7) Go back to main menu");
					try {
						option = Integer.parseInt(scanner.nextLine());
					} catch (NumberFormatException e) {

					}

					switch (option) {
					case 1:
						System.out.println("Enter Player Id to get the player details");
						
						try {
							int id = Integer.parseInt(scanner.nextLine());
							//Player search service code
							Player p = playerSearchService.getPlayerById(id);
							if(p != null) {
								System.out.println("Player found with id: "+id+" ,details below");
								System.out.println(p);
							}
						} catch (NumberFormatException e) {
							System.out.println("Player ID should be in numbers only");
						} catch (BusinessException e) {
							System.out.println(e.getMessage());
						}
						
						break;
					case 2:
						System.out.println("Under Construction...");
						break;
					case 3:
						System.out.println("Under Construction...");
						break;
					case 4:
						System.out.println("Under Construction...");
						break;
					case 5:
						System.out.println("Enter team name to bring up the players for that team");
						String teamname = scanner.nextLine();
						try {
							List<Player> playerTeamList = playerSearchService.getPlayersByTeamName(teamname);
							System.out.println("Printing players for the team: " + teamname);
							for(Player p:playerTeamList) {
								System.out.println(p);
							}
						} catch (BusinessException e) {
							System.out.println(e.getMessage());
						}
						break;
					case 6:
						System.out.println("Under Construction...");
						break;
					case 7:
						System.out.println("Going back to main menu...");
						break;

					default:
						System.out.println("Invalid search option, please enter a valid number between 1 - 7");
						break;
					}
				} while (option != 7);
				break;

			case 6:
				List<Team> teamList;
				try {
					teamList = teamService.getAllTeams();
					System.out.println("Printing all teams...");
					for (int i = 0; i < teamList.size(); i++) {
						System.out.println((i + 1) + ") " + teamList.get(i));
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 7:
				System.out.println("Under Construction");
				break;

			case 8:
				System.out.println("Thank you for using the program. Exiting...");
				break;

			default:
				System.out.println("Invaid choice, please enter a proper choice between 1-8 only...");
				break;
			}

		} while (choice != 8);

	}

}
