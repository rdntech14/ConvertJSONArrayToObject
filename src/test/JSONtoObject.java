package test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.MyPOJO;

public class JSONtoObject {
	public static void main(String[] args) {
		try {
			File file = new File("company.json");

			ObjectMapper mapper = new ObjectMapper();

			MyPOJO[] myPOJO = mapper.readValue(file, MyPOJO[].class);

			System.out.println("Company 1 : " + myPOJO[0].getCompany().getCompid());
			System.out.println("Company 2 : " + myPOJO[1].getCompany().getCompid());

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
