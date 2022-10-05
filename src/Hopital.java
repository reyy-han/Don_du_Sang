import java.util.ArrayList;

public class Hopital implements Cycle{
	private ArrayList<Donneur> Donneurs;
	private ArrayList<Receveur> Receveurs;
	private ArrayList<Personne> Morgue;
	
	public Hopital(){
		Donneurs=new ArrayList<Donneur>();
		Receveurs=new ArrayList<Receveur>();
		Morgue=new ArrayList<Personne>();
	}
	public ArrayList<Donneur> getDonneurs(){return Donneurs;}
	public ArrayList<Receveur> getReceveurs(){return Receveurs;}
	public ArrayList<Personne> getMorgue(){return Morgue;}
	
	public void NvDonneurAleatoire(){
		double rand;
		if(Math.random()<0.5){
			if(Math.random()<0.2){
				rand=Math.random();
				if(rand<0.36){AjouterElDonneur(new Donneur(new Femme(true),new O("+")));return;}
				if(rand<0.42){AjouterElDonneur(new Donneur(new Femme(true),new O("-")));return;}
				if(rand<0.79){AjouterElDonneur(new Donneur(new Femme(true),new A("+")));return;}
				if(rand<0.86){AjouterElDonneur(new Donneur(new Femme(true),new A("-")));return;}
				if(rand<0.95){AjouterElDonneur(new Donneur(new Femme(true),new B("+")));return;}
				if(rand<0.96){AjouterElDonneur(new Donneur(new Femme(true),new B("-")));return;}
				if(rand<0.99){AjouterElDonneur(new Donneur(new Femme(true),new AB("+")));return;}
				else {AjouterElDonneur(new Donneur(new Femme(true),new AB("-")));return;}
			}
			rand=Math.random();
			if(rand<0.36){AjouterElDonneur(new Donneur(new Femme(false),new O("+")));return;}
			if(rand<0.42){AjouterElDonneur(new Donneur(new Femme(false),new O("-")));return;}
			if(rand<0.79){AjouterElDonneur(new Donneur(new Femme(false),new A("+")));return;}
			if(rand<0.86){AjouterElDonneur(new Donneur(new Femme(false),new A("-")));return;}
			if(rand<0.95){AjouterElDonneur(new Donneur(new Femme(false),new B("+")));return;}
			if(rand<0.96){AjouterElDonneur(new Donneur(new Femme(false),new B("-")));return;}
			if(rand<0.99){AjouterElDonneur(new Donneur(new Femme(false),new AB("+")));return;}
			else {AjouterElDonneur(new Donneur(new Femme(false),new AB("-")));return;}
		}
		rand=Math.random();
		if(rand<0.36){AjouterElDonneur(new Donneur(new Homme(),new O("+")));return;}
		if(rand<0.42){AjouterElDonneur(new Donneur(new Homme(),new O("-")));return;}
		if(rand<0.79){AjouterElDonneur(new Donneur(new Homme(),new A("+")));return;}
		if(rand<0.86){AjouterElDonneur(new Donneur(new Homme(),new A("-")));return;}
		if(rand<0.95){AjouterElDonneur(new Donneur(new Homme(),new B("+")));return;}
		if(rand<0.96){AjouterElDonneur(new Donneur(new Homme(),new B("-")));return;}
		if(rand<0.99){AjouterElDonneur(new Donneur(new Homme(),new AB("+")));return;}
		else {AjouterElDonneur(new Donneur(new Homme(),new AB("-")));return;}
	}
	public void NvReceveurAleatoire(){
		double rand;
		if(Math.random()<0.5){
			if(Math.random()<0.2){
				rand=Math.random();
				if(rand<0.36){AjouterElReceveur(new Receveur(new Femme(true),new O("+")));return;}
				if(rand<0.42){AjouterElReceveur(new Receveur(new Femme(true),new O("-")));return;}
				if(rand<0.79){AjouterElReceveur(new Receveur(new Femme(true),new A("+")));return;}
				if(rand<0.86){AjouterElReceveur(new Receveur(new Femme(true),new A("-")));return;}
				if(rand<0.95){AjouterElReceveur(new Receveur(new Femme(true),new B("+")));return;}
				if(rand<0.96){AjouterElReceveur(new Receveur(new Femme(true),new B("-")));return;}
				if(rand<0.99){AjouterElReceveur(new Receveur(new Femme(true),new AB("+")));return;}
				else {AjouterElReceveur(new Receveur(new Femme(true),new AB("-")));return;}
			}
			rand=Math.random();
			if(rand<0.36){AjouterElReceveur(new Receveur(new Femme(false),new O("+")));return;}
			if(rand<0.42){AjouterElReceveur(new Receveur(new Femme(false),new O("-")));return;}
			if(rand<0.79){AjouterElReceveur(new Receveur(new Femme(false),new A("+")));return;}
			if(rand<0.86){AjouterElReceveur(new Receveur(new Femme(false),new A("-")));return;}
			if(rand<0.95){AjouterElReceveur(new Receveur(new Femme(false),new B("+")));return;}
			if(rand<0.96){AjouterElReceveur(new Receveur(new Femme(false),new B("-")));return;}
			if(rand<0.99){AjouterElReceveur(new Receveur(new Femme(false),new AB("+")));return;}
			else {AjouterElReceveur(new Receveur(new Femme(false),new AB("-")));return;}
		}
		rand=Math.random();
		if(rand<0.36){AjouterElReceveur(new Receveur(new Homme(),new O("+")));return;}
		if(rand<0.42){AjouterElReceveur(new Receveur(new Homme(),new O("-")));return;}
		if(rand<0.79){AjouterElReceveur(new Receveur(new Homme(),new A("+")));return;}
		if(rand<0.86){AjouterElReceveur(new Receveur(new Homme(),new A("-")));return;}
		if(rand<0.95){AjouterElReceveur(new Receveur(new Homme(),new B("+")));return;}
		if(rand<0.96){AjouterElReceveur(new Receveur(new Homme(),new B("-")));return;}
		if(rand<0.99){AjouterElReceveur(new Receveur(new Homme(),new AB("+")));return;}
		else {AjouterElReceveur(new Receveur(new Homme(),new AB("-")));return;}
	}
	
