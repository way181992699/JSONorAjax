package com.kx.json;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// 1.手动生成数据
		List<User> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(new User(i+1,"张三"+i));
		}
		// 2.将生成的数据转化成为一个json格式的字符串
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < list.size(); i++) {
			User user = list.get(i);
			if(i > 0){
				sb.append(",");
			}
			sb.append("{");
			// 拼接id
			sb.append("\"id\":"+user.getId()+",");
			// 拼接name
			sb.append("\"name\":\""+user.getName()+"\"");
			sb.append("}");
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
