package com.scmp.demojsonreader.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.scmp.demojsonreader.model.JsonSample;
import com.scmp.demojsonreader.model.JsonSample.E;

public interface GetJson {
    
    @GetMapping(value = "/json")
    ResponseEntity<List<String>> findAll() throws Exception;
}
