public class KrystalCreateEvenOddArray {
    public static void main(String [] args) {
        //make object
        EvenArray evenA = new EvenArray();
        OddArray oddA = new OddArray();

        //set even array
        evenA.setEvenArray();

        //print out odd array in rows with spaces in between
        oddA.printAnArray(oddA.changeToOdd(evenA.getEvenArray()));
    }
}
