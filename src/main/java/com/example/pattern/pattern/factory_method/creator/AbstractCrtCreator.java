package com.example.pattern.pattern.factory_method.creator;

import com.example.pattern.pattern.factory_method.product.Product;

/**
 * 추상 크리에이터. 팩토리 메서드를 강제 구현하게 하려고 추상으로 해놓음.
 */
public abstract class AbstractCrtCreator {


    //이 부분에서 Product가 데이터 오브젝트라면 굳이 인터페이스를 사용할 필요는 없겠다. (대신 각 공통적인 부분을 잘 처리하는게 필요하다)
    protected String renderHtml(Product product) {
        return null;
    }

    abstract Product createProduct();
}
