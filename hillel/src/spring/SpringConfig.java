package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring.medieval.DamselRescuingKnight;
import spring.medieval.DamselRescuingQuest;
import spring.medieval.DragonSlayQuest;
import spring.soundSystem.CdPlayer;
import spring.soundSystem.YellowSubmarineCd;

/**
 * Created by APavlov on 28.12.2015.
 */
@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    //@Scope : beans also can be with Scope "singleton" or "prototype"
    public DamselRescuingKnight knight() {
        DamselRescuingKnight knight = new DamselRescuingKnight();
        //knight.setQuest(quest());
        return knight;
    }

    @Bean
    // @Primary
    public DamselRescuingQuest quest() {
        return new DamselRescuingQuest();
    }

    @Bean
    @Primary
    public DragonSlayQuest dragonSlayQuest() {
        return new DragonSlayQuest();
    }
    /*
     @Bean
    YellowSubmarineCd yellowSubmarineCd(){
         return new YellowSubmarineCd();
     }

    @Bean
    CdPlayer cdPlayer(){
        return new CdPlayer(yellowSubmarineCd());
    }
    */
}
