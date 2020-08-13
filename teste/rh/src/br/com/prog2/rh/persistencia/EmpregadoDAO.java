/*
Atividade 3 - Fazendo o CRUD para a tabela empregado
 */
package br.com.prog2.rh.persistencia;

import br.com.prog2.rh.negocio.Empregado;
import java.util.List;

/**
 *
 * @author Heloise
 */
public interface EmpregadoDAO {
 
    public String inserir(Empregado emp);

    public String alterar(Empregado emp);

    public String excluir(Empregado emp);

    public List<Empregado> listarTodos();

    public Empregado pesquisarPorCpf(String cpf);   
}
