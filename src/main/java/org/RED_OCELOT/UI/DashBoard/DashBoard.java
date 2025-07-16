package org.RED_OCELOT.UI.DashBoard;

import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import org.RED_OCELOT.UI.DashBoard.MDI_Facilities.Desktop_Pane;
import org.RED_OCELOT.UI.DashBoard.MDI_Windows.cTrader_Window.CTrader_MDI_Window;

import javax.swing.*;
import java.awt.*;

public class DashBoard extends JFrame
{

   Desktop_Pane DesktopPane = new Desktop_Pane();

   CTrader_MDI_Window cTrader_Server;

    public DashBoard(){
        /** Initialize and set Window Parameters*/
        Init();


        //Initialize cTrader Server
        Init_CTrader_Server();
    }

    public void Init()
    {
        this.setTitle("Market Data Server - DASHBOARD");
        this.setFont(new Font(FlatRobotoMonoFont.FAMILY , Font.PLAIN, 12));
        this.setLayout(new BorderLayout());
        this.setBounds(10,30,1200,800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);
        this.setBackground(Color.black);


        //Add the Desktop Pane
        this.add(DesktopPane);
        //Initialize Menus

        //Set Full Screen
        GraphicsEnvironment GE = GraphicsEnvironment.getLocalGraphicsEnvironment();

        GraphicsDevice Graphics_Device = GE.getDefaultScreenDevice();

        /** Check whether we can be able to go Full screen */
        if(Graphics_Device.isFullScreenSupported())
        {
            System.out.println("Full Screen Supported = " + Graphics_Device.isFullScreenSupported());
            //Full Screen is Supported - go FullScreen

            try
            {
                //Graphics_Device.setFullScreenWindow(this);

                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.setVisible(true);
            }
            catch(Exception FullScreen_Exception)
            {
                FullScreen_Exception.printStackTrace();
            }

        }
        else
        {
            //Full Screen is not supported - Set to a generic Size
            this.setSize(1024,920);
        }

    }

    private void Init_CTrader_Server() {
        cTrader_Server = new CTrader_MDI_Window();
        DesktopPane.add(cTrader_Server);
        cTrader_Server.setVisible(true);

    }


}
