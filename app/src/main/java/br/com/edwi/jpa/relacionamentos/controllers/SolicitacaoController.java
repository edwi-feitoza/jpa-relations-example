package br.com.edwi.jpa.relacionamentos.controllers;

import br.com.edwi.jpa.relacionamentos.dtos.SolicitacaoDto;
import br.com.edwi.jpa.relacionamentos.service.SolicitacaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("solicitacoes")
@AllArgsConstructor
public class SolicitacaoController {

    private SolicitacaoService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SolicitacaoDto>> findSolicitacoes(@RequestParam(name = "limit", required = false) Integer limit) {
        List<SolicitacaoDto> solicitacoes = this.service.findSolicitacoes(limit == null || limit <= 0 ? 100 : limit);
        return ResponseEntity.ok().body(solicitacoes);
    }

    @GetMapping(value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SolicitacaoDto>> findSolicitacoesWithClientes(@RequestParam(name = "limit", required = false) Integer limit) {
        List<SolicitacaoDto> solicitacoes = this.service.findSolicitacoesComClientes(limit == null || limit <= 0 ? 100 : limit);
        return ResponseEntity.ok().body(solicitacoes);
    }

    @GetMapping(value = "/clientes/enderecos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SolicitacaoDto>> findSolicitacoesWithClientesWithEnderecos(@RequestParam(name = "limit", required = false) Integer limit) {
        List<SolicitacaoDto> solicitacoes = this.service.findSolicitacoesComClientesComEnderecos(limit == null || limit <= 0 ? 100 : limit);
        return ResponseEntity.ok().body(solicitacoes);
    }
}