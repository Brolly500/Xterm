public class Main {
    public static void main(String[] args) throws Exception {

        Xterm.clear();
        double x = Xterm.inputDouble("First number ");
        double y = Xterm.inputDouble("Second number ");
        double z = Xterm.inputDouble("Third number ");
        double k = (x+y+z)/3;
        Xterm.print(x+"", 7, 4);
        Xterm.print("\n");
        Xterm.print(y+"", 2, 3);
        Xterm.print("\n");
        Xterm.print(z+"", 0,6);
        Xterm.print("\n");
        Xterm.print(k+"", 1, 5);

    }
}