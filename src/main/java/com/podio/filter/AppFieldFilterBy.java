package com.podio.filter;

import java.util.List;

public class AppFieldFilterBy extends FieldFilterBy<List<Integer>> {

	public AppFieldFilterBy(int fieldId) {
		super(fieldId);
	}

	@Override
	public final Object format(List<Integer> values) {
		return values;
	}
}
