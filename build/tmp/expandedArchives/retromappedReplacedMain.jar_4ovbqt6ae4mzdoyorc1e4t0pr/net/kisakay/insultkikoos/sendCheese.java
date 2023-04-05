package net.kisakay.insultkikoos;

import net.kisakay.insultkikoos.test;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraft.network.play.client.C01PacketChatMessage;
import org.lwjgl.Sys;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StringUtils;
import net.minecraft.world.World;
import net.kisakay.insultkikoos.sendCheese;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.CombatTracker;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class sendCheese {
        static Minecraft mc = Minecraft.func_71410_x();
        static EntityPlayerSP player = mc.field_71439_g;

        public static void sendMessage(String value) {
                Minecraft minecraft = Minecraft.func_71410_x();

                String[] messages = {
                        "FDPClient LOL TOO OP",
                        "%name% get it at fdpinfo.github.io",
                        "%name% has a trash client",
                        "FDPClient killing your favourite server lmao",
                        "%name% noob go get FDPClient",
                        "%name% NM$L for being legit",
                        "GET IT [fdpinfo.github.io]",
                        "FDPClient > ALL",
                        "%name% was massacred by FDPClient",
                        "FDPClient was just born different",
                        "Support skidding by going to [fdpinfo.github.io]",
                        "The Best SKIDDER CLIENT GO NOW FDPCLIENT",
                        "What should I choose? FDPClient or FDPClient?",
                        "Want some skills? Check out fdpinfo.github.io",
                        "I need help, teach me how to play!",
                        "FDPClient OP CHEETS LOL",
                        "We forgot to skid the s in skill",
                        "LAG! this server is so laggy!",
                        "get skill today by going to fdpinfo.github.io",
                        "im playing legit using fdpinfo.github.io",
                        "is it a bird? is it a plane? no its fdp!",
                        "FDP v5 > all",
                        "i Am ThE MoSt SkIlLeD iN tHiS GaMe",
                        "%name% eat some $h¡t",
                        "I have a good FDP config, don't blame me",
                        "FDP never dies",
                        "I am not racist, but I only like FDP users. so git gut noobs",
                        "What should I choose? FDP or FDP?",
                        "I don't hack I just FDP",
                        "sudo apt install skill",
                        "oops! clicked the wrong button",
                        "fdp has risen",
                        "OH looks like i got banned for unfair advantage -tenebrous",
                        "I like pineapple on my pizza",
                        "we removed the s from spain",
                        "FDP? HAX? skill!",
                        "fdp > lunar",
                        "fdp > badlion",
                        "I sometimes try to say bad things then this happens :(",
                        "im not hackin, im just using the force!",
                        "SkidderMC best skidders!",
                        "tbh just getfdp.today lmao"};

                Random random = new Random();

                String selectedMessage = messages[random.nextInt(messages.length)];
                String messageWithPlayerName = selectedMessage.replace("%name%", value);

                minecraft.field_71439_g.field_71174_a
                                .func_147297_a(new C01PacketChatMessage("[FDPCLIENT] " + messageWithPlayerName));

        }

}
