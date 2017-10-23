/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.dao;

import com.br.entidades.Movimentacao;
import com.br.utils.Singleton;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author 39-01424
 */
public class MovimentacaoDao {

    private EntityManager em;

    public MovimentacaoDao() {
        em = Singleton.getConnection();
    }

    public void inserir(Movimentacao cat) {
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
    }

    public void alterar(Movimentacao cat) {
        em.getTransaction().begin();
        em.merge(cat);
        em.getTransaction().commit();
    }

    public void excluir(Movimentacao cat) {
        em.getTransaction().begin();
        em.remove(cat);
        em.getTransaction().commit();
    }

    public List getLista(String cat) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from Movimentacao e ");
        //Query query = em.createQuery("select e from Movimentacao e where e.valor =:likes");
        //query.setParameter("likes", "%" + cat.trim() + "%");
        List<Movimentacao> lista = query.getResultList();
        em.getTransaction().commit();
        return lista;
    }

    public List getListaData(String cat, Date data01, Date data02) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from Movimentacao e where  e.data BETWEEN :data01 and :data02");
        //Query query = em.createQuery("select e from Movimentacao e where e.valor =:likes");
        //query.setParameter("likes", "%" + cat.trim() + "%");
        query.setParameter("data01", data01);
        query.setParameter("data02", data02);
        List<Movimentacao> lista = query.getResultList();
        em.getTransaction().commit();
        return lista;
    }
}
