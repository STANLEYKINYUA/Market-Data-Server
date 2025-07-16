package org.RED_OCELOT.UI.DashBoard.MDI_Windows.cTrader_Window;

import net.miginfocom.swing.MigLayout;
import org.RED_OCELOT.CORE.DATA_PARSERS.Renko_Median_Parser;
import org.RED_OCELOT.UI.DashBoard.MDI_Windows.Generic_MDI_Window;

import javax.swing.*;
import java.awt.*;

public class CTrader_MDI_Window extends Generic_MDI_Window
{

    cTrader_Start_Stop_Button Start_stop_Button;

    JLabel ServerPort_Label;
    JTextField Server_Port;

    JLabel lIGHTNING_Port_Label;
    JTextField LIGHTNING_Port;

    JTextArea Console;

    //Real time Parsing Switches
    JCheckBox Mr_4_pips ;
    JCheckBox Mr_6_pips ;
    JCheckBox Mr_8_pips ;
    JCheckBox Mr_10_pips ;
    JCheckBox Mr_12_pips ;
    JCheckBox Mr_14_pips ;


    //Initialize Parsing Engines
    Renko_Median_Parser MedianRENKO_Parser;

    public CTrader_MDI_Window()
    {
        System.out.println("CTrader Server Started");
        Init();

        //Initialize cTrader Data Parsing Engine


    }

    void Init()
    {
        this.setTitle("CTrader Server");
        this.setMinimumSize(new Dimension(100,300));
        this.setBounds(100,100,500,600);

        //set Layout to MigLayout
        this.setLayout(new MigLayout());

        //Add Start and Stop Buttons
        Start_stop_Button = new cTrader_Start_Stop_Button();
        this.add(Start_stop_Button,"span,wrap");

        //Add a Text Area for Output

        //Add TextBox for Server PortNumber
        ServerPort_Label = new JLabel("SERVER PORT");
        this.add(ServerPort_Label,"span");

        Server_Port = new JTextField();
        this.add(Server_Port,"span, wrap");


        lIGHTNING_Port_Label = new JLabel("SERVER PORT");
        LIGHTNING_Port = new JTextField();;

        //Add Checkbox Grid to Select Data to be parsed
        Mr_4_pips = new JCheckBox();
        Mr_6_pips = new JCheckBox();
        Mr_8_pips = new JCheckBox();
        Mr_10_pips = new JCheckBox();
        Mr_12_pips = new JCheckBox();
        Mr_14_pips = new JCheckBox();

        //Add Update Button so that updated timelines can be parsed






    }

    void Initialize_cTrader_Data_Parser_Engine()
    {
        //Initialize the Median Renko Parser
        MedianRENKO_Parser = new Renko_Median_Parser();

    }

}
