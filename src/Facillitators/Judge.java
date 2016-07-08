package Facillitators;
import java.util.*;
import Player.Player;

public class Judge {

	
	//five rounds by default, two players.
	private int rounds = 5;
	private Player p1;
	private Player p2;
	
	/*
	 * 게임을 진행할 심판을 만듭니다.
	 * 
	 * @param Player player1, Player player2 경기를 할 두 선수를 받습니다.
	 */
	public Judge(Player player1, Player player2){
		p1 = player1;
		p2 = player2;
	}
	
	/*
	 * 경기를 총 몇 라운드로 진행할 것인지 설정을 합니다.
	 * 
	 * @param int numRounds 경기의 수를 지정할 정수입니다.
	 */
	public void setRounds(int numRounds){
		rounds = numRounds;
	}
	
	public int getRounds(){
		return rounds;
	}
	
	/*
	 * 콘솔에서 이름을 입력받아 각 선수에게 부여합니다. 
	 */
	public void insertName(){
		Scanner names = new Scanner( System.in );
		System.out.println("첫 선수의 이름을 입력해 주세요");
		p1.setName(names.next());
		System.out.println("두번째 선수의 이름을 입력해 주세요");
		p2.setName(names.next());
	}
	
	/*
	 * 각 선수가 심판의 주관하에 경기를 진행하고, 서로의 점수를 따와서, 이기는 중인지, 지는 중인지를 판단합니다.
	 */
	public void play(){
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
