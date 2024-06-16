package br.com.ana.dao;

import br.com.ana.domain.Produto;

public interface IProdutoDao {

	Produto cadastrar(Produto produtoTest);

	Produto consultarProdutoId(Long idConsulta);

	Produto atualizar(Produto produtoCadastrado);

	void excluirProduto(Long idParaExclusao);

}
