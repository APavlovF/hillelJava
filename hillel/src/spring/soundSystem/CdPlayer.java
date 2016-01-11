package spring.soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by APavlov on 11.01.2016.
 */
@Component("sony")
@Scope("prototype")
//for every query will be created new object (with word "singleton" or by default it will be singleton)
public class CdPlayer {

    @Autowired(required = false)  //injection through private fields is not recommended
    private CD disc;

    /*
    @Autowired
    public CdPlayer(CD disc) {
        this.disc = disc;
    }
    */
    public void play() {
        disc.play();
    }
}
