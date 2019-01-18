import java.util.*;

final public class player {
	final prize a;
	final prize b;
	final prize c;
	final prize d;
	final prize e;
	final prepare_game game;
	prize[] types = new prize[5];
	private static  int[][] visited = new int[10][10];
	final private String name;

	double points;
	private prize[] my_prize = new prize[10];
	private int no_prize;

	player(prize a, prize b, prize c, prize d, prize e, String Name) {
		this.a = a;
		types[0] = a;
		this.b = b;
		types[1] = b;

		this.c = c;
		types[2] = c;

		this.d = d;
		types[3] = d;
		this.e = e;
		types[4] = e;
		this.name=Name;

		game = new prepare_game(a, b, c, d, e);
        

	}

	public   void play() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (visited[x][y] == 1) {
			System.out.println("Enter again :Visited ");
			x = sc.nextInt();
			y = sc.nextInt();

		}
		visited[x][y]=1;
		if(prepare_game.board[x][y]!=null) {
			System.out.println("Guess the prize");
			int inp=sc.nextInt();
			while(inp>=5) {
				System.out.println(":Invalid Input:Enter again");
				inp=sc.nextInt();
			}
			
			if(types[inp].equals(prepare_game.board[x][y])) {
				points=types[inp].add_points(points);
				System.out.println("You won the" + " " + types[inp].Name);
				my_prize[no_prize]=prepare_game.board[x][y];
				no_prize++;
			}
			else {
				double diff=prepare_game.board[x][y].weight- types[inp].weight;
				if(diff<0) {
					diff= diff*(-1);
				}if( points >diff -1 ) {
				points=points - diff ;}
				System.out.println("Sorry, you guessed wrong, it was" + "    "  + prepare_game.board[x][y].Name );
				
			}
			
		}
		else {
			points=points/2;
			System.out.println("Sorry, no prize here");
		}
	System.out.println(points + "  " +"Points");

	}
	public void summery() {
		System.out.println("-------------------------------------------------" + "  " + " Summery of player " + " " +name + " "+"-----------------------------------");
		System.out.println("You Have Won :");
		for(int c=0 ;c<no_prize;c++) {
			System.out.print(my_prize[c].Name+" ,");
			
		}
		System.out.println("Total Points Won :" + " " + points );
		
		
	}

}
