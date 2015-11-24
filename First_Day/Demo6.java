/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of java
*/
//位运算操作符
class Demo6
{
	public static void main(String[] args)
	{
		/*
				二进制数 a  二进制数b  与(&)  或(|) 异或(^)
					0			0		0		0		0
					1 	       	0		0		1		1
					0			1 		0		1 		1
					1			1 		1 		1   	0
					
			3的二进制: 0b00000000_00000000_00000000_00000011
		&	5的二进制: 0b00000000_00000000_00000000_00000101
		-----------------------------------------------------
					   0b00000000_00000000_00000000_00000001
		*/
		System.out.println("3 & 5= " + (3 & 5));//1
		
		
		/*
			3的二进制: 0b00000000_00000000_00000000_00000011
		|	5的二进制: 0b00000000_00000000_00000000_00000101
		-----------------------------------------------------
					   0b00000000_00000000_00000000_00000111
					   
					   1 * 2的0次方 + 1 * 2的1次方 + 1 * 2 的2次方
		*/
		System.out.println("3 ^ 5= "+ (3 ^ 5));//6
		
		//移位
		
		/*
			8的二进制: 0b00000000_00000000_00000000_00001000
					<< 1
					   0b00000000_00000000_00000000_00010000
					   
			8的二进制: 0b00000000_00000000_00000000_00001000
					>> 1
					   0b00000000_00000000_00000000_00000100
		*/
		System.out.println("8 << 2= "+ (8 << 2));//32
		System.out.println("8 >> 2= "+ (8 >> 2));//2
		
		System.out.println("负数移位");
		
		/*
			-8二进源码:
				源码:	0b10000000_00000000_00000000_00001000
				取反:	0b11111111_11111111_11111111_11110111
			补码(+1):	0b11111111_11111111_11111111_11111000
				运算:	0b11111111_11111111_11111111_11111110
				取反:	0b10000000_00000000_00000000_00000001
			补码(+1):	0b10000000_00000000_00000000_00000010
		*/
		System.out.println("-8 >> 2= "+ (-8 >> 2));//-2
		System.out.println("-8 >>> 2= "+ (-8 >>> 2));//1073741822
	}
}