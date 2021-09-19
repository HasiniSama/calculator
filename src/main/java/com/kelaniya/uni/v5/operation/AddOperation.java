package com.kelaniya.uni.v5.operation;

public class AddOperation implements Operation {

    public Double execute(Double[] numbers) {
        return numbers[0] + numbers[1];
    }
}

//What is the responsibility of the class?
//figure out the test cases