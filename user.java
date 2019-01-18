import java.util.*;

public class user {
	public static prize getclass(String name) {
		prize obj = null;
		if (name.equals("Dog")) {
			obj = new soft_toys("Dog", 50);

		} else if (name.equals("Cat")) {
			obj = new soft_toys("Cat", 40);

		} else if (name.equals("Rabbit")) {
			obj = new soft_toys("Rabbit", 20);

		} else if (name.equals("Kit-Kat")) {
			obj = new candy_bars("Kit-Kat", 10);

		} else if (name.equals("Snickers")) {
			obj = new candy_bars("Snickers", 5);

		} else if (name.equals("Five-Star")) {
			obj = new candy_bars("Five-Star", 7);

		} else if (name.equals("Pen")) {
			obj = new stationary("Pen", 2);

		} else if (name.equals("Pencil")) {
			obj = new stationary("Pencil", 1);

		} else if (name.equals("Eraser")) {
			obj = new stationary("Eraser", 3);

		} else {
			System.out.print("INVALID INPUT");

		}
		return (obj);
	}

	public static prize get_types() {
		Scanner sc = new Scanner(System.in);

		String p1 = sc.next();
		prize obj1 = getclass(p1);
		while (obj1 == null) {
			p1 = sc.next();
			obj1 = getclass(p1);
		}
		return obj1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Np = sc.nextInt();

		for (int i = 0; i < Np; i++) {
			String Name = sc.next();
			System.out.print("Player" + "  " + Name + " started playing");
			prize ob1 = get_types();
			prize ob2 = get_types();
			prize ob3 = get_types();
			prize ob4 = get_types();
			prize ob5 = get_types();
			

			player playr = new player(ob1, ob2, ob3, ob4, ob5, Name);

			for (int chances = 0; chances < 10; chances++) {
				System.out.println("Choose a coordinate");
				playr.play();
			}
			playr.summery();

		}

	}

}
