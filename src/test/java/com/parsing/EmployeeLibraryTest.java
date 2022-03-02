package com.parsing;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoLibrary;

public class EmployeeLibraryTest {
	
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		
	//we are creating an object of pojo library
	 PojoLibrary pObj = new PojoLibrary("Akash", "TY0001", "akash@gamil.com", 987456);
	 //coverting java object into jason 
	 ObjectMapper mapper = new ObjectMapper();
	 // printing the jason object into the console
	 System.out.println(mapper.writeValueAsString(pObj));
	 //generating a json file
	 mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./jasonData.json"), pObj);
}
}









