package Elemento;

public enum tipoElementoEnum {
    FOGO, AGUA, TERRA, AR, LUZ, TREVAS;

    public static tipoElementoEnum getTipoElementoEnum(String tipoElemento) {
        for (tipoElementoEnum tipoElementoEnum : tipoElementoEnum.values()) {
            if (tipoElementoEnum.name().equals(tipoElemento)) {
                return tipoElementoEnum;
            }
        }
        return null;
    } 
}