package ru.oleg.zotov;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BotAstral {
    private Robot robot;
    private int delay;
    private BufferedImage img;
    BotAstral()  {
        try {
            robot = new Robot();
            img = ImageIO.read(new File("C:\\Users\\oleg\\Desktop\\result.png"));
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void mouseClick(){
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(250);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(250);
    }

    void prtscr(){
        BufferedImage image = robot.createScreenCapture(new Rectangle(850,690,30,20));
        for (int i=0;i<img.getWidth();i++){
            for (int j=0;j<img.getHeight();j++){
                if (img.getRGB(i,j)!=image.getRGB(i,j)){
                    return;
                }
            }
        }
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.mouseMove(865,703);
        mouseClick();

    }

    void move(){
        robot.mouseMove(934,695);
        mouseClick();
        robot.delay(250);
        robot.mouseMove(1327,695);
        mouseClick();
        robot.delay(2000);
        robot.mouseMove(1060,695);
        mouseClick();
        robot.delay(250);
        robot.mouseMove(766,639);
        mouseClick();
        robot.delay(250);
        prtscr();

    }
}
