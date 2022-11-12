package Map;

import Elemento.tipoElementoEnum;
public enum TipoDeBlockEnum {
    TERRA,
    AGUA,
    FOGO,
    AR,
    LUZ,
    TREVAS,
    RUNA,
    ELEMENTO,
    VAZIO;

    public static TipoDeBlockEnum getTipoDeBlockEnum(String tipoDeBlock) {
        for (TipoDeBlockEnum tipoDeBlockEnum : TipoDeBlockEnum.values()) {
            if (tipoDeBlockEnum.name().equals(tipoDeBlock)) {
                return tipoDeBlockEnum;
            }
        }
        return null;
    }
}

