package com.moments.dummycontrollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/moments")
public class TestController {

  @GetMapping(produces = "application/json", path = "/test-dummy")
  public ResponseEntity<Object> testDummy() {
    return new ResponseEntity("working", HttpStatus.OK);
  }
}
