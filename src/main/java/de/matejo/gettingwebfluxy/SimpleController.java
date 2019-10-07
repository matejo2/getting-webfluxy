package de.matejo.gettingwebfluxy;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SimpleController {

    @PostMapping("/hello2")
    public Flux<GreetingName> saveNewName(){
        return Flux.just();
    }

    @GetMapping("/hello/{name}")
    public Mono<String> sayHelloTo(@PathVariable String name){
        return Mono.just("Hello " + name);
    }

}
