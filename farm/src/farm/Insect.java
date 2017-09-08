// Marina Escalante
// playing with inheritance & classes

package farm;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Insect {

	public Color getColor() {
		return Color.BLACK;
	}

	public int numOfLegs() {
		return 6;
	}

	public String toString() {
		return "?";
	}

	public boolean canFly() {
		return false;
	}

	public void draw(Graphics g, int x, int y) {

	}
}
