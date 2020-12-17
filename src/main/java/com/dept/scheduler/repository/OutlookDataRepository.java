package com.dept.scheduler.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dept.scheduler.model.OutlookData;

@Repository
public interface OutlookDataRepository extends CrudRepository<OutlookData, Long>{

}
