package oops.Inheritance;



class Aeroplane {
    void flying() {
        System.out.println("Aeroplane is flying");
    }

    void landing() {
        System.out.println("Aeroplane is landing ");
    }
}

class CargoPlane extends Aeroplane {

    // inheritance follows IS - a relationship
}

class CommercialPlane extends Aeroplane {

}

class PassengerPlane extends CommercialPlane {
}


public class Inhertiance1 {
    public static void main(String[] args) {
//        CargoPlane cp = new CargoPlane();
//        cp.flying();
//        cp.landing();
//        PassengerPlane pp = new PassengerPlane();
//        pp.flying();
//        pp.landing();

        PassengerPlane ps = new PassengerPlane();
        ps.landing();
        ps.flying();
    }
}
