/*
2. Ecrire un programme "PassFile" permettant de générer un ficher contenant des mots de passe
Le programme demandera à l'utilisateur le nombre de mots de passe à produire
Un fichier passList.txt sera généré. Il contiendra autant de mots de passe 
qu'indiqué par l'utilisateur
*/


package PassFile;

import java.io.File;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
    
    
    System.out.println("veuillez saisir le nombre de mot de passe");
    String NbrPwd = Scanner.nextLine();
    Scanner sc=new Scanner(System.in);
    System.out.println("Nombre de mot passe saisis");
    



    /*System.out.println("veuillez saisir votre password");
    Scanner sc=new Scanner(System.in);
    String Login = sc.nextLine();
    System.out.println("Votre password");
    */

    import java.io.File;  // Import the File class
    import java.io.IOException;  // Import the IOException class to handle errors
    
    public class CreateFile {
      public static void main(String[] args) {
        try {
          File myObj = new File("filename.txt");
          if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
          } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
    }

    
}
}
