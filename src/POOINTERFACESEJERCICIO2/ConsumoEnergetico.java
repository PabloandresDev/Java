package POOINTERFACESEJERCICIO2;

public enum ConsumoEnergetico {
    A,B,C,D,E,F;

    public static boolean contains(String codigo) {
        for (ConsumoEnergetico consumo : values()) {
            if (consumo.name().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
}
