package olek.gorecki.reddit_clone.repository;

import olek.gorecki.reddit_clone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepostiory extends JpaRepository<Vote, Long> {
}
