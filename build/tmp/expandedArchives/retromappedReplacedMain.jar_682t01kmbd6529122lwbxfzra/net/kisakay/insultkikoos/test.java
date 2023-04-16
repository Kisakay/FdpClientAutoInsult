package net.kisakay.insultkikoos;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;

//math
import java.lang.Math;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class test {
    public static boolean isAimbotting = true;
    public static boolean deathMessageSent = false;


    static Minecraft mc = Minecraft.func_71410_x();
    static WorldClient world = mc.field_71441_e;

    public static void Aim() {
        if (Minecraft.func_71410_x().field_71439_g == null) {
            return;
        }
        Minecraft minecraft = Minecraft.func_71410_x();

        if (minecraft.field_71441_e == null) {
            return;
        }

            Entity entity = getEnemy();

    }
    public static Entity getEnemy() {
        Entity entity = null;
        for (Object o : mc.field_71441_e.field_72996_f) {
            if (o instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) o;
                String playerName = player.func_70005_c_();
                float playerHealth = player.func_110143_aJ();
    
                if (!playerName.equals(Minecraft.func_71410_x().field_71439_g.func_70005_c_())) { 
                    if(playerHealth<=2 && deathMessageSent == false) {
                            sendCheese.sendMessage(playerName);
                            deathMessageSent = true;
                            return entity;
                    }
                    if(playerHealth<=0 && deathMessageSent == true) {
                        deathMessageSent = true;
                        return entity;
                    }else{
                        deathMessageSent = false;
                        return entity;
                    }
                }
            }
        }
        return entity;
    }

}