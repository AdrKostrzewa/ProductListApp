package pl.kostrzewa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    //wstrzykiwanie zależności
    @Autowired
    private ProductRepository repo;

    public List<Product> listAll(){
        return repo.findAll();
    }

    public void save (Product product){
        repo.save(product);
    }

    public Product get (Long id){
        return repo.findById(id).get();
    }

    public void delete (Long id){
        repo.deleteById(id);
    }

}
