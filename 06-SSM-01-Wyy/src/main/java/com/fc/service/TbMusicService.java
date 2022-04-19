package com.fc.service;

import com.fc.entity.TbMusic;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TbMusicService {
    List<TbMusic> findAll();

    TbMusic findById(Integer musicId);

    TbMusic nextSong(Integer musicId);

    TbMusic prevSong(Integer musicId);

    List<TbMusic> search(String keyword);

    List<TbMusic> findSongsBySheet(String sheetName);

    int insertSheet(String sheetName);
}
