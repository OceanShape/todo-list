package kr.codesquad.todolist.dto.card;

import kr.codesquad.todolist.domain.Card;


public class CreateCardRequest {

    private String author;
    private Integer sectionId;
    private String subject;
    private String contents;

    private CreateCardRequest() {
    }

    public Card toEntity() {
        return Card.newCard(this.author, this.sectionId, this.subject, this.contents);
    }

    public String getAuthor() {
        return author;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public String getSubject() {
        return subject;
    }

    public String getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "CreateCardRequest{" +
                "author='" + author + '\'' +
                ", sectionId=" + sectionId +
                ", subject='" + subject + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}