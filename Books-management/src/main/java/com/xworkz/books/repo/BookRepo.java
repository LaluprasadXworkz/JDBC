package com.xworkz.books.repo;

import com.xworkz.books.dto.BookInfoDto;

public interface BookRepo {

    String saveBook(BookInfoDto dto);
    void readAll();
}
