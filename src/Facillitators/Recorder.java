package Facillitators;

import Player.Player;

public class Recorder {
	Player p1;
	Player p2;
	
	
	public Recorder(Player player1, Player player2){
		//constructor that accepts two players as parameters.
		p1 = player1;
		p2 = player2;
	}
	
	public void record(){
		//records each player's score.
		System.out.println("[" + p1.getName() + ":" + p1.getScore() + p1.getDice().getType() + " " + p2.getName()+":"+ p2.getScore()+ p2.getDice().getType()+"]");
	}
	
	public void result(){
		// announces final winner with final score.
		if (p1.getScore()>p2.getScore()){
			System.out.println(p1.getName()+"가 승리했습니다!");
		} else if (p2.getScore()>p1.getScore()){
		System.out.println(p2.getName()+"가 승리했습니다!");
		} else {
		System.out.println("동점입니다!");
		}
	}
	
	
}
