package com.vm.sb.ms;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import com.vm.sb.ms.model.Movie;

/**
 * this microservice returns the movie details of each movie id provided to it
 * @author Admin
 *
 */

@RestController
	@RequestMapping("/movies")
	public class MovieResource {
		
		@RequestMapping("/{movieId}")
		public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
			return new Movie("movieid1", "moviename1");
		}

}
