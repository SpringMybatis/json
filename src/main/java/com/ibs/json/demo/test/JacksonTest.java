package com.ibs.json.demo.test;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibs.json.demo.model.Authority;

public class JacksonTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		String ss = "{\"authId\":\"44\",\"authName\":\"普通测试权限\",\"authCode\":\"A4-CODE\"}";
		String liststr = "[{\"authId\":\"44\",\"authName\":\"普通测试权限\",\"authCode\":\"A4-CODE\"}]";
		
		Authority a4 = new Authority();
		a4.setAuthId("44");
		a4.setAuthCode("A4-CODE");
		a4.setAuthName("普通测试权限");
		
		List<Authority> ro1list = new ArrayList<Authority>();
		ro1list.add(a4);
		
		ObjectMapper mapper = new ObjectMapper();
		String auth = mapper.writeValueAsString(a4);
		System.out.println(auth);
		
		String list = mapper.writeValueAsString(ro1list);
		System.out.println(list);
		
		Authority a = mapper.readValue(ss, Authority.class);
		System.out.println(a.getAuthName());
		
		List<Authority> ssList = mapper.readValue(liststr, new TypeReference<List<Authority>>(){});
		System.out.println(ssList.get(0).getAuthCode());
		

	}

}
