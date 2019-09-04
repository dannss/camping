package Sheila;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;

@Entity @Table(name="items")
public class Items {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String itemsName;
    private String itemsDetail;
    private String category;
    private double weight;
    private String pictureFilePath;

    public Items(String itemsName, String itemsDetail, String category, double weight, String pictureFilePath) {
        this.itemsName = itemsName;
        this.itemsDetail = itemsDetail;
        this.category = category;
        this.weight = weight;
        this.pictureFilePath = pictureFilePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemName) {
        this.itemsName = itemName;
    }

    public String getItemsDetail() {
        return itemsDetail;
    }

    public void setItemsDetail(String itemDetail) {
        this.itemsDetail = itemsDetail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPictureFilePath() {
        return pictureFilePath;
    }

    public void setPictureFilePath(String pictureFilePath) {
        this.pictureFilePath = pictureFilePath;
    }


}
