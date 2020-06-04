package com.santhosh.repo.Controller;

import com.santhosh.repo.model.Data;
import com.santhosh.repo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.santhosh.repo.model.Data;

@RestController
public class MainController {


    @Autowired
    private DataRepository dataRepository;


    @GetMapping("/get")
//    public List<Data> GetAll(){
//
//        return dataRepository.findAll();
//    }
    public Data send(){
        return new Data("Santhosh Kumar");
    }
}
