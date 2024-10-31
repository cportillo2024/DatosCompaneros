package datoscompaneros;
public class DatosCompaneros {
    public static void main(String[] args) {
        String[][] datos = {
            {"Diana", "Perdomo", "Computacion", "Plantel"},
            {"Blanca", "Carcamo", "Computacion", "IMSA"},
            {"Ruth", "Quintanilla", "Produccion Industrial", "Corporacion Lear"},
            {"Luis", "Mendoza", "Produccion Industrial", "Camaronera"},
            {"Norma", "Gavarrete", "Produccion Idustrial", "Maquila"}
        };
        
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Nombre: " + datos[i][0]);
            System.out.println("Apellido: " + datos[i][1]);
            System.out.println("Carrera: " + datos[i][2]);
            System.out.println("Lugar de trabajo: " + datos[i][3]);
            System.out.println();
        }
    }
}

