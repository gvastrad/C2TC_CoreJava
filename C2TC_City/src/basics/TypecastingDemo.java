package basics;

public class TypecastingDemo {
	
		public static void main(String[] args) {
			
           //explicit typecasting			
	       float f = 10.532f;
	       long l = (long) f;
	       System.out.println(l);
	       
	       //implicit typecasting
	       byte b=58;
	       short s=b;
	       System.out.println(s);
	       
	       //narrowing
	       float f1=22.34f;
	       double d=f1;
	       System.out.println(f1);
	       System.out.println(d);
	       
	       //widening
	       double d1=34.45;
	       float f2=(float)d1;
	       System.out.println(d1);
	       System.out.println(f2);
	       
		}
	}

