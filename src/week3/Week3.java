package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if (m > n) return m;
        else return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min = array[0];
        for (int i = 1 ; i <  array.length ; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight/(height*height);
        String s = "ok";
        if (BMI < 18.5) s = "Thieu can" ;
        if (BMI >= 18.5 && BMI <= 24.9 ) s = "Binh thuong";
        if (BMI >= 25.0 && BMI <= 29.9) s = "Thua can";
        if (BMI >= 30) s = "Beo Phi";
        return s;
    }
    public static void main(String[] arg){
        System.out.println(max(5,3));
        int arr[] = new int[] {5,3,2,4,1};
        System.out.println(minOfArray(arr));
        String BMI1 = calculateBMI(55,1.8);
        System.out.println(BMI1);
        System.out.println(calculateBMI(55,1.7));
    }
}
