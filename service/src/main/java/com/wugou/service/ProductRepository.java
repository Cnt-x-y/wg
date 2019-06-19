package com.wugou.service;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * @Author xuett
 * @Date 2019/6/18 11:54
 */
public interface ProductRepository extends ElasticsearchCrudRepository<Product,Long> {
}
