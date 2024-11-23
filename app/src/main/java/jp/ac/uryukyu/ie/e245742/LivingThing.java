package jp.ac.uryukyu.ie.e245742;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    
    /**
     * キャラクターの名前を取得するメソッド。
     * @return キャラクターの名前
     */
    public String getName() {
        return name;
    }

    /**
     * キャラクターのHPを取得するメソッド。
     * @return キャラクターの現在のHP
     */
    public int getHitPoint() {
        return hitPoint;
    }

    /**
     * キャラクターの攻撃力を取得するメソッド。
     * @return キャラクターの攻撃力
     */
    public int getAttack() {
        return attack;
    }

    /**
     * キャラクターの死亡状態を取得するメソッド。
     * @return 死亡状態（true = 死亡, false = 生存）
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * キャラクターの名前を設定するメソッド。
     * @param name 設定する名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * キャラクターのHPを設定するメソッド。
     * @param hitPoint 設定するHP
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * キャラクターの攻撃力を設定するメソッド。
     * @param attack 設定する攻撃力
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * キャラクターの死亡状態を設定するメソッド。
     * @param dead 死亡状態（true = 死亡, false = 生存）
     */
    public void isDead(boolean dead) {
        this.dead = dead;
    }
    

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name キャラクター名
     * @param maximumHP キャラクターのHP
     * @param attack キャラクターの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(LivingThing opponen){
        if (dead) {
            return;
        }
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponen.getName(), damage);
        opponen.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }


}
