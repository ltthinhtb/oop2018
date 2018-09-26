package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private
        int numerator,denominator;

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        while (b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    public Fraction(int numerator, int denominator) {
        int x = gcd(numerator,denominator);
        this.numerator = numerator / x;
        this.denominator = denominator / x;
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    Fraction(){
        this.numerator = 1;
        this.denominator = 2;
    }


    public boolean equals(Fraction o) {
        if (this.numerator*o.denominator - o.numerator*this.denominator  < 0) return false;
        else return true;
    }

    public void print() {
        System.out.print(this.numerator);
        System.out.print("/");
        System.out.print(this.denominator);
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction add = new Fraction();
        add.numerator = this.numerator*other.denominator + this.denominator*other.numerator;
        add.denominator = this.denominator*other.denominator;
        return add;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction subtract = new Fraction();
        subtract.numerator = this.numerator*other.denominator - this.denominator*other.numerator;
        subtract.denominator = this.denominator*other.denominator;
        return subtract;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multiply = new Fraction();
        multiply.numerator = this.numerator * other.numerator;
        multiply.denominator = this.denominator * other.denominator;
        return multiply;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction divide = new Fraction();
        divide.numerator = this.numerator / other.numerator;
        divide.denominator = this.denominator / other.denominator;
        return divide;
    }
    public static void main(String[] arg){
        Fraction a = new Fraction(6,9);
        Fraction b = new Fraction(2,3);
        System.out.print(a.equals(b));

    }
}
