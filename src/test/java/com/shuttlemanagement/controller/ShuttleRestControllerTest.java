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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.shuttlemanagement.ShuttleManagementApplication;

/**
 * Test class for ShuttleManagementRestController.
 * @author Kazim Ulusoy
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShuttleManagementApplication.class)
@WebAppConfiguration
public class ShuttleRestControllerTest {

	private static final Logger LOG = LoggerFactory.getLogger(ShuttleRestControllerTest.class);
	
	private static final String swaggerJson = "swagger.json";
	private static final String userHome = "user.home";
	private static final String url = "/v2/api-docs.json";
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}
    
    @Test
    public void testGetSwaggerJsonMessage() throws Exception {
    	
    	final MockHttpServletRequestBuilder getRequestBuilder = MockMvcRequestBuilders.get(url);
    	
    	MvcResult result = mockMvc.perform(getRequestBuilder).andExpect(status().isOk()).andReturn();
    	saveJsonFile(result.getResponse().getContentAsString());
    }
    
    private void saveJsonFile(String content) {
    	FileOutputStream fileOutputStream = null;
		File file;
    	
		try {
			String userHomeFolder = System.getProperty(userHome);
			file = new File(userHomeFolder, swaggerJson);
			fileOutputStream = new FileOutputStream(file);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fileOutputStream.write(contentInBytes);
			fileOutputStream.flush();
			fileOutputStream.close();

			LOG.info("swagger.json created under: " + userHomeFolder);

		} catch (IOException e) {
			LOG.error(e.getMessage());
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				LOG.error(e.getMessage());
			}
		}
    }
}
