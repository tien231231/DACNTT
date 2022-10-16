package DesignPuzzle;

public abstract class Character{
    WeaponBehavior weapon;
    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }


    public void performWeapon() {

        weapon.useWeapon();

    }

    public abstract void fight();

}
