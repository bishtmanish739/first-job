package com.jopapps.www.First.Job.app.Controller;

import com.jopapps.www.First.Job.app.Entity.Review;
import com.jopapps.www.First.Job.app.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {
    @Autowired
    ReviewService reviewService;
    @PostMapping("/review")
    ResponseEntity<Review> postReview(@RequestBody  Review review){
        return  ResponseEntity.ok(reviewService.postReview(review));

    }
    @PatchMapping("/review")
    ResponseEntity<Review> updateReview(@RequestBody  Review review){
        return  ResponseEntity.ok(reviewService.updateReview(review));

    }
    @GetMapping("/review/{id}")
    ResponseEntity<Review> getReview(@PathVariable Long id){
        return  ResponseEntity.ok(reviewService.getReviewById(id));

    }
    @GetMapping("/review/company/{id}")
    ResponseEntity<List<Review>> getReviews(@PathVariable Long id){
        return  ResponseEntity.ok(reviewService.getReviewsByCompanyId(id));

    }

    @DeleteMapping("/review/{id}")
    ResponseEntity<String> deleteReview(@PathVariable Long id){
        return  ResponseEntity.ok(reviewService.deleteReviewById(id));

    }

}
