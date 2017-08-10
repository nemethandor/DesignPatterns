package com.pattern.core.observer;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}