/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;
import week4.task1.Orange;
import week4.task1.Fruit;
import week4.task1.Apple;
import week4.task1.Cao_Phong_Orange;
import week4.task1.Sanh_Orange;


public class Task1{
    public static void main(String[] arg){
        Sanh_Orange Orange1 = new Sanh_Orange();
        Orange1.setColor("orange");
        Orange1.setPrice(20000);
        Orange1.setWeigh(2);
        Orange1.setShape("Round");
        Orange1.getInfo();
    }
}