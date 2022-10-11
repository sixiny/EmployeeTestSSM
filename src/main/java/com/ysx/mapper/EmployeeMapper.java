package com.ysx.mapper;

import com.ysx.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ysx
 * @Date: 2022/10/06/11:40
 * @Description:
 */
public interface EmployeeMapper {

    /**
     * 獲取全部員工信息
     * @return
     */
    List<Employee> getEmps();


    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    Employee getEmpById(Integer id);

    /**
     * 根据id用户
     * @param id
     */
    void delEmp(Integer id);

    /**
     * 更新用户信息
     */
    void updateEmp(Employee employee);

    /**
     * 添加用户
     * @param employee
     */
    void addEmp(Employee employee);

    /**
     * 批量删除
     * @param ids
     */
    void delEmps(@Param("ids") Integer[] ids);


}
