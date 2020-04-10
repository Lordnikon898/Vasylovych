
package com.class18;

class Main extends M{
	  public static void main(String g[]){
	    int[][] gg= {{1,2,3},{3,4,5},{7,8,9}};
	    int ggg = sum(gg);
	    System.out.print(ggg);
	  }
	} 

class M{
	  
	  static int sum(int a[][]){
	    int sam=0;
	    for (int i = 0; i<a.length;i++){
	      for(int y= 0; y<a[i].length;y++){
	        sam+= a[i][y];
	      }
	    }
	    return sam;
	  }
	  
	  
	}