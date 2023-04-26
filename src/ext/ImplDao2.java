package ext;

import dao.IDao;

public class ImplDao2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version 2");
        double temp=2;
        return temp;
    }
}
