package com.scmp.demojsonreader.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scmp.demojsonreader.model.JsonSample;
import com.scmp.demojsonreader.model.JsonSample.E;
import com.scmp.demojsonreader.service.JsonReadService;

@Service
public class JsonReadServiceImpl implements JsonReadService {

    @Override
    public JsonSample readSample() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Specify the path to your JSON file
            File jsonFile = new File("json/example.json");

            InputStream is = new ClassPathResource("json/example.json").getInputStream();

            // Read the JSON file and map it to a Java object
            JsonSample yourObject = objectMapper.readValue(is, JsonSample.class);

            // Now you can access the data from the Java object
            return yourObject;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JsonSample();
    }

    // @Override
    // public AudienceAttributeWithDistributionResponse getAttributeWithDistributions(String aid) {
    //     try {
    //         // Load the mock JSON file from the classpath
    //         InputStream is = new ClassPathResource("mockData/getAudienceAttributesWithDistributions.json").getInputStream();
    //         // Directly read the content into AudienceAttributeResponse
    //         return ObjectMapperUtil.getObjectMapper().readValue(is, AudienceAttributeWithDistributionResponse.class);
    //     } catch (IOException e) {
    //         // Handle the error as you see fit, e.g., log it or throw an exception
    //         throw new RuntimeException("Error reading mock JSON file", e);
    //     }
    // }

    // @Override
    // public AttributeSuggestionListResponse getAttributeSuggestionList(String aid, String attributeId, Boolean isAutoComplete, String field, String query, String type, Boolean isCampaignAttribute) {
    //     try {
    //         InputStream is = null;
    //         // Load the mock JSON file from the classpath
    //         if (field.equals("recency")) {
    //             //read recency mock data if the value of item parameter is recency
    //             is = new ClassPathResource("mockData/getAudienceAttributeSuggestionRecencyItem.json").getInputStream();
    //         } else if (field.equals("item")) {
    //             //read item mock data if the value of item parameter is item
    //             is = new ClassPathResource("mockData/getAudienceAttributeSuggestionTopicItem.json").getInputStream();
    //         }
    //         return ObjectMapperUtil.getObjectMapper().readValue(is, AttributeSuggestionListResponse.class);
    //     } catch (IOException e) {
    //         // Handle the error as you see fit, e.g., log it or throw an exception
    //         throw new RuntimeException("Error reading mock JSON file", e);
    //     }
    // }


}
