package com.xworkz.books.runner;


import com.xworkz.books.dto.BookInfoDto;
import com.xworkz.books.service.BookService;
import com.xworkz.books.service.BookServiceImpl;

public class BookRunner {
    public static void main(String[] args) {

        BookInfoDto infoDto=new BookInfoDto();
        infoDto.setBookName("Mysql");
        infoDto.setAuthor("Omkar");
        infoDto.setPrice(145.23);
        infoDto.setGenre("Teco");
        infoDto.setPublisherName("Xworkz");
        infoDto.setLanguage("English");


        BookService service=new BookServiceImpl();
        System.out.println(service.saveBookInfo(infoDto));


    }
}
