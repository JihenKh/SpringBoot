package soa.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import soa.entities.Categorie;
import soa.entities.Produit;
import soa.repository.CategorieRepository;

public class CategorieMetierImpl implements CategorieMetierInterface
{

    @Autowired
    private CategorieRepository categorieRepository;
    @Override
    public void     ajouterCategorie(Categorie c)
    {
       categorieRepository.save(c);
    }
    @Override
    public List<Categorie> listeCategories() {
        return categorieRepository.findAll();
    }
}
