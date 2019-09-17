package me.study.springbootautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService {

    @Autowired // AutoWiredAnnotationBeanProcessor 가 동작하여 해당 annotation 처리
    @Qualifier("myBookRepository") // 빈의 이름을 지정해서 주입
    //복수의 빈을 주입 받으려면 List로 받으면 됨.
    //field 명을 myBookRepository로 선언시 해당 빈을 주입함.
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    @Autowired(required = false)
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    public void print() {
        System.out.println(bookRepository.getClass());
    }

    @PostConstruct // 빈 인스턴스가 만들어진 다음 실행
    public void test() {
        System.out.println(bookRepository);
    }


}
