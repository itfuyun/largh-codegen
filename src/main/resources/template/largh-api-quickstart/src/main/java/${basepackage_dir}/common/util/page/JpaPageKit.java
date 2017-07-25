package ${basepackage}.common.util.page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

/**
 * 分页工具
 * Created by itfuyun（itfuyun@outlook.com）
 */
public class JpaPageKit {

    /**
     * 创建PageRequest对象
     *
     * @param page      页码
     * @param size      每页数量
     * @param sortField 排序字段
     * @param asc       排序方式ASC or DESC
     * @return
     */
    public static PageRequest buildPageReq(Integer page, Integer size, String sortField, boolean asc) {
        if (page == null || page < 1) {
            page = 1;
        }
        if (size == null || size < 1) {
            size = 20;
        }
        if (sortField == null || "".equals(sortField)) {
            return new PageRequest(page - 1, size);
        }
        Sort sort = new Sort(asc ? Sort.Direction.ASC : Sort.Direction.DESC, sortField);
        return new PageRequest(page - 1, size, sort);
    }

    /**
     * 创建PageRequest对象
     *
     * @param page      页码
     * @param size      每页数量
     * @param sortField 排序字段 默认ASC方式
     * @return
     */
    public static PageRequest buildPageReq(Integer page, Integer size, String sortField) {
        return buildPageReq(page, size, sortField, true);
    }

    /**
     * 创建PageRequest对象
     *
     * @param page 页码
     * @param size 每页数量
     * @return
     */
    public static PageRequest buildPageReq(Integer page, Integer size) {
        return buildPageReq(page, size, null, true);
    }
}
