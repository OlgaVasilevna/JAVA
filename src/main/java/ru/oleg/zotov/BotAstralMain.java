package ru.oleg.zotov;



public class BotAstralMain  {
    public static void main(String[] args) {
        BotAstral botAstral = new BotAstral();
        int i= 0;
        while (i<100) {
            botAstral.move();
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

