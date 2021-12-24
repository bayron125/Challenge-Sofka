package repositorio;

import modelo.Categoria;

import java.util.ArrayList;
import java.util.List;

public class BancoDePreguntas implements IRepisotorio<Categoria>{
    List<Categoria> categorias;

    public BancoDePreguntas() {
        this.categorias = new ArrayList<>();
    }

    public Categoria porId(int i){
        return categorias.get(i);
    }

    public List<Categoria> listar(){
        return categorias;
    }

    public void agregar(Categoria categoria){
        categorias.add(categoria);
    }


}
