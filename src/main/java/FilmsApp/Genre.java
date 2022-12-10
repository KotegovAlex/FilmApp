package FilmsApp;

public class Genre {
    private Integer genreID;
    private String genreName;

    public Genre (Integer genreID, String genreName){
        this.genreID = genreID;
        this.genreName = genreName;
    }

    public Integer getGenreID() {
        return genreID;
    }

    public String getGenreName() {
        return genreName;
    }
}
