package POOINTERFACESEJERCICIO2;

public enum Color {
        BLANCO, NEGRO, ROJO, AZUL, GRIS;

        public static boolean contains(String color) {
                for (Color color1 : values()) {
                        if (color1.name().equals(color)) {
                                return true;
                        }
                }
                return false;
        }
}
