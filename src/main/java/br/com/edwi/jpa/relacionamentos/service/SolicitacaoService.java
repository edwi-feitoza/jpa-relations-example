package br.com.edwi.jpa.relacionamentos.service;

import br.com.edwi.jpa.relacionamentos.dtos.SolicitacaoDto;
import java.util.List;

public interface SolicitacaoService {
    List<SolicitacaoDto> findSolicitacoes(Integer limit);
    List<SolicitacaoDto> findSolicitacoesComClientes(Integer limit);
    List<SolicitacaoDto> findSolicitacoesComClientesComEnderecos(Integer limit);
    void insertBulk();
}