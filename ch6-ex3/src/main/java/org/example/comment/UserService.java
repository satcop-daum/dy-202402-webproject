package org.example.comment;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class UserService {

    public UserService() {
        System.out.println("UserService 인스턴스 생성!");
    }

}
