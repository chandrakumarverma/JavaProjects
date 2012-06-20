package com.test.observerPattern.subjectImpl;

import java.util.ArrayList;
import java.util.List;

import com.test.observerPattern.observerInt.ObserverInt;
import com.test.observerPattern.subjectInt.SubjectInt;

public class SubjectImpl implements SubjectInt {

	private List<ObserverInt> observerList;
	private int temp;
	private int hum;

	public SubjectImpl() {
		observerList = new ArrayList<ObserverInt>();
	}

	@Override
	public void notifyObserver() {
		for (ObserverInt observer : observerList)
			observer.update(temp, hum);
	}

	@Override
	public void registerObserver(ObserverInt observerObject) {
		observerList.add(observerObject);

	}

	@Override
	public void removeObserver(ObserverInt ob) {
		observerList.remove(ob);

	}

	public void setMesurementChanged(int hum, int temp) {
		this.hum = hum;
		this.temp = temp;
		notifyObserver();

	}

}
