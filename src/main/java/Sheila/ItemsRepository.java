package Sheila;

import org.springframework.data.repository.CrudRepository;
import Sheila.Items;


public interface ItemsRepository extends CrudRepository<Items, Integer> {
    public String findByID(Integer id);
}

