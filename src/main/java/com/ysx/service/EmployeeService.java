package com.ysx.service;

import com.github.pagehelper.PageInfo;
import com.ysx.pojo.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ysx
 * @Date: 2022/10/06/11:55
 * @Description:
 */

public interface EmployeeService {

    /**
     * 獲取全部
     * @return
     */
    List<Employee> getEmps();


    /**
     * 添加用户
     * @param employee
     */
    void addEmp(Employee employee);

    /**
     * g根据id查询
     * @param id
     * @return
     */
    Employee getEmpById(Integer id);

    /**
     * 更新员工信息
     * @param employee
     */
    void updateEmp(Employee employee);

    /**
     *
     * @param id
     */
    void delEmp(Integer id);

    /**
     * 批量删除
     * @param ids
     */
    void delEmps(Integer[] ids);

    /**
     * 分页查询
     * @return
     */
    PageInfo<Employee> getEmpsByPage(Integer pageNum);
}
