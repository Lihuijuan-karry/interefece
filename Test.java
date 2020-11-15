package chance;

import java.util.Scanner;

public class Test {
	public static final int start=5000;                 //定义个人月起征税点为5000 
	public static double tax(Doctor stu){               //年薪-年学费之差
		stu.getFee();
		stu.getWages();
		Double value=stu.getWages()*12-stu.getFee()*2;
		return value;
	}
	public static void see(Doctor stu) {
		double diff=stu.getWages()-stu.getFee()-start; 
		double m=0;
		if(diff>0){
	    	if(diff<=1500){
	    	m=diff*0.03;
	    	}else if(diff<=4500){
	    	m=1500*0.03+(diff-1500)*0.1;
	    	}else if(diff<=9000){
	    	m=1500*0.03+3000*0.1+(diff-4500)*0.2;
	    	}else if(diff<=35000){
	    	m=1500*0.03+3000*0.1+4500*0.2+(diff-9000)*0.25;
	    	}else if(diff<=55000){
	    	m=1500*0.03+3000*0.1+4500*0.2+26000*0.25+(diff-35000)*0.3;
	    	}else if(diff<=80000){
	    	m=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(diff-55000)*0.35;
	    	}else {
	    	m=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(diff-80000)*0.45;
	    	}
	    	System.out.println("您应交的月税为："+m+"   "+"应交的年税为："+m*12);
	    	}else{
	    	System.out.println("您不需要交税！");
	    	}
	}
	public static void main(String[] args) {
		Doctor doc1=new Doctor();                         //第一个研究生
		Doctor doc2=new Doctor();                         //第二个研究生
		doc1.setFeeWage(doc1);                            //调用Scanner设置的方法
//		doc2.setFeeWage(doc2);                            //调用Scanner设置的方法
//		doc1.setFeeWages(args[0],args[1]);                //采用运行时通过main方法的参数args一次性赋值 args[0]=fee args[1]=wages
		try {	System.out.println("请输入你的姓名："); 								                         //异常处理
			 	Scanner in1 = new Scanner(System.in);
			 	String names=in1.next();
				doc2.setFeeWage1(args[0],args[1]);                //采用运行时通过main方法的参数args一次性赋值
				if(doc2.getFee()<0||doc2.getWages()<0) {
					throw new MyException(names+"您输入的学费或工资为负数！输入有误！不能查询年学费，年薪和年税");
				}else {
					System.out.println(names+"的年学费是："+doc2.getFee()*2+"   "+"年薪是："+doc2.getWages()*12+";   年薪-年学费="+tax(doc2));
					see(doc2);
				}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		//		System.out.println("研究生1的年学费为："+doc1.getFee()+"   "+"研究生1的年薪为："+doc1.getWages());
//		System.out.println(doc2.setName(doc2)+"的年学费是："+doc2.getFee()*2+"   "+"年薪是："+doc2.getWages()*12+";   年薪-年学费="+tax(doc2));
//		see(doc2);
	}
}
