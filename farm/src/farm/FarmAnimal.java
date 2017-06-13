// Marina Escalante
// playing with inheritance & classes

package farm;

import java.awt.Color;

public abstract class FarmAnimal {

	public Color getColor() {
		return Color.BLACK;
	}

	public int numOfLegs() {
		return 0;
	}

	public String toString() {
		return "?";
	}
}
