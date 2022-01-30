package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_1 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");
    
    private JButtonObserver observer_1;
    private JButtonObserver observer_2;
    private JButtonObserver observer_3;

    private TextArea contenu = new TextArea(30, 80);
 
    public IHMQuestion2_1() {
        super("IHM Question2_1");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        enHaut.setBackground(Color.blue);
        setLocation(100,100);
        pack();show();

        observer_1 = new JButtonObserver("jbo1",contenu);
        observer_2 = new JButtonObserver("jbo2",contenu);
        observer_3 = new JButtonObserver("jbo3",contenu);
        
        ActionListener action_listener_1 = observer_1.new Click();
        ActionListener action_listener_2 = observer_2.new Click();
        ActionListener action_listener_3 = observer_3.new Click();
        
        // le bouton A a 3 observateurs jbo1, jbo2 et jbo3
        boutonA.addActionListener(action_listener_1);
        boutonA.addActionListener(action_listener_2);
        boutonA.addActionListener(action_listener_3);
        
        // le bouton B a 2 observateurs jbo1 et jbo2
        boutonB.addActionListener(action_listener_1);
        boutonB.addActionListener(action_listener_2);
        
        // le bouton C a 1 observateur jbo1
        boutonC.addActionListener(action_listener_1);

      
    }
    
    public static void main(String[] args){
        new IHMQuestion2_1();
    }

}
