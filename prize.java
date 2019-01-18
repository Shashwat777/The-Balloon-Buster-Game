
public class prize  implements  Cloneable {
   final String Name;
   final int weight;
   prize(String Name , int weight){
	   this.Name=Name;
	   this.weight=weight;
   }
  public prize clone() {
	   prize nw=new prize(this.Name,this.weight);
	   return (nw);
   } 
  @Override
  public boolean equals(Object ob) {
	  prize obj =(prize) ob ;
	 
	  return (this.Name == obj.Name && this.weight ==obj.weight);
  }
  public double add_points(double points) {

	  return (points);

	}
}
