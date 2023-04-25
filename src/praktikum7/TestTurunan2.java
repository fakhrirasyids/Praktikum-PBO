package praktikum7;

public class TestTurunan2 {
    public static void main(String[] args) {
        new Empat("kiriman untuk mbah buyut... alfatihah");
    }
}

class Satu {
    Satu(String s) {
        System.out.println("satu........" + s);
    }
}

class Dua extends Satu {
    Dua(String s) {
        super(s);
        System.out.println("dua........");
    }
}

class Tiga extends Dua {
    Tiga(String s) {
        super(s);
        System.out.println("tiga........");
    }
}

class Empat extends Tiga {
    Empat(String s) {
        super(s);
        System.out.println("empat........");
    }
}