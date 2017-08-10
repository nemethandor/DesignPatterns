package com.pattern.runners;

import com.pattern.core.abstractfactory.AbstractWidgetFactory;
import com.pattern.core.abstractfactory.GUIBuilder;
import com.pattern.core.abstractfactory.MSWindowsWidgetFactory;
import com.pattern.core.abstractfactory.MacOSXWidgetFactory;

public class AbstractFactoryPatternRunner {
	public static void main(String[] args) {
		String variable="MACOSX";
		
		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory = null;
		// check what platform we're on
		if (variable.equals("MACOSX")) {
			widgetFactory = new MacOSXWidgetFactory();
		} else {
			widgetFactory = new MSWindowsWidgetFactory();
		}
		builder.buildWindow(widgetFactory);
	}
}
