package com.scmp.demojsonreader.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.scmp.demojsonreader.model.JsonSample;
import com.scmp.demojsonreader.model.JsonSample.E;
import com.scmp.demojsonreader.service.JsonReadService;


@RestController
@RequestMapping("/api/v1")
public class GetJsonController implements GetJson {

    @Autowired
    private JsonReadService jsonReadService;

    @Override
    public ResponseEntity<List<String>> findAll() throws Exception {
        JsonSample jsonSample = jsonReadService.readSample();
        List<String> onclickList = jsonSample.getA().getD().getE().stream().map(E::getValue).toList();
        return ResponseEntity.ok().body(onclickList);
        // return null;
    }

}
