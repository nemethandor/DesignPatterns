package com.pattern.core.proxyanddecorator;

public class ProxySkill implements SkillInterface {

    private RealSkill realImage;
    private String fileName;

    public ProxySkill(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void getSkill() {
        if (realImage == null) {
            realImage = new RealSkill(fileName);
        }
        realImage.getSkill();
    }
}
