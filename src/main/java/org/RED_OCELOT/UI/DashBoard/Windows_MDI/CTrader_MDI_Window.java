package org.RED_OCELOT.UI.DashBoard.Windows_MDI;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyVetoException;

public class CTrader_MDI_Window extends Generic_MDI_Window
{
    public CTrader_MDI_Window()
    {
        System.out.println("CTrader Server Started");
        Init();


    }

    void Init()
    {
        this.setTitle("CTrader Server");
        this.setMinimumSize(new Dimension(100,300));
        this.setBounds(100,100,500,600);

        //set Layout to MigLayout
        





    }

}
