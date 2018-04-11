package com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OneOfValidator implements ConstraintValidator<OneOf, String> {

	@Override
	public void initialize(OneOf arg0) {

	}

	@Override
	public boolean isValid(String optionValue, ConstraintValidatorContext arg1) {

		boolean flag = false;

		if (optionValue == null) {
			return flag;
		}
		optionValue = optionValue.trim();

		if (optionValue.equalsIgnoreCase("select")) {
			return false;
		}
		return true;
	}
}
