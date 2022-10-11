package com.ysx.controller;

import com.github.pagehelper.PageInfo;
import com.ysx.pojo.Employee;
import com.ysx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ysx
 * @Date: 2022/10/06/11:59
 * @Description:
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee/page/{pagenum}")
    public String getEmpsByPage(@PathVariable("pagenum") Integer pagenum, Model model, HttpSession session){
        PageInfo<Employee> page = employeeService.getEmpsByPage(pagenum);
        model.addAttribute("page", page);
        //存页数 方便返回定位
        session.getServletContext().setAttribute("pageNow", pagenum);
        return "employeeList";
    }

    /**
     * 不想用分页查询时
     * @param model
     * @return
     */
    @GetMapping("/employee")
    public String getAllEmps(Model model){
        List<Employee> emps = employeeService.getEmps();
        model.addAttribute("emps", emps);
        return "employeeList";
    }

    @PostMapping("/employee")
    public String addEmp(Employee employee, HttpSession session){
        employeeService.addEmp(employee);
        Integer num = (Integer)session.getServletContext().getAttribute("pageNow");
        return "redirect:/employee/page/" + num;
    }

    @RequestMapping("/employee/{id}")
    public String updateEmp(@PathVariable("id") Integer empid, Model model){
        Employee emp = employeeService.getEmpById(empid);
        model.addAttribute("emp", emp);
        return "employee_update";
    }

    @PutMapping("/employee")
    public String updateEmp(Employee employee, HttpSession session){
        employeeService.updateEmp(employee);
        Integer pageNum = (Integer)session.getServletContext().getAttribute("pageNow");
        return "redirect:/employee/page/" + pageNum;
    }

    @DeleteMapping("/employee/{id}")
    public String delEmp(@PathVariable("id") Integer empId, HttpSession session) {
        employeeService.delEmp(empId);
        Integer pageNum = (Integer)session.getServletContext().getAttribute("pageNow");
        return "redirect:/employee/page/" + pageNum;
    }


    @PostMapping("/employee/deleteEmps")
    @ResponseBody
    public String delEmps(Integer[] ids, HttpSession session){
        employeeService.delEmps(ids);
        Integer pageNum = (Integer)session.getServletContext().getAttribute("pageNow");
        /**
         * 直接 redirect:/employee 这样返回页面不刷新
         * 所以通过js来刷新
         */
        return "ok" + pageNum;
    }




}
