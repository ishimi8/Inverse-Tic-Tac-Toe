
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;


public class DrawPanel extends JPanel {
    
	
	private List<DrawSquare> squares = new LinkedList<DrawSquare>();
	private List<DrawDiamond> diamonds = new LinkedList<DrawDiamond>();
	ClickEvent checkWin = new ClickEvent(null);
	
	
	public void addSquare(DrawSquare square) {
		squares.add(square);
		this.repaint();
		
	}
	
	public void addDiamond(DrawDiamond diamond) {
		diamonds.add(diamond);
		this.repaint();
	}
	public void paint(Graphics g) {
		for(DrawSquare s: squares) {
			s.draw(g);
			
		}
		
		
		for(DrawDiamond d:diamonds) {
			d.draw(g);
		}
		
		//Lines
		g.setColor(Color.BLACK);
		g.drawLine(650, 300, 650, 600);//down
		g.drawLine(550, 400, 850, 400);//side
		g.drawLine(550, 500, 850, 500);//side
		g.drawLine(750, 300, 750, 600);//down
		
		g.drawString("Instructions",150,300);
		g.drawString("1: To Start The Game Click On A Square",100,325);
		g.drawString("2: Your Icon is a Square and The Computer is a Diamond",100,350);
		g.drawString("3: To Win The Computer Has To Get 3 In A Row",100,375);
		g.drawString("4: If You Get 3 In A Row, You Lose", 100, 400);
		g.drawString("5: You Take Turns Playing Like Tic Tac Toe", 100, 425);
		g.drawString("6: Exit the Main Window and Rerun to Play Again",100,450);
		}
	 
	}