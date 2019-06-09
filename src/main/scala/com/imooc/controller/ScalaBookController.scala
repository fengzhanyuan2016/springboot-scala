package com.imooc.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class ScalaBookController {
  def sayHello() ={
    "hello scala"
  }
}
