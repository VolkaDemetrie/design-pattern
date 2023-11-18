package com.example.pattern.pattern.factory_method.creator;

import com.example.pattern.pattern.factory_method.product.ConcreteProductCrtEmpl;
import com.example.pattern.pattern.factory_method.product.Product;

public class CrtEmplCreator extends AbstractCrtCreator {



    @Override
    Product createProduct() {
        return new ConcreteProductCrtEmpl();
    }
}
