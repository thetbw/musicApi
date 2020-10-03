package xyz.thetbw.musicApi;

import java.util.Date;
import java.util.List;

/**
 *音乐类，代表一个歌曲
 * @author thetbw
 */
public class Music {
    /** 歌曲id */
    private String id;

    /** 歌曲名 */
    private String name;

    /** 歌曲时长 */
    private Long duration;

    /** 歌手 */
    private List<Singer> singers;

    /** 所属专辑 */
    private Album album;

    /** 发布日期 */
    private Date publishDate;


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Music.class").append("\n")
                .append("\tid:\t").append(id).append("\n")
                .append("\tname:\t").append(name).append("\n")
                .append("\tduration:\t").append(duration).append("\n")
                .append("\tpublishDate:\t").append(publishDate).append("\n")
                .append("\talbum:\t").append(album.toString()).append("\n");
        if (singers!=null){
            builder.append("\tsingers:\n");
            for (Singer singer:singers){
                builder.append("\t\tsinger:\n").append(singer.toString()).append("\n");
            }
        }
        return builder.toString();
    }


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

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public List<Singer> getSingers() {
        return singers;
    }

    public void setSingers(List<Singer> singers) {
        this.singers = singers;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
