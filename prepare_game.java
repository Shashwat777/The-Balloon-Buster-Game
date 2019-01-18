import java.util.*;

public final class prepare_game {

	final prize a;
	final prize b;
	final prize c;
	final prize d;
	final prize e;
	static prize[][] board = new prize[10][10];
	prize[] types=new prize[5];

	prepare_game(prize a, prize b, prize c, prize d, prize e) {
		this.a = a; types[0]=a;
		this.b = b; types[1]=b;
		this.c = c; types[2]=c;
		this.d = d; types[3]=d;
		this.e = e; types[4]=e;
		set_board(a);
		set_board(b);
		set_board(c);
		set_board(d);
		

	}

	public int[] gencod() {
		Random r = new Random();
		int x = r.nextInt(10);
		int y = r.nextInt(10);
		int[] cod = new int[2];
		cod[0] = x;
		cod[1] = y;
		while (board[x][y]!= null) {
			x=r.nextInt(10);
			y = r.nextInt(10);
			cod[0] = x;
			cod[1] = y;

		}
		return cod;
	}

	public void set_board(prize prz) {
		
		for (int count = 0; count < 10; count++) {
			int[] cod = gencod();
			
			board[cod[0]][cod[1]]=prz.clone();
			

		}
	}

}
