import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Movie
{
    public Movie(String name,int releaseYear,String actor)
    {
        this.name=name;
        this.actor=actor;
        this.release_Year=releaseYear;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_Year() {
        return release_Year;
    }

    public void setRelease_Year(int release_Year) {
        this.release_Year = release_Year;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    private  String name;
    private int release_Year;
    private String actor;
}
 class StreamsDemo
 {
     public static void main(String[] args) {
//         List movie=new ArrayList<>();
         List<Movie> movieList= Arrays.asList(new Movie("M1",2021,"A1"),
                                              new Movie("M2",2020,"A2"));
//         Stream<Movie> movieStream = movieList.stream();
//        Stream <Movie> filterStream = movieStream.filter(movie -> movie.getRelease_Year()==2020);
//        Stream <String> mapStream=filterStream.map( Movie::getName);
//        mapStream.forEach(System.out::println);
        movieList.stream()//source
                .filter(m-> m.getRelease_Year()==2020)//intermediate operation
                .map(Movie::getName) //intermediate operation
                .forEach(System.out::println);//Terminal operation

     }
 }