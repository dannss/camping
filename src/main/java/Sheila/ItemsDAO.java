package Sheila;

import java.util.List;

public interface ItemsDAO {
    public List<String> findAll();
    public boolean save(Items items);
    public Items findById(String id);
    public String findByID(String id);
    public boolean insertItems(Items items);
    public boolean deleteItems(Items items);
    public boolean update(Items items);
}
