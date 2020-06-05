package com.genpact.fabulous;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.fabulous.model.Video;

@RestController
@EnableAutoConfiguration
public class RequestController {
	
	@GetMapping("/getAllResource")
	public Video greeting() {
		return Video.builder().creator("shivs").build();
	}
	
	@GetMapping(value = "/image")
	public @ResponseBody byte[] getImage() throws IOException {
	    InputStream in = getClass()
	      .getResourceAsStream("/image.jpg");
	    return IOUtils.toByteArray(in);
	}
	
	 public static void main(String[] args) {
	        SpringApplication.run(RequestController.class, args);
	    }

}
