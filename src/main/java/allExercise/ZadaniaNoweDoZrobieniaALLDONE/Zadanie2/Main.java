package allExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie2;

import java.util.ArrayList;
import java.util.List;

/* TODO
    10.
    1. Stwórz klasę Email, która przechowuje adres email (String).
    done
    2. Stwórz kilka obiektów klasy Email (user@mydomain.com, admin@mydomain.com, moderator@mydomain.com).
    done
    3. Stwórz listę, która przechowuje obiekty typu Email, a następnie dodaj stworzone obiekty do listy.
    done
    4. Wypisz stworzoną listę na ekran. W jaki sposób została wypisana lista ? Popraw tak, aby wypisane elementy były w ładnej formie (tzw. human readable ;)).
    done
    5. Stwórz nowy obiekt o adresie identycznym do obiektu admin (admin@mydomain.com). Przy użyciu metody indexOf sprawdź na którym miejscu znajduje się obiekt z takim adresem.
    done
    6. Zapoznaj się z metodą equals oraz Hashcode, a następnie popraw powyższy program tak, aby poprawnie znajdował obiekt email.
    done

 */
public class Main {
    public static void main(String[] args) {

        Email email1 = new Email("user@mydomain.com");
        Email email2 = new Email("admin@mydomain.com");
        Email email3 = new Email("moderator@mydomain.com");

        List<Email> emailList = new ArrayList<>();
        emailList.add(email1);
        emailList.add(email2);
        emailList.add(email3);

        System.out.println("emailList = " + emailList);

        Email email = new Email("admin@mydomain.com"); //jak wypisze -1 to nie ma na liście
        int emailIndex = emailList.indexOf(email);
        System.out.println("emailIndex = " + emailIndex);

    }
}
