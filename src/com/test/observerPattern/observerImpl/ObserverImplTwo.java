package com.test.observerPattern.observerImpl;

import com.test.observerPattern.display.displayInt;
import com.test.observerPattern.observerInt.ObserverInt;
import com.test.observerPattern.subjectInt.SubjectInt;

public class ObserverImplTwo implements ObserverInt, displayInt {

	private int temp;
	private int hum;

	public ObserverImplTwo(SubjectInt sub) {
		sub.registerObserver(this);
	}

	@Override
	public void update(int temp, int hum) {
		this.temp = temp;
		this.hum = hum;
		display();
	}

	@Override
	public void display() {
		System.out.println("Observer Two : " + temp + "  :: " + hum);

	}

	// Implemnt for push model
	@Override
	public void update(SubjectInt subject, int temp, int hum) {

	}

}
