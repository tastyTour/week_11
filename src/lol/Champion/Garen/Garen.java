package lol.Champion.Garen;
import lol.Champion.Champion;

public class Garen extends Champion {
    @Override
    public void pick() {
        super.pick();
        System.out.println("가렌 - 내 검과 심장은, 데마시아의 것이다!");
    }

    public void q() {
        super.q();
        System.out.println("전진!");
    }

    public void w() {
        super.w();
        System.out.println("버텨라!");
    }

    public void e() {
        super.e();
        System.out.println("진형을 무너뜨려라!");
    }

    public void r() {
        super.r();
        System.out.println("정의를 위해!");
    }
}
