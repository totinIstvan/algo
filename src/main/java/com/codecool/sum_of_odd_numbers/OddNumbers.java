package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        Integer sum = 0;

        for(Integer num : numbers) {
            sum += num % 2 != 0 ? num : 0;
        }
        return sum;
    }
}