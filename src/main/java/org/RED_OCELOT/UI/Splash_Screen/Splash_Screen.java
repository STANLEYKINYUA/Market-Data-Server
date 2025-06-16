package org.RED_OCELOT.UI.Splash_Screen;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Splash_Screen extends JFrame
{
    JButton Start_Button = new JButton("START");
    JLabel Splash_Label = new JLabel("MARKET DATA SERVER");


    public Splash_Screen()
    {
        this.setLayout( new MigLayout());
        this.setVisible(true);
        this.setBounds(200,200,400,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Add JLabel
        this.add(Splash_Label,"span,wrap");
        Splash_Label.setVisible(true);

        //Add JButton
        Start_Button.setBounds(10,10,30,30);
        this.add(Start_Button,"span,wrap");
        Start_Button.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                //Mouse has been clicked :: Output
                System.out.println("Start Button Clicked");

                Display_DashBoard();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        Start_Button.setVisible(true);
    }



    void Display_DashBoard()
    {

        //todo print displaying dashboard

        //todo Display Dashboard

    }
}
