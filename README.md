# 计G201  2020322067  李慧娟  
### 接口实现
## 阅读程序
1. 设计两个管理接口：学生管理接口和教师管理接口。  
 + &ensp;&ensp; 学生接口 (Student) 包括缴纳学费、查学费的方法  
 + &ensp;&ensp; 教师接口 (Teacher) 包括发放薪水和查询薪水的方法  
2. 设计博士研究生类 (Doctor) ，实现上述的两个接口  
 + &ensp;&ensp; 该博士研究生具有姓名(name) 、性别(sex) 、年龄(age) 、每学期学费(fee) 、每月薪水(wages) 属性
3. 编写测试类 (Test)，实例化两名博士研究生
 + &ensp;&ensp; 统计他们的年收入和学费
 + &ensp;&ensp; 根据两者之差，算出每名博士研究生的年应纳税金额  
## 实验目的
1. 掌握Java中抽象类和抽象方法的定义；
2. 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
3. 了解异常的使用方法，并在程序中根据输入情况做异常处理
## 实验过程
1. 学生管理接口（Student）  
&ensp;&ensp;编写两个抽象方法：缴学费pay(double x)、查学费check(double x)  
2. 教师管理接口（Teacher）  
&ensp;&ensp;编写两个抽象方法：发薪水pay_wages(double x)、查薪水check_wages(double x)  
3. 博士研究生类（Doctor）  
&ensp;&ensp;定义属性；  
&ensp;&ensp;定义set()，get()方法；  
&ensp;&ensp;定义setFeeWage1(String a,String b)方法：采用运行时通过main方法的参数args一次性赋值  
&ensp;&ensp;定义setFeeWage(Doctor stu)方法：采用Scanner类实现运行时交互式输入。  
&ensp;&ensp;根据输入情况，在程序中做异常处理：try-catch  
4. 测试类(Test)   
&ensp;&ensp;实例化两个博士研究生对象：doc1，doc2  
&ensp;&ensp;定义常量(static final)：个人月起征税点  
&ensp;&ensp;doc1采用Scanner类实现运行时交互式输入，调用setFeeWage(doc1)方法  
&ensp;&ensp;doc2采用运行时通过main方法的参数args一次性赋值，调用setFeeWage1(args[0],args[1])方法    
&ensp;&ensp;定义tax()方法实现并返回年薪与年学费之差  
&ensp;&ensp;定义see()方法实现年应纳税金额，利用if-else语句来体现税率  
&ensp;&ensp;根据输入情况，在程序中做异常处理：try-catch  
## 核心方法
1. 采用运行时通过main方法的参数args一次性赋值:  
&ensp;setFeeWage1(String a,String b)方法：//String类型转换为Double类型  
```
public void setFeeWage1(String a,String b) {           //设置每学期费用，每月薪水
		fee=Double.parseDouble(a);                         //String类型转换为Double类型
		wages=Double.parseDouble(b);
	}
```
2. 采用Scanner类实现运行时交互式输入:   
&ensp;setFeeWage(Doctor stu):  (包含try-catch，if-else语句)     
```
public void setFeeWage(Doctor stu) {            //设置Scanner方法
		System.out.println("请输入你的姓名、学费和工资：");  
		try {	Scanner in = new Scanner(System.in);                    //异常处理
				String name=in.next();
				double fee = in.nextDouble();
				double wages = in.nextDouble();
				double subtract=wages*12-fee*2;
        if(fee<=0||wages<=0) {
				System.out.println("您输入的学费或工资为负数！输入有误！不能查询年学费，年薪和年税");
        :
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
   }
```
3. tax()方法实现并返回年薪与年学费之差
```
public static double tax(Doctor stu){               //年薪-年学费之差
		stu.getFee();
		stu.getWages();
		Double value=stu.getWages()*12-stu.getFee()*2;
		return value;
	}
```  
## 实验结果
1. 对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
![alt 点击图片](http://m.qpic.cn/psc?/V51PA3o90d17IF0JFyFi0lN3aB2Fw6re/bqQfVz5yrrGYSXMvKr.cqVuzMmr5xcjNl8PQ.Tpi5Te8vDm05CYDJridSkwO9841VK5jpgtF3ahqZEykerT6zRx2v4CIWWSl1IrDIJWyLH4!/b&bo=6ARmAQAAAAADB6k!&rf=viewer_4)  
![alt 点击图片](http://m.qpic.cn/psc?/V51PA3o90d17IF0JFyFi0lN3aB2Fw6re/TmEUgtj9EK6.7V8ajmQrEILaHcIFzSveppjHxxvawEquPSXq63cMkB82nITIl*8FmFjXs2QzfRIUMuTLUwMEyEX*breLmJ6IUZY3PTucgCg!/b&bo=FQPEAQAAAAADF.E!&rf=viewer_4)  
2. 当输入工资或学费<0时，输出异常信息  
![alt 点击图片](http://m.qpic.cn/psc?/V51PA3o90d17IF0JFyFi0lN3aB2Fw6re/TmEUgtj9EK6.7V8ajmQrEB.NovLma*YXhypE8MActREX2hopweLHWRbEsPP3luUE5eN4muaa51c.C.1z06hjqbhe2DggibFesueBD7HSevU!/b&bo=pAJQAQAAAAADF8U!&rf=viewer_4)  
![alt 点击图片](http://m.qpic.cn/psc?/V51PA3o90d17IF0JFyFi0lN3aB2Fw6re/TmEUgtj9EK6.7V8ajmQrEEFF.z8KEj
:
li9wXLePiH2q1BAsoBqkD80V*dUesbvKuDF8umMeBnAIvTly7IaWuMPle.9If6IqhFhovhVqPs57k!/b&bo=iwNQAQAAAAADF.s!&rf=viewer_4)  
## 实验感想  
1. 掌握了接口的定义，了解了异常的处理  
2. 小问题：当用户输入名字时不是字符串格式，处理这个异常没有实现，不太会！！！  
（作业之前交到其他同学的GitHub中了，因为同学之前电脑死机用了我的电脑写的readme。我写实验的时候没有看账号，直接登陆进去了。）
