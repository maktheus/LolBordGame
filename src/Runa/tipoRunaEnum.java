package Runa;

import java.util.ArrayList;

//create a enum

public enum tipoRunaEnum {
    DANO, CURA, DANODAHABILIDADE, VELOCIDADE, RESISTENCIA;

    public static tipoRunaEnum getTipoRunaEnum(String tipoRuna) {
        for (tipoRunaEnum tipoRunaEnum : tipoRunaEnum.values()) {
            if (tipoRunaEnum.name().equals(tipoRuna)) {
                return tipoRunaEnum;
            }
        }
        return null;
    } 

    
}