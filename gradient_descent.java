import java.util.*;
public class gradient_descent {
    public static void main(String args[])
    {
        double x[]={1,2,3,4,5,6,7,8,9,10,10};
        double y[]={0.39343,0.43525,0.6015,0.55794,0.66029,0.9394,0.98273,1.09431,1.05582,1.22391,1.21872};
        double pred[]=new double[11];
        double l=0.01,m=0,c=0;
        double sse=0;
        int i=0;
        int epoch=1;
        double dm=0,dc=0;
        while(epoch<=10)
        {
            System.out.println("Epoch No.:"+epoch++);
            System.out.println("Current slope is: "+m+" Current intercept is: "+c);
            System.out.println("Predicted Values:");
            for(i=0;i<11;i++)
            {
                pred[i]=m*x[i]+c;
                System.out.println("For "+x[i]+" predicted value = "+pred[i]);
                sse=sse+Math.pow((y[i]-pred[i]),2);
            }
            System.out.println("Sum Of Square Error is:"+sse);
            if(sse<0.005)
            break;
            sse=0;
            System.out.println("Updating slope and intercept");
            for(i=0;i<11;i++)
            {
                dm=dm+(-2*x[i])*(y[i]-pred[i]);
                dc=dc+(-2)*(y[i]-pred[i]);
            }
            System.out.println("dm = "+dm);
            System.out.println("dc = "+dc);
            m=m-l*dm;
            c=c-l*dc;
            dm=0;
            dc=0;
        }
        if(sse==0)
        {
        for(i=0;i<11;i++)
        {
            pred[i]=m*x[i]+c;
            sse=sse+Math.pow((y[i]-pred[i]),2);
        }
        }
        System.out.println("Final Sum Of Square Error is:"+sse);
        System.out.println("Final values of slope and intercept are:");
        System.out.println("slope(m) = "+m);
        System.out.println("intercept(c) = "+c);
    }
    
}
