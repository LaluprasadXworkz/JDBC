package com.xworkz.books.service;

import com.xworkz.books.dto.BookInfoDto;
import com.xworkz.books.repo.BookRepo;
import com.xworkz.books.repo.BookRepoImpl;

public class BookServiceImpl implements BookService{

    BookRepo repo=new BookRepoImpl();

    @Override
    public String saveBookInfo(BookInfoDto dto) {
        if(dto!=null){
           return repo.saveBook(dto);
        }
        return "You can't Pass Null values";
    }

    @Override
    public void getAll() {
        repo.readAll();
    }
}
