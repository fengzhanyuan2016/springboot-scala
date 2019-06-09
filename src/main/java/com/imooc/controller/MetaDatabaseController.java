package com.imooc.controller;

import com.imooc.domain.MetaDatabase;
import com.imooc.service.MetaDatabaseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/meta/database")
public class MetaDatabaseController {
    private MetaDatabaseService _databaseService;
    public MetaDatabaseController(MetaDatabaseService databaseService){
        _databaseService = databaseService;
    }
    @PostMapping("/")
    public String save(@ModelAttribute MetaDatabase database){
        _databaseService.save(database);
        return "success";
    }

    @GetMapping("/")
    public Iterable<MetaDatabase> query(){
        return _databaseService.query();
    }

}
