
public class Femme extends Genre {
	private boolean enceinte;
	public Femme(boolean enceinte){
		super(4);
		this.enceinte=enceinte;
	}
	public boolean getEnceinte(){return enceinte;}
	public void setEnceinte(boolean b){enceinte=b;}
	@Override
	public String toString() {
		String s="";
		if (enceinte){
			s+="Femme, ENCEINTE";
		}
		else s+="Femme, ResteDon: "+DonMax;
		return s;
		
	}

	@Override
	public void reinitialise() {
		DonMax=4;
	}

}
