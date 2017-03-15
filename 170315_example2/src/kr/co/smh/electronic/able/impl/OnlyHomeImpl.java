package kr.co.smh.electronic.able.impl;

import kr.co.smh.electronic.able.IOnlyHome;

public class OnlyHomeImpl implements IOnlyHome{

	@Override
	public void doSomething() {
		System.out.println("집에서만 사용 가능하다");
	}

}
