package Personagem;

import Runa.Runa;

public class Personagem {
    private String nome;
    private float vida;
    private float ataque;
    private float danoDaHabilidade;
    private Runa runa;
    private float resistencia;
    public ArrayList<Elemento> Elemento = new ArrayList<Elemento>();



    public Personagem(String nome, float vida, float ataque, float danoDaHabilidade, ArrayList<Elemento> Elemento) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.danoDaHabilidade = danoDaHabilidade;
        this.runa = null;
        this.resistencia = 0;
        this.Elemento = Elemento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public float getDanoDaHabilidade() {
        return danoDaHabilidade;
    }

    public void setDanoDaHabilidade(float danoDaHabilidade) {
        this.danoDaHabilidade = danoDaHabilidade;
    }


    public void pegarRuna(Runa runa) {
        this.runa = runa;

        if(runa.getTipoRuna() == tipoRunaEnum.DANO) {
            this.ataque += 10;
        } else if(runa.getTipoRuna() == tipoRunaEnum.CURA) {
            this.vida += 10;
        } else if(runa.getTipoRuna() == tipoRunaEnum.DANODAHABILIDADE) {
            this.danoDaHabilidade += 10;
        } else if(runa.getTipoRuna() == tipoRunaEnum.VELOCIDADE) {
            this.ataque += 10;
        } else if(runa.getTipoRuna() == tipoRunaEnum.RESISTENCIA) {
            this.resistencia += 10;
        }
    }
    
    public void perderRuna() {
        if(runa.getTipoRuna() == tipoRunaEnum.DANO) {
            this.ataque -= 10;
        } else if(runa.getTipoRuna() == tipoRunaEnum.CURA) {
            this.vida -= 10;
        } else if(runa.getTipoRuna() == tipoRunaEnum.DANODAHABILIDADE) {
            this.danoDaHabilidade -= 10;
        } else if(runa.getTipoRuna() == tipoRunaEnum.VELOCIDADE) {
            this.ataque -= 10;
        } else if(runa.getTipoRuna() == tipoRunaEnum.RESISTENCIA) {
            this.resistencia -= 10;
        }
        this.runa = null;
    }

    public void atacar(Personagem personagem) {
        personagem.setVida(personagem.getVida() - this.ataque + personagem.getResistencia());
    }

    public void atacarComHabilidade(Personagem personagem) {
        personagem.setVida(personagem.getVida() - this.danoDaHabilidade + personagem.getResistencia());
    }

    public void morrer(Personagem personagem) {
        // da os elementos do personagem morto para o personagem que o matou
        personagem.Elemento.addAll(this.Elemento);
        this.Elemento.clear();
    }   

}
