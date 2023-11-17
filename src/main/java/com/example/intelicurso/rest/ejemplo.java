package com.example.intelicurso.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/")
public class ejemplo {

    @GetMapping("ejemplo")
    ResponseEntity<?> ejemplo(){
        //http:localhost:8080/api/ejemplo
        ArrayList<Object> response = new ArrayList<>();
        //Un arreglo en JSOn se represneta con los simbolos[]
        //Un objeto en json se representa con {}

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Bart");
        nombres.add("Lisa");
        nombres.add("Magui");
        nombres.add("Margue");
        nombres.add("Homero");

        for (int i = 0; i < nombres.toArray().length; i++) {
            Map<String, Object> map = new HashMap<>();

            map.put("id", i);
            map.put("nombre", nombres.get(i));

            response.add(map);

        }
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}
