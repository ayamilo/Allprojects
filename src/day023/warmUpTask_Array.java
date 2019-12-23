package day023;

public class warmUpTask_Array {
    public static void main(String[] args) {

        // create an int array of 7 times
        // assign values
        // 1. print out in reverse order
        // 2. store last item in a variable called lastItem
        // print it out separately
        //3. print the item right in the middle
        //OPTIONALLY : find sum, find average, find max,find min
        // double the value of each items in this array
//first way to create an array object and add value into index locations
        int[] nums = new int[7];

        nums[0] = 11;
        nums[1] = 2;
        nums[2] = 23;
        nums[3] = 4;
        nums[4] = 53;
        nums[5] = 6;
        nums[6] = 3;
        System.out.println();

        // 2nd way to create an array with values already filled
        // this must happen in the same line
        int[]  num2=new int[]{11,23,4,53,6,3};
        //3rd way
        int[] num3={11,23,4,53,6,3};

        for (int x = nums.length - 1; x >= 0; x--) {
            System.out.println("index " + x + " : " + nums[x]);
        }

        int arraySize = nums.length;
        int lastItemIndex = arraySize - 1;

        int lastItemValue = nums[lastItemIndex];

        System.out.println("last Item Value = " + lastItemValue);

        int middleItemIdex = arraySize / 2;
        System.out.println("middle item value  = " + nums[middleItemIdex]);


        int sum = 0;
        for (int x = 0; x < arraySize; x++) {

//            int currentItem =  nums[x] ;
//            sum = sum + currentItem ;
            sum = sum + nums[x];  // sum += nums[x]


        }
        System.out.println("sum = " + sum);


    }



    }



