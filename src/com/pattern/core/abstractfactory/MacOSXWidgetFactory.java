package com.pattern.core.abstractfactory;

// create a MacOSXWindow
public class MacOSXWidgetFactory implements AbstractWidgetFactory {
	public Window createWindow() {
		MacOSXWindow window = new MacOSXWindow();
		return window;
	}

}
