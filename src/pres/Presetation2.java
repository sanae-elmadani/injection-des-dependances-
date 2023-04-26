package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

// exemple qui met en place le principe de l'injection de dépendances et de concept ouvert/fermé
//le framework spring qui s'oocupe de ce travaille

public class Presetation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //instanciation dynamique
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.next();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getData());

//instanciation dynamique
        String metierClassName = scanner.nextLine(); // consume the empty line
        metierClassName = scanner.nextLine(); // read the second line
        System.out.println(metierClassName);
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

//Methode dynamique pour qu'on puisse acceder aux methodes de la classe de la ligne 2 du fichier conf

        Method method = cMetier.getMethod("setDao", IDao.class);
//metier.setDao(dao)
        method.invoke(metier, dao);

        System.out.println(metier.calcule());









    }
}
