package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.ResourceNotFoundException;
import com.model.Artist;
import com.utility.DBConnection;

public class ArtistDaoImpl implements ArtistDao{

	@Override
	public int save(Artist artist) throws SQLException {
		// insert artist record in DB
		Connection con = DBConnection.dbConnect();
		String sql="INSERT INTO Artists (ArtistID, Name, Biography, Nationality) VALUES (?,?,?,?)";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		//attach the data
		pstmt.setInt(1, artist.getArtistID());
		pstmt.setString(2, artist.getName());
		pstmt.setString(3, artist.getBiography());
		pstmt.setString(4, artist.getNationality());
		//execute the query 
		int status = pstmt.executeUpdate(); //1: if all good., 0 - if op fails 
		DBConnection.dbClose();
		return status;
	}

	/* 
	 * executeQuery(); -- select 
	 * update,insert,delete == executeUpdate(); 
	 * */
	@Override
	public void deleteById(int id)  throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="delete from artists where artistID =?";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		DBConnection.dbClose();
	}
	
	@Override
	public Boolean findOne(int id) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select artistID from artists where artistID=?";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rst  = pstmt.executeQuery();
		boolean status = rst.next(); //true / false
		DBConnection.dbClose();
		return status;
	}


	@Override
	public void softDeleteById(int id) throws SQLException, ResourceNotFoundException {
		Connection con = DBConnection.dbConnect();
		String sql="update artists SET isActive='no' where artistID =?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		DBConnection.dbClose();		
	}
	
	@Override
	public int update(int id, Artist updatedArtist) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Artist> findAll() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from artists where isActive='yes'";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Artist> list = new ArrayList<>();
		while(rst.next() == true) {
			int id  = rst.getInt("artistID");
			String name = rst.getString("name");
			String nationality = rst.getString("nationality");
			String biography = rst.getString("biography");
			Artist artist = new Artist(id,name,biography,nationality); //100X 200X 300X
			list.add(artist);
		}
		DBConnection.dbClose();		
		return list;
	}

	
	
}
