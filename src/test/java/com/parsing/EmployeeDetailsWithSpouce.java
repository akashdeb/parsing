package com.parsing;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoLibraryWithSpouceDetails;
import com.parsing.pojo.PojoSpouceLibrary;

public class EmployeeDetailsWithSpouce {
	@Test
	public void serialization() throws Throwable, JsonMappingException, IOException {
	PojoSpouceLibrary spouce = new PojoSpouceLibrary("abc", "abc@gmail.com", 12345);
	PojoLibraryWithSpouceDetails pObj = new PojoLibraryWithSpouceDetails("Akash", "TY0001", "akash@gamil.com", spouce);
	
	
	ObjectMapper mapper = new ObjectMapper();
	
	System.out.println(mapper.writeValueAsString(pObj));
	
	mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonSpouce.json"), pObj);
	
}
}