package lol.Champion.Galio;
import lol.Champion.Champion;

public class Galio extends Champion {
    double attack(double char_attack, int defult_attack) {
        char_attack = 3;
        return char_attack * defult_attack;
    }

    @Override
    public void pick() {
        super.pick();
        System.out.println("갈리오 - 힘을 발휘할 시간이군!");
        System.out.println(defult_attack);
    }

    public void q() {
        super.q();
        System.out.println("바람을 느껴라!");
    }

    public void w() {
        super.w();
        System.out.println("어딜 가시려고!");
    }

    public void e() {
        super.e();
        System.out.println("한번 막아보시지!");
    }

    public void r() {
        super.r();
        System.out.println("안녕, 친구들!");
    }
}
