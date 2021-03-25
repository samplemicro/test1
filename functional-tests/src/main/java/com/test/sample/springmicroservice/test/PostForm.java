package com.test.sample.springmicroservice.test;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author Hantsy Bai<hantsy@gmail.com>
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostForm implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @NotNull
    @NotEmpty
    private String title;

    @NotNull
    @NotEmpty
    private String content;

}
