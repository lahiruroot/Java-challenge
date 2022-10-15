import java.util.Scanner;

public class fractional_knapsack
 {
    public static void main(String args[])
    {  
        int i,j=0,max_qty,m,n;  
        float sum=0,max;  
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no of items");  
        n=sc.nextInt(); 
        int array[][]=new int[2][n];  
        System.out.println("Enter the weights of each items");
        for(i=0;i<n;i++)  
            array[0][i]=sc.nextInt();    
 
        System.out.println("Enter the values of each items");
        for(i=0;i<n;i++)  
            array[1][i]=sc.nextInt(); 
 
        System.out.println("Enter maximum volume of knapsack :");  
        max_qty=sc.nextInt();  
 
        m=max_qty;  // m tells the remaining size of the knapsack
        while(m>=0)  
        {  
            max=0;    // find the max price per kg from the remaining items
            for(i=0;i<n;i++)  
            {  
                if(((float)array[1][i])/((float)array[0][i])>max)  
                {  
                    max=((float)array[1][i])/((float)array[0][i]);  
                    j=i;  
                }  
            }  

            if(array[0][j]>m)  //when the bag is almost full and we want to add fractional value
            {  
                System.out.println("Quantity of item number: " +  (j+1) + " added is " +m);  
                sum+=m*max;  
                m=-1;           //m=-1 to get out of while loop  
            }  
            else       //in the normal case when we can insert the whole items
            {  
                System.out.println("Quantity of item number: " + (j+1) + " added is " + array[0][j]);  
                m-=array[0][j];  
                sum+=(float)array[1][j];  
                array[1][j]=0;  //now the max value has been converted to zero so that it is not added again
            }  
        }  

        System.out.println("The Maximum profit is " + sum);
        sc.close();
    }  
}

