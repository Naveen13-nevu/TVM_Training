package com.tvm.programmingtest;

public class AlphaSort {

	public static void main(String[] args) {

		  String str="How was the program today";
	        String arr[]=str.split(" ");
	        String res="";
	       
	        for(int i=0;i<arr.length;i++){
	        	
	          String word=arr[i];
	          char ch[]=word.toCharArray();
	          
	          for(int j=0;j<ch.length-1;j++){
	        	  
	              for(int k=j+1;k<ch.length;k++){
	            	  
	                if(ch[j]>ch[k]){
	                  char temp=ch[j];
	                  ch[j]=ch[k];
	                  ch[k]=temp;
	                }
	              }
	          }
	          String s=new String(ch);
	           res+=s+" ";
	        }
	      System.out.println(res);

	}

}
