package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Artwork;
import com.utility.DBConnection;

public class ArtworkDaoImpl implements ArtworkDao {

	@Override
	public int save(Artwork artwork) throws SQLException {
		// insert artist record in DB
		Connection con = DBConnection.dbConnect();
		String sql="INSERT INTO artworks (ArtworkID, Title, ArtistID, CategoryID,Year,Description) "
				+ " VALUES (?,?,?,?,?,?)";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		//attach the data
		pstmt.setInt(1, artwork.getArtworkId());
		pstmt.setString(2, artwork.getTitle());
		pstmt.setInt(3, artwork.getArtistId());
		pstmt.setInt(4, artwork.getCategoryId());
		pstmt.setString(5, artwork.getYear());
		pstmt.setString(6, artwork.getDescription());
		//execute the query 
		int status = pstmt.executeUpdate(); //1: if all good., 0 - if op fails 
		DBConnection.dbClose();
		return status;		
	}
	
}
