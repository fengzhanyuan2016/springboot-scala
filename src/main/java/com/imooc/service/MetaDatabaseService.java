package com.imooc.service;

import com.imooc.domain.MetaDatabase;
import com.imooc.repository.MetaDatabaseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MetaDatabaseService {
    private MetaDatabaseRepository _metaDatabaseRepository;
    public MetaDatabaseService(MetaDatabaseRepository metaDatabaseRepository){
        _metaDatabaseRepository = metaDatabaseRepository;
    }

    @Transactional
    public void save(MetaDatabase metaDatabase){
        _metaDatabaseRepository.save(metaDatabase);
    }

    public List<MetaDatabase> query(){
        return _metaDatabaseRepository.findAll();
    }


}

