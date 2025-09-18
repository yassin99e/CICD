package ma.ensa.cicd.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class test {




    @GetMapping("/test")
    public ResponseEntity<String> test(){

        String response = "Hello this is the Second Edition";

        return ResponseEntity.ok(response);
    }

}
