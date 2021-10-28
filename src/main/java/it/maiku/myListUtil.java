package it.maiku;
/*
Realizza la prova mentre sono attivi la condivisione del tuo schermo, l'audio, la propria telecamera, e la registrazione nella tua riunione Microsoft Teams.
Scrivere all'interno di una classe con nome “MyListUtil” una funzione "sort" che, data una lista di numeri interi, organizzi gli elementi sia in ordine crescente sia in ordine decrescente, a seconda della scelta dell'utente.
            public List<Integer> sort(List<Integer> list, int order){
            }
            order = 0 //Ascendente
            order = 1 //Dicendente
Nota:  Si consiglia di scrivere il proprio algoritmo per ordinare i numeri
A tal fine:
Creare un progetto Maven. (Potete usare l'archetype: maven-archetype-quickstart)
Tracciare le modifiche usando Git. Si deve creare una branca con nome “dev” per scrivere il codice, e in fine fare merge con la branca principale.
Testare la funzione scritta utilizzando JUnit e scrivere almeno due casi di prove, nel caso in cui sia stata scritta più di
una funzione è comunque necessario riportare le prove delle stesse. È richiesto l'uso di @Before o @BeforeClass a seconda dei casi.
Installare la libreria Joda-Time e stampare la data e l’ora dell' inizio e della fine di tutti i tests. Il formato di stampa è a scelta personale.
Caricare il codice sorgente su un repository GitHub evitando di caricare quei files che riguardano l'impostazione dell' IDE ed infine la cartella "target"
 creata da Maven. Il nome del progetto su GitHub deve essere nel formato: ProvaIngSw_{matricola}.*/

import java.util.Collections;
import java.util.List;

public class myListUtil {
    public static List<Integer> sort (List<Integer> list, int order){
        List<Integer> internalList = list;

        if(order == 0){
            //ascendant ...
            Collections.sort(internalList);
        }
        else{
            //descendant ...
            Collections.sort(internalList,Collections.reverseOrder());
        }

        return internalList;
    }

}
