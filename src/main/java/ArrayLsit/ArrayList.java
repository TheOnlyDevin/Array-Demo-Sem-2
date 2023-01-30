package ArrayLsit;
import ...


public class ArrayList {
    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(100);

        myList.add(200);

        myList.add(300);

        myList.add(400);

        myList.add(500);

        myList.add(600);

        myList.add(700);

        myList.add(800);

        myList.add(900);

        myList.add(1000);
        loop(myList);

        Scanner myScan = new Scanner(System.in);

        try
        {
            System.out.println("Please enter a new number: ");
            myList.add(myScan.nextInt());
            loop(myList);
        }
        catch (ArrayIndexOutOfBoundsException aiob)
        {
            System.out.println("We went ouside of our a;;pcated memory block "+ aiob);

        }

        public static void loop(java.util.ArrayList<Integer> someArrayList)
        {
            int indexVlaue = 0;
            for(int value: someArrayList)
            {
                System.out.println("Element at index " +indexVlaue + " : " + value);
                indexVlaue++;
            }
        }
    }
}
