// marinaescalante-unfinished

// still has errors, cannot run, mostly done

/* planning
 * simulate beans w/  basic graphics (end game)
 * choose option, prompt typing? (endgame button)
 * randomly simulate the 2 bean options (coffee can returns array, does actions)
 */

// add in name prompt??, variable is ready

package coffeeBeans;

import java.util.Scanner;

public class CoffeeBeansMain
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name = "";
		CoffeeBeanCan coffeeCan;

		name = intro(keyboard);
		coffeeCan = createCan(keyboard);

		while (!coffeeCan.oneLeft())
		{
			drawBeans(keyboard, coffeeCan);
		}
		endGame(coffeeCan);

	}

	public static String intro(Scanner keyboard)
	{
		System.out.println("This is the coffee bean game.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("We have a coffee can that contains some white beans and some black beans. ");
		System.out.println("Here are the rules:");
		System.out.println("1. Randomly choose two beans. ");
		System.out.println(
				"2. If the two beans are the same color," + " then throw both of them away and add a new black bean. ");
		System.out.println("3. If the two beans are different colors, then throw away the black one and "
				+ "return the white one to the can.");
		System.out.println();
		System.out.print("What is your name? ");
		String name = keyboard.nextLine();
		return name;
	}

	public static CoffeeBeanCan createCan(Scanner keyboard)
	{
		System.out.println();
		System.out.println("Create your coffee bean can. You have 3 options, please type the number you want.");
		System.out.println("Create a random can for me. <1>");
		System.out.println("Enter the total amount of random colored beans you want. <2>");
		System.out.println("Enter specific white and black bean values. <3>");
		System.out.print("Type: ");

		int type = getType(keyboard);

		CoffeeBeanCan temp;

		if (type == 1)
		{
			temp = new CoffeeBeanCan();
		}
		else if (type == 2)
		{
			System.out.println();
			System.out.print("How many beans would you like total? ");
			int beans = keyboard.nextInt();
			temp = new CoffeeBeanCan(beans);
		}
		else //(type == 3)
		{
			System.out.println();
			System.out.print("How many black beans would you like? ");
			int black = keyboard.nextInt();
			System.out.print("How many white beans would you like? ");
			int white = keyboard.nextInt();
			temp = new CoffeeBeanCan(black, white);
		}

		return temp;
	}

	public static void drawBeans(Scanner keyboard, CoffeeBeanCan coffeeCan)
	{
		System.out.println();
		System.out.println("New Turn. Press enter to continue.");

		String ans = keyboard.nextLine();
		while (!ans.equals("y"))
		{
			System.out.print("Would you like to draw 2 beans? Type <y> and press enter to confirm. ");
			ans = keyboard.nextLine();
		}

		char[] beans = coffeeCan.drawBeans();
		displayBeans(beans);
	}

	public static void displayBeans(char[] beans)
	{
		if (beans[0] == beans[1]) // same color
		{
			String color = "black";
			if (beans[0] == 'w')
			{
				color = "white";
			}

			System.out.println("You drew two " + color + "beans!");
			System.out.println("They were removed. A black bean was added.");
		}

		else // both colors
		{
			System.out.println("You drew a black bean and a white bean!");
			System.out.println("The black bean was removed.");
			System.out.println("The white bean was returned to the can.");
		}
	}

	public static void endGame(CoffeeBeanCan coffeeCan)
	{
		System.out.println("There is one bean left!");
		System.out.println("The last bean's color is " + coffeeCan.getLastBean());
	}

	public static int getType(Scanner keyboard)
	{
		int type = getNum(keyboard);
		while (type < 0 || type > 4)
		{
			keyboard.nextLine();
			System.out.println("Please enter a valid type (<1>, <2>, <3>).");
		}
		return type;
	}

	public static int getNum(Scanner keyboard)
	{
		while (!keyboard.hasNextInt())
		{
			keyboard.nextLine();
			System.out.println("Please enter a number.");
		}
		int num = keyboard.nextInt();
		return num;
	}

}
