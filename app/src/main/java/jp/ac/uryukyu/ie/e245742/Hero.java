package jp.ac.uryukyu.ie.e245742;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by hibiki2gou on 2024/11/23.
 */
public class Hero extends LivingThing {
    public Hero(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        
        if( getHitPoint() < 0 ) {
            isDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
