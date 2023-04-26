package dao;

public class ImpDao implements IDao{
    @Override
    public double getData() {

        System.out.println("version1");
        double temp=9.0;
        return temp;
    }
}
