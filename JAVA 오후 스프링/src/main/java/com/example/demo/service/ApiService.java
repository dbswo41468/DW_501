package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.vo.Movie;

// @Service : 서비스에서 로직을 구현한다. 
// 비즈니스구역
@Service
public class ApiService {

	/**
	 * @Since : 2022. 11. 23.
	 * @Author : 미스터 빈
	 * @Return : List<Movie> 	
	 * @comment : 영화 만둘기 비둘기
	 */
	public List<Movie> makeMovies() {

		List<Movie> list = new ArrayList<Movie>();

//		System.out.println(movie);//movie 의 위치 값
		Movie movie = new Movie();
		movie.setTitle("Friends with Benefits");
		movie.setYear("2011");
		movie.setRuntime("109 min");
		movie.setGenre("Comdy, Romance");

		Movie movie2 = new Movie();
//		System.out.println(movie2); //movie2 의 위치 값
		movie2.setTitle("Just Friends");
		movie2.setYear("2005");
		movie2.setRuntime("96 min");
		movie2.setGenre("Comdy, Romance");

		Movie movie3 = new Movie();
		movie3.setTitle("How to Lose Friends & Alienate People");
		movie3.setYear("2008");
		movie3.setRuntime("110 min");
		movie3.setGenre("Biography, Comedy, Drama");

		Movie movie4 = new Movie();
		movie4.setTitle("Friends: The Reunion");
		movie4.setYear("2021");
		movie4.setRuntime("104 min");
		movie4.setGenre(" Documentary, Biography, Comedy");
		
		Movie movie5 = new Movie();
		movie5.setTitle("Friends with Kids");
		movie5.setYear("2011");
		movie5.setRuntime(" 107 min");
		movie5.setGenre(" Comedy, Drama, Romance");

		list.add(movie);
		list.add(movie2);
		list.add(movie3);
		list.add(movie4);
		list.add(movie5);
		return list;

	}

}
