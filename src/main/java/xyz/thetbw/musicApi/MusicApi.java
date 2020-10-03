package xyz.thetbw.musicApi;

import java.util.List;

/**
 * 所有的音乐接口
 * @author thetbw
 */
public interface MusicApi {

    /**
     * 根据关键词查询歌曲列表
     * @param keyword 要查询的关键词
     * @param pageNum 分页页码
     * @param pageSize 分页大小
     * @return 歌曲列表
     */
    List<Music> searchMusicList(String keyword,int pageNum,int pageSize);

    /**
     * 搜索专辑
     * @param keyword 搜索关键词
     * @param pageNum 分页页码
     * @param pageSize 分页大小
     * @return 专辑列表
     */
    List<Album> searchAlbumList(String keyword,int pageNum,int pageSize);

    /**
     * 显示专辑里的歌曲
     * @param album 所指定的专辑
     * @param pageNum 分页页码
     * @param pageSize 分页大小
     * @return 歌曲列表
     */
    List<Music> showMusicFromAlbum(Album album,int pageNum,int pageSize);


}
