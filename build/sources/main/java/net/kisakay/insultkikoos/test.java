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


    static Minecraft mc = Minecraft.getMinecraft();
    static WorldClient world = mc.theWorld;

    public static void Aim() {
        if (Minecraft.getMinecraft().thePlayer == null) {
            return;
        }
        Minecraft minecraft = Minecraft.getMinecraft();

        if (minecraft.theWorld == null) {
            return;
        }

            Entity entity = getEnemy();

    }
    public static Entity getEnemy() {
        Entity entity = null;
        for (Object o : mc.theWorld.loadedEntityList) {
            if (o instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) o;
                String playerName = player.getName();
                float playerHealth = player.getHealth();
    
                if (!playerName.equals(Minecraft.getMinecraft().thePlayer.getName())) { 
                    if(playerHealth<=0 && deathMessageSent == false) {
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