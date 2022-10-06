# Don_du_Sang
Projet L2 - POBJ : réalisation d'une simulation de Donneur et Receveur de Sang dans un Hôpital

Ce programme est l'équivalent d’une banque de sang/organe dans un hôpital.
Il gère des arrays listes de donneurs, receveurs et personnes décédés.

Ainsi, le programme essaye de trouver des potentiels donneurs, de vérifier qu’ils sont chacun apte à donner (conditions physiques (poids,âge), santé, limite annuelle...) 
et compatible avec le receveur, le groupe sanguin, notamment. Le programme vérifie aussi le degré d’urgence pour les receveurs, il les classe selon leur priorité sur 
une échelle qui va de 0 à 6, 6 étant le cas le plus urgent.

Une fois que l'échange est fait, le programme actualise les données des personnes concernées ; les donneurs deviennent alors non apte à donner 
(pendant une durée de 2 mois pour un don de sang et de 6 pour une greffe de rein) et les receveurs se rétablissent ou meurent (selon le cas de la personne). 
Le programme traite également les aléas de la vie, par exemple en générant des améliorations ou des dégradations d’état de sujet quelconque.
Pour tester le bon fonctionnement du code, nous avons généré une année entière de gestion de don au sein de l'hôpital.
A la fin de l'exécution de chaque mois, le programme affiche si le nombre de Donneurs potentiels couvre les besoins de l'hôpital.

## Exécution 
Pour exécuter le code, il faut, après avoir récupérer le code, compiler et exécuter le fichier `Main.java`

