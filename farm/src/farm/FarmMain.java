// Marina Escalante

package farm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class FarmMain {
	public static void main(String[] args) {
		DrawingPanel p1 = new DrawingPanel(1200, 600);
		Graphics g = p1.getGraphics();
		Color sky = new Color(153, 204, 255);
		p1.setBackground(sky);

		createGrass(g, 0, 450, 1200, 600);

		createBees(g, 20);
	}

	public static void createGrass(Graphics g, int startX, int startY, int endX, int endY) {
		Color grass = new Color(0, 204, 102);
		g.setColor(grass);
		g.fillRect(startX, startY, endX, endY);

		// randomize the grass blades
		Color grassBlade = new Color(0, 153, 0);
		g.setColor(grassBlade);
		Random ran = new Random();
		for (int i = 0; i < 2000; i++) {
			int x = ran.nextInt(1200);
			int y = ran.nextInt(150) + 450;
			drawGrassBlade(g, x, y);
		}

	}

	// helper for createGrass
	private static void drawGrassBlade(Graphics g, int x, int y) {
		g.drawPolygon(new int[] { x + 1, x + 2, x + 3 }, new int[] { y + 10, y + 2, y + 10 }, 3);
	}

	public static void createBees(Graphics g, int num) {
		Bee bumble = new Bee();
		bumble.draw(g, 100, 100, true);
		Random ran = new Random();
		for (int i = 0; i < num; i++) {
			int x = ran.nextInt(1200);
			int y = ran.nextInt(600);
			bumble.draw(g, x, y, true);
		}
	}
}
