package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.exception.ResourceNotFoundException;
import com.model.Artist;
import com.service.ArtistService;

public class ArtistController {

	public static void main(String[] args) {
		ArtistService artistService = new ArtistService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------Artist Ops-------------");
			System.out.println("Press 1. Insert Artist ");
			System.out.println("Press 2. Delete Artist ");
			System.out.println("Press 3. Deactivate Delete Artist[Soft delete] ");
			System.out.println("Press 4. Display all artists");
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Artist Module..");
				break; 
			}
			
			switch(input) {
			case 1: 
				//System.out.println(UUID.randomUUID()); --auto generating alphanumeric for ID
				Random random = new Random(); 
				int randomNumber = random.nextInt(); 
				int id =randomNumber<0?randomNumber*-1:randomNumber; 
				System.out.println("Enter Name");
				sc.nextLine();
				String name = sc.nextLine();   
				System.out.println("Enter Biography");
				String biography=sc.nextLine(); //email
				System.out.println("Enter Nationality");
				String nationality=sc.nextLine();
				/* Attach values to Object  */
				Artist artist = new Artist(id,name,biography,nationality);
				try {
					int status = artistService.insert(artist);
					if(status == 1)
						System.out.println("Artist record added to DB..");
					else
						System.out.println("Insert op failed");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
				break; 
			case 2: 
				System.out.println("Enter Artist ID");
				try {
					artistService.deleteByid(sc.nextInt());
					System.out.println("Artist record deleted..");
				} catch (SQLException e) {
					 System.out.println(e.getMessage());
				} catch (ResourceNotFoundException e) {
					 System.out.println(e.getMessage());
				}				
				break; 
			case 3: 
				System.out.println("Enter Artist ID");
				try {
					artistService.softDeleteByid(sc.nextInt());
					System.out.println("Artist record de-activated..");
				} catch (ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}				
				break; 
			case 4: 	 
				try {
					List<Artist> list = artistService.findAll();
					for(Artist a : list) {
						System.out.println(a);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break; 
			}
			
		}
		
		sc.close();
	}

}
