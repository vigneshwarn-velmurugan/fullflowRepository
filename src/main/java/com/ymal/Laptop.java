package com.ymal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop {
@Autowired
YamlRepository yr;
@PostMapping(value="/postAll")
public String post(@RequestBody List<YamlEntity> y) {
   yr.saveAll(y);
   return "posted successfully";
}
@GetMapping(value="/getAll")
public List<YamlEntity> get() {
	return yr.findAll();
}
}
