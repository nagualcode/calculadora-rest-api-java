package com.infnet.services.services;

import com.infnet.domain.model.enums.*;
import com.infnet.domain.model.exception.*;
import com.infnet.services.interfaces.MathOperationsInterface;
import org.springframework.stereotype.Service;

@Service
public class MathOperationsService implements MathOperationsInterface {
    @Override
    public Double retrieveValueOperation(
            String numberOne, String numberTwo, MathEnum enumOps
    ) {
        try{
            return switch (enumOps){
                case SUM -> convertToDouble(numberOne) + convertToDouble(numberTwo);
                case SUBTRACTION -> convertToDouble(numberOne) - convertToDouble(numberTwo);
                case MULTIPLICATION -> convertToDouble(numberOne) * convertToDouble(numberTwo);
                case DIVISION -> convertToDouble(numberOne) / convertToDouble(numberTwo);
            };
        }catch (Exception e){
            throw new UnsupportedMathOperationException(e.getMessage());
        }
    }

    private Double convertToDouble(String number) {
        if(number == null) return 0D;

        String replacedNumber = number.replaceAll(",", ".");

        return isNumeric(number)
                ? Double.parseDouble(replacedNumber) : 0D;
    }

    private boolean isNumeric(String number) {
        if(number == null) return false;
        String replacedNumber = number.replaceAll(",", ".");
        return replacedNumber.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}

