package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Operation {
    private String operationNum;
    private double amount;
    private Status status;



    @Override
    public String toString() {
        return "Operation | " +
                "operationNum = '" + operationNum + '\'' +
                "| amount = " + amount +
                "| status = " + status +
                '|';
    }
}
