package br.com.ana.dao;

import br.com.ana.domain.Matricula;

public interface IMatriculaDao {

	Matricula cadastrar(Matricula mat);

	Matricula consultarPorId(Long id);

	Matricula atualizar(Matricula matriculaCadastrada);

	void excluirMatricula(Long idParaExcluir);
}
