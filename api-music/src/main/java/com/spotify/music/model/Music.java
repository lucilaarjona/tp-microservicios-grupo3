package com.spotify.music.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MUSIC")
public class Music implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MUSIC_ID", unique = true, nullable = false)
    private Long musicId;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "SINGER_NAME", nullable = false, length = 50)
    private String singerName;

}
