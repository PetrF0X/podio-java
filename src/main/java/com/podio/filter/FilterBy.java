package com.podio.filter;

public interface FilterBy<T> {

	String getKey();

	Object format(T value);
}
