
public abstract class Sang implements Soin {
	protected double hemoglobine;
	protected boolean malade;
	protected double litre;
	
	//constructeurs
	public Sang(double hemo,boolean m,double qte){
		hemoglobine=hemo;
		malade=m;
		litre=qte;
	}
	public Sang(){
		this(Math.random()*20,false,5000.0);
	}
	public Sang(double h){
		this(h,false,5000.0);
	}
	public Sang(boolean b){
		this(Math.random()*20,b,5000.0);
	}
	//Accesseurs
	public double getHemoglobine(){return hemoglobine;}
	public boolean getMalade(){return malade;}
	public double getLitre(){return litre;}
	//Modifs
	public void setLitre(double d){litre+=d;}
	//les Strings
	public String toString(){
		return "Sang : litre= "+litre+"; taux d'hemoglobine= "+hemoglobine+"; malade= "+malade;
	}
	public String Anemie(){return "ANEMIE BESOIN DE SANG!";}
	
	//evolution du sang
	public void setHemoglobine(double d){hemoglobine=d;}
	public void DiminutionHemoglobine(double decombien){hemoglobine-=decombien;}
	public void hemorragie(){
		litre-=(Math.random()*litre);
		if (litre<=((5000.0/3)*2)){
			DiminutionHemoglobine(6.0);
			System.out.println("Urgences:  "+Anemie()+"\n");
		}
	}
	public void Contamination(){malade=true;}
	public boolean BonneSanteFemme(){
		if ((litre<5000.0) || ((hemoglobine < 12.0) || (hemoglobine > 16.0))||(malade==true)){
			return false;
		}
		return true;
	}
	public boolean BonneSanteHomme(){
		if ((litre<5000.0) || ((hemoglobine < 13.0) || (hemoglobine > 18.0))||(malade==true)){
			return false;
		}
		return true;
	}
	
	//interface Soin
	public void Aggrave(){
		if (!malade){malade=true;}
		else{
		hemoglobine-=2.0;
		}
	}
	public void guerrir(){	
			litre=5000.0;
			hemoglobine=14.0;
			malade=false;
			System.out.println("Le sang n'est plu malade.");
	}
	
	public void Don(){
		litre-=450.0;
		hemoglobine+=1.0;
	}
	public void Recois(){
		litre+=450.0;
		hemoglobine+=2.0;
	}
	
	public abstract boolean D_CompareTo_R(Sang s);
	public abstract boolean R_CompareTo_D(Sang s);
	public abstract String getType();
	public abstract String getRhesus();
	public abstract String getGroupeSanguin();
	

}
