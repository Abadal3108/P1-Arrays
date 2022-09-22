package EX_02;

public class App {
    int resultado = 0;
    char array[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static void main(String[] args) {
        App app = new App();
        int dni = 24554527;
        app.resultado = dni % 23;
        System.out.println(app.resultado);
        char letra = app.letra();
        System.out.println(letra);
    }
    public char letra() {
        char letra = ' ';
         letra=array[resultado] ;
        return letra;
    }

}
