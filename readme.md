## 这是我上传的第一个SSM项目
菜鸟在读研究生 简单的实现了一个RestFul风格的员工管理
主要实现了增删改查、批量删除、分页操作、以及登录拦截器操作。

### 访问链接
* 查询所有的员工信息-->/employee-->get
* 查询员工的分页信息-->/employee/page/{pagenum}-->get
* 根据id查询员工信息-->/employee/{empid}-->get
* 跳转到添加页面-->/to/add-->get
* 添加员工信息-->/employee-->post
* 修改员工信息-->/employee-->put
* 删除员工信息-->/employee/{empid}-->delete
* 批量删除-->deleteEmps-->post axios拼接传递ids

### 总结
做的比较简单 只有单独的一个表的处理 欢迎大佬们的指正和批评 非常的感谢