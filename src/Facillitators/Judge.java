package Facillitators;
import java.util.*;
import Player.Player;

public class Judge {

	
	//five rounds by default, two players.
	private int rounds = 5;
	private Player p1;
	private Player p2;
	
	/*
	 * ������ ������ ������ ����ϴ�.
	 * 
	 * @param Player player1, Player player2 ��⸦ �� �� ������ �޽��ϴ�.
	 */
	public Judge(Player player1, Player player2){
		p1 = player1;
		p2 = player2;
	}
	
	/*
	 * ��⸦ �� �� ����� ������ ������ ������ �մϴ�.
	 * 
	 * @param int numRounds ����� ���� ������ �����Դϴ�.
	 */
	public void setRounds(int numRounds){
		rounds = numRounds;
	}
	
	public int getRounds(){
		return rounds;
	}
	
	/*
	 * �ֿܼ��� �̸��� �Է¹޾� �� �������� �ο��մϴ�. 
	 */
	public void insertName(){
		Scanner names = new Scanner( System.in );
		System.out.println("ù ������ �̸��� �Է��� �ּ���");
		p1.setName(names.next());
		System.out.println("�ι�° ������ �̸��� �Է��� �ּ���");
		p2.setName(names.next());
	}
	
	/*
	 * �� ������ ������ �ְ��Ͽ� ��⸦ �����ϰ�, ������ ������ ���ͼ�, �̱�� ������, ���� �������� �Ǵ��մϴ�.
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
