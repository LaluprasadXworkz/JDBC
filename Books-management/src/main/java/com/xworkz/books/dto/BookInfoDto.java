package com.xworkz.books.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookInfoDto {
    
    private int bookId;
    private String bookName;
    private String author;
    private double  price;
    private String genre;
    private String publisherName;
    private String language;

}
