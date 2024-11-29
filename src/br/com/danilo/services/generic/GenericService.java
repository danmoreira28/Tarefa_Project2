package br.com.danilo.services.generic;

/**
 * @author danmoreira28
 */

import java.io.Serializable;
import java.util.Collection;

import br.com.danilo.dao.generic.IGenericDAO;
import br.com.danilo.exceptions.TipoChaveNaoEncontradaException;
import br.com.danilo.dao.IPersistente;

public abstract class GenericService<T extends IPersistente, E extends Serializable>
implements IGenericService<T, E> {

    protected IGenericDAO<T,E> dao;

    public GenericService(IGenericDAO<T,E> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) {
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.dao.buscarTodos();
    }
}