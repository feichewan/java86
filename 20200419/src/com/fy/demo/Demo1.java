package com.fy.demo;
/**
 * 
 * @author wzf
 * @date   2020年4月18日
 */
public class Demo1 {

	public static void main(String[] args) {
		String hotel1 ="格林豪泰苏州火车站南广场拙政园商务酒店";
		String hotelType1 ="vip大床房(有代金券)";
		String[] hotelType2 ={"大床房","标间","豪华双床房","豪华双床房","高级大床房"};
		String[] hotelType3 ={"vip大床房","vip标间","vip豪华双床房","vip豪华双床房","vip高级大床房"};
		String[] hotelType4 ={"大床房(有代金券)","标间(有代金券)","豪华双床房(有代金券)","豪华双床房(有代金券)","高级大床房(有代金券)"};
		String[] hotelType5 ={"vip大床房(有代金券)","vip标间(有代金券)","vip豪华双床房(有代金券)","vip豪华双床房(有代金券)","vip高级大床房(有代金券)"};
		int[] price1 ={189,169,209,399,189};
		int[] price2 ={161,149,190,339,161};
		int[] voucher ={20,10,30,20,10};
		hotel(hotel1);
		for(int i = 0;i<price1.length;i++){
			if(hotelType1.equals(hotelType2[i])){
				System.out.println(hotelType1+"价格:"+price1[i]+"元");
			}else if(hotelType1.equals(hotelType3[i])){
				System.out.println(hotelType1+"价格:"+price2[i]+"元");
			}else if(hotelType1.equals(hotelType4[i])){
				System.out.println(hotelType1+"价格:"+(price1[i]-voucher[i])+"元");
			}else if(hotelType1.equals(hotelType5[i])){
				System.out.println(hotelType1+"价格:"+(price2[i]-voucher[i])+"元");
			}
		}
		System.out.println();
	}
	public static boolean hotel(String hotel1){
		String[] hotel2 ={"格林豪泰苏州火车站南广场拙政园商务酒店","格雅苏州工业园区金鸡湖东方之门酒店","格林豪泰苏州漕湖工业园智选酒店"};
		String[] address ={"江苏省苏州市姑苏区人民路2156号","江苏省苏州工业园区星海街169号","江苏省苏州市相城区黄畦路3号"};
		boolean c = false;
		for(int i=0;i<hotel2.length;i++){
			if(hotel1.equals(hotel2[i])){
				System.out.println("入住酒店:"+hotel1);
				System.out.println("入住酒店地址:"+address[i]);
				c = true;
			}
		}
		return c;
	}
}
