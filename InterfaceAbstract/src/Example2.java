// 게임 캐릭터 (추상 클래스)
abstract class Character{
    String name;
    int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public final void takeDamage(int amount){
        hp = hp - amount;
        System.out.println(name+"은 " + amount+"의 데미지를 받음! "+" 남은 생명력: "+ hp);
    }
    abstract void doAction(); // 추상 메서드
}
// 기능 인터페이스 : 근접 공격
interface MeleeAttacker {
    void meleeAttack(Character target);

}
interface MagicCaster {
    void magicCast(Character target);
}

// 전사
class Warrior extends Character implements MeleeAttacker {
    public Warrior(String name, int hp) {
        super(name, hp);  // 부모에게 기본생성자가 없기 때문에 선택지를 안주고 바로 생성
    }

    @Override
    public void doAction() {
        System.out.println("전사는 근접 공격");
    }

    @Override
    public void meleeAttack(Character target) {
        System.out.println(name+ " 이(가) "+ target.name +"을 공격");
        target.takeDamage();
    }
}
// 마법사
class Mage extends Character implements MagicCaster{
    public Mage(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void doAction() {
        System.out.println("마법사는 원거리 공격");
    }

    @Override
    public void magicCast(Character target) {

    }
}

public class Example2 {
    public static void main(String[] args) {

    }
}
