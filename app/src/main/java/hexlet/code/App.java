package hexlet.code;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        var app = getApp();
        app.start(getPort());
    }

    public static Javalin getApp() {

        Javalin app = Javalin.create(config ->
                config.bundledPlugins.enableDevLogging()
        );

        app.get("/", ctx -> ctx.result("Hello World"));

        return app;
    }

    public static int getPort() {
        String port = System.getenv().getOrDefault("PORT", "7071");
        return Integer.parseInt(port);
    }
}
