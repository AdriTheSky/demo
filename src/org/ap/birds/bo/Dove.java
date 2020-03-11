package org.ap.birds.bo;

public class Dove extends Bird implements CanFly{

    @Override
    public void interfaceFly() {

        System.out.println("I fly like a dove !");
    }
}
