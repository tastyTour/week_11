package lol;


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

class Lol{
    String maker;

    void start2(){
        System.out.println("게임을 시작합니다.");
    }
}

class Champion extends Lol {
    int defult_attack = 1;

    void pick() {
        System.out.print("캐릭터를 선택하셨습니다. >> ");
    }

    void q() {
        System.out.print("q스킬을 사용하셨습니다. >> ");
    }

    void w() {
        System.out.print("w스킬을 사용하셨습니다. >> ");
    }

    void e() {
        System.out.print("e스킬을 사용하셨습니다. >> ");
    }

    void r() {
        System.out.print("r스킬을 사용하셨습니다. >> ");
    }
}

class Garen extends Champion {
    void pick() {
        super.pick();
        System.out.println("가렌 - 내 검과 심장은, 데마시아의 것이다!");
    }
    void q(){
        super.q();
        System.out.println("전진!");
    }
    void w(){
        super.w();
        System.out.println("버텨라!");
    }
    void e(){
        super.e();
        System.out.println("진형을 무너뜨려라!");
    }
    void r(){
        super.r();
        System.out.println("정의를 위해!");
    }
}

class Galio extends Champion{
    double attack(double char_attack, int defult_attack){
        char_attack = 3;
        return char_attack * defult_attack;
    }
    void pick() {
        super.pick();
        System.out.println("갈리오 - 힘을 발휘할 시간이군!");
        System.out.println(defult_attack);
    }
    void q(){
        super.q();
        System.out.println("바람을 느껴라!");
    }
    void w(){
        super.w();
        System.out.println("어딜 가시려고!");
    }
    void e(){
        super.e();
        System.out.println("한번 막아보시지!");
    }
    void r(){
        super.r();
        System.out.println("안녕, 친구들!");
    }
}