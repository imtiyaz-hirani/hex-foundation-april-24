package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.dto.ArtworkDto;
import com.exception.ResourceNotFoundException;
import com.model.Artist;
import com.model.Artwork;
import com.model.Category;
import com.service.ArtistService;
import com.service.ArtworkService;
import com.service.CategoryService;

public class ArtworkController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArtworkService artworkService =new ArtworkService();
		ArtistService artistService = new ArtistService();
		CategoryService categoryService =new CategoryService();
		while(true) {
			System.out.println("1. Insert Artwork");
			System.out.println("2. Display artwork by Artist");
			System.out.println("3. Display artwork Stats");
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Artist Module..");
				break; 
			}
			switch(input) {
			case 1: 
			try {
				Artwork artwork = new Artwork();
				/* Generating and assigning id to artwork obj*/
				Random random = new Random(); 
				int randomNumber = random.nextInt(); 
				int id =randomNumber<0?randomNumber*-1:randomNumber;
				artwork.setArtworkId(id);
				
				/* Reading title and assigning to artwork obj*/
				System.out.println("Enter title");
				sc.nextLine();
				artwork.setTitle(sc.nextLine());
				
				/* Reading year and assigning to artwork obj*/
				System.out.println("Enter year");
				artwork.setYear(sc.nextLine());
				
				/* Reading description and assigning to artwork obj*/
				System.out.println("Enter description");
				artwork.setDescription(sc.nextLine());
				
				//display all artists, read id and assign it to artwork obj				
				List<Artist> list = artistService.findAll();
				for(Artist a : list) {
					System.out.println(a);
				}
				//read artist id and assign to artwork obj 
				System.out.println("Enter Artist ID");
				artwork.setArtistId(sc.nextInt());
				
				//display all categories,read id and assign it to artwork obj	
				List<Category> listCat = categoryService.findAll();
				for(Category c : listCat) {
					System.out.println(c);
				}
				System.out.println("Enter Category Id");
				artwork.setCategoryId(sc.nextInt());
				
				//Save artwork obj in DB via service/dao
				artworkService.save(artwork);
				System.out.println("Artwork added to DB");
				
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} catch (ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				}
			 break; 
			case 2: 		
				try {
					//display all artists 
					List<Artist> list = artistService.findAll();
					for(Artist a : list) {
						System.out.println(a);
					}
					//read artist id
					System.out.println("Enter Artist ID");
					int artistId = sc.nextInt();
					
					//fetch artworks of this artist
					List<Artwork> listArtwork = artworkService.getArtworkByArtistId(artistId);
					for(Artwork a : listArtwork) {
						System.out.println(a);
					}
				} catch (ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}				
				break; 
			case 3: 			
				try {
					List<ArtworkDto> list = artworkService.getArtworkStats();
					System.out.println("------------------------------------------\n");
					System.out.format("%22s%30s", "Name of Artist", "Number of Artworks");
					System.out.println("\n-----------------------------------------");
					for(ArtworkDto a : list) {
						System.out.format("%22s%20d", a.getName(), a.getNumberOfArtworks());
						System.out.print("\n");
				}
					System.out.println("-------------------------------------------");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}	
				break; 
				/*
				 * DTO : Data transfer Object
				+-------------------+-------------------+
				| name              |  numberOfArtworks |
				+-------------------+-------------------+
				| andres dmello     |                 2 |
				| Leonardo da Vinci |                 1 |
				| Pablo Picasso     |                 1 |
				| Vincent van Gogh  |                 1 |
				+-------------------+-------------------+
				*/
			}
		}
		sc.close();
	}

}
