package com.example.demo.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.req.TestReqModel;
import com.example.demo.model.res.TestResModel;
import com.example.demo.model.res.TestResbyidModel;



@RestController
@RequestMapping("/testapi")
public class TestController {
	@GetMapping(value = "/inquiry-test/")	
	public @ResponseBody Object inquiryTestList() {

		TestResModel  resmo =new TestResModel();
		resmo.setCode("200");
		resmo.setStatus("Success");
		return resmo;
	}
	@GetMapping(value = "/inquiry-test/id/{id}")	
	public @ResponseBody Object inquiryTestbypathList(@PathVariable(value = "id", required = false) String id) {

		TestResbyidModel  resmo =new TestResbyidModel();
		resmo.setId(id);
		resmo.setCode("200");
		resmo.setStatus("Success");
		return resmo;
	}

	@PostMapping(value = "/inquiry-test")	
	public @ResponseBody Object inquiryTestpostList(@RequestBody TestReqModel TestReqModel) {
		
		return 0;
	}
	
	
	@DeleteMapping(value = "/inquiry-test")	
	public @ResponseBody Object inquiryTestdeletetList() {
		return 0;
	}
	
	@PutMapping(value = "/inquiry-test")	
	public @ResponseBody Object inquiryTestPutList() {
		return 0;
	}
	
}
