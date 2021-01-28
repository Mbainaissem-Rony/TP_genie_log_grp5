
public class Ville {
//Variables publiques qui comptent les instances
	protected static int nombreInstance;
//Variables publiques qui comptent les instances
	protected static int nombreInstacesBiss ;

// stock le nom de notre ville
	protected String nomVille;
// stock le nom du pays de notre ville
	protected String nomPays;
// stock le nombre d'habitant de notre ville
	protected int nombreHabitants;
//stock la cathegorie d'une ville 
	protected char categorie;
// constructeur par defaut
	
public Ville() {
System.out.println("Création d'une ville");
nombreInstance++;
nombreInstacesBiss++;
nomVille = "inconnu";
nomPays = " inconnu";
nombreHabitants = 0;
this.SetCategorie();
}
//constructeur avec paramètre
public Ville(String Pnom, String Ppays, int PnbrH)
{
System.out.println("Création d'une ville avec paramètre!");
nombreInstance++;
nombreInstacesBiss++;
nomVille = Pnom;
nomPays = Ppays;
nombreHabitants = PnbrH;
this.SetCategorie();
 
}
public static int getnombreInstacesBiss() {
	return nombreInstacesBiss;
}

//retourne le nom de la ville
public String getNom() {
	return nomVille;
}
//retourne le nom du pays
public String getPays() {
	return nomPays;
}
//retourne le nombre d'habitant
public int getHabitant() {
	return nombreHabitants;
}	
public char getCategorie(){
	return categorie;
}
//*******MUTATEURS********
//définit le nom de la ville
public void setNom(String Pnom) {
	nomVille=Pnom;
}
//définit le nom du pays
public void setPays(String Ppays) {
	nomPays=Ppays;
}
//définit le nom de la ville
public void setHabitant(int PnbrH) {
	nombreHabitants=PnbrH;
	this.SetCategorie();
}
private void SetCategorie(){
	int borneSuperieurs[] = {0, 100,1000, 10000,100000, 500000,1000000, 5000000, 100000000 };
	char categories []= {'?', 'A', 'B', 'C', 'D','E', 'F','G','H'};
	int i =0;
	while (i<borneSuperieurs.length && this.nombreHabitants>borneSuperieurs[i])
		i++;
	this.categorie = categories[i];
}
// retoune la description de la ville
public String decriToi() {
	return "\t"+this.nomVille + " est une ville de " + this.nomPays + " elle comporte :" + this.nombreHabitants + " habitant(s) => elle est donc de catégorie : " + this.categorie;

}
public String comparer(Ville ville1) {
	String str= new String();
	if (ville1.getHabitant() > this.nombreHabitants)
		str = ville1.getNom() +" est une ville plus peuplée que " + this.nomVille ;
	else
		str = this.nomVille + " est plus peuplée que la ville de " + ville1.getNom();
	return str;	
}

}

