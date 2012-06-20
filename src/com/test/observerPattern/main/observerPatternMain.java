package com.test.observerPattern.main;

import com.test.observerPattern.observerImpl.ObserverImplOne;
import com.test.observerPattern.observerImpl.ObserverImplTwo;
import com.test.observerPattern.observerInt.ObserverInt;
import com.test.observerPattern.subjectImpl.SubjectImpl;

public class observerPatternMain {

	public static void main(String[] args) {

		SubjectImpl subject = new SubjectImpl();

		ObserverInt observer1 = new ObserverImplOne(subject);
		ObserverInt observer2 = new ObserverImplTwo(subject);

		subject.setMesurementChanged(10, 20);
		System.out.println("---------------");
		subject.setMesurementChanged(40, 20);

	}

}
