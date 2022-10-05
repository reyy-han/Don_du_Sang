
public class Main {
	public static void main(String[] args){
		
		Hopital h= new Hopital();
		for(int i=0; i<20;i++){
			h.NvDonneurAleatoire();
			h.NvReceveurAleatoire();
		}
		for (int i=0;i<10;i++){
			double r;
			r=Math.random();
			
			if(Math.random()<0.5){
				if (r<0.36)h.AjouterElMorgue(new Donneur(new Homme(),new O("+")));
				else {
					if(r<0.42)h.AjouterElMorgue(new Receveur(new Homme(),new O("-")));
					else{
						if(r<0.79)h.AjouterElMorgue(new Receveur(new Homme(),new A("+")));
						else{
							if(r<0.86)h.AjouterElMorgue(new Receveur(new Homme(),new A("-")));
							else{ 
								if(r<0.95)h.AjouterElMorgue(new Receveur(new Homme(),new B("+")));
								else{
									if(r<0.96)h.AjouterElMorgue(new Receveur(new Homme(),new B("-")));
									else{
										if(r<0.99)h.AjouterElMorgue(new Receveur(new Homme(),new AB("+")));
										else{ h.AjouterElMorgue(new Receveur(new Homme(),new AB("-")));}
									}
								}
							}
						}
					}
				}
			}
			else{
				if (r<0.36)h.AjouterElMorgue(new Donneur(new Femme(false),new O("+")));
				else{
					if(r<0.42)h.AjouterElMorgue(new Receveur(new Femme(true),new O("-")));
				
					else{
						if(r<0.79)h.AjouterElMorgue(new Receveur(new Femme(false),new A("+")));
					
						else{
							if(r<0.86)h.AjouterElMorgue(new Receveur(new Femme(false),new A("-")));
						
							else{
								if(r<0.95)h.AjouterElMorgue(new Receveur(new Femme(false),new B("+")));
							
								else{
									if(r<0.96)h.AjouterElMorgue(new Receveur(new Femme(false),new B("-")));
								
									else{
										if(r<0.99)h.AjouterElMorgue(new Receveur(new Femme(true),new AB("+")));
								
										else{ h.AjouterElMorgue(new Receveur(new Femme(false),new AB("-")));}
									}
								}
							}
						}
					}
				}
			}
		}
		h.Effectif();
			

		h.TriReceveurs();
		System.out.println("On affiche l'Hopital:      \n\n\n");
		h.Affiche_Hopital();
		h.BilanDePopulation();
		System.out.println("\n		Le Premier mois a l'Hopital:\n\n");
		
		for(int i=0; i<12;i++){
			System.out.println("\n\nMOIS "+i+"\n");
			h.Mois();
			h.Affiche_Hopital();
			h.BilanDePopulation();
			System.out.println("Nombre de Receveurs:"+h.getReceveurs().size()+"	;	 Nombre de Donneurs:"+h.getDonneurs().size()+"; 	Nombre de Personne a la morgue:		"+h.getDonneurs().size());
			System.out.println("__________________________________________________________________________________________________________________________");
		}
		for(Donneur d:h.getDonneurs()){
			d.vieillir();
			if (d.LimiteAnnuelleAtteinte())d.getGenre().reinitialise();
		}
		for(Receveur r:h.getReceveurs()){
			r.vieillir();
		}
		System.out.println("__________________________________________________________________________________________________________________________\n");
		System.out.println("Bilan de l'annee precedente:\n");
		System.out.println(h.AfficheListReceveurs()+"\n \n");
		System.out.println(h.AfficheListDonneurs());

		h.Effectif();
	}
}
