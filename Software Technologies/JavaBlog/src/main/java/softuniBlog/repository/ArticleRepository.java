package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Article;

/**
 * Created by DJColdBrain on 10-Aug-17.
 */
public interface ArticleRepository extends JpaRepository<Article, Integer>{


}
