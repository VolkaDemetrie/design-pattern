package com.example.pattern.factory_method.product;


import lombok.Data;

@Data
public class ConcreteProductCrtCareer implements Product {
    private String crtNo;
    private String crtNm;
    private String crtType;
    private String carrerSomthing;

}
