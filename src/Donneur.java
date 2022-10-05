
public class Donneur extends Personne implements ApteADonner,Comparable {
	private int attente;
	
	public Donneur(Genre g,double poids,int age,boolean ci, Sang s){
		super(g,poids,age,ci,s,false);
		attente=0;
	}
	public Donneur (Genre g,Sang s){
		super(g,(Math.random()*75)+50,(((int)(Math.random()*52))+18),false,s,false);
		attente=0;
	}
	
	public String toString(){
		return super.toString()+" mois d'attente pour le prochain don: "+attente+"\n";
	}
	public Receveur DevenirReceveur() {
		Receveur r=null;
		if(!BonHemoglobine()){
			new Receveur(genre,getPoids(),getAge(),getCI(),sang,false);
		}
		return r;
	}

	public void actualise(){
		if ((sang.getHemoglobine()<10)||(getReinMalade())||getBesoinGreffe()||(!SangSain())){
			DevenirReceveur();
		}
	}
	
	public int getAttente(){return attente;}
	public void setAttente(int i){attente=i;}
	public void ViensdeDonner(){attente=2;}
	public void moins1attente(){attente--;}
	
	public boolean CompareTo(Object obj) {
		Receveur r=(Receveur)obj;
		return sang.D_CompareTo_R(r.getSang());
	}
	
	@Override
	public boolean BonPoids() {
		if (getPoids()<50.0){return false;}
		return true;
	}

	@Override
	public boolean BonAge() {
		if((getAge()<18)&&(getAge()>70)){return false;}
		return true;
	}

	@Override
	public boolean BonHemoglobine() {
		if(genre instanceof Femme){
			if((sang.getHemoglobine()<12.0)||(sang.getHemoglobine()>16.0)){return false;}
		}
		if(genre instanceof Homme){
			if((sang.getHemoglobine()<12.0)||(sang.getHemoglobine()>18.0)){return false;}
		}
		return true;
	}

	@Override
	public boolean AucunProblemeSante() {
		if( (getCI()==true)||(getReinMalade()==true)||(SangSain()==false)) return false;
		return true;
	}

	@Override
	public boolean Enceinte() {
		return getGenre().getEnceinte();
	}

	@Override
	public boolean LimiteAnnuelleAtteinte() {
		if(getGenre().getDonMax()==0){return true;}
		return false;
	}
	public boolean Apte(){
		if ((AucunProblemeSante()==true)&&(Enceinte()==false)&&(BonHemoglobine()==true)&&(BonPoids()==true)&&(BonAge()==true)&&(LimiteAnnuelleAtteinte()==false)&&(getAttente()==0)){
			return true;
		}
		return false;
	}
	public void Don() {		/* ou PeutDonner()*/
		if (Apte()){
			sang.Don();
			setAttente(2);
			genre.moins1();
		}
		else{
			System.out.println("le Donneur ne peut pas donner.");
		}
	}
	@Override
	public void Echange(Personne receveur){
		Receveur r=(Receveur)receveur;
		Don();
		r.Recevoir();
	}
	
	public void GreffeRein(Personne receveur){
		if ((CompareTo(receveur))&&(getNbReins()==2)&&(!getReinMalade())&&(Apte())){
			moins1Rein();
			setAttente(6);
			
		}
		else{
			System.out.println("Le donneur n'est pas apte ра donner un rein");
		}
	}
	public void GreffePostMortem(Personne receveur){
		if ((CompareTo(receveur))&&(getNbReins()==2)&&(!getReinMalade())&&getMort()){
			if(receveur.getReinMalade()&& (receveur.getBesoinGreffe())){
				moins1Rein();
			}
			if((!receveur.getReinMalade())&& (receveur.getBesoinGreffe())){
				receveur.ReinPlusMalade();
				Receveur r=(Receveur)receveur;
				r.actualise();
			}
		}
		else{
			System.out.println("Cette personne de la morgue ne peut pas donner de rein ра ce receveur");
		}
	}
	

}
