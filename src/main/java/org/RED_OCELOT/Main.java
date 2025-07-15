package org.RED_OCELOT;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.fonts.jetbrains_mono.FlatJetBrainsMonoFont;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import org.RED_OCELOT.THEMES.*;
import org.RED_OCELOT.UI.Splash_Screen.Splash_Screen;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("BUILD SUCCESS!!");

        //Install FlatLaf Fonts
        Install_Flatlaf_Fonts();

        //Load the UI before other things
        init_Application();
    }


    public static void init_Application()
    {
        //Initialize FlatLaff= and Set Theme
        String Theme_to_Install="";

        Install_FlatLaf_and_Set_Theme(Theme_to_Install);

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

    //Add FlatLaf Support

    //Add FlatLaf Support
    static void Install_FlatLaf_and_Set_Theme(String Theme_to_Set)
    {
        //Create a block to catch exceptions.
        try
        {
            //set the theme variable.
            String Theme = Theme_to_Set;

            //Select Appropriate Theme and Set it.
            //CARBON LAF
            if(Theme == "Carbon")
            {
                //Set Carbon as the Look and Feel.
                FlatCarbonIJTheme.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
                Carbon_Laf.setup();
            }
            //DarkPurple LAF
            if(Theme == "DarkPurple_LAF")
            {
                //Set DarkPurple_LAF as the Look and Feel.
                FlatDarkPurpleIJTheme.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
                DarkPurple_Laf.setup();
            }
            //FlatDark LAF
            if(Theme == "FlatDark_LAF")
            {
                //Set FlatDark_LAF as the Look and Feel.
                FlatDarkLaf.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
                FlatDark_Laf.setup();
            }
            //FlatLight LAF
            if(Theme == "FlatLight_LAF")
            {
                //Set FlatLight_LAF as the Look and Feel.
                FlatLightLaf.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
                FlatLight_Laf.setup();
            }
            //FlatMacDark_LAF LAF
            if(Theme == "FlatMacDark_LAF")
            {
                //Set Flat MacDark_LAF as the Look and Feel.
                FlatMacDarkLaf.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
                FlatMacDark_LAF.setup();

            }
            //FlatMacLight_LAF LAF
            if(Theme == "FlatMacLight_LAF")
            {
                //Set FlatMacLight_LAF as the Look and Feel.
                FlatMacLightLaf.registerCustomDefaultsSource("");
                FlatMacLight_LAF.setup();
            }


            //TODO      Remove this and use Config File


            //  Using FLATMACDark so that I can continue development
            //FlatMacDarkLaf.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
            //FlatMacDark_LAF.setup();

            //Prefer FlatLight Laf
            FlatMacLight_LAF.registerCustomDefaultsSource("Themes");
            FlatMacLight_LAF.setup();

            // DarkPurple_Laf.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
            //DarkPurple_Laf.setup();

            //Carbon_Laf.registerCustomDefaultsSource("GENERAL_SYSTEMS.THEMES");
            //Carbon_Laf.setup();

        }
        catch(Exception Theme_Install_Failed_Exception)
        {
            //TODO  Write to Log File.
            //TODO  Proper exception Handling with a window and more logging
            Theme_Install_Failed_Exception.printStackTrace();
        }

    }

    //Install FlatLaf Fonts
    static void Install_Flatlaf_Fonts()
    {
        try
        {
            //Install the Fonts
            FlatRobotoMonoFont.install();
            FlatRobotoFont.install();
            FlatInterFont.install();
            FlatJetBrainsMonoFont.install();

        }
        catch(Exception Flatlaf_FONTS_Install_exception)
        {
            //TODO Log Properly this exception
            Flatlaf_FONTS_Install_exception.printStackTrace();

        }

    }
}