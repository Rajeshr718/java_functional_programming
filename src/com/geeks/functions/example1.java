package com.geeks.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class example1 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(arr);
		list.forEach(x -> System.out.println(x));
		System.out.println(Math.negateExact(25));
		System.out.println(Math.abs(-25));

		Function<Integer, Integer> absThenNegate = ((Function<Integer, Integer>) Math::negateExact).andThen(Math::abs);
		
		System.out.println(absThenNegate.apply(-25));
		System.out.println(absThenNegate.apply(25));
		
	}

}
