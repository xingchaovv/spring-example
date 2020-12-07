package chao.spring.example.bean.wire.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Greeting {

    private final Long id;
    private final String content;
}
