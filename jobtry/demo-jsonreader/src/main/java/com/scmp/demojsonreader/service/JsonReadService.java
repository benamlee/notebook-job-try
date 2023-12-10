package com.scmp.demojsonreader.service;

import com.scmp.demojsonreader.model.JsonSample;
import com.scmp.demojsonreader.model.JsonSample.E;

public interface JsonReadService {

    JsonSample readSample() throws Exception;

}
