import java.util.*;
import java.util.stream.Collectors;
public class StreamsCollectDemo
{
    public static void main(String[] args) {
        List<Movie> movieList= Arrays.asList(new Movie("Movie1",2021,"A1"),
                                             new Movie("Movie2",2020,"A2"),
                                             new Movie("Movie3",2020,"A3"),
                                             new Movie("Movie4",2022,"A4"));
        //Movie Name
//        List<String> movienames=movieList.stream().map(Movie::getName).collect(Collectors.toList());
//        movienames.forEach(System.out::println);
//        Set<String> movienamesSet=movieList.stream().map(Movie::getName).collect(Collectors.toSet());
//        movienamesSet.forEach(System.out::println);
//        //release Year
//        List<Integer> movienamesYear=movieList.stream().map(Movie::getRelease_Year).collect(Collectors.toList());
//        movienames.forEach(System.out::println);
//        Set<Integer> movienamesSetYear=movieList.stream().map(Movie::getRelease_Year).collect(Collectors.toSet());
//        movienamesSet.forEach(System.out::println);

        // add some delimiters
        String allMovie=movieList.stream().map(Movie::getName).collect(Collectors.joining(" - "));
        System.out.println(allMovie);

        // grouping movies based on yearwise released
        Map<Integer,List<Movie>> movieMapList= movieList.stream().collect(Collectors.groupingBy(Movie::getRelease_Year));
        movieMapList.forEach((k,v)-> System.out.println("Key "+k+" Movie "+v));

        // Split the data based on yearwise released
       Map<Boolean, List<Movie>> split=movieList.stream().collect(Collectors.partitioningBy(m->m.getRelease_Year()>=2021));
       split.forEach((k,v)-> System.out.println("Key "+k+" Movie "+v));
       List l=new ArrayList<>();

       // finding Average
       Double average= movieList.stream().collect(Collectors.averagingDouble(Movie::getRelease_Year));
        System.out.println("average : "+average);
    }
}
