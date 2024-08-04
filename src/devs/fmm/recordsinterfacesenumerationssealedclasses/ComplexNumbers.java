package devs.fmm.recordsinterfacesenumerationssealedclasses;

public class ComplexNumbers {

    public final int I =-1;

    record Complex(double real, double imaginary){


        @Override
        public String toString() {
            return "Complex{" +
                    "real=" + real +
                    ", imaginary=" + imaginary +
                    '}';
        }

        public  Complex add(Complex other){
            return new Complex(other.real+this.real, other.imaginary+this.imaginary);
        }

        public Complex substract(Complex other){
            return new Complex(other.real-this.real, other.real*this.imaginary+other.imaginary*this.real);
        }
        public Complex multiply(Complex other){
            return new Complex(other.real*this.real-this.imaginary*other.imaginary, other.imaginary*this.imaginary)
        }

        // TO-DO abs()          !



    }

    public Complex add(Complex other){

    }

}
