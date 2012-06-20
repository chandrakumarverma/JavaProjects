package com.test.observerPattern.observerInt;

import com.test.observerPattern.subjectInt.SubjectInt;

public interface ObserverInt {

	void update(int temp, int hum);

	void update(SubjectInt subject, int temp, int hum);

}
