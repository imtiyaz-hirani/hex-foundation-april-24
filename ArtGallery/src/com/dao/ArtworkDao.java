package com.dao;

import java.sql.SQLException;

import com.model.Artwork;

public interface ArtworkDao {
	int save(Artwork artwork) throws SQLException;
	
}
