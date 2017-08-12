package com.pattern.core.proxyanddecorator;

public class RealSkill implements SkillInterface {

    private String fileName;

    public RealSkill(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void getSkill() {
        System.out.println("Speed=25" + fileName);
    }

}
