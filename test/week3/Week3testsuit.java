package week3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class Week3testsuit {
    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testmax(){
        assertEquals(5,Week3.max(4,5));
        assertEquals(2,Week3.max(2,1));
        assertEquals(9,Week3.max(9,6));
        assertEquals(9,Week3.max(9,1));
        assertEquals(9,Week3.max(8,9));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()

    @Before
    public void init(){
        int arr1[] = new int[] {5,4,2,1,2,5,6};
        int arr2[] = new int[] {12,23,456,23,546,476};
        int arr3[] = new int[] {45,34,6657,345,37,4563,45};
        int arr4[] = new int[] {123,324,543,556,54,67,35,45,34,5,3456,54,6};
        int arr5[] = new int[] {23234,234,235,3,24,23,4,325,34,6,54,6,456};
    }

    @Test
    public void testminOfArray(){
        int arr1[] = new int[] {5,4,2,1,2,5,6};
        int arr2[] = new int[] {12,23,456,23,546,476};
        int arr3[] = new int[] {45,34,6657,345,37,4563,45};
        int arr4[] = new int[] {123,324,543,556,54,67,35,45,34,5,3456,54,6};
        int arr5[] = new int[] {23234,234,235,3,24,23,4,325,34,6,54,6,456};

        assertEquals(1,Week3.minOfArray(arr1));
        assertEquals(12,Week3.minOfArray(arr2));
        assertEquals(34,Week3.minOfArray(arr3));
        assertEquals(5,Week3.minOfArray(arr4));
        assertEquals(3,Week3.minOfArray(arr5));
    }


    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testcalculateBMI(){
        String BMI1 = Week3.calculateBMI(50,1.5);
        String BMI2 = Week3.calculateBMI(60,1.7);
        String BMI3 = Week3.calculateBMI(55,1.45);
        String BMI4 = Week3.calculateBMI(65,1.56);
        String BMI5 = Week3.calculateBMI(50,1.7);
        assertEquals("Binh thuong",BMI1);
        assertEquals("Binh thuong",BMI2);
        assertEquals("Thua can",BMI3);
        assertEquals("Thua can",BMI4);
        assertEquals("Thieu can",BMI5);
    }

}
