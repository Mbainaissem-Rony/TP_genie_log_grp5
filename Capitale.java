
public class Capitale extends Ville {
	private String monument;
	public Capitale(){
		super();
		monument = "aucun";
		}
	public String decriToi(){
			String str = super.decriToi() + "\n \t ==>>" + this.monument + " en est un monument"; 
			System.out.println("Invocation de super.decrisToi()");
			return str;
	}
}
