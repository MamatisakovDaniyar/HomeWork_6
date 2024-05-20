public class Skeleton extends Boss{
    int NumberOfBullets;

    public int getNumberOfBullets() {
        return NumberOfBullets;
    }

    public void setNumberOfBullets(int numberOfBullets) {
        NumberOfBullets = numberOfBullets;
    }
    public void printInfo(){
        System.out.println("NumberOfBullets: "+NumberOfBullets);

    }
}
