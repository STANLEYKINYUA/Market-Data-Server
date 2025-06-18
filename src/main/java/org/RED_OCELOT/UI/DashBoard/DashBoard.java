package org.RED_OCELOT.UI.DashBoard;

import net.miginfocom.swing.MigLayout;
import org.RED_OCELOT.UI.DashBoard.MDI_Facilities.Desktop_Pane;

import javax.swing.*;

public class DashBoard extends JFrame
{

    Desktop_Pane Desktop_Pane = new Desktop_Pane();

    public DashBoard()
    {
        /** Initialize and set Window Parameters*/
        Init();

        //TODO Add the JDesktop Pane as a Singleton
        //TODO Add the Menu Bar


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
