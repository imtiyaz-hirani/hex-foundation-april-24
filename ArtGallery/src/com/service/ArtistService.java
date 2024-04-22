package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.ArtistDao;
import com.dao.ArtistDaoImpl;
import com.exception.ResourceNotFoundException;
import com.model.Artist;

public class ArtistService {

	ArtistDao dao = new ArtistDaoImpl(); //poly
	
	public int insert(Artist artist) throws SQLException {
		return dao.save(artist);
	}

	public void deleteByid(int id) throws SQLException, ResourceNotFoundException {
		boolean isIdValid = dao.findOne(id);
		if(!isIdValid)
			throw new ResourceNotFoundException("Id given is Invalid!!");
		 
		dao.deleteById(id);
	}

	public void softDeleteByid(int id) throws ResourceNotFoundException, SQLException {
		boolean isIdValid = dao.findOne(id);
		if(!isIdValid)
			throw new ResourceNotFoundException("Id given is Invalid!!");
		 
		dao.softDeleteById(id);
		
	}

	public List<Artist> findAll() throws SQLException {
		return dao.findAll();
	}

}
