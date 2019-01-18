
public class candy_bars extends prize {
	
	candy_bars(String name , int weight){
		super(name , weight);
	}
	@Override
	public candy_bars  clone() {
		   candy_bars nw=new candy_bars(this.Name,this.weight);
		   return (nw);}
	@Override
	public double add_points(double points) {
		double  pnts=points+20;
		return pnts ;

	}
	  

}
