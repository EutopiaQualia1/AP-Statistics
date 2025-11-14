import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomRange
{
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main (String[] args)
    {
        Set<Integer> values = new LinkedHashSet<>();
        int max, min, size;
        
        System.out.print("Max:");
        max = scanner.nextInt();
        System.out.print("Min:");
        min = scanner.nextInt();
        System.out.print("Size:");
        size = scanner.nextInt();
        
        while (values.size() < size)
        {
            values.add(nextIntRangeInclusive(max, min));
        }
        System.out.print(values);
    }
    
    public static int nextIntRangeInclusive(int max, int min)
    {
        return random.nextInt(max - min + 1) + min;
    }
}  