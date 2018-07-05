package com.kx.json;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// 1.�ֶ���������
		List<User> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(new User(i+1,"����"+i));
		}
		// 2.�����ɵ�����ת����Ϊһ��json��ʽ���ַ���
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < list.size(); i++) {
			User user = list.get(i);
			if(i > 0){
				sb.append(",");
			}
			sb.append("{");
			// ƴ��id
			sb.append("\"id\":"+user.getId()+",");
			// ƴ��name
			sb.append("\"name\":\""+user.getName()+"\"");
			sb.append("}");
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
