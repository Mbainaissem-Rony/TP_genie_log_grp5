
public class ClasseMain {

	public static void main(String[] args) {

System.out.println(""""""""PRESENTATION DES PAYS AU CAMEROUN""""""""");
System.out println(--------------------------------------------------);
Système.out.println("""""""”""""""""""""""""""""'''''''''''%%%%%%"""");
		pitale yaoundé = new Capitale();
Ville ville = new Ville();
Ville ville1 = new Ville ("Ngoundéré", "Cameroun", 19000000);
Ville ville2 = new Ville("Ndjamena", "Tchad", 25000000);
System.out.println(" \n ville = " +ville.getNom() + " est une ville du " + ville.getPays() + " de " + ville.getHabitant()+" habitants");
System.out.println("\n ville1 = " +ville1.getNom()+ " est une ville du " + ville1.getPays() + " de " +ville1.getHabitant()+ " habitants");
System.out.println("\n ville2 = " +ville2.getNom()+ " est une ville du " + ville2.getPays() + " de " +ville2.getHabitant()+ " habitants");
// échangeons les données des villes 1 et 2 par l'intermediaire de l'objet temps
Ville temps = new Ville();
temps = ville1;
ville1 = ville2;
ville2 = temps;
System.out.println(" \n ville = "+ville.getNom() + " est une ville du " + ville.getPays() + " de " + ville.getHabitant()+" habitants");
System.out.println("\n ville1 = " +ville1.getNom()+ " est une ville du " + ville1.getPays() + " de " +ville1.getHabitant()+ " habitants");
System.out.println("\n ville2 = " +ville2.getNom()+ " est une ville du " + ville2.getPays() + " de " +ville2.getHabitant()+ " habitants");
/* Nous allons maintenant interchanger
 *  leurs noms cette fois par
 *   le biais de leurs mutateurs. */ 
ville1.setNom("Moundou");
ville2.setNom("Garoua");
System.out.println(" \n ville = " +ville.getNom() + " est une ville du " + ville.getPays() + " de " + ville.getHabitant()+" habitants");
System.out.println("\n ville1 = " +ville1.getNom()+ " est une ville du " + ville1.getPays() + " de " +ville1.getHabitant()+ " habitants");
System.out.println("\n ville2 = " +ville2.getNom()+ " est une ville du " + ville2.getPays() + " de " +ville2.getHabitant()+ " habitants");
System.out.println(ville.decriToi());
System.out.println(ville1.decriToi());
System.out.println(ville2.decriToi());
System.out.println(ville2.comparer(ville1));
System.out.println("Le nombre d'instances de la classe Ville est : " + ville1.nombreInstance);   
System.out.println("Le nombre d'instances de la classe Ville est : " + ville1.getnombreInstacesBiss());                        
System.out.println(yaoundé.decriToi());
	}
		}


