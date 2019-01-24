class student {

int rollno, total,sub1, sub2, sub3;
float percentage;

void sd(int r,int s1,int s2,int s3)
{
   rollno=r;
   sub1=s1;
   sub2=s2;
   sub3=s3;
   total=sub1+sub2+sub3;
   percentage=total/3;
}
void gd()
{
	System.out.println("rollno "+rollno+ "sub1 "+sub1+"sub2 "+sub2+ "sub3 "+sub3+"total"+total+
    "percentage "+percentage);
}
}
public class abc
{
  public static void main(String[] args) {
  	
   student [] obj =  new student[3];
   for(int i=0;i<3;i++)
   {
     obj[i]=new student();
   }
   System.out.println("ARRAY OF OBJECTS "+" "+" obj 1");
   obj[0].sd(414,40,60,50);
   obj[0].gd();
   System.out.println(" ");
   System.out.println(" obj 2");
   obj[1].sd(323,30,90,50);
   obj[1].gd();
   System.out.println(" ");
   System.out.println(" obj 3");
   obj[2].sd(313,60,80,60);
   obj[2].gd();

  }
}
