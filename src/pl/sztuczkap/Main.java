package pl.sztuczkap;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // operacje konczace czyli funkcjami  wywolywanymi na streamach
        // ktore redukuja jego elementy do obiektu nie bedacego strumieniem (dokonujemy redukcji strumienia)

        Stream<Integer> stream = Stream.of(5, 60, 115, 13, 1);
//        long elements = stream.count();
//        System.out.println(elements); // 5

//        Optional<Integer> min = stream.min(Comparator.naturalOrder());
//        System.out.println(min.get());

        Stream<String> names = Stream.of("Ola", "Anna", "Iza", "Tadeusz");
/*        Optional <String> any = names
                .filter(name -> name.length() > 2)
                .findAny();  // findFirst zapewnia nam pierwszy element z listy!

        System.out.println(any.get());*/

        // 3 metody zwracajace typ boolean
//        boolean flag = names.anyMatch(name -> name.length() == 3);
//        boolean flag = names.allMatch(name -> name.contains("a"));
        boolean flag = names.noneMatch(name -> name.startsWith("C")); // zadne z imion nie zaczyna sie  na litere C
        System.out.println(flag);


    }
}
