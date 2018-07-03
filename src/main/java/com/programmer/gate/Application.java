package com.programmer.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
//implements CommandLineRunner{
	
//	@Autowired
//	SoccerService soccerService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Override
//	public void run(String... arg0) throws Exception {
//		
//		soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);
//		
//		List<String> players = soccerService.getAllTeamPlayers(1);
//		for(String player : players)
//		{
//			System.out.println("Introducing Barca player => " + player);
//		}
//	}
}