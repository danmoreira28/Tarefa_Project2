package br.com.danilo.services;

/**
 * @author danmoreira28
 */

import br.com.danilo.dao.IClienteDAO;
import br.com.danilo.domain.Cliente;
import br.com.danilo.exceptions.TipoChaveNaoEncontradaException;
import br.com.danilo.services.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    //private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
    }

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
