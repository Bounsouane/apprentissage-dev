package exerciceVehicule;

public class Main {
    public static void main(String[] args) {
        Bmw bm = new Bmw("e36",190,8);
        bm.setPlaque("6df5s1s6q54d65qs");
        System.out.println(bm.toString());
        System.out.println(bm.classerVitesse());

        Titanic tt = new Titanic("ed", 200,150);
        tt.setPlaque("qsdhsqjdhgsjdhqd626");
        System.out.println(tt.toString());
        System.out.println(tt.couler());

        Vg vg = new Vg("jsp",50,900);
        vg.setPlaque("2s561q2d614s5d4q");
        System.out.println(vg.livrer());
        System.out.println(vg.classerVitesse());
        System.out.println(vg.toString());
    }
}
