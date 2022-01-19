import java.awt.Color;
import java.awt.Graphics;

public class DrawDiamond {
	private int x;
	private int y;
	private Color color;
	
	public DrawDiamond(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(getX(), getY(), getX()-25, getY()-25);
		g.drawLine(getX()-25, getY()-25, getX(), getY()-50);
		g.drawLine(getX(), getY()-50, getX()+25, getY()-25);
		g.drawLine(getX()+25, getY()-25, getX(), getY());
		
	}
	}


