
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (Richards)
 */
import java.util.Scanner ;
class Valide
{
    public static void main(String[] args) {
		System.out.println("jfpgjopiojzfojsefgljndvijhhuihvbguqevupiobojwnfdqhfjhv");
	}
    public static boolean estBissextile(int annee){
        if(annee%100==0 && annee%400 != 0){
            return false;
        }
        if(annee%4==0){
            return true;
        }
        return false;
    }

    public static int nbJour(int annee, int mois){
        if(mois == 2){
            if(estBissextile(annee)){
                return 29;
            }
            else{
                return 28;
            }
        }
        else{
            if(mois == 1 || mois == 3 || mois == 5|| mois == 7|| mois == 8|| mois == 10|| mois == 12){
                return 31;
            }
            else{
                return 30;
            }

        }
    }

    public static boolean estValide(int jour, int mois, int annee){
        if(annee>1582 && jour >=1 && jour <= nbJour(annee,mois) && mois >= 1 && mois <=12){
            return true;
        }
        return false;
    }

    public static void saisieCalculAffichageValidite() {

        System.out.println("Saisir le jour");
        Scanner clavier = new Scanner(System.in) ;
        int jour = clavier.nextInt() ;
        System.out.println("Saisir le mois");
        Scanner clavier1 = new Scanner(System.in) ;
        int mois = clavier.nextInt() ;
        System.out.println("Saisir le jour");
        Scanner clavier2 = new Scanner(System.in) ;
        int annee = clavier.nextInt() ;
        if(estValide(jour,mois,annee)){
            System.out.println("Le "+jour+"/0"+mois+"/"+annee+" est bien Valide");
        }
        else{
            System.out.println("Le "+jour+"/0"+mois+"/"+annee+" n'est pas valide");
        }

    
    }
}
