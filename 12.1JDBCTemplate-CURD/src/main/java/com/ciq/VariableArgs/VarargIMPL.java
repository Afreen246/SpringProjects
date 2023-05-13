package com.ciq.VariableArgs;

public class VarargIMPL implements VarArgsInterface{

	

	public int varArg(int... var) {

		int sum=0;
		for (int i : var) {
			sum=sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
         VarargIMPL i=new VarargIMPL();
         int a[]= {10,20};
         int b[]= {10,10,100};
         int c[]= {10,20,30,40};
         
         System.out.println(i.varArg(a));
         System.out.println(i.varArg(b));
         System.out.println(i.varArg(c));
         
	}

}
