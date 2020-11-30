package com.example.resouces;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.models.CatalogItem;
import com.example.models.Movie;
import com.example.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String item){
		
		//get the movie info
		Movie movie = restTemplate.getForObject("http://movie-info-service/movies/1", Movie.class);
		
		//get the ratings of each movie
		Rating rating = restTemplate.getForObject("http://ratings-data-service/ratingsData/"+movie.getId(), Rating.class);
		
		return Collections.singletonList(new CatalogItem(movie.getName(), "test", rating.getRating()));
		
	}
}
