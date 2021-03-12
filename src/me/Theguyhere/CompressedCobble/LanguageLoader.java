package me.Theguyhere.CompressedCobble;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.libs.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class LanguageLoader {
    private final HashMap<String, String> translationMap = new HashMap<>();

    public LanguageLoader(Main plugin) {
        // Create directory locations
        File defaultLanguageFile = new File(plugin.getDataFolder(), "languages/en_US.yml");

        // Create default lang if it doesn't exist
        if (!defaultLanguageFile.exists()) {
            try {
                InputStream stream = plugin.getResource("en_US.yml");
                FileUtils.copyInputStreamToFile(stream, defaultLanguageFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String locale = plugin.getConfig().getString("locale");

        if (locale != null) {
            FileConfiguration translations = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(),
                    "languages/" + locale + ".yml"));
            for (String translation : translations.getKeys(false))
                translationMap.put(translation, translations.getString(translation));
        } else {
            FileConfiguration translations = YamlConfiguration.loadConfiguration(defaultLanguageFile);
            for (String translation : translations.getKeys(false))
                translationMap.put(translation, translations.getString(translation));
        }
    }

    public String get(String path) {
        return translationMap.get(path);
    }
}
