public class Weapon {
    private   WeaponType WeaponType;
 private String NameWeapons = ("нож, Ак47, Газ ");

    public Weapon(WeaponType type, String name) {
        this.WeaponType= type;
        this.NameWeapons = name;
    }





    public WeaponType getWeaponType() {
        return WeaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        WeaponType = weaponType;
    }

    public String getNameWeapons()
    {
        return NameWeapons;
    }

    public void setNameWeapons(String nameWeapons) {
        NameWeapons = nameWeapons;
    }
}
