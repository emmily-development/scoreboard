package team.unnamed.scoreboard.platform;

import team.unnamed.scoreboard.BoardHandler;

import java.lang.reflect.Constructor;

import static team.unnamed.bukkit.ServerVersion.VERSION_STRING;

public class BoardHandlerFactory {

    private static final Constructor<?> BOARD_HANDLER_CONSTRUCTOR;
    private static final String CLASS_NAME_FORMAT = "team.unnamed.scoreboard.platform.v%s.BoardHandler_v%s";

    static {
        try {
            BOARD_HANDLER_CONSTRUCTOR = Class
                .forName(String.format(
                    CLASS_NAME_FORMAT,
                    VERSION_STRING,
                    VERSION_STRING
                ))
                .getConstructor();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException("Your server version (" + VERSION_STRING + ")" +
                " is not supported by unscoreboard!");
        }
    }

    public static BoardHandler createHandler() {
        try {
            return (BoardHandler) BOARD_HANDLER_CONSTRUCTOR.newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("unscoreboard is unable to create a BoardHandler instance: " + e);
        }
    }
}
