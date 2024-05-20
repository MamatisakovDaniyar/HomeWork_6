public class Boss extends GameEntity{
    Weapon weapon ;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void printInfo(){
        System.out.println("Boss health: " + getHealth());
        System.out.println("Boss damage: " + getDamage());
        System.out.println(" Boss WeaponType: " + weapon.getWeaponType());
        System.out.println("Boss NameWeapon: " + weapon.getNameWeapons());

    }
}
