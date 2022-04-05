package kr.codesquad.todolist.repository;

import kr.codesquad.todolist.domain.Card;

import java.util.List;
import java.util.Optional;

public interface CardRepository {

    Card save(Card card);
    Optional<Card> findById(long id);
    List<Card> findAll();
    boolean delete(long id);
}
