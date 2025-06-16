package org.RED_OCELOT;

import org.RED_OCELOT.UI.Splash_Screen.Splash_Screen;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        init_Application();
    }


    public static void init_Application()
    {


        try
        {
            //Load the Splash screen
            java.awt.EventQueue.invokeLater(new Runnable()
            {
                JFrame Splash_Screen = null;

                @Override
                public void run()
                {
                    Splash_Screen = new Splash_Screen();

                }
            });

        }
        catch(Exception Startup_Exception)
        {
            throw new RuntimeException(Startup_Exception);
        }

    }
}