package com.imooc.repository;

import com.imooc.domain.MetaDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaDatabaseRepository extends JpaRepository<MetaDatabase,Integer> {

}
