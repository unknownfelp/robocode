package filipecaio;

import robocode.*;

public class FilipeBot extends Robot {
    public void run() {
        while(true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }

    public void onHitByBullet(HitByBulletEvent e) {
        turnLeft(90);
        ahead(50);
    }
}
