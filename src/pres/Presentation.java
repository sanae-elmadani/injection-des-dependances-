package pres;

import dao.ImpDao;
import metier.ImpMetier;



public class Presentation {
    public static void main(String[] args) {
        //instanciation statique==> new
        //donc on doit toujours changer dans le code source
        //so on ne respecte ps le principe de ouvert a l'extensions et ferme
        //a la modification
        ImpDao dao=new ImpDao();
        ImpMetier  metier =new ImpMetier();
        metier.setDao(dao);

        System.out.println(metier.calcule());
    }
}
