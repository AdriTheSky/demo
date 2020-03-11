package org.ap.birds.bo;

public class Duck extends Bird implements CanFly, CanSwim{

    @Override
    public void interfaceFly() {
        System.out.println("I fly like Donald");
    }

    @Override
    public void interfaceSwim() {
        System.out.println("I swim like ASSSSSS !");
    }
}
