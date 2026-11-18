package com.behindqou.spear;

import com.behindqou.spear.modules.SpearKill;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class AddonTemplate extends MeteorAddon {
    public static final Category CATEGORY = new Category("Spear");

    @Override
    public void onInitialize() {
        Modules.get().add(new SpearKill());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.behindqou.spear";
    }
}
