package task6;

import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        Session session = HibernateConnector.getSessionFactory().openSession();
        // create
        Data data = new Data();
        Rgb rgb = new Rgb(45, 55 ,65);
        data.setIsPrimary(true);
        data.setRgb(rgb);
        List<String> colorList = Arrays.asList("purple", "green", "blue");
        data.setColors(colorList);
        Long id = (Long) session.save(data);

        //read
        Data readData = session.get(Data.class, id);
        System.out.println(readData);

        // update
        data.setIsPrimary(false);
        System.out.println(data);

        // delete
        session.delete(readData);

        session.close();
    }
}
