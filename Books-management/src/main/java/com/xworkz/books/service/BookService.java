package com.xworkz.books.service;

import com.xworkz.books.dto.BookInfoDto;

public interface BookService {
    String saveBookInfo(BookInfoDto dto);
    void getAll();
}
