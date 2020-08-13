/*
Atividade 3 - Fazendo o CRUD para a tabela empregado
 */
package br.com.prog2.rh.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.prog2.rh.negocio.Empregado;
import java.util.List;

/**
 *
 * @author Heloise
 */
public class EmpregadoDAOImp implements EmpregadoDAO {

    @Override
    public String inserir(Empregado emp) {
        return null;
    }

    @Override
    public String alterar(Empregado emp) {
        return null;
    }

    @Override
    public String excluir(Empregado emp) {
        return null;
    }

    @Override
    public List<Empregado> listarTodos() {
        return null;
    }

    @Override
    public Empregado pesquisarPorCpf(String cpf) {
        return null;
    }
}

