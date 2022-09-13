package com.lamdbdas;


@FunctionalInterface
public interface Addition {
	int add(int x, int y);
	default int sub(int d, int y) {
		return d - y;
	}
	static int mul(int x, int y)
	{
		return x *y;
	}
}
