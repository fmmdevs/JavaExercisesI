package devs.fmm.writingyourownclasses.interfaces;

public interface Distance {

    static Distance ofMeter(int value){
        return new Distance() {
            @Override
            public int meter() {
                return value;
            }

            @Override
            public int kilometer() {
                return value/1000;
            }
        };
    }

    static Distance ofKilometer(int value){
         return new Distance() {
             @Override
             public int meter() {
                 return value*1000;
             }

             @Override
             public int kilometer() {
                 return value;
             }
         };
    }

    abstract int meter();

    abstract int kilometer();

    
}
