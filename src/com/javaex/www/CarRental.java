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
//		System.out.println("���� �̸� : " + getName());
//		System.out.println("���� ���� : " + getColor());
//		System.out.println("���� ��ȣ : " + getNum());
//		System.out.println("������ �ּ� : " + getAd());
//		System.out.println("���� �ӵ� : " + getSpeed());
//		System.out.println("��Ʈ ��� : " + getMoney());
//		System.out.println("��Ʈ ȸ�� : " + getRc());
//	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		CarRental Cr = new CarRental();
		
		CarRental [] car = new CarRental[1];
		
		for(int i=0; i<car.length; i++) {
			car[i] = new CarRental();
			
			System.out.print("���� �̸��� �Է��ϼ��� : ");
			car[i].setName(sc.next());
			System.out.print("���� ������ �Է��ϼ��� : ");
			car[i].setColor(sc.next());
			System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
			car[i].setNum(sc.nextInt());
			sc.nextLine();
			System.out.print("������ �ּҸ� �Է��ϼ��� : ");
			car[i].setAd(sc.nextLine());
			System.out.print("���� �ӵ��� �Է��ϼ��� : ");
			car[i].setSpeed(sc.nextInt());
			System.out.print("����� �Է��ϼ��� : ");
			car[i].setMoney(sc.nextInt());
			sc.nextLine();
			System.out.print("��Ʈȸ�縦 �Է��ϼ��� : ");
			car[i].setRc(sc.nextLine());
			System.out.println("==================");
//			car[i]=Cr;
		}
		for(int i = 0; i<car.length; i++) {	
				System.out.println("���� �̸� : " + car[i].getName());
				System.out.println("���� ���� : " + car[i].getColor());
				System.out.println("���� ��ȣ : " + car[i].getNum());
				System.out.println("������ �ּ� : " + car[i].getAd());
				System.out.println("���� �ӵ� : " + car[i].getSpeed());
				System.out.println("��Ʈ ��� : " + car[i].getMoney());
				System.out.println("��Ʈ ȸ�� : " + car[i].getRc());
		}
		for(int i = 0; i<1; i++) {
			System.out.print("�ӵ��� �󸶳� �ø��ðڽ��ϱ�? ");
			int n = sc.nextInt();
			int sum = car[i].getSpeed() + n;
			System.out.print("���� �ӵ� : " + sum);
			System.out.println();
			System.out.print("�ӵ��� �󸶳� �����ðڽ��ϱ�? ");
			int a = sc.nextInt();
			int sub = sum-a;
			System.out.print("���� �ӵ� : " + sub);
		}
	}
}
