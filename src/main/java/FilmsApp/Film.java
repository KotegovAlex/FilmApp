package FilmsApp;

import java.util.ArrayList;

public class Film {
    private final String filmName;
    private final Genre genre;
    private final Studio studio;
    private final Producer producer;
    private final int year;
    private final ArrayList<Artist> artistList;

    public static class Builder {
        private String filmName;
        private Genre genre;
        private Studio studio;
        private Producer producer;
        private int year;
        private ArrayList<Artist> artistList = new ArrayList<>();

        public Builder setFilmName(String value) {
            this.filmName = value;
            return this;
        }

        public Builder setYear(int value) {
            this.year = value;
            return this;
        }

        public Builder setGenre(Genre value) {
            this.genre = value;
            return this;
        }

        public Builder setStudio(Studio value) {
            this.studio = value;
            return this;
        }

        public Builder setProducer(Producer value) {
            this.producer = value;
            return this;
        }

        public Builder setArtist(Artist value) {
            this.artistList.add(value);
            return this;
        }

        public Film build() {
            return new Film(this);
        }
    }

    private Film(Builder builder) {
        filmName = builder.filmName;
        year = builder.year;
        genre = builder.genre;
        studio = builder.studio;
        producer = builder.producer;
        artistList = builder.artistList;
    }


}
