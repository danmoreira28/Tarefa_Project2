package br.com.danilo.services;

/**
 * @author danmoreira28
 */

import br.com.danilo.domain.Cliente;
import br.com.danilo.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
