package POO.Facultad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AreaConocimiento> areasConocimientos = new ArrayList<>();

        List<Facultad> facultades = new ArrayList<>();

        AreaConocimiento veterinaria = new AreaConocimiento(1, "Veterinaria");
        areasConocimientos.add(veterinaria);

        Facultad facultad1 = new Facultad(1, "Facultad Animales");
        facultades.add(facultad1);

            Departamento salud = new Departamento(1, "Salud", veterinaria);
            veterinaria.addDepartamentos(salud);

            Departamento cuidados = new Departamento(2, "Cuidados", veterinaria);
            veterinaria.addDepartamentos(cuidados);

            Catedra catedraSalud = new Catedra(1, "Salud del animal", salud, facultad1);
            salud.addCatedra(catedraSalud);
            facultad1.addCatedra(catedraSalud);

            Catedra catedraCuidados = new Catedra(2, "Cuidados del animal", cuidados, facultad1);
            cuidados.addCatedra(catedraCuidados);
            facultad1.addCatedra(catedraCuidados);

            Profesor paquito = new Profesor(1, "Paquito", salud);
            salud.addProfesor(paquito);
            paquito.addCatedra(catedraSalud);

            Profesor enrique = new Profesor(2, "Enrique", cuidados);
            cuidados.addProfesor(enrique);
            enrique.addCatedra(catedraSalud);


        for(Facultad f : facultades){
            System.out.println(f);
            for(Catedra c : f.getCatedras()){
                System.out.println("\t" + c);
            }
        }

        for (AreaConocimiento ac : areasConocimientos) {
            System.out.println(ac);
            for(Departamento d : ac.getDepartamentos()){
                System.out.println("\t" + d);

                for(Catedra c : d.getCatedras()) {
                    System.out.println("\t\t" + c);
                }

                for(Profesor p : d.getProfesores()){
                    System.out.println("\t\t" + p);
                }
            }
        }
    }
}
