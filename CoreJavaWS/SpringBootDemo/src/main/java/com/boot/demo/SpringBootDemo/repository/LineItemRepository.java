package com.boot.demo.SpringBootDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.demo.SpringBootDemo.entity.LineItem;
import com.boot.demo.SpringBootDemo.entity.Order;

public interface LineItemRepository extends CrudRepository<LineItem, Integer>{

}
