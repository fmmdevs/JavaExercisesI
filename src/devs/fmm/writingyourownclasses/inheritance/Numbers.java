package devs.fmm.writingyourownclasses.inheritance;

class One {
    public One(){
        System.out.println(1);
    }
}

class Two extends One{
    public Two(){
        System.out.println(2);
    }
}

class Three extends Two{
    public Three(){
        System.out.println(3);
    }
}


public class Numbers {
    public static void main(String[] args) {
        new Three();
    }
}
