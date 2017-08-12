package com.pattern.runners;

import com.pattern.core.proxyanddecorator.BasketballPlayer;
import com.pattern.core.proxyanddecorator.FootballPlayer;
import com.pattern.core.proxyanddecorator.JuniorDecorator;
import com.pattern.core.proxyanddecorator.PlayerInterface;
import com.pattern.core.proxyanddecorator.ProxySkill;
import com.pattern.core.proxyanddecorator.RichDecorator;
import com.pattern.core.proxyanddecorator.SkillInterface;

public class PlayerRunner {

    public static void main(String[] args) {
        SkillInterface speedSkill = new ProxySkill("Skills.txt");
        speedSkill.getSkill();

        PlayerInterface basketball = new BasketballPlayer();
        basketball.writeoutProperties();
        System.out.println("");

        PlayerInterface richBasketball = new RichDecorator(new BasketballPlayer());
        richBasketball.writeoutProperties();
        System.out.println("");

        PlayerInterface juniorRichFootball = new JuniorDecorator(new RichDecorator(new FootballPlayer()));
        juniorRichFootball.writeoutProperties();
        System.out.println("");

    }

}
