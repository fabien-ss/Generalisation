package test;

import java.sql.Connection;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import generic.base.Connexion;
import generic.kodro.A;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Connection c = new Connexion().enterToBdd();

        Test3 test3 = new Test3();
        test3.setId("T001");

        test3 = (Test3) A.select(c, test3).get(0);

        System.out.println(test3.getTest().getTest());
        /*Test2 test;
        LocalDateTime localDate = LocalDateTime.now();
        for (int i = 0; i < 5; i++) {
            test = new Test2();
            test.setTest("OKOK");
            A.insert(c, test);
        }
        c.commit();

        LocalDateTime localDate1 = LocalDateTime.now();

        Timestamp timestamp1 = Timestamp.valueOf(localDate);
        Timestamp timestamp2 = Timestamp.valueOf(localDate1);


        long diff = (long) ((timestamp1.getTime() - timestamp2.getTime()));

        System.out.println("seconde "+diff);

        test = new Test2();
        test.setIdtest("V271869");
        List<Test2> tests = A.select(c, test);
        System.out.println(tests.size());
        for (Test2 t : tests) {
            System.out.println(t.getIdtest() + ", " + t.getTest());
        }
        /*Etudiant etudiant = new Etudiant("Kk", "dsq");
        etudiant.insert(null);
        Etudiant etudiant2 = new Etudiant("coco", "cece");
        etudiant.update(null, etudiant2);

        Etudiant etudiant3 = (Etudiant) new Etudiant().select(null).get(0);
        System.out.println("Je suis l'étudiant 3 plaque " + etudiant3.getMatricule() + " matricule " + etudiant3.getNom());
        etudiant3.delete(null);*/
    }
}

