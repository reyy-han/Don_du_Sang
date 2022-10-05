
public abstract class Personne implements Mourir,Soin {
	protected Genre genre;
	private int age;
	private double poids;
	private boolean ContreIndication;
	protected Sang sang;
	private boolean mort;
	private int nbReins;
	private boolean ReinMalade;
	private boolean BesoinGreffe;
	public static int cpt=0;
	private int id;
	
	//constructeurs
	public Personne(Genre g,double poids,int age,boolean ci, Sang s,boolean Rmalade){
		genre=g;
		this.age=age;
		this.poids=poids;
		ContreIndication=ci;
		sang=s;
		mort=false;
		nbReins=2;
		ReinMalade=Rmalade;
		BesoinGreffe=Rmalade;
		cpt++;
		id=cpt;
	}
	public Personne(Genre g,boolean ci,Sang s){
		this(g,Math.random()*250,(int)Math.random()*100,ci,s,false);
	
	}
	public Personne(Genre g,Sang s){
		this(g,Math.random()*250,(int)Math.random()*100,false,s,false);
	
	}
	//accesseurs
	public int getAge(){return age;}
	public double getPoids(){return poids;}
	public boolean getCI(){return ContreIndication;}
	public Sang getSang(){return sang;}
	public Genre getGenre(){return genre;}
	public boolean getMort(){return mort;}
	public int getNbReins(){return nbReins;}
	public boolean getReinMalade(){return ReinMalade;}
	public boolean getBesoinGreffe(){return BesoinGreffe;}
	
	public int getID(){return id;}
	public static int getCpt(){return cpt;}
	//modifs
	public void vieillir(){age++;}
	public void grossir(double d){ poids+=d;}
	public void maigrir(double d){ poids-=d;}
	public void setCI(boolean b){ContreIndication=b;}
	public void mourir(){mort=true;}
	public void moins1Rein(){nbReins--;}
	public void ReinDevientMalade(){ReinMalade=true;}
	public void ReinPlusMalade(){
		ReinMalade=false;
		BesoinGreffe=false;
	}
	public void setBesoinGreffe(boolean b){
		BesoinGreffe=b;
	}
	
	//String
	public String toString(){ 
		return genre.toString()+"\n id= "+getID()+" ; Mort= "+getMort()+"; poids= "+poids+" ; age= "+age+" ; Contre-Indication-Quelconque= "+ContreIndication+"; "
				+ "Reins= "+nbReins+" ; malade? "+ReinMalade+" ; Besoin d'une Greffe= "+BesoinGreffe+ "\n"+sang.toString(); 
	}
	public String Population(){
		return "la ville compte "+getCpt()+" habitants vivants ou morts"; 
	}	
	//Evolution Sante
	public void guerrir(){
		if( genre instanceof Femme){
			if (!sang.BonneSanteFemme()){
				sang.guerrir();
			}
		}
		if(getReinMalade()){
			ReinPlusMalade();
		}
		if(getBesoinGreffe()){
			setBesoinGreffe(false);
		}
		if(!sang.BonneSanteHomme()){
			sang.guerrir();
		}
		if(Math.random()<0.2) {setCI(false);}
		
	}
	public void Aggrave(){
		sang.Aggrave();
	}
	public boolean SangSain(){
		if(genre instanceof Femme){
			return sang.BonneSanteFemme();
			}
		return sang.BonneSanteHomme();
	}
	public void accident(){
		if (Math.random()<0.4){
			mourir();
		}
		if (Math.random()<0.3){
			sang.Contamination();
			System.out.print("Contamination\n");
		}
		if(Math.random()<0.6){
			sang.hemorragie();
		}
	}
	//Abstract
	public abstract boolean CompareTo(Object obj); 
	public abstract void Echange(Personne p);
	public abstract void GreffeRein(Personne p);
	public abstract void GreffePostMortem(Personne p);
}
