public class Blocks10 {
    public int width, length, height;

    public Blocks10(int p, int l, int t) {
        length = p;
        width = l;
        height = t;
    }

    public int countVolume(){
        return  length*width*height;
    }
}
