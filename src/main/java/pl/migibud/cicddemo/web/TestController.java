package pl.migibud.cicddemo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("api/v1/test")
class TestController {

    @GetMapping
    Map<String,String> test(){
        return Map.of("Testing","Up and running...");
    }
}
