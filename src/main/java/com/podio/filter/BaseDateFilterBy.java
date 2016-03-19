package com.podio.filter;

public abstract class BaseDateFilterBy implements FilterBy<PodioDateInterval> {

	@Override
	public final Object format(PodioDateInterval value) {
		return value.serialize();
	}

}
