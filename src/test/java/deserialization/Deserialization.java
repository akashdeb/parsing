package deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.parsing.pojo.PojoLibrary;

public class Deserialization {
	
	@Test
	public void deserialization() throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		PojoLibrary pObj = mapper.readValue(new File("./jasonData.json"), PojoLibrary.class);
		
		
		System.out.println(pObj.name);
		System.out.println(pObj.empId);
		System.out.println(pObj.email);
		System.out.println(pObj.phoneNo);

	}

}
