package com.imooc.domain

import javax.persistence.{Entity, GeneratedValue, GenerationType, Id, Table}

import scala.beans.BeanProperty

@Entity
@Table(name = "meta_table")
class MetaTable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id:Integer = _
  @BeanProperty
  var name:String = _
  @BeanProperty
  var tableType:String = _
  @BeanProperty
  var dbId:Integer = _


}
