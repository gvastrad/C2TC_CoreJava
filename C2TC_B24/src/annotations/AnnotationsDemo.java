package annotations;

import java.lang.annotation.Annotation;
@SmartTV(os="android", height=40, width=50)
@SmartPhone(os="android", version=12)
class Android_Series
{
String model;
int screensize;
public Android_Series(String model, int screensize) {
	this.model = model;
	this.screensize = screensize;
}
}
public class AnnotationsDemo {
	public static void main(String[] args) {
		Android_Series obj=new Android_Series("A23",14);
		System.out.println(obj.model);
		System.out.println(obj.screensize);	
		
		System.out.println("SmartPhome details");
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		
		System.out.println(s.os());
		System.out.println(s.version());
		
		System.out.println("SmartTV details");
		
		Annotation an1=c.getAnnotation(SmartTV.class);
		SmartTV s1=(SmartTV)an1;
		
		System.out.println(s1.os());
		System.out.println(s1.height());
		System.out.println(s1.width());
		
	}
}
