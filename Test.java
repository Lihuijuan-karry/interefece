package chance;

import java.util.Scanner;

public class Test {
	public static final int start=5000;                 //�������������˰��Ϊ5000 
	public static double tax(Doctor stu){               //��н-��ѧ��֮��
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
	    	System.out.println("��Ӧ������˰Ϊ��"+m+"   "+"Ӧ������˰Ϊ��"+m*12);
	    	}else{
	    	System.out.println("������Ҫ��˰��");
	    	}
	}
	public static void main(String[] args) {
		Doctor doc1=new Doctor();                         //��һ���о���
		Doctor doc2=new Doctor();                         //�ڶ����о���
		doc1.setFeeWage(doc1);                            //����Scanner���õķ���
//		doc2.setFeeWage(doc2);                            //����Scanner���õķ���
//		doc1.setFeeWages(args[0],args[1]);                //��������ʱͨ��main�����Ĳ���argsһ���Ը�ֵ args[0]=fee args[1]=wages
		try {	System.out.println("���������������"); 								                         //�쳣����
			 	Scanner in1 = new Scanner(System.in);
			 	String names=in1.next();
				doc2.setFeeWage1(args[0],args[1]);                //��������ʱͨ��main�����Ĳ���argsһ���Ը�ֵ
				if(doc2.getFee()<0||doc2.getWages()<0) {
					throw new MyException(names+"�������ѧ�ѻ���Ϊ�������������󣡲��ܲ�ѯ��ѧ�ѣ���н����˰");
				}else {
					System.out.println(names+"����ѧ���ǣ�"+doc2.getFee()*2+"   "+"��н�ǣ�"+doc2.getWages()*12+";   ��н-��ѧ��="+tax(doc2));
					see(doc2);
				}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		//		System.out.println("�о���1����ѧ��Ϊ��"+doc1.getFee()+"   "+"�о���1����нΪ��"+doc1.getWages());
//		System.out.println(doc2.setName(doc2)+"����ѧ���ǣ�"+doc2.getFee()*2+"   "+"��н�ǣ�"+doc2.getWages()*12+";   ��н-��ѧ��="+tax(doc2));
//		see(doc2);
	}
}
