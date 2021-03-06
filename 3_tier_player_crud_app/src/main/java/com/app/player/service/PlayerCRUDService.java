package com.app.player.service;

import java.util.List;

import com.app.player.exception.BusinessException;
import com.app.player.model.Player;

public interface PlayerCRUDService {

	public int createPlayer(Player player) throws BusinessException;
	public int updatePlayer(int id, String city) throws BusinessException;
	public int deletePlayer(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	
}
