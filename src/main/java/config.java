package main.java;

@Configuration
@EnableJpaRepositories("camping.data")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})

public class config {
    @Bean
    public ItemDAO itemDao() { return new ItemDAOSpring(); }

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
