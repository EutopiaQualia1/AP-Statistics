import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Utils
{
      public static Random random = new Random();
      public static Scanner scanner = new Scanner(System.in);
      public static void main(String[] args)
      {
            for (int i = 0; i < 5; i++)
            {
                  System.out.println(randomRange(5, 1, 5));
            }
      }
      public static Set<Integer> randomRange(int max, int min, int size)
      {
            Set<Integer> values = new LinkedHashSet<>();

            while (values.size() < size)
            {
                  values.add(nextIntRangeInclusive(max, min));
            }
            return values;
      }
    
      public static int nextIntRangeInclusive(int max, int min)
      {
            return random.nextInt(max - min + 1) + min;
      }
}