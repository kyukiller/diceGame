package Facillitators;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import Player.FraudPlayer;
import Player.Player;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class GUIPractice extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 400;
	private static final int LENGTH = 700;
	
	private JLabel name1L, name2L, mode1L, mode2L, resultL;
	private JTextField name1TF, name2TF, mode1TF, mode2TF;
	private JButton playB, exitB;
	private JTextArea resultTA;
	private PlayButtonHandler pbHandler;
	private ExitButtonHandler ebHandler;
	
	public GUIPractice(){
		//Instantiate Labels
		name1L = new JLabel("Enter the first player's name : ", SwingConstants.RIGHT);
		name2L = new JLabel("Enter the second player's name : ", SwingConstants.RIGHT);
		mode1L = new JLabel("Enter the first player's mode(normal/fraud) : ", SwingConstants.RIGHT);
		mode2L = new JLabel("Enter the first player's mode(normal/fraud) : ", SwingConstants.RIGHT);
		resultL = new JLabel("These are the results : ", SwingConstants.RIGHT);
		
		//Text fields next
		name1TF = new JTextField(10);
		name2TF = new JTextField(10);
		mode1TF = new JTextField(10);
		mode2TF = new JTextField(10);
		resultTA = new JTextArea(50,50);
		
		//Buttons
		playB = new JButton("Play");
		pbHandler = new PlayButtonHandler();
		playB.addActionListener(pbHandler);
	
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(6,2));
		pane.add(name1L);
		pane.add(name1TF);
		pane.add(name2L);
		pane.add(name2TF);
		pane.add(mode1L);
		pane.add(mode1TF);
		pane.add(mode2L);
		pane.add(mode2TF);
		pane.add(resultL);
		pane.add(resultTA);
		pane.add(playB);
		
		
		
		
		setTitle("The Dice Game Fraud");
		setSize(WIDTH, LENGTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public class ExitButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	
	public class PlayButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Player p1 = new FraudPlayer();
			Player p2 = new Player();
			
			/*if (mode1TF.getText() == "normal"){
			} else {
				p1 = new FraudPlayer();
			}
			
			if (mode2TF.getText() == "normal"){
			} else {
				p2 = new FraudPlayer();
			}*/
			
			p1.setName(name1TF.getText());
			p2.setName(name2TF.getText());
			
			Judge judge = new Judge(p1,p2);
			judge.play();
			redirectSystemStreams();
		}
	}
	
	
	private void updateTextArea(final String text) {
		  SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		      resultTA.append(text);
		    }
		  });
		}
		 
	private void redirectSystemStreams() {
	  OutputStream out = new OutputStream() {
	    @Override
	    public void write(int b) throws IOException {
	      updateTextArea(String.valueOf((char) b));
	    }
	 
	    @Override
	    public void write(byte[] b, int off, int len) throws IOException {
	      updateTextArea(new String(b, off, len));
	    }
	 
	    @Override
	    public void write(byte[] b) throws IOException {
	      write(b, 0, b.length);
	    }
	  };
	 
	  System.setOut(new PrintStream(out, true));
	  System.setErr(new PrintStream(out, true));
	}

	public static void main(String[] args)
	{
		GUIPractice gameOn = new GUIPractice();
	}
		
}
