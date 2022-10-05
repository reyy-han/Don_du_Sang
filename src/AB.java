
public class AB extends Sang implements Comparable_Sang{
	private String GroupeSanguin;
	private final String rhesus;
	
	//Constructeurs
	public AB(){
		super();
		GroupeSanguin="AB";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public AB(double h){
		super(h);
		GroupeSanguin="AB";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public AB(boolean b){
		super(b);
		GroupeSanguin="AB";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public AB(String rhesus){
		super((Math.random()*6)+12);
		this.rhesus=rhesus;
		GroupeSanguin="AB";
	}
	@Override
	public boolean D_CompareTo_R(Sang s) {
		if (s.getGroupeSanguin()!="AB"){return false;}
		if (rhesus=="+"){
			if (s.getRhesus()=="-"){return false;}
		}
		return true;
	}
	@Override
	public boolean R_CompareTo_D(Sang s) {
		if (rhesus=="-"){
			if (s.getRhesus()=="+"){return false;}
		}
		return true;
	}
	@Override
	public String getType() {
		return "Groupe sanguin: "+GroupeSanguin+rhesus;
	}

	@Override
	public String getRhesus() {
		return rhesus;
	}

	@Override
	public String getGroupeSanguin() {
		return GroupeSanguin;
	}

	public String toString(){ return super.toString()+" ; "+getType();}

}
