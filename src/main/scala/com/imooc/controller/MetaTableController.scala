package com.imooc.controller

import com.imooc.domain.MetaTable
import com.imooc.service.MetaTableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ModelAttribute, PostMapping, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService){

  @PostMapping
  def save(@ModelAttribute table:MetaTable)={
    metaTableService.save(table)
  }



}
