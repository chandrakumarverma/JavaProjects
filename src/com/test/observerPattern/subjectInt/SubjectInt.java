package com.test.observerPattern.subjectInt;

import com.test.observerPattern.observerInt.ObserverInt;

public interface SubjectInt {
	public void registerObserver(ObserverInt observerObject);

	public void removeObserver(ObserverInt ob);

	public void notifyObserver();
}
