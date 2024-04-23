package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.ArtworkDto;
import com.model.Artist;
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

	@Override
	public List<Artwork> getArtworkByArtistId(int artistId) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from artworks a join artists at ON a.artistId=at.artistid  "
				+ " where a.artistId = ? AND at.isActive='yes'";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, artistId);
		ResultSet rst = pstmt.executeQuery();
		List<Artwork> list = new ArrayList<>();
		while(rst.next() == true) {
			int id  = rst.getInt("ArtworkID");
			String title = rst.getString("Title");
			String year = rst.getString("year");
			Artwork artwork = new Artwork(id,title,year,"","",artistId,0); //100X 200X 300X
			list.add(artwork);
		}
		DBConnection.dbClose();		
		return list;
	}

	@Override
	public List<ArtworkDto> getArtworkStats() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select a.name,count(a.artistID) as numberOfArtworks  "
				+ " from artists a JOIN artworks art ON art.artistID = a.artistID "
				+ " group by a.name";
		PreparedStatement pstmt = con.prepareStatement(sql);
		 
		ResultSet rst = pstmt.executeQuery();
		List<ArtworkDto> list = new ArrayList<>();
		while(rst.next() == true) {
			String name  = rst.getString("name");
			int numberOfArtworks = rst.getInt("numberOfArtworks");
			 
			ArtworkDto artwork = new ArtworkDto(name,numberOfArtworks); //100X 200X 300X
			list.add(artwork);
		}
		DBConnection.dbClose();		
		return list;
	}
	
}
