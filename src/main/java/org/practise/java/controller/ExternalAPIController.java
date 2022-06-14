package org.practise.java.controller;

import org.practise.java.model.ResultContainer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalAPIController {

    @GetMapping("/restCountry")
    public ResponseEntity<?> getCountrys() {
        try {
            String uri="https://countriesnow.space/api/v0.1/countries";
            RestTemplate restTemplate = new RestTemplate();
            ResultContainer result = restTemplate.getForObject(uri, ResultContainer.class);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Error!, Please try again", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
