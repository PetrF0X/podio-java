package com.podio.filter;

public final class NumberInterval {

	private final Float from;

	private final Float to;

	public NumberInterval(Float from, Float to) {
		super();
		this.from = from;
		this.to = to;
	}

	public Float getFrom() {
		return from;
	}

	public Float getTo() {
		return to;
	}
}
