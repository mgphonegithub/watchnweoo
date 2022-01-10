package com.nweoo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeriesController {

    @GetMapping("series")
    @ResponseBody
    public ResponseEntity<?> getSeries(@RequestParam int offset, @RequestParam int limit){

        return ResponseEntity.status(HttpStatus.OK).body(offset + limit);
    }
}
