package FilmsApp;

public class Program {
    public static void main(String[] args) {
        FilmManger mng1 = new FilmManger();

        Genre genre1 = new Genre(1, "Фантастика");
        Producer prod1 = new Producer();
        Studio stud1 = new Studio("Халтура", "Россия");


        Film film1 = new Film.Builder()
                .setFilmName("Полёт")
                .setGenre(genre1)
                .setYear(2000)
                .setProducer(prod1)
                .setStudio(stud1)
                .build();

        mng1.addNewFilm(film1);

        System.out.println(mng1.filmoteka);
    }
}
