package com.validationTopics;

import java.util.function.Supplier;

public class SupplierSamples {

	public static void main(String[] args) {

		Supplier<String> s = ()-> "Naveen";
		System.out.println(s.get());

	}

}
