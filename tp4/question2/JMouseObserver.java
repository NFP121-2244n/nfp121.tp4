package question2;

import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.TextArea;

/**
 * Décrivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class JMouseObserver { // à compléter

    private String nom;
    private TextArea contenu;

    /**
     * Constructeur d'objets de classe JButtonObserver
     */
    public JMouseObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }
    
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
    
    public class Mouse implements MouseListener{
        public void mouseClicked(MouseEvent e) {
        }
       
        /**
         * affichage d'un message dans la zone de texte ce message est de la forme
         * observateur this.nom : souris entrée en (X,Y) exemple : observateur jmo1
         * : souris entrée en (15,20)
         * 
         * @param
         */
        public void mouseEntered(MouseEvent e) {
            String name = nom;
            String message = name + " mouse on (" + e.getX() + "," + e.getY() + ")";
            contenu.append(message + "\n");
        }
    
        public void mouseExited(MouseEvent e) {}
    
        public void mousePressed(MouseEvent e) {}
    
        public void mouseReleased(MouseEvent e) {}
    
    }       
}
