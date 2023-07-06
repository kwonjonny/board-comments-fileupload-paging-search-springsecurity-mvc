package board.file.dto.board;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    // tbl_board

    // board & img read 
    private Long tno;
    private String title;
    private String content;
    private String writer;
    private LocalDate registDate;
    private LocalDate updateDate;
    private int replyCnt;
    private List<String> fileName;
}