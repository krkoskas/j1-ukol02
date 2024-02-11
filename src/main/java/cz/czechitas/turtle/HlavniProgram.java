package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //nakresliKruznici(40, 100);
        //nakresliObdelnik(50, 90);

        nakresliKruznici(40, 70);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(25);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliRovnostrannyTrojuhelnik(140);
        zofka.penUp();

        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliKruznici(20, 20);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKruznici(40, 50);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKruznici(20, 20);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(50+80);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruznici(40, 80);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(80+100+30);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruznici(20, 30);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(350+90);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliObdelnik(150,110);
        nakresliKruznici(40, 55);
        zofka.turnLeft(90);
        nakresliObdelnik(160,75);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(55);
        zofka.turnRight(90);
        zofka.move(55);
        zofka.penDown();
        nakresliKruznici(20, 24);
        zofka.penUp();
        zofka.move(65);
        zofka.penDown();
        nakresliKruznici(20, 24);
        zofka.penUp();
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(24);
        zofka.penDown();
        nakresliPravouhlyTrojuhelnik(75);



    }

    public void nakresliRovnostrannyTrojuhelnik(double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(120.0);
        }
    }

    public void nakresliPravouhlyTrojuhelnik(int delkaOdvesny) {
        var delkaPrepony = Math.sqrt(2*Math.pow(delkaOdvesny, 2));
        zofka.move(delkaOdvesny);
        zofka.turnLeft(135);
        zofka.move(delkaPrepony);
        zofka.turnLeft(135);
        zofka.move(delkaOdvesny);
    }

    public void nakresliCtverec(double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    public void nakresliObdelnik (double delkaA, double delkaB) {
        for (int i = 0; i<2; i++) {
            zofka.move(delkaA);
            zofka.turnRight(90);
            zofka.move(delkaB);
            zofka.turnRight(90);
        }
    }

    public void nakresliKruznici (int pocetTahu, int polomer) {
        var uhelZmeny = 360/pocetTahu;
        var delkaTahu = (2*Math.PI*polomer)/pocetTahu;
        for (int i = 0; i < pocetTahu; i++) {
            zofka.turnRight(uhelZmeny);
            zofka.move(delkaTahu);
        }
    }
}
