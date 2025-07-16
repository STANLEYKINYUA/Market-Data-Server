package org.RED_OCELOT.UI.DashBoard.MDI_Windows;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class Generic_MDI_Window extends JInternalFrame
{

    public Generic_MDI_Window()
    {
        this.setClosable(true);
        this.setMaximizable(true);
        this.setIconifiable(true);  // Iconifiable allows Minimization
        this.setFocusable(true);
        this.setResizable(true);
        this.setLayout( new MigLayout());
        this.setVisible(true);

    }
}
