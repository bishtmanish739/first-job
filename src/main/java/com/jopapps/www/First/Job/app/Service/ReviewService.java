package com.jopapps.www.First.Job.app.Service;
import com.jopapps.www.First.Job.app.Entity.Profile;
import com.jopapps.www.First.Job.app.Entity.Review;

import java.util.List;

public interface ReviewService {
    public Review postReview(Review review);

    public Review getReviewById(Long id);
    public List<Review>  getReviewsByCompanyId(Long companyId);

    String deleteReviewById(Long id);

    Review updateReview(Review review);
}
