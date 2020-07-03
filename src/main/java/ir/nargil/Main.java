package ir.nargil;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {

    }

    private static void printJson(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> map = mapper.readValue(json, new TypeReference<Map<String,Object>>() {
        });
        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
        System.out.println(result);
    }
}