import ui.custom.frame.MainFrame;
import ui.custom.panel.MainPanel;
import ui.custom.screen.MainScreen;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class UIMain {
    public static void main(String[] args) {
        final var gameConfig = Arrays.stream(args)
                .map(arg -> arg.split(";"))
                .collect(Collectors.toMap(
                        arr -> arr[0],
                        arr -> arr[1]));
        var mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();
    }
}
