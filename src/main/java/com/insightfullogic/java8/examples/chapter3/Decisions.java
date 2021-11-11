package com.insightfullogic.java8.examples.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Decisions {

    public static class Imperative {
        // BEGIN origins_of_bands_meth_imp
        public Set<String> originsOfBands(Album album) {
            Set<String> nationalities = new HashSet<>();
            for (Artist artist : album.getMusicianList()) {
                if (artist.getName().startsWith("The")) {
                    String nationality = artist.getNationality();
                    nationalities.add(nationality);
                }
            }
            return nationalities;
        }
        // END origins_of_bands_meth_imp
    }

    /**
     * 找出某张专辑上所有乐队的国籍
     * @param album
     * @return
     */
    public Set<String> originsOfBands(Album album) {
        // BEGIN origins_of_bands
        Set<String> origins = album.getMusicians()
                .filter(artist -> artist.getName().startsWith("The"))
                .map(artist -> artist.getNationality())
                .collect(toSet());
        // END origins_of_bands
        return origins;
    }

    /**
     * 用户也可以选择每一步强制对函数求值，而不是将所有的方法调用链接在一起，但是，最好不要如此操作。
     *
     * 误用Stream的例子
     * @param album
     * @return
     */
    public Set<String> originsOfBandsMisuse(Album album) {
        // BEGIN misuse
        List<Artist> musicians = album.getMusicians()
                .collect(toList());

        List<Artist> bands = musicians.stream()
                .filter(artist -> artist.getName().startsWith("The"))
                .collect(toList());

        Set<String> origins = bands.stream()
                .map(artist -> artist.getNationality())
                .collect(toSet());
        // END misuse
        return origins;
    }

}
