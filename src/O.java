
public class O extends Sang implements Comparable_Sang {
	private String GroupeSanguin;
	private final String rhesus;
	//Constructeurs
	public O(){
			super();
			GroupeSanguin="O";
			if(Math.random()<0.5){rhesus="+";}
			else rhesus="-";
	}
	public O(double h){
		super(h);
		GroupeSanguin="O";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public O(boolean b){
		super(b);
		GroupeSanguin="O";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public O(String rhesus){
		super((Math.random()*6)+12);
		this.rhesus=rhesus;
		GroupeSanguin="O";
	}
	public String getRhesus(){return rhesus;}
	public String getGroupeSanguin(){return GroupeSanguin;}
	@Override
	public boolean D_CompareTo_R(Sang s) {
		if(rhesus=="+"){
			if (s.getRhesus()=="-"){
				return false;
			}
		}
		return true;
	}
	public boolean R_CompareTo_D(Sang s) {
		if(rhesus=="-"){
			if (s.getRhesus()=="+"){
				return false;
			}
		}
		if(GroupeSanguin!="O"){return false;}
		return true;
	}
	//accesseurs
	public String getType(){return "Groupe sanguin: "+GroupeSanguin+rhesus;}
	public String toString(){ return super.toString()+" ; "+getType();}
	

}
