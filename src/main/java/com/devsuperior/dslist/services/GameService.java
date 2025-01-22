package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service //Registra esse GameService como componente do sistema.
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true) //Não irá bloquear o banco de dados para escrita
	public GameDTO findById(Long Id) {
		Game result = gameRepository.findById(Id).get(); //Busca no banco de dados o Game
		GameDTO dto = new GameDTO(result); //Converte para DTO
		return dto;
	}
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll(); //Faz busca no banco e retorna lista de objetos.
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //Converte cada objeto para GaminMinDTO
		return dto;
	}

}
