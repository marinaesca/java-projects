// marinaescalante-unfinished

// not resizable rn, can make resizeable, will need font metrics dealio (later goal)
// later goal: make it the cafe su da can yellow & maroon

package coffeeBeans;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class CoffeeBeansGraphics
{

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final Color light_coral = new Color(240, 128, 128);
	public static final Color saddle_brown = new Color(139, 69, 19);
	public static final Color pink = new Color(255, 192, 203);
	//public static final Color deep_pink = new Color(255, 20, 147);

	public static void main(String[] args)
	{

		DrawingPanel p1 = new DrawingPanel(WIDTH, HEIGHT);
		Graphics g = p1.getGraphics();
		p1.setBackground(pink);

		setUp(g);
	}

	public static void setUp(Graphics g)
	{
		g.setColor(light_coral);
		g.setFont(new Font("serif", Font.BOLD + Font.ITALIC, 24));
		g.drawString("Coffee Bean Game :)", 100, 60);

		setUpDirections(g);
		setUpCan(g);
	}

	public static void setUpDirections(Graphics g)
	{
		g.setColor(saddle_brown);
		g.setFont(new Font("serif", Font.ITALIC, 14));
		g.drawString("We have a coffee can that contains some white beans and", 400, 50);
		g.drawString("some black beans. Here are the rules:", 400, 66);
		g.drawString("1. Randomly choose two beans. ", 400, 90);
		g.drawString("2. If the two beans are the same color, then throw both", 400, 108);
		g.drawString("     of them away and add a new black bean. ", 400, 126);
		g.drawString("3. If the two beans are different colors, then throw away", 400, 144);
		g.drawString("     the black one and return the white one to the can.", 400, 162);
	}

	// make variables & clean later
	public static void setUpCan(Graphics g)
	{
		// base
		g.setColor(Color.gray);
		g.fillRect(100, 150, 225, 350);

		// top
		g.setColor(Color.black);
		g.fillOval(100, 130, 225, 40);

		// bottom
		g.setColor(Color.gray);
		g.fillOval(100, 475, 225, 50);
	}
}
