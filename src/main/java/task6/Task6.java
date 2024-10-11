package task6;

import org.hibernate.Session;

public class Task6 {
    public static void main(String[] args) {
        Session session = HibernateConnector.getSessionFactory().openSession();
        Data data = new Data();
//        Rgb rgb = new Rgb(45, 55 ,65);
//        data.setRgb(rgb);
        data.setIsPrimary(true);

        session.save(data);
        session.close();
    }
}
