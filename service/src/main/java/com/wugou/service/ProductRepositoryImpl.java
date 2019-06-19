package com.wugou.service;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.data.elasticsearch.repository.support.AbstractElasticsearchRepository;

/**
 * @Author xuett
 * @Date 2019/6/18 11:55
 */
public class ProductRepositoryImpl extends AbstractElasticsearchRepository<Product,Long> implements ProductRepository {
    @Override
    protected String stringIdRepresentation(Long aLong) {
        return null;
    }
}
