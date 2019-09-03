package main.java;

@Entity @Table(name="items")
public class Items {
    public Items(int id, String itemName, String itemDetail, String category, String weight, String pictureFilePath) {
        this.id = id;
        this.itemName = itemName;
        this.itemDetail = itemDetail;
        this.category = category;
        this.weight = weight;
        this.pictureFilePath = pictureFilePath;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String itemName;
    private String itemDetail;
    private String category;
    private String weight;
    private String pictureFilePath;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPictureFilePath() {
        return pictureFilePath;
    }

    public void setPictureFilePath(String pictureFilePath) {
        this.pictureFilePath = pictureFilePath;
    }


}
