import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] a = new int[n + 1][m + 1];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = scn.nextInt();

      }
    }

    int i = 0;
    int j = 0;

    int d = 0;
    while (((i >= 0) && (i < (n))) && ((j >= 0) && (j < (m)))) {
      if ((a[i][j] == 0) && (d == 0)) {
        if (j < (m - 1))
          j++;
        else
        {
          System.out.println(i + "
                             " + j);
                             break;
        }


      }
      else if ((a[i][j] == 0) && (d == 1)) {
        if (i < (n - 1))
          i++;
        else
        {
          System.out.println(i + "
                             " + j);
                             break;
        }

      } else if ((a[i][j] == 0) && (d == 2)) {
        if (j > 0)
          j--;
        else
        {
          System.out.println(i + "
                             " + j);
                             break;
        }


      }
      else if ((a[i][j] == 0) && (d == 3)) {
        if (i > 0)
          i--;
        else
        {
          System.out.println(i + "
                             " + j);
                             break;
        }


      }
      else if ((a[i][j] == 1) && (d == 0)) {
        if (i < (n - 1))
          i++;
        else
        {
          System.out.println(i + "
                             " + j);
                             break;
        }
        d = 1;


      }
      else if ((a[i][j] == 1) && (d == 1)) {
        if (j > 0)
          j--;
        else
        {
          System.out.println(i + "
                             " + j);
                             break;
        }
        d = 2;


      }
      else if ((a[i][j] == 1) && (d == 2)) {
        if (i > 0)
          i--;
        else
        {
          System.out.println(i + "
                             " + j);
                             break;
        }
        d = 3;


      }
      else if ((a[i][j] == 1) && (d == 3)) {
        if (j < (m - 1))
          j++;
        else
        {
          System.out.println(i + "
                             " + j);
                             break;
        }
        d = 0;


      }

    }



  }

}
