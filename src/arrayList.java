//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;


        void main() {
    System.out.println("sequencia de numeros");
    ArrayList<String> lista = new ArrayList<>();
    ArrayList<String> lista2 = new ArrayList<>();
    lista2.add("1");
    lista2.add("2");
    lista2.add("3");
    lista2.add("4");
    System.out.println(lista2 );
    lista.add("ana");
    lista.add("ben");
    lista.add("ciao");
    lista.add("daniel");
    System.out.println(lista);
for(int i = 0; i < lista2.size();i++) {
    for(int j = 0; j < lista.size();j++) {
        if(lista2.get(i).equals(lista2.get(j))) {
            System.out.println(i + " - " + j + " - " + lista2.get(i));
        }
    }}

}

