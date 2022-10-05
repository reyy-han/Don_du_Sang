
public class A extends Sang implements Comparable_Sang{
	private String GroupeSanguin;
	private final String rhesus;
	
	//Constructeurs
	public A(){
		super();
		GroupeSanguin="A";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public A(double h){
		super(h);
		GroupeSanguin="A";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public A(boolean b){
		super(b);
		GroupeSanguin="A";
		if(Math.random()<0.5){rhesus="+";}
		else rhesus="-";
	}
	public A(String rhesus){
		super((Math.random()*6)+12);
		this.rhesus=rhesus;
		GroupeSanguin="A";
	}
	
	//Strings
	public String getGroupeSanguin(){return GroupeSanguin;}
	public String getType(){return "Groupe sanguin: "+GroupeSanguin+rhesus;}
	public String toString(){ return super.toString()+" ; "+getType();}
	public String getRhesus(){return rhesus;}
	@Override
	public boolean D_CompareTo_R(Sang s) {
		if ((s.getGroupeSanguin()=="O")||(s.getGroupeSanguin()=="B")){return false;}
		if (rhesus=="+"){
			if (s.getRhesus()=="-"){return false;}
		}
		return true;
	}
	public boolean R_CompareTo_D(Sang s) {
		if ((s.getGroupeSanguin()=="AB")||(s.getGroupeSanguin()=="B")){return false;}
		if (rhesus=="-"){
			if (s.getRhesus()=="+"){return false;}
		}
		return true;
	}
}
