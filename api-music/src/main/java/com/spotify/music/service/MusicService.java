package com.spotify.music.service;

import com.spotify.music.model.Music;
import com.spotify.music.repository.MusicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    private final MusicRepository musicRepository;

    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    public void save(Music music) {
        musicRepository.save(music);
    }


    public List<Music> getAll() {
        return musicRepository.findAll();
    }

    public Music getById(Long id) {
        return musicRepository.findById(id).orElse(null);
    }


    public void deleteById(Long id) {
        musicRepository.deleteById(id);
    }

    public void update(Music music) {
        if(musicRepository.existsById(music.getMusicId())){
            musicRepository.save(music);
        }
    }
}
