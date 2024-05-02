package com.infnet.services.interfaces;

import com.infnet.domain.model.enums.*;

public interface MathOperationsInterface {
    Double retrieveValueOperation(String numberOne, String numberTwo, MathEnum enumOps);
}
