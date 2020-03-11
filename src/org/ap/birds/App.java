package org.ap.birds;
import org.ap.birds.bo.*;

public class App {

    public static void main(String[] args) {

        Bird[] tabBirds = new Bird[10];
        tabBirds[0] = new Penguin();

        CanFly[] tabsF = new CanFly[2];
        tabsF[0] = new Duck();
        tabsF[1] = new Dove();
        /** (int i = 0; i<tabsF.length; i++) **/
        for (CanFly item : tabsF) {
            item.interfaceFly();
        }

        CanSwim[] tabsS = new CanSwim[2];
        tabsS[0] = new Duck();
        tabsS[1] = new Penguin();
        /** (int i = 0; i<tabsS.length; i++) **/
        for (CanSwim item : tabsS) {
            item.interfaceSwim();
        }
    }
}
