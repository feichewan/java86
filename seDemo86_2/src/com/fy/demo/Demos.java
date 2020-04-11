package com.fy.demo;
/**
 * 
 * @author wzf
 * @date   2020年4月10日
 */

public class Demos {
	
	public static void main(String[] arges) {
		//ctrl+Shift+/ 针对整块的选中代码注释掉  ctrl+Shift+\注释取消
		//类名称首字母大写，方法名首字母小写，变量名首字母小写		
		//变量不要使用中文
		//变量命名:一个英文单词或是缩写，二是两个单词中间使用下划线_,三驼峰式命名
		//name:姓名
		String user_name = "王正飞";//字符串使用是""双引号
		//age:年龄
		int age = 18;
		//salary:月薪
		double salary = 0.0;
		//address:地址
		String address = "丹阳";
		//hobbys:爱好     多个的话使用数组
		String hobbys = "英雄联盟，PUBG";
		//sex:性别一个字符 
		char sex = '男';
		
		//println换行
		System.out.println("姓名"+user_name);
		System.out.println("年龄"+age);
		System.out.println("月薪"+salary);
		System.out.println("地址"+address);
		System.out.println("爱好"+hobbys);
		System.out.println("性别"+sex);
		System.out.println("姓名"+user_name);
		
	}
}
