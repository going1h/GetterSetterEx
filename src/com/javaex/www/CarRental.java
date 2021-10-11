package com.javaex.www;

import java.util.Scanner;

public class CarRental {

	private String name;
	private String color;
	private int num;
	private String ad;
	private int speed;
	private int money;
	private String rc;
	

	
	public CarRental() {
		name=color=ad=rc=null;
		num=speed=money=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getRc() {
		return rc;
	}
	public void setRc(String rc) {
		this.rc = rc;
	}
//	void Write () {
//		System.out.println("차랑 이름 : " + getName());
//		System.out.println("차랑 색깔 : " + getColor());
//		System.out.println("차랑 번호 : " + getNum());
//		System.out.println("운전자 주소 : " + getAd());
//		System.out.println("현재 속도 : " + getSpeed());
//		System.out.println("렌트 요금 : " + getMoney());
//		System.out.println("렌트 회사 : " + getRc());
//	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		CarRental Cr = new CarRental();
		
		CarRental [] car = new CarRental[1];
		
		for(int i=0; i<car.length; i++) {
			car[i] = new CarRental();
			
			System.out.print("차량 이름을 입력하세요 : ");
			car[i].setName(sc.next());
			System.out.print("차량 색깔을 입력하세요 : ");
			car[i].setColor(sc.next());
			System.out.print("차량 번호을 입력하세요 : ");
			car[i].setNum(sc.nextInt());
			sc.nextLine();
			System.out.print("운전자 주소를 입력하세요 : ");
			car[i].setAd(sc.nextLine());
			System.out.print("현재 속도를 입력하세요 : ");
			car[i].setSpeed(sc.nextInt());
			System.out.print("렌드비를 입력하세요 : ");
			car[i].setMoney(sc.nextInt());
			sc.nextLine();
			System.out.print("렌트회사를 입력하세요 : ");
			car[i].setRc(sc.nextLine());
			System.out.println("==================");
//			car[i]=Cr;
		}
		for(int i = 0; i<car.length; i++) {	
				System.out.println("차랑 이름 : " + car[i].getName());
				System.out.println("차랑 색깔 : " + car[i].getColor());
				System.out.println("차랑 번호 : " + car[i].getNum());
				System.out.println("운전자 주소 : " + car[i].getAd());
				System.out.println("현재 속도 : " + car[i].getSpeed());
				System.out.println("렌트 요금 : " + car[i].getMoney());
				System.out.println("렌트 회사 : " + car[i].getRc());
		}
		for(int i = 0; i<1; i++) {
			System.out.print("속도를 얼마나 올리시겠습니까? ");
			int n = sc.nextInt();
			int sum = car[i].getSpeed() + n;
			System.out.print("현재 속도 : " + sum);
			System.out.println();
			System.out.print("속도를 얼마나 내리시겠습니까? ");
			int a = sc.nextInt();
			int sub = sum-a;
			System.out.print("현재 속도 : " + sub);
		}
	}
}
