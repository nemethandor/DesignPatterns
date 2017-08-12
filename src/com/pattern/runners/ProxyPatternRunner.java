package com.pattern.runners;

import com.pattern.core.proxy.ImageInterface;
import com.pattern.core.proxy.ProxyDbData;
import com.pattern.core.proxy.ProxyImage;

public class ProxyPatternRunner {

    public static void main(String[] args) {
        ImageInterface image = new ProxyImage("testImage.jpg");
        ImageInterface image2 = new ProxyDbData("testImage.jpg");

        // image will be loaded from disk
        image.display();
        System.out.println("");

        // image will not be loaded from disk
        image.display();

        image2.display();
        System.out.println("");

        image2.display();
    }

}
