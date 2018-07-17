package appletsPackage;

import java.applet.*;
import java.awt.*;

/*
<applet code="appletsPackage.Banner" width=300 height=50>
</applet>
 */

public class Banner extends Applet implements Runnable {
    String msg = " Java rules the Web ";
    Thread t;
    boolean stopFlag;

    @Override
    public void init() {
        t = null;
    }

    @Override
    public void start() {
        t = new Thread(this);
        stopFlag =false;
        t.start();
    }

    @Override
    public void run() {
        for ( ; ; ){
            try {
                repaint();
                Thread.sleep(250);
                if (stopFlag)
                    break;
            } catch (InterruptedException exc){
                System.out.println(exc);
            }
        }
    }

    @Override
    public void stop() {
        stopFlag = true;
        t = null;
    }

    @Override
    public void paint(Graphics g) {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
