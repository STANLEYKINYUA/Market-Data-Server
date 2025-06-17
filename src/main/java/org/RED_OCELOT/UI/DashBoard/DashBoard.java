package org.RED_OCELOT.UI.DashBoard;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class DashBoard extends JFrame
{

    public DashBoard()
    {
        Init();

    }

    public void Init()
    {
        this.setLayout(new MigLayout());
        this.setBounds(10,30,1200,800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setTitle("Market Data Server");

        //Initialize Menus

    }
}
