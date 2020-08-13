/*
Atividade 3 - Fazendo o CRUD para a tabela empregado

 */
package br.com.prog2.rh.controller;

import br.com.prog2.rh.negocio.Empregado;
import br.com.prog2.rh.persistencia.ConnectionFactory;
import br.com.prog2.rh.persistencia.EmpregadoDAOImp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heloise
 */
public class EmpregadoController {

    /*public String inserir(Empregado emp) {
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.inserir(emp);
    }*/
    //@Override
    public String inserir(Empregado emp) {
        String sql = "insert into empregado(cpf,nome,idade,salario) values (?,?,?,?)";
               Connection con = ConnectionFactory.getConnection();
        
        try {
            
            PreparedStatement pst = con.prepareStatement("");//sql
            pst.setString(1, emp.getCpf());
            pst.setString(2, emp.getNome());
            pst.setInt(3, emp.getIdade());
            pst.setDouble(4, emp.getSalario());
            int res = pst.executeUpdate();
            if (res > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir.";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }
    }

    public String alterar(Empregado emp) {
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.alterar(emp);
    }

    /*public String excluir(Empregado emp) {
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.excluir(emp);
    }*/
    public String excluir(Empregado emp) {
        String sql = "delete from empregado where cpf=?";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, emp.getCpf());
            int res = pst.executeUpdate();
            if (res > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }
    }

    /*public List<Empregado> listarTodos() {
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.listarTodos();
    }*/
    public List<Empregado> listarTodos() {
        String sql = "select * from empregado";
        Connection con = ConnectionFactory.getConnection();
        List<Empregado> lista = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Empregado ep = new Empregado();
                    ep.setCpf(rs.getString(1));
                    ep.setNome(rs.getString(2));
                    ep.setIdade(rs.getInt(3));
                    ep.setSalario(rs.getDouble(4));
                    lista.add(ep);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        } finally {
            ConnectionFactory.close(con);
        }
    }

    /*public Empregado pesquisarPorCpf(String cpf) {
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.pesquisarPorCpf(cpf);
    }*/
    public Empregado pesquisarPorCpf(String cpf) {
        String sql = "select * from empregado where cpf=?";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Empregado ep = new Empregado();
                ep.setCpf(rs.getString(1));
                ep.setNome(rs.getString(2));
                ep.setIdade(rs.getInt(3));
                ep.setSalario(rs.getDouble(4));
                return ep;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        } finally {
            ConnectionFactory.close(con);
        }
    }
}
