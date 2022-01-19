import java.awt.Color;
import java.awt.Graphics;

public class DrawSquare {
private int x;
private int y;
private Color color;


public DrawSquare(int x, int y) {
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
	g.setColor(Color.RED);
	g.drawLine(getX(), getY(), getX(), getY()-50);
	g.drawLine(getX(), getY()-50, getX()+50, getY()-50);
	g.drawLine(getX()+50, getY()-50, getX()+50, getY());
	g.drawLine(getX()+50, getY(), getX(), getY());
	
}

}
