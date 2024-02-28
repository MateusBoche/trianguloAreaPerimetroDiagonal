import Entidades.Triangulo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        Triangulo triangulo = new Triangulo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a largura e altura do triangulo: ");
        triangulo.altura = scanner.nextDouble();
        triangulo.largura = scanner.nextDouble();

        System.out.println("area: "+ triangulo.area());
        System.out.println("Perimetro: " + triangulo.perimetro());
        System.out.println("Diagonal: "+ triangulo.diagonal());

    }
}