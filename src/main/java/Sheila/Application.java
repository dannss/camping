package Sheila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Sheila.ItemsDAO;


@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    private ItemsDAO itemsDao;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        ApplicationContext ctx = new AnnotationConfigApplicationContext("Sheila");
        ItemsDAO itemsDao = ctx.getBean(ItemsDAO.class);
        //RouteDAO routeDao = ctx.getBean(RouteDAO.class);

        Items tent = new Items("Tent", "This is the tent", "Sleeping", 1.1, "tent.jpg");

        itemsDao.save(tent);

        System.out.println(itemsDao.findAll());

    }

}


