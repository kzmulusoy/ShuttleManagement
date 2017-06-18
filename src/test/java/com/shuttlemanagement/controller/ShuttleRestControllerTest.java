package com.shuttlemanagement.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


import com.shuttlemanagement.ShuttleManagementApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShuttleManagementApplication.class)
@WebAppConfiguration
public class ShuttleRestControllerTest {

	private static final Logger LOG = LoggerFactory.getLogger(ShuttleRestControllerTest.class);
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}
    
    @Test
    public void testGetSwaggerJsonMessage() throws Exception {
    	final String url = "/v2/api-docs.json";
    	final MockHttpServletRequestBuilder getRequestBuilder = MockMvcRequestBuilders.get(url);
    	
    	MvcResult result = mockMvc.perform(getRequestBuilder).andExpect(status().isOk()).andReturn();
    	String content = result.getResponse().getContentAsString();
    }
}
