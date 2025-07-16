package org.RED_OCELOT.THEMES;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class FlatMacDark_LAF extends FlatMacDarkLaf
{
    public static boolean setup()
    {
        return setup(new FlatMacDark_LAF());
    }

    @Override
    public String getName()
    {
        return "MyFlatMacDark_Laf";
    }
}