	public Donneur supprimerElDonneur(int index){
		return Donneurs.remove(index);
	}public Receveur supprimerElReceveur(int index){
		return Receveurs.remove(index);
	}public Personne supprimerElMorgue(int index){
		return Morgue.remove(index);
	}public void AjouterElDonneur(Donneur d){
		Donneurs.add(d);
	}public void AjouterElReceveur(Receveur r){
		Receveurs.add(r);
	}public void AjouterElMorgue(Personne p){
		Morgue.add(p);
	}
	public Donneur TrouverDonneurSang(Receveur r){
		for(Donneur d: Donneurs){
			if (d.CompareTo(r)){
				if(d.Apte()){
					return d;
				}
			}
		}
		System.out.println("- Aucun Donneur de Sang ne correspond aux besoins de ce receveur "+r.getID()+".\n");
		return null;
	}
	public Personne TrouverDonneurRein(Receveur r){
		if (Math.random()<0.90){/*environ 90% des greffes sont realises post-mortem*/ 
			for(Personne p: Morgue){
				if (p.CompareTo(r)){
					if((p.getNbReins()==2)||(!p.getReinMalade())){
						return p;
					}
				}
			}
		}
		for(Donneur d: Donneurs){
			if (d.CompareTo(r)){
				if(d.Apte()&&(d.getNbReins()==2)||(!d.getReinMalade())){
					return d;
				}
			}
		}
		System.out.println("- Aucun Donneur de Rein ne correspond aux besoins de ce receveur "+r.getID()+".\n");
		return null;
	}
	public String AfficheListDonneurs(){
		String s="Liste des Donneurs de l'Hopital:\n";
		s+="-----------------------------------------------------------------------------------------------------------------";
		s+="\n";
		for (Donneur d:Donneurs){
			s+="- "+d.toString()+"\n\n";
		}
		s+="-----------------------------------------------------------------------------------------------------------------";
		return s;
	}public String AfficheListReceveurs(){
		String s="Liste d'attente des Receveurs de l'Hopital:\n";
		s+="-----------------------------------------------------------------------------------------------------------------";
		s+="\n";
		for (Receveur r:Receveurs){
			s+="- "+r.toString()+"\n\n";
		}
		s+="-----------------------------------------------------------------------------------------------------------------";
		s+="\n";
		return s;
		
	}public String AfficheListMorgue(){
		String s="Liste des corps de la Morgue de l'Hopital:\n";
		s+="-----------------------------------------------------------------------------------------------------------------";
		s+="\n";
		for (Personne p:Morgue){
			s+="- id= "+p.getID()+" ; poids= "+p.getPoids()+" ; age= "+p.getAge()+" ; Contre-Indication-Quelconque= "+p.getCI()+"; "
					+ "Reins= "+p.getNbReins()+" ; malade? "+p.getReinMalade()+" ;\n "+p.getSang().toString()+".\n\n"; 
		}
		s+="-----------------------------------------------------------------------------------------------------------------";
		s+="\n";
		return s;
	}
	public void Affiche_Hopital(){
		System.out.println(AfficheListReceveurs());
		System.out.println("\n \n");
		System.out.println(AfficheListDonneurs());
		System.out.println("\n \n");
		System.out.println(AfficheListMorgue());
	}
	public void TriReceveurs(){
		int i=Receveurs.size()-1;
		while(i!=0){
			if((Receveurs.get(i).getPriorite())>(Receveurs.get(i-1).getPriorite())){
				Receveur t=Receveurs.remove(i-1);
				Receveurs.add(t);
				i=Receveurs.size()-1;
			}
			i--;	
		}
	}
	public void Effectif(){
		System.out.println("Nombre de donneurs: "+Donneurs.size()+" ;		Nombre de receveurs: "+Receveurs.size()+" ;		Nombre de personnes a la morgue: "+Morgue.size());
	}
	public void BilanDePopulation(){
		int nbDonneur=Donneurs.size();
		int nbReceveur=Receveurs.size();
		int nbRGreffe=0;
		int nbDMGreffe=0;
		int nbMort=Morgue.size();
		int nbDonneurApte=0;
		for (Donneur d:Donneurs){
			if (d.Apte()) nbDonneurApte++;
			if((!d.getReinMalade())&&(d.Apte())&&(d.getNbReins()==2)) nbDMGreffe++;
		}
		for(Receveur r:Receveurs){
			if(r.getBesoinGreffe()){
				nbRGreffe++;
			}
		}
		for(Personne p:Morgue){
			if((!p.getReinMalade())&&p.SangSain()&&p.getNbReins()>0)nbDMGreffe++;
		}
		if(nbReceveur>(nbDonneurApte+nbMort)){
			System.out.println("Appel au don de Sang pour pouvoir soigner les nombreux patients en attente de soin vitaux.");
		}
		if(nbRGreffe>nbDMGreffe){
			System.out.println("Manque de greffons pour nos patients atteints de maladie graves necessitant une greffe:\n Appel au don de Rein.");
		}
		else{
			System.out.println("Le nombre de Donneurs potentielles et aptes a donner couvre les besoins de l'hopital.");
		}
	}
	
