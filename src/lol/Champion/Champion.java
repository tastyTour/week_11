package lol.Champion;

import lol.Play.Play;

public class Champion extends Play {
    public int defult_attack = 1;

    protected void pick() {
        System.out.print("캐릭터를 선택하셨습니다. >> ");
    }

    protected void q() {
        System.out.print("q스킬을 사용하셨습니다. >> ");
    }

    protected void w() {
        System.out.print("w스킬을 사용하셨습니다. >> ");
    }

    protected void e() {
        System.out.print("e스킬을 사용하셨습니다. >> ");
    }

    protected void r() {
        System.out.print("r스킬을 사용하셨습니다. >> ");
    }
}
