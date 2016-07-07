package Facillitators;
import java.util.*;
import Player.Player;

public class Judge {

	
	//five rounds by default, two players.
	private int rounds = 5;
	private Player p1;
	private Player p2;
	
	public Judge(Player player1, Player player2){
		/*
		 * ������ ������ ������ ����ϴ�.
		 * 
		 * @param Player player1, Player player2 ��⸦ �� �� ������ �޽��ϴ�.
		 */
		p1 = player1;
		p2 = player2;
	}
		
	public void setRounds(int numRounds){
		/*
		 * ��⸦ �� �� ����� ������ ������ ������ �մϴ�.
		 * 
		 * @param int numRounds ����� ���� ������ �����Դϴ�.
		 */
		//if the number of rounds should be adjusted, this method would be used.
		rounds = numRounds;
	}
	
	public int getRounds(){
		return rounds;
	}
	
	public void insertName(){
		/*
		 * �ֿܼ��� �̸��� �Է¹޾� �� �������� �ο��մϴ�. 
		 */
		Scanner names = new Scanner( System.in );
		System.out.println("ù ������ �̸��� �Է��� �ּ���");
		p1.setName(names.next());
		System.out.println("�ι�° ������ �̸��� �Է��� �ּ���");
		p2.setName(names.next());
	}
	
	public void play(){
		/*
		 * �� ������ ������ �ְ��Ͽ� ��⸦ �����ϰ�, ������ ������ ���ͼ�, �̱�� ������, ���� �������� �Ǵ��մϴ�.
		 */
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
