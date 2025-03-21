public class SouthIndianMovieRunner {
    public static void main(String[] args) {
        
        SouthIndianMovie movie1 = SouthIndianMovie.BAAHUBALI;
        SouthIndianMovie movie2 = SouthIndianMovie.KGF;
        SouthIndianMovie movie3 = SouthIndianMovie.VIKRAM;
        SouthIndianMovie movie4 = SouthIndianMovie.MASTER;
        SouthIndianMovie movie5 = SouthIndianMovie.RRR;

        SouthIndianMovieDirector.printDirector(movie1);
        SouthIndianMovieDirector.printDirector(movie2);
        SouthIndianMovieDirector.printDirector(movie3);
        SouthIndianMovieDirector.printDirector(movie4);
        SouthIndianMovieDirector.printDirector(movie5);
    }
}