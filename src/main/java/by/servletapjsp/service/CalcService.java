package by.servletapjsp.service;

import by.servletapjsp.entity.Operation;

import java.util.List;

public class CalcService {
private HistoryService historyService = new HistoryService();

    public int calc(int num1, int num2, String operation, List<Operation> operations) {
        switch (operation) {
            case "sum":
                int result1 = num1 + num2;
                historyService.add(new Operation(num1, num2, operation, result1), operations);
                return result1;
            case "mul":
                int result2 = num1 * num2;
                historyService.add(new Operation(num1, num2, operation, result2), operations);
                return result2;
            case "div":
                int result3 = num1 / num2;
                historyService.add(new Operation(num1, num2, operation, result3), operations);
                return result3;
            case "sub":
                int result4 = num1 - num2;
                historyService.add(new Operation(num1, num2, operation, result4), operations);
                return result4;
        }
        return 0;
    }
}
