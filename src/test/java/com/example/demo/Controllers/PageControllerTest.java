package com.example.demo.Controllers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controllers.PControllers;

@RunWith( SpringRunner.class)
@WebMvcTest(PControllers.class)
public class PageControllerTest {
	
	@Autowired
	MockMvc  MockMvc;
	
	@Test
	public void home() throws Exception {
		
		this.MockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string(containsString("Hello World !")));
		this.MockMvc.perform(get("/?name=")).andExpect(status().isOk()).andExpect(content().string(containsString("Hello World !")));
		this.MockMvc.perform(get("/?name=mercury")).andExpect(status().isOk()).andExpect(content().string(containsString("Hello Mercury !")));
		this.MockMvc.perform(get("/?name=hono")).andExpect(status().isOk()).andExpect(content().string(containsString("Hello Hono !")));
	}

	
	
}