package net.uoneweb.springboottrial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TrialController {
    @Autowired
    private ModelProductFireRepository modelProductFireRepository;
    @GetMapping("/hello")
    public Flux<FireProductEntity> hello() {
        final Flux<FireProductEntity> res =  modelProductFireRepository.findAll();
        return res;
    }
}
