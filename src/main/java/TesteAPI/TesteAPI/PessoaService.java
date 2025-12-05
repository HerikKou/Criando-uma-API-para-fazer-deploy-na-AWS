package TesteAPI.TesteAPI;
import java.util.List;

import org.springframework.stereotype.Service;
import TesteAPI.TesteAPI.DTO.Pessoa;
@Service
public class PessoaService {
    
    public List<Pessoa> ListarPessoas() {
        return List.of(
            new Pessoa("Herik", 22, "Herik@gmail.com"),
            new Pessoa("Ana", 20, "Ana@gmail.com"));
    }
   


}
