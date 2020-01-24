package pl.kostrzewa;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository <Product ,Long> - to odpowiada za CRUD, Product to klasa z @Entiity, Long to typ @Id
public interface ProductRepository extends JpaRepository <Product ,Long> {

}
