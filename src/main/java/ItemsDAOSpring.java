package main.java;

import java.util.ArrayList;
import java.util.List;

public class ItemsDAOSpring implements ItemDAO {
    @Autowired
    private ItemsRepository itemsRepository;

    public List<String> findAll() {
        ArrayList<String> allItems = new ArrayList<String>();
        for (Items i : itemsRepository.findAll()) {
            allItems.add(i.getItemName());}
        return allItems;
    }
}
