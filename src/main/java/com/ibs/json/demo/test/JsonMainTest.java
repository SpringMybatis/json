package com.ibs.json.demo.test;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.ibs.json.demo.model.Authority;
import com.ibs.json.demo.model.Role;
import com.ibs.json.demo.model.User;

public class JsonMainTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		String ss = "{\"age\":18,\"id\":\"1\",\"passWord\":\"666666\",\"roleList\":[{\"code\":\"ROLE1-CODE\",\"id\":\"R1\",\"list\":[{\"authCode\":\"A1-CODE\",\"authId\":\"11\",\"authName\":\"普通权限\"},{\"authCode\":\"A2-CODE\",\"authId\":\"22\",\"authName\":\"管理员权限\"},{\"authCode\":\"A3-CODE\",\"authId\":\"33\",\"authName\":\"超级管理员权限\"},{\"authCode\":\"A4-CODE\",\"authId\":\"44\",\"authName\":\"普通测试权限\"}],\"name\":\"超级管理员\"},{\"code\":\"ROLE2-CODE\",\"id\":\"R2\",\"list\":[{\"authCode\":\"A1-CODE\",\"authId\":\"11\",\"authName\":\"普通权限\"},{\"authCode\":\"A4-CODE\",\"authId\":\"44\",\"authName\":\"普通测试权限\"}],\"name\":\"普通员\"}],\"sex\":\"MM\",\"userName\":\"2B刘\"}";
		
		String arrstr = "[{\"code\":\"ROLE1-CODE\",\"id\":\"R1\",\"list\":[{\"authCode\":\"A1-CODE\",\"authId\":\"11\",\"authName\":\"普通权限\"},{\"authCode\":\"A2-CODE\",\"authId\":\"22\",\"authName\":\"管理员权限\"},{\"authCode\":\"A3-CODE\",\"authId\":\"33\",\"authName\":\"超级管理员权限\"},{\"authCode\":\"A4-CODE\",\"authId\":\"44\",\"authName\":\"普通测试权限\"}],\"name\":\"超级管理员\"},{\"code\":\"ROLE2-CODE\",\"id\":\"R2\",\"list\":[{\"authCode\":\"A1-CODE\",\"authId\":\"11\",\"authName\":\"普通权限\"},{\"authCode\":\"A4-CODE\",\"authId\":\"44\",\"authName\":\"普通测试权限\"}],\"name\":\"普通员\"}]";
		
		Authority a1 = new Authority();
		a1.setAuthId("11");
		a1.setAuthCode("A1-CODE");
		a1.setAuthName("普通权限");
		
		Authority a2 = new Authority();
		a2.setAuthId("22");
		a2.setAuthCode("A2-CODE");
		a2.setAuthName("管理员权限");
		
		Authority a3 = new Authority();
		a3.setAuthId("33");
		a3.setAuthCode("A3-CODE");
		a3.setAuthName("超级管理员权限");
		
		Authority a4 = new Authority();
		a4.setAuthId("44");
		a4.setAuthCode("A4-CODE");
		a4.setAuthName("普通测试权限");
		
		List<Authority> ro1list = new ArrayList<Authority>();
		ro1list.add(a1);
		ro1list.add(a2);
		ro1list.add(a3);
		ro1list.add(a4);
		Role ro1 = new Role();
		ro1.setId("R1");
		ro1.setCode("ROLE1-CODE");
		ro1.setName("超级管理员");
		ro1.setList(ro1list);
		
		List<Authority> ro2list = new ArrayList<Authority>();
		ro2list.add(a1);
		ro2list.add(a4);
		Role ro2 = new Role();
		ro2.setId("R2");
		ro2.setCode("ROLE2-CODE");
		ro2.setName("普通员");
		ro2.setList(ro2list);
		
		List<Role> roleList = new ArrayList<Role>();
		roleList.add(ro1);
		roleList.add(ro2);
		
		User u = new User();
		u.setAge(18);
		u.setId("1");
		u.setPassWord("666666");
		u.setUserName("2B刘");
		u.setSex("MM");
		u.setRoleList(roleList);
		
		String s = JSONObject.fromObject(u).toString();
		
		System.out.println(s);
		
		String arr = JSONArray.fromObject(roleList).toString();
		
		System.out.println(arr);
		
		JSONObject object = JSONObject.fromObject(ss);
		User jsonUser = (User) JSONObject.toBean(object, User.class);
		System.out.println(jsonUser.getUserName());
		
		JSONArray arrObj = JSONArray.fromObject(arrstr);
		
		List<Role> list = (List<Role>) JSONArray.toCollection(arrObj, Role.class);
		
		System.out.println(list.size());
		
		System.out.println(list.get(0).getName());
		
	}

}
