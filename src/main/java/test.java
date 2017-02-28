import bean.Even;
import bean.EvenFactory;
import service.DaggerService;
import service.Service;

/**
 * Created by Yang&Yu on 2017/2/25.
 */
public class test {

    public static void main(final String[] arg) {
        final Service s = DaggerService.builder().build();
        final EvenFactory evenFactory = s.get();
        final Even e = evenFactory.getEven();

        System.out.println("ID:" + e.getId());
        System.out.println("Name:" + e.getName());
        System.out.println("Date:" + e.getDate());
        System.out.println("Is important:" + e.isImportant());
    }
}
