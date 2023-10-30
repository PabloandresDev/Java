//package POO;
//
//import FlujosDeControl.SwitchCase;
//
//public class EjemploAutomovilEnum {
//    public static void main(String[] args) {
//        Automovil kia = new Automovil("Kia motors","2022", TipoAutomoil.FURGON, Color.ROJO,155,1000) ;
//        System.out.println(kia.toString());
//        TipoAutomoil tipoCarro = kia.getTipo();
//        switch(tipoCarro){
//            case CONVERTIBLE:
//                System.out.println("El automovil "+ tipoCarro.getNombre()+" tiene "+tipoCarro.getNumeroPuertas()+" puertas");
//                break;
//            case PICKUP:
//                System.out.println("El automovil "+ tipoCarro.getNombre()+" tiene "+tipoCarro.getNumeroPuertas()+" puertas");
//                break;
//            case COUPE:
//                System.out.println("El automovil "+ tipoCarro.getNombre()+" tiene "+tipoCarro.getNumeroPuertas()+" puertas");
//                break;
//            case SEDAN:
//                System.out.println("El automovil "+ tipoCarro.getNombre()+" tiene "+tipoCarro.getNumeroPuertas()+" puertas");
//                break;
//            case STATION_WAGON:
//                System.out.println("El automovil "+ tipoCarro.getNombre()+" tiene "+tipoCarro.getNumeroPuertas()+" puertas");
//                break;
//            case FURGON:
//                System.out.println("El automovil "+ tipoCarro.getNombre()+" tiene "+tipoCarro.getNumeroPuertas()+" puertas");
//                break;
//            default:
//                System.out.println("No coincidio el tipo de automovil");
//                break;
//        }
//
//        TipoAutomoil[] tipos = TipoAutomoil.values();
//        for (TipoAutomoil ta:tipos) {
//            System.out.println(ta.name() + " => " + ta.name()+ " ,"+
//                    ta.getNombre()+ " ,"+
//                    ta.getDescription()+ " ,"+
//                    ta.getNumeroPuertas());
//
//        }
//    }
//
//}
