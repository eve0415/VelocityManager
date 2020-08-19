package net.eve0415.spigot.VelocityManager;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

import org.slf4j.Logger;

@Plugin(id = "velocitymanager", name = "VelocityManager", version = "1.0-SNAPSHOT", description = "Manager for Velocity", authors = "eve0415")
public class VelocityManager {
    @Inject
    private ProxyServer server;
    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInit(ProxyInitializeEvent e) {
        server.getCommandManager().register(new ServerCommand(server), "server");
        logger.info("VelocityManager enabled");
    }
}