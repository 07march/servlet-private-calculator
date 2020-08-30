package by.servletapjsp.service;

import by.servletapjsp.entity.Operation;

import java.util.ArrayList;
import java.util.List;

public class HistoryService {

    public void add(Operation his, List<Operation> operations) {
        operations.add(his);
    }

    public List<Operation> getAll(List<Operation> operations) {
        return new ArrayList<>(operations);
    }

    public List<Operation> findAllByOperation(String operation, List<Operation> operations) {
        List<Operation> op = new ArrayList<>();
        for (Operation operation1 : operations) {
            if (operation1.getOperation().equals(operation)) {
                op.add(operation1);
            }
        }
        return op;
    }

    public List<Operation> findAllByResult(int result, List<Operation> operations) {
        List<Operation> op = new ArrayList<>();
        for (Operation operation1 : operations) {
            if (operation1.getResult() == result) {
                op.add(operation1);
            }
        }
        return op;
    }
}
