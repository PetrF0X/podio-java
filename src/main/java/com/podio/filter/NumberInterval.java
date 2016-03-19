package com.podio.filter;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public final class NumberInterval {
        @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
	private final Float from;

        @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
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
