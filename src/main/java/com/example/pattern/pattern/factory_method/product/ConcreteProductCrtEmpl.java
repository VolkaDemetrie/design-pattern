package com.example.pattern.pattern.factory_method.product;

import lombok.Data;

@Data
public class ConcreteProductCrtEmpl implements Product {
    private String crtNo;
    private String crtNm;
    private String crtType;
    private String emplSomething;
}
