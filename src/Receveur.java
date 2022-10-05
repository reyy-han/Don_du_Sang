
public class Receveur extends Personne implements Comparable, Mourir {
	private int priorite;
	private int attenddepuis;
	
	public Receveur(Genre g,double poids,int age,boolean ci, Sang s,boolean Rmalade){
		super(g,poids,age,ci,s,Rmalade);
		attenddepuis=0;
		s.setHemoglobine(Math.random()*10);
		if(sang.getHemoglobine()<12){priorite=1;}
		if(sang.getHemoglobine()<10){priorite=2;}
		if(sang.getHemoglobine()<8){priorite=3;}
		if(sang.getHemoglobine()<6){priorite=4;}
		if(sang.getHemoglobine()<4){priorite=5;}
		if(Rmalade){priorite=6;}
	}
	
	public Receveur(Genre g,Sang s,boolean Rmalade){
		this(g,(Math.random()*250),((int)(Math.random()*100)),false,s,Rmalade);
	}
	public Receveur(Genre g,Sang s){
		this(g,(Math.random()*150+50),((int)(Math.random()*100)),false,s,Math.random()<0.3?true:false);
	}
	
	public int getPriorite(){
		return priorite;
	}
	public void setPriorite(int i){
		priorite=i;
	}
	public void plus1Priorite(){ priorite++;}
	public void moins1Priorite(){ priorite--;}
	public void plusAttente(){attenddepuis++;}
	public int getAttendDepuis(){return attenddepuis;}
	public void setAttentDepuis(int i){attenddepuis=i;}
	
	public void actualise(){
		if(getReinMalade()){priorite=6;}
		else {
			if(sang.getHemoglobine()<2){mourir();}
			else{
				if((sang.getHemoglobine()<4)&&(getReinMalade())){mourir();}
				else{
					if(sang.getHemoglobine()<4){priorite=5;}
					else{
						if(sang.getHemoglobine()<6){priorite=4;}
						else{
							if(sang.getHemoglobine()<8){priorite=3;}
							else{
								if(sang.getHemoglobine()<10){priorite=2;}
								else{priorite=1;}
							}
						}
					}
				}
			}
		}
	}
	
	@Override
	public boolean CompareTo(Object obj) {
		Donneur d=(Donneur) obj;
		return sang.R_CompareTo_D(d.getSang());
	}
	//Strings
	public String Message(){
		if (priorite==6) { return "BESOIN URGENT DE DON DE REIN";}
		if (priorite==5) { return "BESOIN URGENT DE DON";}
		if (priorite==4) { return "Besoin important de don";}
		if (priorite==3) { return "Besoin de don";}
		if (priorite==2) { return "Besoin faible de don";}
		else{ return "Besoin tres faible de don";}
	}
	public String toString(){
		return "Priorit'e du receveur: "+priorite+" ; Attend depuis: "+getAttendDepuis()+" ; "+super.toString()+"\n";
	}
	@Override
	public void mourir(){
		super.mourir();
		priorite=0;
	}
	public Donneur DevenirDonneur(){
		ReinPlusMalade();
		return new Donneur(genre,getPoids(),getAge(),getCI(),sang);
	}

	@Override
	public void Echange(Personne donneur){
		Donneur d=(Donneur) donneur;
		Recevoir();
		d.Don();
	}
	public void Recevoir() {
		sang.Recois();
		actualise();

	}

	@Override
	public void GreffeRein(Personne donneur) {
		Donneur d=(Donneur) donneur;
		if (d.Apte()||d.getNbReins()==2||(!d.getReinMalade())){
			d.GreffeRein(this);
			ReinPlusMalade();
			actualise();
		}

	}

	@Override
	public void GreffePostMortem(Personne donneur) {
		Donneur d=(Donneur) donneur;
		if(d.getMort()||(!d.getReinMalade())){
			guerrir();
			actualise();
			d.moins1Rein();
		}

	}

}
