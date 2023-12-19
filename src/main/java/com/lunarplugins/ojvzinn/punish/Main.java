package com.lunarplugins.ojvzinn.punish;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Getter
    private static Main instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        sendMessage("O plugin inicializou com sucesso!");
    }

    @Override
    public void onDisable() {
        sendMessage("Salvando dados de forma permanente...");
    }

    public void sendMessage(String message) {
        Bukkit.getConsoleSender().sendMessage("[" + this.getDescription().getName() + "] §a" + message);
    }

    public void sendMessage(String message, Character color) {
        Bukkit.getConsoleSender().sendMessage("[" + this.getDescription().getName() + "] §" + color + message);
    }
}