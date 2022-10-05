
public class B extends Sang implements Comparable_Sang {
	private String GroupeSanguin;
	private final String rhesus;
	
	//Constructeurs
	public B(){
		super();
		GroupeSanguin="B";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public B(double h){
		super(h);
		GroupeSanguin="B";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public B(boolean b){
		super(b);
		GroupeSanguin="B";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public B(String rhesus){
		super((Math.random()*6)+12);
		this.rhesus=rhesus;
		GroupeSanguin="B";
	}
	

	public String toString(){ return super.toString()+" ; "+getType();}
	@Override
	public boolean D_CompareTo_R(Sang s) {
		if ((s.getGroupeSanguin()=="O")||(s.getGroupeSanguin()=="A")){return false;}
		if (rhesus=="+"){
			if (s.getRhesus()=="-"){return false;}
		}
		return true;
	}
	public boolean R_CompareTo_D(Sang s) {
		if ((s.getGroupeSanguin()=="AB")||(s.getGroupeSanguin()=="A")){return false;}
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

}
