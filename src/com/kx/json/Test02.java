package com.kx.json;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;



public class Test02 {

	public static void main(String[] args) {
		// 1.�ֶ���������
		List<User> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(new User(i+1,"����"+i));
		}
		// 2.ͨ��json��������json����
		JSONArray json = new JSONArray(list);
		System.out.println(json.toString());

	}

}
