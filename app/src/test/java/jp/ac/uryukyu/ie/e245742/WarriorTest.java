package jp.ac.uryukyu.ie.e245742;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** 
 * AttackWithWeponSkill()の動作を確認するためのテスト。
 */
public class WarriorTest {
    @Test
    public void testAttackWithWeponSkill() {
    Warrior demoWarrior = new Warrior("戦士", 100, 10);
    Enemy demoEnemy = new Enemy("スライム", 60, 0);
    
    demoWarrior.attackWithWeponSkill(demoEnemy);
    assertEquals(45, demoEnemy.getHitPoint()); //60 - 10 * 1.5 = 45
    
    demoWarrior.attackWithWeponSkill(demoEnemy);
    assertEquals(30, demoEnemy.getHitPoint()); //45 - 10 * 1.5 = 30

    demoWarrior.attackWithWeponSkill(demoEnemy);
    assertEquals(15, demoEnemy.getHitPoint()); //30 - 10 * 1.5 = 15

    demoWarrior.attackWithWeponSkill(demoEnemy);
    assertEquals(0, demoEnemy.getHitPoint()); //15 - 10 * 1.5 = 0
    }
}

