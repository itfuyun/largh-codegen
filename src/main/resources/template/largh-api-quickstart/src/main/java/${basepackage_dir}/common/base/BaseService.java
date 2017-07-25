package ${basepackage}.common.base;

import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by itfuyun（itfuyun@outlook.com）
 */
public interface BaseService<T, ID> {
    /**
     * 根据主键获取实体
     *
     * @param id
     * @return
     */
    T getById(ID id);

    /**
     * 获取所有列表
     *
     * @return
     */
    List<T> getList();

    /**
     * 根据实体条件获取列表
     *
     * @param t
     * @return
     */
    List<T> getList(T t);

    /**
     * 根据主键删除实体
     *
     * @param id
     * @return
     */
    void deleteById(ID id);

    /**
     * 保存实体
     *
     * @param t
     * @return
     */
    T save(T t);

    /**
     * 分页
     *
     * @param page
     * @param size
     * @param sortField
     * @param asc
     * @param t
     * @param matcher
     * @return
     */
    Page<T> page(Integer page, Integer size, String sortField, boolean asc, T t, ExampleMatcher matcher);
}
