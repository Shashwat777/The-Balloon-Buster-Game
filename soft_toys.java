
public class soft_toys extends prize {
	soft_toys(String name, int weight) {
		super(name, weight);
	}
	@Override
	public soft_toys clone() {
		soft_toys nw = new soft_toys(this.Name, this.weight);
		return (nw);
	}
   @Override
	public double add_points(double points) {
		double pnts=points*2  + 10 ;
		return pnts;
				

	}
}