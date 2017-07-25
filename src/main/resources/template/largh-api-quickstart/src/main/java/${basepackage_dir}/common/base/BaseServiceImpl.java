package ${basepackage}.common.base;

import ${basepackage}.common.util.page.JpaPageKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by itfuyun（itfuyun@outlook.com）
 */
public class BaseServiceImpl<T, ID extends Serializable, D extends JpaRepository<T, ID>> implements BaseService<T, ID> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected D baseRepository;

    @Override
    public T getById(ID id) {
        return baseRepository.findOne(id);
    }

    @Override
    public List<T> getList() {
        return baseRepository.findAll();
    }

    @Override
    public List<T> getList(T t) {
        return baseRepository.findAll(Example.of(t));
    }

    @Override
    public void deleteById(ID id) {
        baseRepository.delete(id);
    }

    @Override
    public T save(T t) {
        return baseRepository.save(t);
    }

    @Override
    public Page<T> page(Integer page, Integer size, String sortField, boolean asc, T t, ExampleMatcher matcher) {
        Pageable pageable = JpaPageKit.buildPageReq(page, size, sortField, asc);
        return baseRepository.findAll(Example.of(t, matcher), pageable);
    }
}
