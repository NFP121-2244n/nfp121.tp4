package question2;

import java.awt.event.*;
import java.awt.TextArea;

/**
 * Décrivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class JButtonObserver {

    private String nom;
    private TextArea contenu;

    public String getNom(){
        return this.nom;
    }
    
    /**
     * Constructeur d'objets de classe JButtonObserver
     * 
     * @param nom
     *            le nom du bouton, jbo1, jbo2, jbo3, jmo1, jmo2, jmo3
     * @param contenu
     *            la zone de texte de l'applette
     */
    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    /**
     * affichage d'un message dans la zone de texte ce message est de la forme
     * observateur this.nom : clic du bouton nom_du_bouton exemple : observateur
     * jbo1 : clic du bouton A, voir la méthode getActionCommand()
     * 
     * @param à
     *            compléter
     */
    
    public class Click implements ActionListener{
        String observer_name = nom;
    
        public void actionPerformed(ActionEvent e) {
            String message = "Observer " + observer_name + " clicks button "; 
            
            if (e.getActionCommand() == "A") message += "A";
            else if (e.getActionCommand() == "B") message += "B";
                 else if (e.getActionCommand() == "C") message += "C";
                      else message = "";
                      
            contenu.append(message + "\n");
        }
    }
}

