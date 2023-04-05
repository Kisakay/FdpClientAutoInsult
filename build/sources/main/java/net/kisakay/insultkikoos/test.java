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
    // make an smooth aimbot
    public static boolean isAimbotting = false;
    public static boolean isSmoothAimbotting = true;
    public static boolean isSilentAimbotting = true;
    public static boolean isAimbottingFOV = true;

    // mc
    static Minecraft mc = Minecraft.getMinecraft();
    static EntityPlayerSP player = mc.thePlayer;
    static WorldClient world = mc.theWorld;

    public static void Aim() {
        if (Minecraft.getMinecraft().thePlayer == null) {
            return;
        }

        if (isAimbotting) {

            EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;
            WorldClient world = Minecraft.getMinecraft().theWorld;
            Entity entity = getEnemy();
            if (entity != null) {

                if (isSmoothAimbotting) {


                    if (mc.objectMouseOver != null && mc.objectMouseOver.typeOfHit == MovingObjectType.ENTITY) {

                    } else {
                        // make it smoother by the Smoothing slider
                        // mc.thePlayer.rotationYaw = (mc.thePlayer.rotationYaw + (yaw -
                        // mc.thePlayer.rotationYaw) / (speedy * 5));
                        // mc.thePlayer.rotationPitch = mc.thePlayer.rotationPitch + (pitch -
                        // mc.thePlayer.rotationPitch) / (speedy * 10);

                    }
                } 
            }
        }

    }

    public static Entity getEnemy() {

        Entity entity = null;

        // gest the closest entity in the fov and the specified range
        for (Object o : mc.theWorld.loadedEntityList) {
            if (o instanceof EntityLivingBase) {
                EntityLivingBase e = (EntityLivingBase) o;
                // if (e != mc.thePlayer && e.getDistanceToEntity(mc.thePlayer)) {

                // } else if (e.getDistanceToEntity(mc.thePlayer) <
                // entity.getDistanceToEntity(mc.thePlayer)) {

                    System.out.println(e);
            }

        }
        return entity;
    }

}