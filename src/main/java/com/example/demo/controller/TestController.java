package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/getdata")
	public List<String> getmapping()
	{
		List<String> list=Arrays.asList("mahi","sunita","vanita","pruthvi","shiv","anavi");
		return list;
	}
}
