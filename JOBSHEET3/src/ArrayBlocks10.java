public class ArrayBlocks10 {
    public static void main(String[] args) {
        Blocks10[] blArray = new Blocks10[3];

        blArray[0] = new Blocks10(100, 30, 12);
        blArray[1] = new Blocks10(120, 40, 15);
        blArray[2] = new Blocks10(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume blocks - " + i + " : " + blArray[i].countVolume());
        }
    }
}
