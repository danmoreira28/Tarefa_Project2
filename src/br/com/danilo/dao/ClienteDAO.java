package br.com.danilo.dao;

import br.com.danilo.dao.generic.GenericDAO;
import br.com.danilo.domain.Cliente;

/**
 * @author danmoreira28
 */

public class ClienteDAO extends GenericDAO<Cliente, Long> {

    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTel(entity.getTel());

    }



}