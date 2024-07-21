package com.tanishq.jobapp.reviews;

import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ReviewService  {
    List<Review> getAllReviews(Long companyId);
    boolean addReviews(Long comapnyId , Review review );
    Review getReview(Long companyId,Long reviewId);
    boolean updateReview(Long companyId , Long reviewId , Review review );
    boolean deleteReview(Long companyId , Long reviewId );
}
