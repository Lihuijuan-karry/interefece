package chance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Doctor implements Student,Teacher{
	private String name;
	private String sex;
	private int age;
	private double fee;            //ÿѧ��ѧ��
	private double wages;          //ÿ��нˮ
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
	public double getFee() {          //����ÿѧ���ѧ��
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getWages() {        //����������
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
	public void setFeeWage1(String a,String b) {           //����ÿѧ�ڷ��ã�ÿ��нˮ
		fee=Double.parseDouble(a);                         //String����ת��ΪDouble����
		wages=Double.parseDouble(b);
	}
	public void setFeeWage(Doctor stu) {            //����Scanner����
		System.out.println("���������������ѧ�Ѻ͹��ʣ�");  
		try {	Scanner in = new Scanner(System.in);                    //�쳣����
				String name=in.next();
				double fee = in.nextDouble();
				double wages = in.nextDouble();
				double subtract=wages*12-fee*2;
				if(fee<=0||wages<=0) {
				System.out.println("�������ѧ�ѻ���Ϊ�������������󣡲��ܲ�ѯ��ѧ�ѣ���н����˰");
			}else {
				System.out.print(name+"����ѧ���ǣ�"+fee*2+"    "+"��н�ǣ�"+wages*12+";   ��н-��ѧ��="+subtract+"    ");
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
			    	System.out.println(name+"��Ӧ������˰Ϊ��"+j+"   "+"Ӧ������˰Ϊ��"+j*12);
			    	}else{
			    	System.out.println(name+"������Ҫ��˰��");
			    	}
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
//	    System.out.print(name+"����ѧ���ǣ�"+fee*2+"    "+"��н�ǣ�"+wages*12+";   ��н-��ѧ��="+subtract+"    ");
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
//	    	System.out.println(name+"��Ӧ������˰Ϊ��"+j+"   "+"Ӧ������˰Ϊ��"+j*12);
//	    	}else{
//	    	System.out.println(name+"������Ҫ��˰��");
//	    	}
	}    
//	public String setName(Doctor name) {
//		System.out.println("���������������");  
//		Scanner in1 = new Scanner(System.in);
//		String names=in1.next();
//		return names;
//	}
}
