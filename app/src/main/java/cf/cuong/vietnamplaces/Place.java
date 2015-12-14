package cf.cuong.vietnamplaces;

/**
 * Created by Tvc97 on 12/14/15.
 */
public class Place {
    private String name;
    private String detail;
    private int image;

    public Place(String name, String detail, int image) {
        setName(name);
        setDetail(detail);
        setImage(image);
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
