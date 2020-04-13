package br.com.edwi.jpa.relacionamentos.service.impl;

import br.com.edwi.jpa.relacionamentos.dtos.ClienteDto;
import br.com.edwi.jpa.relacionamentos.dtos.EnderecoCartaDto;
import br.com.edwi.jpa.relacionamentos.dtos.SolicitacaoDto;
import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoEntity;
import br.com.edwi.jpa.relacionamentos.exceptions.BuscaSolicitacaoException;
import br.com.edwi.jpa.relacionamentos.repositories.SolicitacaoRepository;
import br.com.edwi.jpa.relacionamentos.service.SolicitacaoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class SolicitacaoServiceImpl implements SolicitacaoService {

    private SolicitacaoRepository repository;

    @Override
    public List<SolicitacaoDto> findSolicitacoes(Integer limit) {
        Page<SolicitacaoEntity> solicitacoes = this.repository.findAll(PageRequest.of(0, limit));
        return getSolicitacaoDtos(Collections.unmodifiableList(solicitacoes.getContent()));
    }

    @Override
    public List<SolicitacaoDto> findSolicitacoesComClientes(Integer limit) {
        Page<SolicitacaoEntity> solicitacoes = this.repository.findAllWithCliente(PageRequest.of(0, limit));
        return getSolicitacaoClientesDtos(Collections.unmodifiableList(solicitacoes.getContent()));
    }

    @Override
    public List<SolicitacaoDto> findSolicitacoesComClientesComEnderecos(Integer limit) {
        Page<SolicitacaoEntity> solicitacoes = this.repository.findAllWithClienteAndEnderecoCarta(PageRequest.of(0, limit));
        return getSolicitacaoClientesEnderecosDtos(Collections.unmodifiableList(solicitacoes.getContent()));
    }

    private List<SolicitacaoDto> getSolicitacaoDtos(List<SolicitacaoEntity> solicitacoes) {
        if(solicitacoes.size() == 0) throw new BuscaSolicitacaoException("Nenhuma [SOLICITCAO] foi encontrada em banco de dados com os critérios informados");

        List<SolicitacaoDto> dtos = new ArrayList<>();
        solicitacoes.forEach(s -> {
            SolicitacaoDto dto = new SolicitacaoDto();
            BeanUtils.copyProperties(s, dto);
            dtos.add(dto);
        });
        return dtos;
    }

    private List<SolicitacaoDto> getSolicitacaoClientesDtos(List<SolicitacaoEntity> solicitacoes) {
        if(solicitacoes.size() == 0) throw new BuscaSolicitacaoException("Nenhuma [SOLICITCAO] foi encontrada em banco de dados com os critérios informados");

        List<SolicitacaoDto> dtos = new ArrayList<>();
        solicitacoes.forEach(s -> {
            SolicitacaoDto dto = new SolicitacaoDto();
            BeanUtils.copyProperties(s, dto);

            ClienteDto clienteDto = new ClienteDto();
            BeanUtils.copyProperties(s.getCliente(), clienteDto);
            dto.setCliente(clienteDto);

            dtos.add(dto);
        });
        return dtos;
    }

    private List<SolicitacaoDto> getSolicitacaoClientesEnderecosDtos(List<SolicitacaoEntity> solicitacoes) {
        if(solicitacoes.size() == 0) throw new BuscaSolicitacaoException("Nenhuma [SOLICITCAO] foi encontrada em banco de dados com os critérios informados");

        List<SolicitacaoDto> dtos = new ArrayList<>();
        solicitacoes.forEach(s -> {
            SolicitacaoDto dto = new SolicitacaoDto();
            BeanUtils.copyProperties(s, dto);

            ClienteDto clienteDto = new ClienteDto();
            BeanUtils.copyProperties(s.getCliente(), clienteDto);

            EnderecoCartaDto enderecoCartaDto = new EnderecoCartaDto();
            BeanUtils.copyProperties(s.getCliente().getEnderecoCarta(), enderecoCartaDto);
            clienteDto.setEnderecoCarta(enderecoCartaDto);

            dto.setCliente(clienteDto);
            dtos.add(dto);
        });
        return dtos;
    }
}