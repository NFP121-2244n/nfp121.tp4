package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private JMouseObserver mouse_observer_1;
    private JMouseObserver mouse_observer_2;
    private JMouseObserver mouse_observer_3;
    
    private TextArea contenu = new TextArea(30, 80);
     
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);
        
        mouse_observer_1 = new JMouseObserver("jbo1",contenu);
        mouse_observer_2 = new JMouseObserver("jbo2",contenu);
        mouse_observer_3 = new JMouseObserver("jbo3",contenu);
        
        ActionListener listener_1 = mouse_observer_1.new Click();
        ActionListener listener_2 = mouse_observer_2.new Click();
        ActionListener listener_3 = mouse_observer_3.new Click();
        
        MouseListener mouse_listener_1 = mouse_observer_1.new Mouse();
        MouseListener mouse_listener_2 = mouse_observer_2.new Mouse();
        MouseListener mouse_listener_3 = mouse_observer_3.new Mouse();
        
        // le bouton A a 3 observateurs jbo1, jbo2 et jbo3
        boutonA.addActionListener(listener_1);
        boutonA.addActionListener(listener_2);
        boutonA.addActionListener(listener_1);
        
        //le bouton B a 2 observateurs jbo1 et jbo2
        boutonB.addActionListener(listener_1);
        boutonB.addActionListener(listener_2);

        // le bouton C a 1 observateur jbo1
        boutonC.addActionListener(listener_1);
       
        // le bouton A a 1 observateur jmo1
        boutonA.addMouseListener(mouse_listener_1);
        
        // le bouton B a 1 observateur jmo2
        boutonB.addMouseListener(mouse_listener_2);
        
        // le bouton C a 1 observateur jmo3
        boutonC.addMouseListener(mouse_listener_3);
       
    }
    
     public static void main(String[] args){
        new IHMQuestion2_1();
        new IHMQuestion2_2();
    }

}