	public void Mois(){
		Donneur [] dsup=new Donneur[Donneurs.size()];
		Receveur [] rsup=new Receveur[Receveurs.size()];
		int nbDon=0;
		int nbDRein=0;
		TriReceveurs();
		for(Receveur r:Receveurs){
			Donneur dt=TrouverDonneurSang(r);
			if (dt!=null){
				if(r.getReinMalade() && r.getBesoinGreffe()){
					r.GreffeRein(dt);
					r.actualise();
					dt.actualise();
					if(!r.getReinMalade()){
						nbDRein++;
						System.out.println("- Le Receveur "+r.getID()+" a recu un rein de la part du Donneur "+dt.getID()+".");
						System.out.println(r.toString());
						System.out.println(dt.toString()+"\n");
					}
				}
				if(dt.Apte()){
					dt.Echange(r);
					nbDon++;
					System.out.println("- Le Donneur "+dt.getID()+" a donner son sang au Receveur "+r.getID()+"\n");
					System.out.println(r.toString());
					System.out.println(dt.toString()+"\n");
				}
			}
			else{ 
				r.plusAttente();
				if (r.getAttendDepuis()==3){
					r.plus1Priorite();
					r.setAttentDepuis(0);
				}
				if(r.getPriorite()==7){r.mourir();}
			}
		}
		System.out.println("\nBilan de modification des donneurs et receveurs:\n");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("DONNEURS:\n");
		for(Donneur d:Donneurs){
			if(d.getSang().getLitre()<5000.0)d.getSang().setLitre(450.0);
			if(d.getAttente()!=0)d.moins1attente();
			if(Math.random()<0.80){d.guerrir();}
			if(Math.random()<0.10){d.grossir(Math.random()*2);}
			if(Math.random()<0.10){d.maigrir(Math.random()*2);}
			if(Math.random()<0.001){d.mourir();}
			if(Math.random()<0.02){
				d.ReinDevientMalade();
				d.setBesoinGreffe(true);
			}
			if(Math.random()<0.001){d.setBesoinGreffe(true);}
			if(Math.random()<0.2){d.setCI(!d.getCI());}
			if(Math.random()<0.1){
				System.out.print("Donneur: "+d.getID()+"	");
				d.accident();
			}
			if(!d.BonAge()){
				supprimerElDonneur(Donneurs.indexOf(d));
			}
			d.actualise();
			if(d.getMort()){
				int i=0;
			 	while(dsup[i]!=null){i++;}
			 	dsup[i]=d;
			}
		}
		System.out.println("\nRECEVEURS:\n");
		for(Receveur r:Receveurs){
			if(r.getSang().getLitre()>5000.0)r.getSang().setLitre(-450.0);
			if(Math.random()<0.10){r.grossir(Math.random()*2);}
			if(Math.random()<0.10){r.maigrir(Math.random()*2);}
			if(Math.random()<0.002){r.mourir();}
			if(Math.random()<0.20){
				r.Aggrave();
				r.actualise();
			}	
			if(r.getMort()){
				int i=0;
			 	while(rsup[i]!=null){i++;}
			 	rsup[i]=r;
			}
		}
		for(int i=0;i<dsup.length;i++){
			if(dsup[i]!=null){
				Donneur dd = supprimerElDonneur(Donneurs.indexOf(dsup[i]));
				AjouterElMorgue(dd);
				System.out.print("\n\nEnvoie a la morgue du donneur:	"+dsup[i].getID());
			}
		}
		for(int i=0;i<rsup.length;i++){
			if(rsup[i]!=null){
				Receveur rn =supprimerElReceveur(Receveurs.indexOf(rsup[i]));
				AjouterElMorgue(rn);
				System.out.print("Envoie a la morgue du receveur:	"+rsup[i].getID());
			}
		}
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.println("\n Le nombre de Don de Sang ce mois: "+ nbDon+" ; Don de Rein: "+nbDRein+"\n\n\n");
	}

}
