import java.util.*;
class Film {
String name;
int budjet;
int releaseYear;
String[] actors;
}

public class JavaFilms {

public static void main(String[] args) {
Scanner in = new Scanner(System.in, "cp1251");
System.out.println("Vvedite kolichestvo filmov");
int kol = in.nextInt();
Film[] film = new Film[kol];
in.nextLine();
for (int i = 0; i < kol; i++) {
film[i] = new Film();
System.out.println("Vvedite nazvanie " + (i + 1) + " filma - ");
film[i].name = in.nextLine();
System.out.println("Vvedite budjet " + (i + 1) + " filma - ");
film[i].budjet = in.nextInt();
in.nextLine();
System.out.println("Vvedite god release " + (i + 1) + " filma - ");
film[i].releaseYear = in.nextInt();
in.nextLine();
System.out.println("Vvedite kolichestvo akterov v filme " + (i + 1) + " - ");
int numActors = in.nextInt();
in.nextLine();
film[i].actors = new String[numActors];
for (int j = 0; j < numActors; j++) {
System.out.println("Vvedite imya aktera " + (j + 1) + " - ");
film[i].actors[j] = in.nextLine();
}
}

int minReleaseYear = film[0].releaseYear;
Film earliestFilm = film[0];
for (int x = 0; x < film.length; x++) {
if (minReleaseYear > film[x].releaseYear) {
minReleaseYear = film[x].releaseYear;
earliestFilm = film[x];
}
}

System.out.println("Film s samym rannim godom release: " + earliestFilm.name + " (" + earliestFilm.releaseYear + ")");
System.out.print("List of actors: ");
for (String actor : earliestFilm.actors) {
System.out.print(actor + " ");
}
}
}