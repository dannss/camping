package Sheila;

import org.springframework.beans.factory.annotation.Autowired;
import Sheila.ItemsRepository;
import java.util.ArrayList;
import java.util.List;

public class ItemsDAOSpring implements ItemsDAO {
    @Autowired
    private ItemsRepository itemsRepository;

    public List<String> findAll() {
        ArrayList<String> allItems = new ArrayList<String>();
        for (Items i : itemsRepository.findAll()) {
            allItems.add(i.getItemsName());}
        return allItems;
    }

    @Override
    public boolean save(Items items) {
        return false;
    }

    @Override
    public Items findById(String id) {
        return null;
    }

    @Override
    public String findByID(String id) {
        return null;
    }

    @Override
    public boolean insertItems(Items items) {
        return false;
    }

    @Override
    public boolean deleteItems(Items items) {
        return false;
    }

    @Override
    public boolean update(Items items) {
        return false;
    }
}
