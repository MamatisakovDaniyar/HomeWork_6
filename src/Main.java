//        Создайте перечисление WeaponType, в котором перечислите три типа оружия
//        Создайте класс Weapon с приватными полями для хранения типа оружия и названия оружия,
//        а также добавьте методы доступа (геттеры и сеттеры) к этим полям.
//        Создайте класс GameEntity для представления игровых сущностей, выделив общие поля,
//        присущие как боссам, так и героям, и добавьте методы доступа к этим полям.
//        Создайте класс Boss, который наследуется от GameEntity,
//        и добавьте в него поле сложного типа Weapon (для назначения оружия боссу), а также методы доступа к этому полю.
//        В классе Main создайте экземпляр босса и установите ему все необходимые свойства.
//        Реализуйте метод printInfo() в классе Boss для печати информации о боссе.
//        Создайте класс Skeleton, который также наследуется от класса Boss.
//        Добавьте в класс Skeleton поле для хранения количества стрел и методы доступа к этому полю.
//        Переопределите метод printInfo() в классе Skeleton.
//        В методе main создайте и заполните данными два экземпляра Skeleton,
//        а затем выведите всю информацию о скелетах.

public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(300);
        boss.setDamage(50);
        Weapon FireArms = new Weapon(WeaponType.ChemicalWeapon, "Газ: ");
        FireArms.setWeaponType(WeaponType.SteelArms);
        FireArms.setNameWeapons("Ак47: ");
        boss.setWeapon(FireArms);
        boss.printInfo();



                Weapon skeletonWeapon1 = new Weapon(WeaponType.FireArms, "Ак47: ");
                Skeleton skeleton1 = new Skeleton();
                skeleton1.setHealth(300);
                skeleton1.setDamage(23);
                skeleton1.setWeapon(skeletonWeapon1);
                skeleton1.setNumberOfBullets(30);
                skeleton1.printInfo();

                Weapon skeletonWeapon2 = new Weapon(WeaponType.SteelArms," Нож: ");
                Skeleton skeleton2 = new Skeleton();
                skeleton2.setHealth(100);
                skeleton2.setDamage(37);
                skeleton2.setWeapon(skeletonWeapon2);
                skeleton2.setNumberOfBullets(15);
                skeleton2.printInfo();

            }

}
