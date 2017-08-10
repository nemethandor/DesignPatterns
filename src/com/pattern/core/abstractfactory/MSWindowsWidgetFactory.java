package com.pattern.core.abstractfactory;

public class MSWindowsWidgetFactory implements AbstractWidgetFactory {// create an MSWindow
	public Window createWindow() {
		MSWindow window = new MSWindow();
		return window;
	}
}
