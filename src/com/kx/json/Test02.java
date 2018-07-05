package com.kx.json;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;



public class Test02 {

	public static void main(String[] args) {
		// 1.手动生成数据
		List<User> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(new User(i+1,"张三"+i));
		}
		// 2.通过json快速生成json数据
		JSONArray json = new JSONArray(list);
		System.out.println(json.toString());

	}

}
