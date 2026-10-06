public class Main {
    static void main() {
        LinkedList listadoEstudiantes=new LinkedList();

        Estudiante estudiante1=new Estudiante("06091162386","Geonel","Sanchez","Masculino",
                "Septiembre",1,true,true);
        Estudiante estudiante2=new Estudiante("06010262386","Leonardo","Roque","Masculino",
                "Enero",2,true,true);
        Estudiante estudiante3=new Estudiante("06090562386","Edgar","Hernandez","Masculino",
                "Septiembre",3,true,true);
        Estudiante estudiante4=new Estudiante("06040362386","Jorge","Hernandez","Masculino",
                "Septiembre",3,true,true);


        listadoEstudiantes.add(estudiante1);
        listadoEstudiantes.add(estudiante2);
        listadoEstudiantes.add(estudiante3);
        listadoEstudiantes.add(estudiante4);

        listadoEstudiantes.Cumpleaños("Septiembre");


        listadoEstudiantes.mostrarCantMilitantes();

        System.out.println("Cantidad de estudiantes becados: "+listadoEstudiantes.CantBecados());
    }
}