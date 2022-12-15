package jpacrud.jpastudy.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String author;

    @Builder
    public PostsUpdateRequestDto(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
