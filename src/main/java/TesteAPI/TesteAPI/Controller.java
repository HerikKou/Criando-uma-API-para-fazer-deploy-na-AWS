package TesteAPI.TesteAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TesteAPI.TesteAPI.DTO.Pessoa;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class Controller {
    
    private final PessoaService pessoaService;
    public Controller(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
    public String HelloWorld() {
        return "Hello, World!";
    }

  
    
    @GetMapping("/cadastro")
    public List<Pessoa> ListarPessoas() {
        return pessoaService.ListarPessoas();
    }
    
}
