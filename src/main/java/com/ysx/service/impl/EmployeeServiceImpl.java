package com.ysx.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ysx.mapper.EmployeeMapper;
import com.ysx.pojo.Employee;
import com.ysx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ysx
 * @Date: 2022/10/06/11:56
 * @Description:
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmps() {
        return employeeMapper.getEmps();
    }

    @Override
    public void addEmp(Employee employee) {
        employeeMapper.addEmp(employee);
    }

    @Override
    public Employee getEmpById(Integer id) {
        return employeeMapper.getEmpById(id);
    }

    @Override
    public void updateEmp(Employee employee) {
        employeeMapper.updateEmp(employee);
    }

    @Override
    public void delEmp(Integer id) {
        employeeMapper.delEmp(id);
    }
    @Override
    public void delEmps(Integer[] ids) {
        employeeMapper.delEmps(ids);
    }

    @Override
    public PageInfo<Employee> getEmpsByPage(Integer pageNum) {
        //开启分页
        Page<Object> page = PageHelper.startPage(pageNum, 5);
        List<Employee> emps = getEmps();

        //获取分页相关信息
        PageInfo<Employee> pageInfo = new PageInfo<>(emps, 5);
        return pageInfo;
    }
}
