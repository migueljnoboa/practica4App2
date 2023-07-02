package org.example;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {

            // Configuracion de static files
            config.staticFiles.add(staticFileConfig -> {
                staticFileConfig.hostedPath = "/";
                staticFileConfig.directory = "/public";
                staticFileConfig.location = Location.CLASSPATH;
                staticFileConfig.precompress = false;
                staticFileConfig.aliasCheck = null;
            });
        });

        // Iniciando en el Puerto 7000
        app.start(7002);


        app.get("/", ctx -> ctx.result("App2"));
    }
}