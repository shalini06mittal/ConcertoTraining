package com.lamdbdas;
/**
 * Lambdas can be used only on interfaces which have 1 and only 1
 * abstract method
 * @FunctionalInterface => governs interface to not have more
 * than 1 abstarct method
 * @author Shalini
 *
 *an interface can extends other interface
 */
@FunctionalInterface
public interface INotification {
	int x =10;
	public void sendMessage();
	//public void sendMessage1();
}
