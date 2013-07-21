package org.crowdguru.webapp.controllers;

import org.crowdguru.webapp.controller.RegisterController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(MockitoJUnitRunner.class)
public class RegisterControllerTest{
	
	private MockMvc mockMvc;
	
	@InjectMocks
	private RegisterController cut;
	
	@Before
	public void setup(){
		this.mockMvc = standaloneSetup(cut).build();
	}
	
	@Test
	public void mapsRegister() throws Exception{
		this.mockMvc.perform(get("/register"))
			.andExpect(status().isOk());
	}
	
	@Test
	public void rendersRegisterView() throws Exception{
		this.mockMvc.perform(get("/register"))
			.andExpect(view().name("signup"));
	}
}
