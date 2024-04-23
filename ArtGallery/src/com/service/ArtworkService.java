package com.service;

import java.sql.SQLException;

import com.dao.ArtistDao;
import com.dao.ArtistDaoImpl;
import com.dao.ArtworkDao;
import com.dao.ArtworkDaoImpl;
import com.dao.CategoryDao;
import com.dao.CategoryDaoImpl;
import com.exception.ResourceNotFoundException;
import com.model.Artwork;

public class ArtworkService {

	ArtworkDao dao = new ArtworkDaoImpl();
	ArtistDao artistDao = new ArtistDaoImpl();
	CategoryDao categoryDao = new CategoryDaoImpl();
	
	public void save(Artwork artwork) throws SQLException, ResourceNotFoundException {
		/* 
		 * validate categoryId and artistId given 
		 * */  
		
		//artistId validation
		boolean isArtistIdValid = artistDao.findOne(artwork.getArtistId());
		if(!isArtistIdValid)
			throw new ResourceNotFoundException("Artist ID invalid");
		
		//categoryId validation
		boolean isCatIdValid = categoryDao.findOne(artwork.getCategoryId());
		if(!isCatIdValid)
			throw new ResourceNotFoundException("Category ID invalid");
		
		dao.save(artwork);
	}

}
