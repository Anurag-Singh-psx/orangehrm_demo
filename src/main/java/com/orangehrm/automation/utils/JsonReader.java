package com.orangehrm.automation.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class JsonReader {
    private JsonNode node;
    public void initJsonReader(File file) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        node=mapper.readTree(file);
    }

    public String getValue(String rootNode,String key){
        return node.get(rootNode).get(key).asText();
    }

    public String getValue(String rootNode,String childNode,String key){
        return node.get(rootNode).get(childNode).get(key).asText();
    }

    public String getValue(String rootNode,String arrayKey,String key,int index){
        JsonNode jsonNode= node.get(rootNode).get(arrayKey);
        return  jsonNode.get(index).get(key).asText();
    }

    public String getValue(String arrayKey,String key,int index){
        JsonNode jsonNode= node.get(arrayKey);
        return  jsonNode.get(index).get(key).asText();
    }
}
