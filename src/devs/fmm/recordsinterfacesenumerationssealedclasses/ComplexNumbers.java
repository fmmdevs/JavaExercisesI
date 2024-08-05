package devs.fmm.recordsinterfacesenumerationssealedclasses;

public class ComplexNumbers {

    public final int I =-1;

    record Complex(double real, double imaginary){


        @Override
        public String toString() {

            // String.format always rounding half-up
            return "("+String.format("%.3f",real)+", "+ String.format("%.3f",imaginary)+"i)";
        }

        public  Complex add(Complex other){

            return new Complex(other.real+this.real, other.imaginary+this.imaginary);
        }

        public Complex subtract(Complex other){
            return new Complex(this.real-other.real, this.imaginary-other.imaginary);
        }


        public Complex multiply(Complex other){
            return new Complex(other.real*this.real-this.imaginary*other.imaginary, this.real*other.imaginary+this.imaginary*other.real);
        }

        // TO-DO abs()          !

        public Complex abs(Complex other){
            double real, imaginary;




            return new Complex(Math.abs(this.real-other.real),Math.abs(this.imaginary-other.imaginary));
        }


    }

    public static void main(String[] args) {
        Complex c1 = new Complex(-12,43);
        Complex c2 = new Complex(2,-3);
        Complex c3 = new Complex(-12,-10);

        System.out.println(c1.abs(c2));
        System.out.println(c2.abs(c1));
        System.out.println(c1.abs(c3));
        System.out.println(c3.abs(c1));
        System.out.println(c1.subtract(c2));


    }


}
