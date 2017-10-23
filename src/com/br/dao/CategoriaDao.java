/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.dao;

import com.br.entidades.Categoria;
import com.br.utils.Singleton;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author 39-01424
 */
public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao() {
        em = Singleton.getConnection();
    }

    public void inserir(Categoria cat) {
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
    }

    public void alterar(Categoria cat) {
        em.getTransaction().begin();
        em.merge(cat);
        em.getTransaction().commit();
    }

    public void excluir(Categoria cat) {
        em.getTransaction().begin();
        em.remove(cat);
        em.getTransaction().commit();
    }

    public List getLista(String cat) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from Categoria e where e.descricao like:likes");
        query.setParameter("likes", "%" + cat.trim() + "%");
        List<Categoria> lista = query.getResultList();
        em.getTransaction().commit();
        return lista;
    }

    public List getListaFiltro(String cat) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from Categoria e where e.tipo =:likes");
        query.setParameter("likes", cat);
        List<Categoria> lista = query.getResultList();
        em.getTransaction().commit();
        return lista;
    }
}
