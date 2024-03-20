package com.jopapps.www.First.Job.app.Service.ServiceImpl;

import com.jopapps.www.First.Job.app.Entity.Review;
import com.jopapps.www.First.Job.app.Repository.ReviewRepository;
import com.jopapps.www.First.Job.app.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    @Override
    public Review postReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public List<Review> getReviewsByCompanyId(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }

    @Override
    public String deleteReviewById(Long id) {
        try{
            reviewRepository.deleteById(id);
            return "Deleted";
        }
        catch (Exception e){
            return  "Review Not found";
        }

    }

    @Override
    public Review updateReview(Review review) {
        return reviewRepository.save(review);
    }
}
