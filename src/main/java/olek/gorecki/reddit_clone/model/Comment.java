package olek.gorecki.reddit_clone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String text;
    @ManyToOne
    @JoinColumn(name= "postId", referencedColumnName = "postId")
    private Post post;
    private Instant createdDate;
    @ManyToOne
    @JoinColumn(name= "userId", referencedColumnName = "userId")
    private User user;
}
