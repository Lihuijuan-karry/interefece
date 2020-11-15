package chance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Doctor implements Student,Teacher{
	private String name;
	private String sex;
	private int age;
	private double fee;            //每学期学费
	private double wages;          //每月薪水
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getFee() {          //返回每学年的学费
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getWages() {        //返回年收入
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public double pay(double x) {
		return x;
	}
	public double check(double x) {
		return x;
	}
	public double pay_wages(double x) {
		return x;
	}
	public double check_wages(double x) {
		return x;
	}
	public void setFeeWage1(String a,String b) {           //设置每学期费用，每月薪水
		fee=Double.parseDouble(a);                         //String类型转换为Double类型
		wages=Double.parseDouble(b);
	}
	public void setFeeWage(Doctor stu) {            //设置Scanner方法
		System.out.println("请输入你的姓名、学费和工资：");  
		try {	Scanner in = new Scanner(System.in);                    //异常处理
				String name=in.next();
				double fee = in.nextDouble();
				double wages = in.nextDouble();
				double subtract=wages*12-fee*2;
				if(fee<=0||wages<=0) {
				System.out.println("您输入的学费或工资为负数！输入有误！不能查询年学费，年薪和年税");
			}else {
				System.out.print(name+"的年学费是："+fee*2+"    "+"年薪是："+wages*12+";   年薪-年学费="+subtract+"    ");
				double differt=wages-fee-Test.start;
			    double j=0;
			    if(differt>0){
			    	if(differt<=1500){
			    	j=differt*0.03;
			    	}else if(differt<=4500){
			    	j=1500*0.03+(differt-1500)*0.1;
			    	}else if(differt<=9000){
			    	j=1500*0.03+3000*0.1+(differt-4500)*0.2;
			    	}else if(differt<=35000){
			    	j=1500*0.03+3000*0.1+4500*0.2+(differt-9000)*0.25;
			    	}else if(differt<=55000){
			    	j=1500*0.03+3000*0.1+4500*0.2+26000*0.25+(differt-35000)*0.3;
			    	}else if(differt<=80000){
			    	j=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(differt-55000)*0.35;
			    	}else {
			    	j=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(differt-80000)*0.45;
			    	}
			    	System.out.println(name+"您应交的月税为："+j+"   "+"应交的年税为："+j*12);
			    	}else{
			    	System.out.println(name+"您不需要交税！");
			    	}
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
//	    System.out.print(name+"的年学费是："+fee*2+"    "+"年薪是："+wages*12+";   年薪-年学费="+subtract+"    ");
//	    double differt=wages-fee-5000;
//	    double j=0;
//	    if(differt>0){
//	    	if(differt<=1500){
//	    	j=differt*0.03;
//	    	}else if(differt<=4500){
//	    	j=1500*0.03+(differt-1500)*0.1;
//	    	}else if(differt<=9000){
//	    	j=1500*0.03+3000*0.1+(differt-4500)*0.2;
//	    	}else if(differt<=35000){
//	    	j=1500*0.03+3000*0.1+4500*0.2+(differt-9000)*0.25;
//	    	}else if(differt<=55000){
//	    	j=1500*0.03+3000*0.1+4500*0.2+26000*0.25+(differt-35000)*0.3;
//	    	}else if(differt<=80000){
//	    	j=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(differt-55000)*0.35;
//	    	}else {
//	    	j=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(differt-80000)*0.45;
//	    	}
//	    	System.out.println(name+"您应交的月税为："+j+"   "+"应交的年税为："+j*12);
//	    	}else{
//	    	System.out.println(name+"您不需要交税！");
//	    	}
	}    
//	public String setName(Doctor name) {
//		System.out.println("请输入你的姓名：");  
//		Scanner in1 = new Scanner(System.in);
//		String names=in1.next();
//		return names;
//	}
}
