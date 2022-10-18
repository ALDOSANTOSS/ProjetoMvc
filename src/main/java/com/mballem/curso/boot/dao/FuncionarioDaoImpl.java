package com.mballem.curso.boot.dao;

import com.mballem.curso.boot.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario,Long> implements FuncionarioDao {
}
