package Sheila;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories("camping.data")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})

public class config {
    @Bean
    public ItemsDAO itemDao() { return new ItemsDAOSpring(); }

    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean em
                = new LocalEntityManagerFactoryBean();
        em.setPersistenceUnitName("items");
        return em;
    }

    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager manager = new JpaTransactionManager();
        return manager;
    }

}
