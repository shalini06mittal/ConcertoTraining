package com.boot.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "teachers", path="teachers")
public interface TeacherRepo extends PagingAndSortingRepository<Teacher, Integer>{

}
