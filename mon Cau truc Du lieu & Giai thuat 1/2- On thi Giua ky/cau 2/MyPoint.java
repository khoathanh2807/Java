// class quan ly cac diem trong khong gian toa do

import java.util.*;

public class MyPoint{

	private double x;		// toa độ trục hoành
	private double y;		// toa độ trục tung
	private static int quantity = 0;	// số lượng điểm toa độ

	public MyPoint(){	// constructor không tham số

		x = 0.0;	// toạ độ góc toa độ O(x= 0; y = 0) 
		y = 0.0;

		quantity++;

	}

	public MyPoint(double x, double y){		// constructor có tham số

		this.x = x;
		this.y = y;

		quantity++;

	}
	
	public void setX(double x){

		this.x = x;

	}
	
	public double getX(){

		return x;

	}
	
	public void setY(double y){

		this.y = y;

	}
	
	public double getY(){

		return y;

	}
	
	public static int getQuantity(){

		return quantity;

	}

	public double getEuclideanDistance(MyPoint p){		// hàm tính khoản cách giữa 2 điểm

		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));

	}

	//@Override
	public boolean equals(MyPoint obj){

		if( this.x == obj.x && this.y == obj.y ){

			return true;

		} else{

			return false;

		}

	}
	
}
