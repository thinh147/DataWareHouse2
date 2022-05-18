package com.example.demo;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

@RestController
public class DemoController {
    private final Gson gson = new Gson();
    @GetMapping("/test")
    public ResponseEntity<?> getListJson(){
        try {
            BufferedReader objReader = new BufferedReader(new FileReader("C:\\table2.json"));
            Data data = gson.fromJson(objReader, Data.class);
            List<Item> items = data.getItem();
            System.out.println("item la: ");
            items.forEach(item -> {
                System.out.println(item.toString());
            });
            return ResponseEntity.ok("Success");
        } catch (Exception e) {
            return ResponseEntity.ok("Error" + e.getMessage());
        }
    }
}
