package com.imooc.repository

import com.imooc.domain.MetaTable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
@Repository
trait MetaTableRepository extends JpaRepository[MetaTable,Integer]{

}
