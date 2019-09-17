package me.study.springbootautowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary // 동일한 빈을 주입 할 경우 해당 빈을 주입하도록 설정
public class DongchulBookRepository implements BookRepository {
}
