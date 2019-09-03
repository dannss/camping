package main.java;

import java.util.List;

public interface ItemDAO {
    public List<String> findAll();
    public boolean save(Items items);
    public Items findById(String id);
    public boolean insertItems(Items items);
    public boolean deleteItems(Items items);
    public boolean update(Items items);
}
