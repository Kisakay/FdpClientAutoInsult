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
        static Minecraft mc = Minecraft.getMinecraft();
        static EntityPlayerSP player = mc.thePlayer;

        public static void sendMessage(String value) {
                Minecraft minecraft = Minecraft.getMinecraft();

                String[] messages = {
                        "FeatherClient LOL TOO OP",
                        "%name% get it at feathermc . com",
                        "%name% has a trash client",
                        "FeatherClient killing your favourite server lmao",
                        "%name% noob go get FeatherClient",
                        "%name% NM$L for being legit",
                        "GET IT [feathermc . com]",
                        "FeatherClient > ALL",
                        "%name% was massacred by FeatherClient",
                        "FeatherClient was just born different",
                        "Support skidding by going to [feathermc . com]",
                        "The Best SKIDDER CLIENT GO NOW FeatherClient",
                        "What should I choose? FeatherClient or FeatherClient?",
                        "Want some skills? Check out feathermc . com",
                        "I need help, teach me how to play!",
                        "FeatherClient OP CHEETS LOL",
                        "We forgot to skid the s in skill",
                        "LAG! this server is so laggy!",
                        "get skill today by going to feathermc . com",
                        "im playing legit using feathermc . com",
                        "is it a bird? is it a plane? no its feather!",
                        "feather v5 > all",
                        "i Am ThE MoSt SkIlLeD iN tHiS GaMe",
                        "%name% eat some $h¡t",
                        "I have a good feather config, don't blame me",
                        "feather never dies",
                        "I am not racist, but I only like feather users. so git gut noobs",
                        "What should I choose? feather or feather?",
                        "I don't hack I just feather",
                        "sudo apt install skill",
                        "oops! clicked the wrong button",
                        "feather has risen",
                        "OH looks like i got banned for unfair advantage -tenebrous",
                        "I like pineapple on my pizza",
                        "we removed the s from spain",
                        "feather? HAX? skill!",
                        "feather > lunar",
                        "feather > badlion",
                        "I sometimes try to say bad things then this happens :(",
                        "im not hackin, im just using the force!",
                        "SkidderMC best skidders!",
                        "tbh just getfeather.today lmao"};

                Random random = new Random();

                String selectedMessage = messages[random.nextInt(messages.length)];
                String messageWithPlayerName = selectedMessage.replace("%name%", value);

                minecraft.thePlayer.sendQueue
                                .addToSendQueue(new C01PacketChatMessage("[FeatherClient] " + messageWithPlayerName));

        }

}
