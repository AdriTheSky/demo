package org.ap.birds.bo;

public class Penguin extends Bird implements CanSwim{

    @Override
    public void interfaceSwim() {
        System.out.println("I swim like BITCH !");
    }
}
