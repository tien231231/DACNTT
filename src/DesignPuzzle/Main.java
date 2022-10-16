package DesignPuzzle;

public class Main{
    public static void main(String[] args) {
        Character king = new King();

        king.setWeapon(new SwordBehavior());
        king.fight();
        king.performWeapon();
        //This is a bit similar to "state mode"


    }
}