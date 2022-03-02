package com.parsing;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoArrayLibrary;

public class EmployeeDetailsWithArray {
	
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		
		long[] arr = {321664, 654218, 65432};
		PojoArrayLibrary pObj = new PojoArrayLibrary("Akash", "TY0001", "akash@gamil.com", arr);
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(pObj));
		
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jsonArrayFile.json"), pObj);
		
		
		
		
		
		
		
	}

}










