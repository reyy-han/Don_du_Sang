
public class Homme extends Genre {
	public Homme(){
		super(6);
	}
	@Override
	public String toString() {
		return "Homme, ResteDon: "+DonMax;
	}

	@Override
	public void reinitialise() {
		DonMax=6;

	}
	public boolean getEnceinte(){return false;}

}
