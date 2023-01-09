package de.hebk.menu.GUI;

import de.hebk.menu.GUI.Fragenlayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Joker{

    /**
     * Attribute
     */
    private StartGUI frame;
    private JPanel panel1;
    private JTextArea welchenJokerMoechtestDuTextArea;
    private JButton a5050Button;
    private JButton telefonjokerButton;
    private JButton publikumsjokerButton;
    private JButton zurueckButton;

    public Joker(StartGUI gui, int i) {
        this.frame = gui;
        frame.add(panel1);
        frame.setVisible(true);

        zurueckButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Zurueck Button Pressed");
                frame.remove(panel1);
                Fragenlayout fragen = new Fragenlayout(frame, i);
            }
        });
    }

    /**
     * Gibt das Panel zurück
     * @return Panel
     */
    private JPanel getPanel() {
        return panel1;
    }

}
