package com.bolivarsoft.components;

import java.io.File;
import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

public class LectorMetadataMenu {
	public MetadataMenu leer() {
        try {
            String jsonFile = FileUtils.readFileToString(
                    new File("C:/var/tmp/bolivarsoft/menu.json"),
                    "UTF-8"
            );
            MetadataMenu mm = new Gson().fromJson(jsonFile, MetadataMenu.class);
            return mm;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }
}
