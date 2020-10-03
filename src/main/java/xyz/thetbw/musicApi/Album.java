package xyz.thetbw.musicApi;

/**
 * 专辑
 * @author thetbw
 */
public class Album {

    /** 专辑id */
    private String id;

    /** 专辑名 */
    private String name;

    /** 封面地址 */
    private String coverPath;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }
}
