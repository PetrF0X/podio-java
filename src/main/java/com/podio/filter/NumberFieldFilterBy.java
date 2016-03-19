package com.podio.filter;

public class NumberFieldFilterBy extends FieldFilterBy<NumberInterval> {

	public NumberFieldFilterBy(int fieldId) {
		super(fieldId);
	}

	@Override
	public Object format(NumberInterval value) {
		return value;
	}
}
