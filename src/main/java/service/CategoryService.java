package service;

import DAO.CategoryRepository;
import model.Category;

import java.util.ArrayList;

public class CategoryService implements ICRUD<Category>{
private final CategoryRepository categoryRepository = new CategoryRepository();

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id);
    }

    @Override
    public ArrayList<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void create(Category category) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void deleteById(int id) {

    }
}
