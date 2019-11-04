package com.iib;

class P2 {
	int i;//initializing i
	{
		System.out.println(i);
		i=20;
		System.out.println(" from iib");
	}
	P2()
	{
		System.out.println("from p2()");//-before the constructor statements the iib statments execute
	}
	P2(int i)
	{
		System.out.println(this.i);//-before the constructor statements the iib statments execute
		this.i=i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begins");
		P2 ob = new P2();
		System.out.println(ob.i);
		P2 obj =new P2(10);
		System.out.println(obj.i);
		System.out.println("main ends");

	}

}
