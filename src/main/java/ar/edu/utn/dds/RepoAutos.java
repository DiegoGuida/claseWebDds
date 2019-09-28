package ar.edu.utn.dds;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RepoAutos {

    private static List<Auto> automotores = new ArrayList<>();

    public void RepoAutos() {

    	for (int i=0 ; i<100; i++) {
            Auto auto1 = new Auto("HGG123"+ new Integer (i).toString(), "Astra", "Chevrolet", 2005);
            automotores.add(auto1);
    	}

    }

    public Optional<Auto> findPatente(String patente) {
    	return automotores.stream().filter(auto -> auto.getPatente().equals(patente)).findFirst();

    }

    public List<Auto> findMarca (String marca) {
        return automotores.stream().filter(a -> a.getMarca().equals(marca)).collect(Collectors.toList());

    }

    public void findId () {

    }




}
