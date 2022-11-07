package com.spotify.playlist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PLAYLIST")
public class Playlist implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAYLIST_ID", unique = true, nullable = false)
    private Long playListId;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "MGCOUNT", nullable = false, columnDefinition = " integer default 0")
    private Integer mgCount = 0;

    @OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<PlayListMusic> musics = new ArrayList<>();


}
