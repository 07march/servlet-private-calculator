package by.servletapjsp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    private int num1;
    private int num2;
    private String operation;
    private int result;
}
