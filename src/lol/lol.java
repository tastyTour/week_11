package lol;


import lol.Champion.Galio.Galio;
import lol.Champion.Garen.Garen;

public class lol {
    public static void main(String[] args) {
        Garen garen = new Garen();
        Galio galio = new Galio();
        garen.pick();
        galio.pick();
        garen.start2();
        garen.q();
        garen.e();
        galio.e();
        galio.w();
        galio.q();
        garen.r();

    }
}

