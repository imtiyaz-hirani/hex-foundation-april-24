package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.ResourceNotFoundException;
import com.model.Artist;

public interface ArtistDao {
	int save(Artist artist) throws SQLException; //1:for successful insert / 0 for failure 
	void deleteById(int id) throws SQLException,ResourceNotFoundException;
	void softDeleteById(int id) throws SQLException,ResourceNotFoundException;
	int update(int id, Artist updatedArtist) throws SQLException,ResourceNotFoundException; //id of existing record, updated record 
	List<Artist> findAll() throws SQLException;
	Boolean findOne(int id) throws SQLException; 
}
//ResourceNotFoundException 