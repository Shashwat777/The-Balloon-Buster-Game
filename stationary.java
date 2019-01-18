
public class stationary extends prize {
	stationary(String name , int weight){
		super(name , weight);
	}
	@Override
	public stationary  clone() {
		   stationary nw=new stationary(this.Name,this.weight);
		   return (nw);}
	@Override
	public double add_points(double points) {
		
		double pnts= points*(1.1) +5 ;
		return (pnts);

	}
	
	

}
