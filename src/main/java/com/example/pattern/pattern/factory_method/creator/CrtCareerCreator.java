package com.example.pattern.pattern.factory_method.creator;

import com.example.pattern.pattern.factory_method.product.ConcreteProductCrtCareer;
import com.example.pattern.pattern.factory_method.product.Product;

public class CrtCareerCreator extends AbstractCrtCreator {

    /**
     * 팩토리 메소드. 여기서 DB I/O 등의 Product에 대한 가공 마친 후 리턴 (리턴 타입은 인터페이스로)
     * @return
     */
    @Override
    Product createProduct() {
        //ConcreteProductCrtCareer crtCareer = DB.I/O()
        return new ConcreteProductCrtCareer();
    }
}
