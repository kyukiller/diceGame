package Facillitators;
import java.util.*;
import Player.Player;

public class Judge {
	//five rounds by default, two players.
	int rounds = 5;
	Player p1;
	Player p2;
	
	public Judge(Player player1, Player player2){
		//constructor that creates a judge to proceed a game with two players
		p1 = player1;
		p2 = player2;
	}
		
	public void setRounds(int a){
		//if the number of rounds should be adjusted, this method would be used.
		rounds = a;
	}
	
	public int getRounds(){
		return rounds;
	}
	
	public void insertName(){
		//accepts from user the names of two players. This has been tested at the CMD.
		Scanner names = new Scanner( System.in );
		System.out.println("첫 선수의 이름을 입력해 주세요");
		p1.setName(names.next());
		System.out.println("두번째 선수의 이름을 입력해 주세요");
		p2.setName(names.next());
	}
	
	public void play(){
		//the actual game's play mechanism.
		int count = 0;
		Recorder rec = new Recorder(p1, p2);
		while (count < rounds){
			p1.setScore(p1.getScore()+p1.getDice().getValue());
			p2.setScore(p2.getScore()+p2.getDice().getValue());
			rec.record();
			p1.setOpponentScore(p2.getScore());
			p2.setOpponentScore(p1.getScore());
			p1.changeDice();
			p2.changeDice();
			count++;
		}
		rec.result();
	}
	
}
